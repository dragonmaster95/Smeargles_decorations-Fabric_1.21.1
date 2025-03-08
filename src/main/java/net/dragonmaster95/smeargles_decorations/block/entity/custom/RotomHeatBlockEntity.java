package net.dragonmaster95.smeargles_decorations.block.entity.custom;

import net.dragonmaster95.smeargles_decorations.block.entity.ModBlockEntities;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.AbstractFurnaceBlockEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.recipe.RecipeType;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.screen.SmokerScreenHandler;
import net.minecraft.text.Text;
import net.minecraft.util.math.BlockPos;

public class RotomHeatBlockEntity extends AbstractFurnaceBlockEntity {
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
}
