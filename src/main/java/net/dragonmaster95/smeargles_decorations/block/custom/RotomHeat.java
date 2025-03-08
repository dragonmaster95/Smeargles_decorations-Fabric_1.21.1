package net.dragonmaster95.smeargles_decorations.block.custom;

import com.mojang.serialization.MapCodec;
import net.dragonmaster95.smeargles_decorations.block.entity.custom.RotomHeatBlockEntity;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.block.*;
import net.minecraft.block.entity.*;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.item.ItemStack;
import net.minecraft.loot.context.LootContext;
import net.minecraft.registry.Registry;
import net.minecraft.screen.NamedScreenHandlerFactory;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.stat.Stats;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.DirectionProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.ItemScatterer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.random.Random;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;

public class RotomHeat extends SmokerBlock {
    public static final BooleanProperty OPEN = Properties.OPEN;

    public RotomHeat(Settings settings) {
        super(settings);
        this.setDefaultState(
                this.getDefaultState().with(OPEN, false)
        );
    }

    public static final VoxelShape SHAPE_N = Block.createCuboidShape(1, 0, 7, 15, 10, 16);
    public static final VoxelShape SHAPE_E = Block.createCuboidShape(0, 0, 1, 9, 10, 15);
    public static final VoxelShape SHAPE_S = Block.createCuboidShape(1, 0, 0, 15, 10, 9);
    public static final VoxelShape SHAPE_W = Block.createCuboidShape(7, 0, 1, 16, 10, 15);


	@Override
	public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
		return new RotomHeatBlockEntity(pos, state);
	}

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
        builder.add(OPEN);
    }

    public boolean hasComparatorOutput(BlockState state) {
        return true;
    }

    public int getComparatorOutput(BlockState state, World world, BlockPos pos) {
        return ScreenHandler.calculateComparatorOutput(world.getBlockEntity(pos));
    }

    /*@Override
    protected void openScreen(World world, BlockPos pos, PlayerEntity player) {
        BlockEntity blockEntity = world.getBlockEntity(pos);
        if (blockEntity instanceof SmokerBlockEntity) {
            player.openHandledScreen((NamedScreenHandlerFactory)blockEntity);
            player.incrementStat(INTERACT_WITH_ROTOM_HEAT);
        }
    }*/

}
