package net.dragonmaster95.smeargles_decorations.block.custom;

import com.mojang.serialization.MapCodec;
import net.dragonmaster95.smeargles_decorations.block.entity.custom.RotomHeatBE;
import net.dragonmaster95.smeargles_decorations.screenhandler.RotomHeatScreenHandler;
import net.minecraft.block.*;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.SmokerBlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.DirectionProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.ActionResult;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;

public class RotomHeat extends BlockWithEntity {

    public static final BooleanProperty LIT = Properties.LIT; // For whether the furnace is lit
    public static final BooleanProperty OPEN = Properties.OPEN; // For whether the furnace is open
    public static final DirectionProperty FACING = Properties.FACING;


    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        super.appendProperties(builder);
        builder.add(LIT, OPEN, FACING); // Add the properties to the blockstate
    }

    public RotomHeat(Settings settings) {
        super(settings);
        this.setDefaultState(this.stateManager.getDefaultState().with(OPEN, false).with(LIT, false).with(FACING, Direction.NORTH));
    }


    @Override
    protected MapCodec<? extends BlockWithEntity> getCodec() {
        return null;
    }

    public static final VoxelShape SHAPE_N = Block.createCuboidShape(1, 0, 7, 15, 10, 16);
    public static final VoxelShape SHAPE_E = Block.createCuboidShape(0, 0, 1, 9, 10, 15);
    public static final VoxelShape SHAPE_S = Block.createCuboidShape(1, 0, 0, 15, 10, 9);
    public static final VoxelShape SHAPE_W = Block.createCuboidShape(7, 0, 1, 16, 10, 15);

    @Override
    protected VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        Direction direction = state.get(FACING);
        if (direction == Direction.EAST) return SHAPE_E;
        if (direction == Direction.SOUTH) return SHAPE_S;
        if (direction == Direction.WEST) return SHAPE_W;
        else return SHAPE_N;
    }

    public static void setOpenState(World world, BlockPos pos, boolean open) {
        BlockState state = world.getBlockState(pos);
        if (state.get(OPEN) != open) {
            world.setBlockState(pos, state.with(OPEN, open), Block.NOTIFY_ALL | Block.REDRAW_ON_MAIN_THREAD);
            world.updateNeighbors(pos, world.getBlockState(pos).getBlock()); // Force neighbor update
        }
    }

    @Override
    public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return new RotomHeatBE(pos, state);
    }



    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, BlockHitResult hit) {
        if (!world.isClient) {
            BlockEntity blockEntity = world.getBlockEntity(pos);
            if (blockEntity instanceof RotomHeatBE be && player != null) {
                player.openHandledScreen(be);  // Open the custom screen when clicked
            }
        }
        return ActionResult.success(world.isClient);
    }

    @Override
    public void onBlockAdded(BlockState state, World world, BlockPos pos, BlockState oldState, boolean notify) {
        super.onBlockAdded(state, world, pos, oldState, notify);
        // Set the block to the default state when it's placed
        if (!world.isClient) {
            updateBlockState(state, world, pos);
        }
    }

    protected void openScreen(World world, PlayerEntity player, BlockPos pos) {
        // Open the custom container when the player right-clicks the block
        BlockEntity blockEntity = world.getBlockEntity(pos);
        if (blockEntity instanceof RotomHeatBE) {
            //player.openHandledScreen(new RotomHeatScreenHandler(pos, player));
            world.setBlockState(pos, world.getBlockState(pos).with(OPEN, true), 3); // Set open to true
            //player.incrementStat(Stats.INTERACT_WITH_SMOKER);
        }
    }

    public void updateBlockState(BlockState state, World world, BlockPos pos) {
        BlockEntity blockEntity = world.getBlockEntity(pos);
        if (blockEntity instanceof RotomHeatBE furnaceEntity) {
            //boolean isOpen = furnaceEntity.isOpen();
            //boolean isLit = furnaceEntity.isLit(); // Whether the furnace is lit
            //world.setBlockState(pos, state.with(LIT, isLit).with(OPEN, isOpen), 3);
        }
    }
}
