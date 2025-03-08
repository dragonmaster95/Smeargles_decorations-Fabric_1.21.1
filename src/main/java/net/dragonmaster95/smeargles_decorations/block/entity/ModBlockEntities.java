package net.dragonmaster95.smeargles_decorations.block.entity;

import net.dragonmaster95.smeargles_decorations.SmearglesDecorations;
import net.dragonmaster95.smeargles_decorations.block.ModBlocks;
import net.dragonmaster95.smeargles_decorations.block.entity.custom.RotomHeatBlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlockEntities {
    public static final BlockEntityType<RotomHeatBlockEntity> ROTOM_HEAT_BE =
            Registry.register(
                    Registries.BLOCK_ENTITY_TYPE,
                    Identifier.of(
                            SmearglesDecorations.MOD_ID,
                            "rotom_heat_be"
                    ),
                    BlockEntityType.Builder.create(
                            RotomHeatBlockEntity::new,
                            ModBlocks.ROTOM_HEAT_ROTOM,
                            ModBlocks.ROTOM_HEAT_SHINY,
                            ModBlocks.ROTOM_HEAT_POKEDEX,
                            ModBlocks.ROTOM_HEAT_WHITE,
                            ModBlocks.ROTOM_HEAT_LIGHT_GRAY,
                            ModBlocks.ROTOM_HEAT_GRAY,
                            ModBlocks.ROTOM_HEAT_BLACK,
                            ModBlocks.ROTOM_HEAT_BROWN,
                            ModBlocks.ROTOM_HEAT_RED,
                            ModBlocks.ROTOM_HEAT_ORANGE,
                            ModBlocks.ROTOM_HEAT_YELLOW,
                            ModBlocks.ROTOM_HEAT_LIME,
                            ModBlocks.ROTOM_HEAT_GREEN,
                            ModBlocks.ROTOM_HEAT_CYAN,
                            ModBlocks.ROTOM_HEAT_LIGHT_BLUE,
                            ModBlocks.ROTOM_HEAT_BLUE,
                            ModBlocks.ROTOM_HEAT_PURPLE,
                            ModBlocks.ROTOM_HEAT_MAGENTA,
                            ModBlocks.ROTOM_HEAT_PINK
                    ).build()
            );
    public static void registerBlockEntities() {
        SmearglesDecorations.LOGGER.info("Registering Block Entities for "+SmearglesDecorations.MOD_ID);

    }
}
