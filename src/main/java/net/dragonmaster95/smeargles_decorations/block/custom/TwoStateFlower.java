package net.dragonmaster95.smeargles_decorations.block.custom;

import com.mojang.serialization.MapCodec;

import java.util.List;
import java.util.function.BiFunction;

import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.block.*;
import net.minecraft.component.type.SuspiciousStewEffectsComponent;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.DirectionProperty;
import net.minecraft.state.property.IntProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.BlockMirror;
import net.minecraft.util.BlockRotation;
import net.minecraft.util.Util;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.random.Random;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.WorldView;

public class TwoStateFlower extends PlantBlock implements Fertilizable, SuspiciousStewIngredient {
    protected static final MapCodec<SuspiciousStewEffectsComponent> STEW_EFFECT_CODEC = SuspiciousStewEffectsComponent.CODEC.fieldOf("suspicious_stew_effects");
    public static final MapCodec<TwoStateFlower> CODEC = RecordCodecBuilder.mapCodec(
            instance -> instance.group(STEW_EFFECT_CODEC.forGetter(TwoStateFlower::getStewEffects), createSettingsCodec()).apply(instance, TwoStateFlower::new)
    );

    public static final DirectionProperty FACING = Properties.HORIZONTAL_FACING;
    public static final BooleanProperty FLOWER_BED = BooleanProperty.of("flower_bed");
    private static final BiFunction<Direction, Boolean, VoxelShape> FACING_AND_AMOUNT_TO_SHAPE = Util.memoize(
            (BiFunction<Direction, Boolean, VoxelShape>)((facing, isFlowerField) -> {
                VoxelShape[] voxelShapes = new VoxelShape[]{
                        Block.createCuboidShape(5, 0, 5, 11, 8, 11), //single flower
                        Block.createCuboidShape(0.0, 0.0, 0.0, 16.0, 8.0, 16.0) //flower bed
                };
                VoxelShape voxelShape = isFlowerField ? voxelShapes[1] : voxelShapes[0];

                return voxelShape.asCuboid();
            })
    );
    private SuspiciousStewEffectsComponent stewEffects;


    @Override
    public MapCodec<TwoStateFlower> getCodec() {
        return CODEC;
    }

    public TwoStateFlower(RegistryEntry<StatusEffect> stewEffect, float effectLengthInSeconds, AbstractBlock.Settings settings) {
        this(createStewEffectList(stewEffect, effectLengthInSeconds), settings);
    }

    public TwoStateFlower(SuspiciousStewEffectsComponent stewEffects, AbstractBlock.Settings settings) {
        super(settings);
        this.stewEffects = stewEffects;
        this.setDefaultState(this.stateManager.getDefaultState().with(FACING, Direction.NORTH).with(FLOWER_BED, false));
    }

    protected static SuspiciousStewEffectsComponent createStewEffectList(RegistryEntry<StatusEffect> effect, float effectLengthInSeconds) {
        return new SuspiciousStewEffectsComponent(List.of(new SuspiciousStewEffectsComponent.StewEffect(effect, MathHelper.floor(effectLengthInSeconds * 20.0F))));
    }

    @Override
    public BlockState rotate(BlockState state, BlockRotation rotation) {
        return state.with(FACING, rotation.rotate(state.get(FACING)));
    }

    @Override
    public BlockState mirror(BlockState state, BlockMirror mirror) {
        return state.rotate(mirror.getRotation(state.get(FACING)));
    }

    @Override
    public boolean canReplace(BlockState state, ItemPlacementContext context) {
        return !context.shouldCancelInteraction() && context.getStack().isOf(this.asItem()) && !state.get(FLOWER_BED) || super.canReplace(state, context);
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return (VoxelShape)FACING_AND_AMOUNT_TO_SHAPE.apply((Direction)state.get(FACING), (Boolean)state.get(FLOWER_BED));
    }

    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        BlockState blockState = ctx.getWorld().getBlockState(ctx.getBlockPos());
        return blockState.isOf(this)
                ? blockState.with(FLOWER_BED, blockState.get(FLOWER_BED))
                : this.getDefaultState().with(FACING, ctx.getHorizontalPlayerFacing().getOpposite());
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(FACING, FLOWER_BED);
    }

    @Override
    public boolean isFertilizable(WorldView world, BlockPos pos, BlockState state) {
        return true;
    }

    @Override
    public boolean canGrow(World world, Random random, BlockPos pos, BlockState state) {
        return true;
    }

    @Override
    public void grow(ServerWorld world, Random random, BlockPos pos, BlockState state) {
        if (!state.get(FLOWER_BED)) {
            world.setBlockState(pos, state.with(FLOWER_BED, true), Block.NOTIFY_LISTENERS);
        } else {
            dropStack(world, pos, new ItemStack(this));
        }
    }

    @Override
    public SuspiciousStewEffectsComponent getStewEffects() {
        return this.stewEffects;
    }
}
