package com.squaresaresquare.github.block.entity.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.squaresaresquare.github.ArchitectureBlocks;
import com.squaresaresquare.github.block.entity.ModBlockEntities;

public class WindowBlankEntity extends BlockEntity {
    public static final Logger LOGGER = LoggerFactory.getLogger(ArchitectureBlocks.MOD_ID);

    public WindowBlankEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.WINDOW_BLANK_ENTITY, pos, state);
        System.out.print("the WINDOW_BLANK_ENTITY class\n");
        LOGGER.debug("The window entity class\n");
    }
}
        
