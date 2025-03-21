package net.dragonmaster95.smeargles_decorations.block.entity.custom;

import net.dragonmaster95.smeargles_decorations.SmearglesDecorations;
import net.dragonmaster95.smeargles_decorations.block.custom.RotomHeat;
import net.dragonmaster95.smeargles_decorations.block.entity.ModBlockEntities;
import net.dragonmaster95.smeargles_decorations.network.BlockPosPayload;
import net.dragonmaster95.smeargles_decorations.screenhandler.RotomHeatScreenHandler;
import net.fabricmc.fabric.api.screenhandler.v1.ExtendedScreenHandlerFactory;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvent;
import net.minecraft.text.Text;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3i;
import org.jetbrains.annotations.Nullable;


public class RotomHeatBE extends BlockEntity implements ExtendedScreenHandlerFactory<BlockPosPayload> {

    public static final Text TITLE = Text.translatable("container." + SmearglesDecorations.MOD_ID + ".rotom_oven");

    public RotomHeatBE(BlockPos pos, BlockState state) {
        super(ModBlockEntities.ROTOM_HEAT_BE, pos , state);
    }

    protected Text getContainerName() {
        return Text.translatable("smeargles_decorations.container.rotom_heat");
    }


    public void onOpen(PlayerEntity player) {
        if (!this.removed && !player.isSpectator()) {
            if (world == null) throw new AssertionError();
            RotomHeat.setOpenState(world,pos,true);
        }
    }

    public void onClose(PlayerEntity player) {
        if (!this.removed && !player.isSpectator()) {
            if (world == null) throw new AssertionError();
            RotomHeat.setOpenState(world,pos,false);
        }
    }


    void playSound(BlockState state, SoundEvent soundEvent) {
        Vec3i vec3i = state.get(RotomHeat.FACING).getVector();
        double d = this.pos.getX() + 0.5 + vec3i.getX() / 2.0;
        double e = this.pos.getY() + 0.5 + vec3i.getY() / 2.0;
        double f = this.pos.getZ() + 0.5 + vec3i.getZ() / 2.0;
        this.world.playSound(null, d, e, f, soundEvent, SoundCategory.BLOCKS, 0.5F, this.world.random.nextFloat() * 0.1F + 0.9F);
    }

    @Override
    public BlockPosPayload getScreenOpeningData(ServerPlayerEntity player) {
        return new BlockPosPayload(this.pos);
    }

    @Override
    public Text getDisplayName() {
        return TITLE;
    }

    @Override
    public @Nullable ScreenHandler createMenu(int syncId, PlayerInventory playerInventory, PlayerEntity player) {
        return new RotomHeatScreenHandler(syncId, playerInventory, this);
    }
}
