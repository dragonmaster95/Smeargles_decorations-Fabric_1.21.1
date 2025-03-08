package net.dragonmaster95.smeargles_decorations.block.entity.custom;

import net.dragonmaster95.smeargles_decorations.SmearglesDecorations;
import net.dragonmaster95.smeargles_decorations.block.custom.RotomHeat;
import net.dragonmaster95.smeargles_decorations.block.entity.ModBlockEntities;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.AbstractFurnaceBlockEntity;
import net.minecraft.block.entity.SmokerBlockEntity;
import net.minecraft.block.entity.ViewerCountManager;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.Inventory;
import net.minecraft.item.ItemStack;
import net.minecraft.recipe.RecipeType;
import net.minecraft.screen.GenericContainerScreenHandler;
import net.minecraft.screen.NamedScreenHandlerFactory;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.screen.SmokerScreenHandler;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvent;
import net.minecraft.text.Text;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3i;
import net.minecraft.world.World;


public class RotomHeatBlockEntity extends AbstractFurnaceBlockEntity implements NamedScreenHandlerFactory {
    public RotomHeatBlockEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.ROTOM_HEAT_BE, pos , state, RecipeType.SMOKING);
    }

    @Override
    protected Text getContainerName() {
        return Text.translatable("smeargles_decorations.container.rotom_heat");
    }

    @Override
    protected int getFuelTime(ItemStack fuel) { return super.getFuelTime(fuel) / 2; }

    @Override
    protected ScreenHandler createScreenHandler(int syncId, PlayerInventory playerInventory) {
        return new SmokerScreenHandler(syncId, playerInventory, this, this.propertyDelegate);
    }


    @Override
    public void onOpen(PlayerEntity player) {
        SmearglesDecorations.LOGGER.warn("DEBUG: OPENING SCREEN");
        super.onOpen(player);
        if (!this.removed && !player.isSpectator()) {
            if (world == null) throw new AssertionError();
            RotomHeat.setOpenState(world,pos,true);
        }
    }

    @Override
    public void onClose(PlayerEntity player) {
        SmearglesDecorations.LOGGER.warn("DEBUG: CLOSING SCREEN");
        super.onClose(player);
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

}
