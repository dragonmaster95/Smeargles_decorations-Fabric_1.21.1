package net.dragonmaster95.smeargles_decorations.block.custom;

import com.mojang.serialization.MapCodec;
import net.minecraft.block.*;
import net.minecraft.block.enums.DoubleBlockHalf;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.DirectionProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.random.Random;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

public class RotomFan extends OrientableBlock {
    public static final BooleanProperty POWERED = Properties.POWERED;
    //public static final DirectionProperty FACING = Properties.FACING;
    public static final VoxelShape SHAPE_X = Block.createCuboidShape(3, 0, 6.5, 13, 14, 9.5);
    public static final VoxelShape SHAPE_Z = Block.createCuboidShape(6.5, 0, 3, 9.5, 14, 13);

    @Override
    protected VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        Direction direction = state.get(FACING);
        if (direction == Direction.NORTH || direction == Direction.SOUTH  ) return SHAPE_X;
        else return SHAPE_Z;
    }

    public RotomFan(AbstractBlock.Settings settings) {
        super(settings);
        this.setDefaultState(
                this.getDefaultState().with(POWERED, false)
        );
    }

    @Nullable
    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        BlockPos blockPos = ctx.getBlockPos();
        World world = ctx.getWorld();
        boolean bl = world.isReceivingRedstonePower(blockPos);
        return this.getDefaultState()
            .with(FACING, ctx.getHorizontalPlayerFacing())
            .with(POWERED, bl);
    }

    @Override
    protected void neighborUpdate(BlockState state, World world, BlockPos pos, Block sourceBlock, BlockPos sourcePos, boolean notify) {
        if (!world.isClient) {
            boolean bl = (Boolean)state.get(POWERED);
            if (bl != world.isReceivingRedstonePower(pos)) {
                if (bl) {
                    world.scheduleBlockTick(pos, this, 4);
                } else {
                    world.setBlockState(pos, state.cycle(POWERED), Block.NOTIFY_LISTENERS);
                }
            }
        }
    }

    @Override
    protected void scheduledTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        if ((Boolean)state.get(POWERED) && !world.isReceivingRedstonePower(pos)) {
            world.setBlockState(pos, state.cycle(POWERED), Block.NOTIFY_LISTENERS);
        }
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        super.appendProperties(builder);
        builder.add(POWERED);
    }
}
