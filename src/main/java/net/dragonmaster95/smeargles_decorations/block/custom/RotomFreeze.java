package net.dragonmaster95.smeargles_decorations.block.custom;

import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;

public class RotomFreeze extends OrientableBlock{
    public RotomFreeze(Settings settings) {
        super(settings);
    }

    @Override
    protected boolean isTransparent(BlockState state, BlockView world, BlockPos pos) {
        return false;
    }
}
