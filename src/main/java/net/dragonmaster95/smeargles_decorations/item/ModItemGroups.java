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

    public static final ItemGroup SMEARGLES_DECORATIONS = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(SmearglesDecorations.MOD_ID, "smeargle_decorations"),
            FabricItemGroup.builder()
                    .icon(() -> new ItemStack(ModBlocks.ROTOM_WASH_ROTOM))
                    .displayName(Text.translatable("itemgroup.tutorialmod.smeargles_decorations"))
                    .entries(((displayContext, entries) -> {
                        
                        entries.add(ModBlocks.ROTOM_WASH_ROTOM);
                        entries.add(ModBlocks.ROTOM_WASH_SHINY);
                        entries.add(ModBlocks.ROTOM_WASH_POKEDEX);
                        entries.add(ModBlocks.ROTOM_WASH_WHITE);
                        entries.add(ModBlocks.ROTOM_WASH_LIGHT_GRAY);
                        entries.add(ModBlocks.ROTOM_WASH_GRAY);
                        entries.add(ModBlocks.ROTOM_WASH_BLACK);
                        entries.add(ModBlocks.ROTOM_WASH_BROWN);
                        entries.add(ModBlocks.ROTOM_WASH_RED);
                        entries.add(ModBlocks.ROTOM_WASH_ORANGE);
                        entries.add(ModBlocks.ROTOM_WASH_YELLOW);
                        entries.add(ModBlocks.ROTOM_WASH_LIME);
                        entries.add(ModBlocks.ROTOM_WASH_GREEN);
                        entries.add(ModBlocks.ROTOM_WASH_CYAN);
                        entries.add(ModBlocks.ROTOM_WASH_LIGHT_BLUE);
                        entries.add(ModBlocks.ROTOM_WASH_BLUE);
                        entries.add(ModBlocks.ROTOM_WASH_PURPLE);
                        entries.add(ModBlocks.ROTOM_WASH_MAGENTA);
                        entries.add(ModBlocks.ROTOM_WASH_PINK);
                        entries.add(ModBlocks.ROTOM_FREEZE_ROTOM);
                        entries.add(ModBlocks.ROTOM_FREEZE_SHINY);
                        entries.add(ModBlocks.ROTOM_FREEZE_POKEDEX);
                        entries.add(ModBlocks.ROTOM_FREEZE_WHITE);
                        entries.add(ModBlocks.ROTOM_FREEZE_LIGHT_GRAY);
                        entries.add(ModBlocks.ROTOM_FREEZE_GRAY);
                        entries.add(ModBlocks.ROTOM_FREEZE_BLACK);
                        entries.add(ModBlocks.ROTOM_FREEZE_BROWN);
                        entries.add(ModBlocks.ROTOM_FREEZE_RED);
                        entries.add(ModBlocks.ROTOM_FREEZE_ORANGE);
                        entries.add(ModBlocks.ROTOM_FREEZE_YELLOW);
                        entries.add(ModBlocks.ROTOM_FREEZE_LIME);
                        entries.add(ModBlocks.ROTOM_FREEZE_GREEN);
                        entries.add(ModBlocks.ROTOM_FREEZE_CYAN);
                        entries.add(ModBlocks.ROTOM_FREEZE_LIGHT_BLUE);
                        entries.add(ModBlocks.ROTOM_FREEZE_BLUE);
                        entries.add(ModBlocks.ROTOM_FREEZE_PURPLE);
                        entries.add(ModBlocks.ROTOM_FREEZE_MAGENTA);
                        entries.add(ModBlocks.ROTOM_FREEZE_PINK);
                        entries.add(ModBlocks.ROTOM_MOW_ROTOM);
                        entries.add(ModBlocks.ROTOM_MOW_SHINY);
                        entries.add(ModBlocks.ROTOM_MOW_POKEDEX);
                        entries.add(ModBlocks.ROTOM_MOW_WHITE);
                        entries.add(ModBlocks.ROTOM_MOW_LIGHT_GRAY);
                        entries.add(ModBlocks.ROTOM_MOW_GRAY);
                        entries.add(ModBlocks.ROTOM_MOW_BLACK);
                        entries.add(ModBlocks.ROTOM_MOW_BROWN);
                        entries.add(ModBlocks.ROTOM_MOW_RED);
                        entries.add(ModBlocks.ROTOM_MOW_ORANGE);
                        entries.add(ModBlocks.ROTOM_MOW_YELLOW);
                        entries.add(ModBlocks.ROTOM_MOW_LIME);
                        entries.add(ModBlocks.ROTOM_MOW_GREEN);
                        entries.add(ModBlocks.ROTOM_MOW_CYAN);
                        entries.add(ModBlocks.ROTOM_MOW_LIGHT_BLUE);
                        entries.add(ModBlocks.ROTOM_MOW_BLUE);
                        entries.add(ModBlocks.ROTOM_MOW_PURPLE);
                        entries.add(ModBlocks.ROTOM_MOW_MAGENTA);
                        entries.add(ModBlocks.ROTOM_MOW_PINK);
                        entries.add(ModBlocks.ROTOM_HEAT_ROTOM);
                        entries.add(ModBlocks.ROTOM_HEAT_SHINY);
                        entries.add(ModBlocks.ROTOM_HEAT_POKEDEX);
                        entries.add(ModBlocks.ROTOM_HEAT_WHITE);
                        entries.add(ModBlocks.ROTOM_HEAT_LIGHT_GRAY);
                        entries.add(ModBlocks.ROTOM_HEAT_GRAY);
                        entries.add(ModBlocks.ROTOM_HEAT_BLACK);
                        entries.add(ModBlocks.ROTOM_HEAT_BROWN);
                        entries.add(ModBlocks.ROTOM_HEAT_RED);
                        entries.add(ModBlocks.ROTOM_HEAT_ORANGE);
                        entries.add(ModBlocks.ROTOM_HEAT_YELLOW);
                        entries.add(ModBlocks.ROTOM_HEAT_LIME);
                        entries.add(ModBlocks.ROTOM_HEAT_GREEN);
                        entries.add(ModBlocks.ROTOM_HEAT_CYAN);
                        entries.add(ModBlocks.ROTOM_HEAT_LIGHT_BLUE);
                        entries.add(ModBlocks.ROTOM_HEAT_BLUE);
                        entries.add(ModBlocks.ROTOM_HEAT_PURPLE);
                        entries.add(ModBlocks.ROTOM_HEAT_MAGENTA);
                        entries.add(ModBlocks.ROTOM_HEAT_PINK);
                        entries.add(ModBlocks.ROTOM_FAN_ROTOM);
                        entries.add(ModBlocks.ROTOM_FAN_SHINY);
                        entries.add(ModBlocks.ROTOM_FAN_POKEDEX);
                        entries.add(ModBlocks.ROTOM_FAN_WHITE);
                        entries.add(ModBlocks.ROTOM_FAN_LIGHT_GRAY);
                        entries.add(ModBlocks.ROTOM_FAN_GRAY);
                        entries.add(ModBlocks.ROTOM_FAN_BLACK);
                        entries.add(ModBlocks.ROTOM_FAN_BROWN);
                        entries.add(ModBlocks.ROTOM_FAN_RED);
                        entries.add(ModBlocks.ROTOM_FAN_ORANGE);
                        entries.add(ModBlocks.ROTOM_FAN_YELLOW);
                        entries.add(ModBlocks.ROTOM_FAN_LIME);
                        entries.add(ModBlocks.ROTOM_FAN_GREEN);
                        entries.add(ModBlocks.ROTOM_FAN_CYAN);
                        entries.add(ModBlocks.ROTOM_FAN_LIGHT_BLUE);
                        entries.add(ModBlocks.ROTOM_FAN_BLUE);
                        entries.add(ModBlocks.ROTOM_FAN_PURPLE);
                        entries.add(ModBlocks.ROTOM_FAN_MAGENTA);
                        entries.add(ModBlocks.ROTOM_FAN_PINK);

                        entries.add(ModBlocks.NORMAL_WOOL);
                        entries.add(ModBlocks.FIGHTING_WOOL);
                        entries.add(ModBlocks.FLYING_WOOL);
                        entries.add(ModBlocks.BUG_WOOL);
                        entries.add(ModBlocks.POISON_WOOL);
                        entries.add(ModBlocks.GROUND_WOOL);
                        entries.add(ModBlocks.ROCK_WOOL);
                        entries.add(ModBlocks.FIRE_WOOL);
                        entries.add(ModBlocks.WATER_WOOL);
                        entries.add(ModBlocks.GRASS_WOOL);
                        entries.add(ModBlocks.ELECTRIC_WOOL);
                        entries.add(ModBlocks.ICE_WOOL);
                        entries.add(ModBlocks.GHOST_WOOL);
                        entries.add(ModBlocks.PSYCHIC_WOOL);
                        entries.add(ModBlocks.DRAGON_WOOL);
                        entries.add(ModBlocks.DARK_WOOL);
                        entries.add(ModBlocks.STEEL_WOOL);
                        entries.add(ModBlocks.FAIRY_WOOL);
                        entries.add(ModBlocks.NORMAL_CUSHION);
                        entries.add(ModBlocks.FIGHTING_CUSHION);
                        entries.add(ModBlocks.FLYING_CUSHION);
                        entries.add(ModBlocks.BUG_CUSHION);
                        entries.add(ModBlocks.POISON_CUSHION);
                        entries.add(ModBlocks.GROUND_CUSHION);
                        entries.add(ModBlocks.ROCK_CUSHION);
                        entries.add(ModBlocks.FIRE_CUSHION);
                        entries.add(ModBlocks.WATER_CUSHION);
                        entries.add(ModBlocks.GRASS_CUSHION);
                        entries.add(ModBlocks.ELECTRIC_CUSHION);
                        entries.add(ModBlocks.ICE_CUSHION);
                        entries.add(ModBlocks.GHOST_CUSHION);
                        entries.add(ModBlocks.PSYCHIC_CUSHION);
                        entries.add(ModBlocks.DRAGON_CUSHION);
                        entries.add(ModBlocks.DARK_CUSHION);
                        entries.add(ModBlocks.STEEL_CUSHION);
                        entries.add(ModBlocks.FAIRY_CUSHION);

                        entries.add(ModBlocks.FLOETTE_WHITE);
                        entries.add(ModBlocks.FLOETTE_RED);
                        entries.add(ModBlocks.FLOETTE_ORANGE);
                        entries.add(ModBlocks.FLOETTE_YELLOW);
                        entries.add(ModBlocks.FLOETTE_BLUE);
                        entries.add(ModBlocks.FLOETTE_PINK);
                        entries.add(ModBlocks.FLOETTE_AZ);
                    }))
                    .build());

    public static void registerItemGroups() {
        SmearglesDecorations.LOGGER.info("Registering Item Groups for " + SmearglesDecorations.MOD_ID);
    }
}
