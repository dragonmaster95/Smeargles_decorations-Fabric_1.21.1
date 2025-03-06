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
                        
                        entries.add(ModBlocks.NORMAL_WOOL);
                        entries.add(ModBlocks.NORMAL_CUSHION);
                        entries.add(ModBlocks.FIGHTING_WOOL);
                        entries.add(ModBlocks.FIGHTING_CUSHION);
                        entries.add(ModBlocks.FLYING_WOOL);
                        entries.add(ModBlocks.FLYING_CUSHION);
                        entries.add(ModBlocks.BUG_WOOL);
                        entries.add(ModBlocks.BUG_CUSHION);
                        entries.add(ModBlocks.POISON_WOOL);
                        entries.add(ModBlocks.POISON_CUSHION);
                        entries.add(ModBlocks.GROUND_WOOL);
                        entries.add(ModBlocks.GROUND_CUSHION);
                        entries.add(ModBlocks.ROCK_WOOL);
                        entries.add(ModBlocks.ROCK_CUSHION);
                        entries.add(ModBlocks.FIRE_WOOL);
                        entries.add(ModBlocks.FIRE_CUSHION);
                        entries.add(ModBlocks.WATER_WOOL);
                        entries.add(ModBlocks.WATER_CUSHION);
                        entries.add(ModBlocks.GRASS_WOOL);
                        entries.add(ModBlocks.GRASS_CUSHION);
                        entries.add(ModBlocks.ELECTRIC_WOOL);
                        entries.add(ModBlocks.ELECTRIC_CUSHION);
                        entries.add(ModBlocks.ICE_WOOL);
                        entries.add(ModBlocks.ICE_CUSHION);
                        entries.add(ModBlocks.GHOST_WOOL);
                        entries.add(ModBlocks.GHOST_CUSHION);
                        entries.add(ModBlocks.PSYCHIC_WOOL);
                        entries.add(ModBlocks.PSYCHIC_CUSHION);
                        entries.add(ModBlocks.DRAGON_WOOL);
                        entries.add(ModBlocks.DRAGON_CUSHION);
                        entries.add(ModBlocks.DARK_WOOL);
                        entries.add(ModBlocks.DARK_CUSHION);
                        entries.add(ModBlocks.STEEL_WOOL);
                        entries.add(ModBlocks.STEEL_CUSHION);
                        entries.add(ModBlocks.FAIRY_WOOL);
                        entries.add(ModBlocks.FAIRY_CUSHION);
                    }))
                    .build());

    public static void registerItemGroups() {
        SmearglesDecorations.LOGGER.info("Registering Item Groups for "+ SmearglesDecorations.MOD_ID);
    }
}
