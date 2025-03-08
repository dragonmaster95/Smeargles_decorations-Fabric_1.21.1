package net.dragonmaster95.smeargles_decorations.block.custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.state.StateManager;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

import static net.minecraft.state.property.Properties.POWERED;

public class RotomMow extends OrientableBlock{
    public RotomMow(Settings settings) {
        super(settings);
    }

    public static final VoxelShape SHAPE_N = Block.createCuboidShape(1, 0, 7, 15, 13, 14);
    public static final VoxelShape SHAPE_E = Block.createCuboidShape(1, 0, 1, 8, 13, 15);
    public static final VoxelShape SHAPE_S = Block.createCuboidShape(1,0,1, 15, 13, 8);
    public static final VoxelShape SHAPE_W = Block.createCuboidShape(8, 0, 1, 15, 13, 15);

    @Override
    protected VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        Direction direction = state.get(FACING);
        if (direction == Direction.EAST) return SHAPE_E;
        if (direction == Direction.SOUTH) return SHAPE_S;
        if (direction == Direction.WEST) return SHAPE_W;
        else return SHAPE_N;
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        super.appendProperties(builder);
    }
}
