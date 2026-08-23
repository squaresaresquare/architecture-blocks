package com.squaresaresquare.github.gui.screens;

import com.mojang.blaze3d.vertex.PoseStack;
import com.squaresaresquare.github.ArchitectureBlocks;
import com.squaresaresquare.github.records.PaintingsRecord;
import net.minecraft.client.gui.GuiGraphicsExtractor;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.navigation.ScreenRectangle;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.client.input.MouseButtonEvent;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.FormattedText;
import net.minecraft.util.Mth;
import org.apache.commons.lang3.arch.Processor;

import java.util.Arrays;

public class PaintingLoreScreen extends Screen {
    private final PaintingsRecord.Painting data;
    private String[] lines;

    private int scrollOffset = 0;
    private int maxScroll = 0;

    private int left, top, boxWidth, boxHeight;
    private Button closeButton;

    // Scrollbar interaction states
    private boolean isDraggingScrollbar = false;
    private double dragClickOffset = 0.0;
    private final int scrollbarHeight = 105;
    private int scrollbarLeft, scrollbarTop;

    public PaintingLoreScreen(PaintingsRecord.Painting data) {
        super(Component.literal(data.title()));
        this.data = data;
    }

    @Override
    protected void init() {
        super.init();

        this.boxWidth = 220;
        this.boxHeight = 150;
        this.left = this.width / 2 - (boxWidth / 2);
        this.top = this.height / 2 - (boxHeight / 2);

        this.scrollbarLeft = left + boxWidth - 12;
        this.scrollbarTop = top + 8;
        int lineHeight = 13;
        int totalContentHeight = (("Title: %s".formatted(data.title()).length() / 39 + "Title: %s".formatted(data.title()).length() / 39  + data.note().length() / 39) * lineHeight);
        ArchitectureBlocks.LOGGER.debug("Total height is %d".formatted(totalContentHeight));
        int viewableAreaHeight = 105;
        this.maxScroll = Math.max(0, totalContentHeight - viewableAreaHeight);

        this.closeButton = this.addRenderableWidget(
                Button.builder(Component.literal("Close Window"), button -> this.onClose())
                        .bounds(this.width / 2 - 50, this.top + this.boxHeight - 25, 100, 20)
                        .build()
        );
    }

    @Override
    public void extractRenderState(GuiGraphicsExtractor extractor, int mouseX, int mouseY, float delta) {
        super.extractRenderState(extractor, mouseX, mouseY, delta);
        // Draw background box
        extractor.fillGradient(left, top, left + boxWidth, top + boxHeight, 0x88282828, 0x88663300);

        // Draw borders
        extractor.outline(left, top, boxWidth, boxHeight, 0xFFFFFFFF);
        //extractor.fill(left, top, left + boxWidth, top + 1, 0xFFFFFFFF);
        //extractor.fill(left, top + boxHeight - 1, left + boxWidth, top + boxHeight, 0xFFFFFFFF);
        //extractor.fill(left, top, left + 1, top + boxHeight, 0xFFFFFFFF);
        //extractor.fill(left + boxWidth - 1, top, left + boxWidth, top + boxHeight, 0xFFFFFFFF);

        // Clip the scroll text using the ScreenRectangle boundaries
        extractor.scissorStack.push(new ScreenRectangle(left + 8, top + 8, boxWidth - 25, 105));

        int currentY = top + 3 - this.scrollOffset;
        ArchitectureBlocks.LOGGER.debug("write text to window");
        currentY += 22;
        extractor.textWithWordWrap(this.font, FormattedText.of("Title: %s".formatted(data.title())), left +10, currentY,boxWidth - 45, 0xFFFFFF00, false);
        currentY += 22;
        extractor.textWithWordWrap(this.font, FormattedText.of("Created by: %s".formatted(data.author())), left +10, currentY,boxWidth - 45, 0xFF66FF33, false);
        currentY += 30;
        extractor.textWithWordWrap(this.font, FormattedText.of(data.note()), left +10, currentY, boxWidth - 45, 0xFFF2F2F2, false);
        extractor.scissorStack.pop();

        // Draw Scrollbar Track
        extractor.fill(scrollbarLeft, scrollbarTop, scrollbarLeft + 4, scrollbarTop + scrollbarHeight, 0xFF151515);

        if (this.maxScroll > 0) {
            int knobHeight = getKnobHeight();
            int knobTop = getKnobTop(knobHeight);

            int knobColor = this.isDraggingScrollbar ? 0xFFCCCCCC : 0xFF888888;
            extractor.fill(scrollbarLeft, knobTop, scrollbarLeft + 4, knobTop + knobHeight, knobColor);
        }

        if (this.closeButton != null) {
            this.closeButton.extractRenderState(extractor, mouseX, mouseY, delta);
        }
    }

