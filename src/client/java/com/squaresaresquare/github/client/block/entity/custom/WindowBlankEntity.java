package com.squaresaresquare.github.client.block.entity.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.squaresaresquare.github.client.ArchitectureBlocksClient;
import com.squaresaresquare.github.client.block.entity.ModBlockEntities;
import com.squaresaresquare.github.client.ArchitectureBlocksClient.*;

public class WindowBlankEntity extends BlockEntity {
    public static final Logger LOGGER = LoggerFactory.getLogger(ArchitectureBlocksClient.MOD_ID);

    public WindowBlankEntity(BlockPos pos, BlockState state) {
        System.out.print("the WINDOW_BLANK_ENTITY class\n");
        LOGGER.debug("The window entity class\n");
        super(ModBlockEntities.WINDOW_BLANK_ENTITY, pos, state);
    }
}
        
