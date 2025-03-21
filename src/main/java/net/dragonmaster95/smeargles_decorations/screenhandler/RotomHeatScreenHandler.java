package net.dragonmaster95.smeargles_decorations.screenhandler;

import net.dragonmaster95.smeargles_decorations.block.ModBlocks;
import net.dragonmaster95.smeargles_decorations.block.entity.custom.RotomHeatBE;
import net.dragonmaster95.smeargles_decorations.network.BlockPosPayload;
import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.screen.ScreenHandlerContext;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.screen.slot.Slot;

public class RotomHeatScreenHandler extends ScreenHandler {
    private final RotomHeatBE blockEntity;
    private final ScreenHandlerContext context;

    //Client Constructor
    public RotomHeatScreenHandler(int syncId, PlayerInventory playerInventory, BlockPosPayload payload) {
        this(syncId, playerInventory, (RotomHeatBE) playerInventory.player.getWorld().getBlockEntity(payload.pos()));
    }

    //Main Constructor (directly called from server)
    public RotomHeatScreenHandler(int syncId, PlayerInventory playerInventory, RotomHeatBE be) {
        super(ScreenHandlerTypeInit.ROTOM_HEAT,syncId);

        this.blockEntity = be;
        this.context = ScreenHandlerContext.create(this.blockEntity.getWorld(), this.blockEntity.getPos());

        addPlayerInventory(playerInventory);
        addPlayerHotbar(playerInventory);
    }

    private void addPlayerHotbar(PlayerInventory playerInv) {
        for (int column = 0; column < 9; column++) {
            //x and y pixel position of the hotbar slots
            addSlot(new Slot(playerInv, column, 8 + (column * 18),  142));
        }
    }
    private void addPlayerInventory(PlayerInventory playerInv) {
        for (int row = 0; row < 3; row++) {
            for (int column = 0; column < 9; column++) {
                //x and y pixel position of the hotbar slots
                addSlot(new Slot(playerInv, 9 + (column * row*9), 8 + (column * 18), 84 + (row*18) ));
            }
        }
    }

    public RotomHeatBE getBlockEntity() {
        return this.blockEntity;
    }

    @Override
    public ItemStack quickMove(PlayerEntity player, int slot) {
        return ItemStack.EMPTY;
    }

    @Override
    public boolean canUse(PlayerEntity player) {
        for (Block block: ModBlocks.ROTOM_HEAT_BLOCKS)
            if (canUse(null, player, block)) return true;
        return false;
    }
}
