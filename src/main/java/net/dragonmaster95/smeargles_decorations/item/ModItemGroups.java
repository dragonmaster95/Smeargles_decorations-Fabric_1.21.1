package net.dragonmaster95.smeargles_decorations.item;

import net.dragonmaster95.smeargles_decorations.SmearglesDecorations;
import net.dragonmaster95.smeargles_decorations.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    public static final ItemGroup SMEARGLES_DECORATIONS = Registry.register(Registries.ITEM_GROUP,Identifier.of(SmearglesDecorations.MOD_ID, "smeargle_decorations"),
            FabricItemGroup.builder()
                    .icon(() -> new ItemStack(ModBlocks.ROTOM_WASH))
                    .displayName(Text.translatable("itemgroup.tutorialmod.smeargles_decorations"))
                    .entries(((displayContext, entries) -> {
                        entries.add(ModBlocks.ROTOM_WASH);
                    }))
                    .build());

    public static void registerItemGroups() {
        SmearglesDecorations.LOGGER.info("Registering Item Groups for "+ SmearglesDecorations.MOD_ID);
    }
}