    private int getKnobHeight() {
        return Math.max(15, (scrollbarHeight * scrollbarHeight) / (scrollbarHeight + this.maxScroll));
    }

    private int getKnobTop(int knobHeight) {
        int availableTrack = scrollbarHeight - knobHeight;
        return scrollbarTop + (int) (((double) this.scrollOffset / this.maxScroll) * availableTrack);
    }

    // --- DIRECT SCREEN INTERACTION INTERCEPTORS ---

    @Override
    public boolean mouseClicked(MouseButtonEvent event, boolean doubleClick) {
        // Look for Left Click (button index 0) directly on the screen plane
        if (this.maxScroll > 0 && event.button() == 0) {
            double mouseX = event.x();
            double mouseY = event.y();

            int knobHeight = getKnobHeight();
            int knobTop = getKnobTop(knobHeight);

            // Bounds check for the scrollbar interaction area (+/- 2 padding pixels)
            if (mouseX >= scrollbarLeft - 2 && mouseX <= scrollbarLeft + 6) {
                // Clicked directly on the moving knob
                if (mouseY >= knobTop && mouseY <= knobTop + knobHeight) {
                    this.isDraggingScrollbar = true;
                    this.dragClickOffset = mouseY - knobTop;
                    this.setDragging(true); // Locks interaction focus onto this screen handler
                    return true;
                }
                // Clicked empty space on the track
                else if (mouseY >= scrollbarTop && mouseY <= scrollbarTop + scrollbarHeight) {
                    this.isDraggingScrollbar = true;
                    this.dragClickOffset = knobHeight / 2.0;
                    this.setDragging(true);
                    updateScrollFromMouseY(mouseY);
                    return true;
                }
            }
        }
        return super.mouseClicked(event, doubleClick);
    }

    @Override
    public boolean mouseDragged(MouseButtonEvent event, double dx, double dy) {
        // If the click-lock state is active, parse position vectors directly from the event payload
        if (this.maxScroll > 0 && this.isDraggingScrollbar) {
            updateScrollFromMouseY(event.y());
            return true;
        }
        return super.mouseDragged(event, dx, dy);
    }

    @Override
    public boolean mouseReleased(MouseButtonEvent event) {
        if (event.button() == 0) {
            this.isDraggingScrollbar = false;
            this.setDragging(false); // Unlocks focus from the drag router context
        }
        return super.mouseReleased(event);
    }

    private void updateScrollFromMouseY(double mouseY) {
        int knobHeight = getKnobHeight();
        int availableTrack = scrollbarHeight - knobHeight;

        if (availableTrack <= 0) return;

        double desiredKnobTop = mouseY - scrollbarTop - this.dragClickOffset;
        double scrollPercent = desiredKnobTop / (double) availableTrack;

        this.scrollOffset = Mth.clamp((int) Math.round(scrollPercent * this.maxScroll), 0, this.maxScroll);
    }

    @Override
    public boolean mouseScrolled(double mouseX, double mouseY, double horizontalAmount, double verticalAmount) {
        if (this.maxScroll > 0) {
            this.scrollOffset = Mth.clamp(this.scrollOffset - (int) (verticalAmount * 11), 0, this.maxScroll);
            return true;
        }
        return super.mouseScrolled(mouseX, mouseY, horizontalAmount, verticalAmount);
    }

    @Override
    public boolean isPauseScreen() {
        return false;
    }
}
