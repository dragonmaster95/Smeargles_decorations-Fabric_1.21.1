package net.dragonmaster95.smeargles_decorations.block.entity.custom;

import net.dragonmaster95.smeargles_decorations.block.custom.RotomHeat;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;

import static net.dragonmaster95.smeargles_decorations.block.entity.ModBlockEntities.ROTOM_HEAT_BE;

public class RotomHeatBE_old extends BlockEntity {

    private boolean isOpen;  // Track whether the furnace is open
    private boolean isLit;   // Track whether the furnace is lit (active)
    private Direction facing;  // Track the facing direction of the furnace

    public RotomHeatBE_old(BlockPos pos, BlockState state) {
        super(ROTOM_HEAT_BE, pos, state);
        this.isOpen = false;    // Default state is closed
        this.isLit = false;     // Default state is not lit (off)
        this.facing = Direction.NORTH;  // Default facing direction is north
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void setOpen(boolean open) {
        this.isOpen = open;
        markDirty();  // Mark the block entity as dirty, indicating a change that should be saved
    }

    public boolean isLit() {
        return isLit;
    }

    public void setLit(boolean lit) {
        this.isLit = lit;
        markDirty();  // Mark the block entity as dirty
    }

    public Direction getFacing() {
        return facing;
    }

    public void setFacing(Direction facing) {
        this.facing = facing;
        markDirty();  // Mark the block entity as dirty
    }

    @Override
    protected void readNbt(NbtCompound nbt, RegistryWrapper.WrapperLookup registryLookup) {
        super.readNbt(nbt, registryLookup);
        this.isOpen = nbt.getBoolean("isOpen");
        this.isLit = nbt.getBoolean("isLit");
        this.facing = Direction.byId(nbt.getInt("facing"));
    }

    @Override
    public void writeNbt(NbtCompound nbt, RegistryWrapper.WrapperLookup registryLookup) {
        super.writeNbt(nbt, registryLookup);
        nbt.putBoolean("isOpen", isOpen);
        nbt.putBoolean("isLit", isLit);
        nbt.putInt("facing", facing.getId());
    }

    @Override
    public void markDirty() {
        super.markDirty();
        if (world != null) {
            // Update the blockstate in the world when the block entity changes
            world.setBlockState(getPos(), world.getBlockState(getPos()).with(RotomHeat.LIT, isLit)
                    .with(RotomHeat.OPEN, isOpen)
                    .with(RotomHeat.FACING, facing), 3);
        }
    }
}
