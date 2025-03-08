package net.dragonmaster95.smeargles_decorations.block;

import net.dragonmaster95.smeargles_decorations.SmearglesDecorations;
import net.dragonmaster95.smeargles_decorations.block.custom.*;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

import static net.minecraft.block.Blocks.createLightLevelFromLitBlockState;

public class ModBlocks {

    //Rotom wash
    public static final Block ROTOM_WASH_ROTOM = rotomWashBlock("rotom/wash/rotom",MapColor.TERRACOTTA_ORANGE);
    public static final Block ROTOM_WASH_SHINY = rotomWashBlock("rotom/wash/shiny",MapColor.TERRACOTTA_RED);
    public static final Block ROTOM_WASH_POKEDEX = rotomWashBlock("rotom/wash/pokedex",MapColor.BRIGHT_RED);
    public static final Block ROTOM_WASH_WHITE = rotomWashBlock("rotom/wash/white",MapColor.WHITE);
    public static final Block ROTOM_WASH_LIGHT_GRAY = rotomWashBlock("rotom/wash/light_gray",MapColor.LIGHT_GRAY);
    public static final Block ROTOM_WASH_GRAY = rotomWashBlock("rotom/wash/gray",MapColor.GRAY);
    public static final Block ROTOM_WASH_BLACK = rotomWashBlock("rotom/wash/black",MapColor.BLACK);
    public static final Block ROTOM_WASH_BROWN = rotomWashBlock("rotom/wash/brown",MapColor.BROWN);
    public static final Block ROTOM_WASH_RED = rotomWashBlock("rotom/wash/red",MapColor.RED);
    public static final Block ROTOM_WASH_ORANGE = rotomWashBlock("rotom/wash/orange",MapColor.ORANGE);
    public static final Block ROTOM_WASH_YELLOW = rotomWashBlock("rotom/wash/yellow",MapColor.YELLOW);
    public static final Block ROTOM_WASH_LIME = rotomWashBlock("rotom/wash/lime",MapColor.LIME);
    public static final Block ROTOM_WASH_GREEN = rotomWashBlock("rotom/wash/green",MapColor.GREEN);
    public static final Block ROTOM_WASH_CYAN = rotomWashBlock("rotom/wash/cyan",MapColor.CYAN);
    public static final Block ROTOM_WASH_LIGHT_BLUE = rotomWashBlock("rotom/wash/light_blue",MapColor.LIGHT_BLUE);
    public static final Block ROTOM_WASH_BLUE = rotomWashBlock("rotom/wash/blue",MapColor.BLUE);
    public static final Block ROTOM_WASH_PURPLE = rotomWashBlock("rotom/wash/purple",MapColor.PURPLE);
    public static final Block ROTOM_WASH_MAGENTA = rotomWashBlock("rotom/wash/magenta",MapColor.MAGENTA);
    public static final Block ROTOM_WASH_PINK = rotomWashBlock("rotom/wash/pink",MapColor.PINK);

    //Rotom Freeze
    public static final Block ROTOM_FREEZE_ROTOM = rotomFreezeBlock("rotom/freeze/rotom",MapColor.TERRACOTTA_ORANGE);
    public static final Block ROTOM_FREEZE_SHINY = rotomFreezeBlock("rotom/freeze/shiny",MapColor.TERRACOTTA_RED);
    public static final Block ROTOM_FREEZE_POKEDEX = rotomFreezeBlock("rotom/freeze/pokedex",MapColor.BRIGHT_RED);
    public static final Block ROTOM_FREEZE_WHITE = rotomFreezeBlock("rotom/freeze/white",MapColor.WHITE);
    public static final Block ROTOM_FREEZE_LIGHT_GRAY = rotomFreezeBlock("rotom/freeze/light_gray",MapColor.LIGHT_GRAY);
    public static final Block ROTOM_FREEZE_GRAY = rotomFreezeBlock("rotom/freeze/gray",MapColor.GRAY);
    public static final Block ROTOM_FREEZE_BLACK = rotomFreezeBlock("rotom/freeze/black",MapColor.BLACK);
    public static final Block ROTOM_FREEZE_BROWN = rotomFreezeBlock("rotom/freeze/brown",MapColor.BROWN);
    public static final Block ROTOM_FREEZE_RED = rotomFreezeBlock("rotom/freeze/red",MapColor.RED);
    public static final Block ROTOM_FREEZE_ORANGE = rotomFreezeBlock("rotom/freeze/orange",MapColor.ORANGE);
    public static final Block ROTOM_FREEZE_YELLOW = rotomFreezeBlock("rotom/freeze/yellow",MapColor.YELLOW);
    public static final Block ROTOM_FREEZE_LIME = rotomFreezeBlock("rotom/freeze/lime",MapColor.LIME);
    public static final Block ROTOM_FREEZE_GREEN = rotomFreezeBlock("rotom/freeze/green",MapColor.GREEN);
    public static final Block ROTOM_FREEZE_CYAN = rotomFreezeBlock("rotom/freeze/cyan",MapColor.CYAN);
    public static final Block ROTOM_FREEZE_LIGHT_BLUE = rotomFreezeBlock("rotom/freeze/light_blue",MapColor.LIGHT_BLUE);
    public static final Block ROTOM_FREEZE_BLUE = rotomFreezeBlock("rotom/freeze/blue",MapColor.BLUE);
    public static final Block ROTOM_FREEZE_PURPLE = rotomFreezeBlock("rotom/freeze/purple",MapColor.PURPLE);
    public static final Block ROTOM_FREEZE_MAGENTA = rotomFreezeBlock("rotom/freeze/magenta",MapColor.MAGENTA);
    public static final Block ROTOM_FREEZE_PINK = rotomFreezeBlock("rotom/freeze/pink",MapColor.PINK);
    
    //Rotom Mow
    public static final Block ROTOM_MOW_ROTOM = rotomMowBlock("rotom/mow/rotom",MapColor.TERRACOTTA_ORANGE);
    public static final Block ROTOM_MOW_SHINY = rotomMowBlock("rotom/mow/shiny",MapColor.TERRACOTTA_RED);
    public static final Block ROTOM_MOW_POKEDEX = rotomMowBlock("rotom/mow/pokedex",MapColor.BRIGHT_RED);
    public static final Block ROTOM_MOW_WHITE = rotomMowBlock("rotom/mow/white",MapColor.WHITE);
    public static final Block ROTOM_MOW_LIGHT_GRAY = rotomMowBlock("rotom/mow/light_gray",MapColor.LIGHT_GRAY);
    public static final Block ROTOM_MOW_GRAY = rotomMowBlock("rotom/mow/gray",MapColor.GRAY);
    public static final Block ROTOM_MOW_BLACK = rotomMowBlock("rotom/mow/black",MapColor.BLACK);
    public static final Block ROTOM_MOW_BROWN = rotomMowBlock("rotom/mow/brown",MapColor.BROWN);
    public static final Block ROTOM_MOW_RED = rotomMowBlock("rotom/mow/red",MapColor.RED);
    public static final Block ROTOM_MOW_ORANGE = rotomMowBlock("rotom/mow/orange",MapColor.ORANGE);
    public static final Block ROTOM_MOW_YELLOW = rotomMowBlock("rotom/mow/yellow",MapColor.YELLOW);
    public static final Block ROTOM_MOW_LIME = rotomMowBlock("rotom/mow/lime",MapColor.LIME);
    public static final Block ROTOM_MOW_GREEN = rotomMowBlock("rotom/mow/green",MapColor.GREEN);
    public static final Block ROTOM_MOW_CYAN = rotomMowBlock("rotom/mow/cyan",MapColor.CYAN);
    public static final Block ROTOM_MOW_LIGHT_BLUE = rotomMowBlock("rotom/mow/light_blue",MapColor.LIGHT_BLUE);
    public static final Block ROTOM_MOW_BLUE = rotomMowBlock("rotom/mow/blue",MapColor.BLUE);
    public static final Block ROTOM_MOW_PURPLE = rotomMowBlock("rotom/mow/purple",MapColor.PURPLE);
    public static final Block ROTOM_MOW_MAGENTA = rotomMowBlock("rotom/mow/magenta",MapColor.MAGENTA);
    public static final Block ROTOM_MOW_PINK = rotomMowBlock("rotom/mow/pink",MapColor.PINK);
    
    //Rotom Heat
    public static final Block ROTOM_HEAT_ROTOM = rotomHeatBlock("rotom/heat/rotom",MapColor.TERRACOTTA_ORANGE);
    public static final Block ROTOM_HEAT_SHINY = rotomHeatBlock("rotom/heat/shiny",MapColor.TERRACOTTA_RED);
    public static final Block ROTOM_HEAT_POKEDEX = rotomHeatBlock("rotom/heat/pokedex",MapColor.BRIGHT_RED);
    public static final Block ROTOM_HEAT_WHITE = rotomHeatBlock("rotom/heat/white",MapColor.WHITE);
    public static final Block ROTOM_HEAT_LIGHT_GRAY = rotomHeatBlock("rotom/heat/light_gray",MapColor.LIGHT_GRAY);
    public static final Block ROTOM_HEAT_GRAY = rotomHeatBlock("rotom/heat/gray",MapColor.GRAY);
    public static final Block ROTOM_HEAT_BLACK = rotomHeatBlock("rotom/heat/black",MapColor.BLACK);
    public static final Block ROTOM_HEAT_BROWN = rotomHeatBlock("rotom/heat/brown",MapColor.BROWN);
    public static final Block ROTOM_HEAT_RED = rotomHeatBlock("rotom/heat/red",MapColor.RED);
    public static final Block ROTOM_HEAT_ORANGE = rotomHeatBlock("rotom/heat/orange",MapColor.ORANGE);
    public static final Block ROTOM_HEAT_YELLOW = rotomHeatBlock("rotom/heat/yellow",MapColor.YELLOW);
    public static final Block ROTOM_HEAT_LIME = rotomHeatBlock("rotom/heat/lime",MapColor.LIME);
    public static final Block ROTOM_HEAT_GREEN = rotomHeatBlock("rotom/heat/green",MapColor.GREEN);
    public static final Block ROTOM_HEAT_CYAN = rotomHeatBlock("rotom/heat/cyan",MapColor.CYAN);
    public static final Block ROTOM_HEAT_LIGHT_BLUE = rotomHeatBlock("rotom/heat/light_blue",MapColor.LIGHT_BLUE);
    public static final Block ROTOM_HEAT_BLUE = rotomHeatBlock("rotom/heat/blue",MapColor.BLUE);
    public static final Block ROTOM_HEAT_PURPLE = rotomHeatBlock("rotom/heat/purple",MapColor.PURPLE);
    public static final Block ROTOM_HEAT_MAGENTA = rotomHeatBlock("rotom/heat/magenta",MapColor.MAGENTA);
    public static final Block ROTOM_HEAT_PINK = rotomHeatBlock("rotom/heat/pink",MapColor.PINK);

    //Rotom Fan
    public static final Block ROTOM_FAN_ROTOM = rotomFanBlock("rotom/fan/rotom",MapColor.TERRACOTTA_ORANGE);
    public static final Block ROTOM_FAN_SHINY = rotomFanBlock("rotom/fan/shiny",MapColor.TERRACOTTA_RED);
    public static final Block ROTOM_FAN_POKEDEX = rotomFanBlock("rotom/fan/pokedex",MapColor.BRIGHT_RED);
    public static final Block ROTOM_FAN_WHITE = rotomFanBlock("rotom/fan/white",MapColor.WHITE);
    public static final Block ROTOM_FAN_LIGHT_GRAY = rotomFanBlock("rotom/fan/light_gray",MapColor.LIGHT_GRAY);
    public static final Block ROTOM_FAN_GRAY = rotomFanBlock("rotom/fan/gray",MapColor.GRAY);
    public static final Block ROTOM_FAN_BLACK = rotomFanBlock("rotom/fan/black",MapColor.BLACK);
    public static final Block ROTOM_FAN_BROWN = rotomFanBlock("rotom/fan/brown",MapColor.BROWN);
    public static final Block ROTOM_FAN_RED = rotomFanBlock("rotom/fan/red",MapColor.RED);
    public static final Block ROTOM_FAN_ORANGE = rotomFanBlock("rotom/fan/orange",MapColor.ORANGE);
    public static final Block ROTOM_FAN_YELLOW = rotomFanBlock("rotom/fan/yellow",MapColor.YELLOW);
    public static final Block ROTOM_FAN_LIME = rotomFanBlock("rotom/fan/lime",MapColor.LIME);
    public static final Block ROTOM_FAN_GREEN = rotomFanBlock("rotom/fan/green",MapColor.GREEN);
    public static final Block ROTOM_FAN_CYAN = rotomFanBlock("rotom/fan/cyan",MapColor.CYAN);
    public static final Block ROTOM_FAN_LIGHT_BLUE = rotomFanBlock("rotom/fan/light_blue",MapColor.LIGHT_BLUE);
    public static final Block ROTOM_FAN_BLUE = rotomFanBlock("rotom/fan/blue",MapColor.BLUE);
    public static final Block ROTOM_FAN_PURPLE = rotomFanBlock("rotom/fan/purple",MapColor.PURPLE);
    public static final Block ROTOM_FAN_MAGENTA = rotomFanBlock("rotom/fan/magenta",MapColor.MAGENTA);
    public static final Block ROTOM_FAN_PINK = rotomFanBlock("rotom/fan/pink",MapColor.PINK);

    //Cushions
    public static final Block NORMAL_CUSHION = carpetBlock("cushion/normal", MapColor.WHITE);
    public static final Block FIGHTING_CUSHION = carpetBlock("cushion/fighting", MapColor.OAK_TAN);
    public static final Block FLYING_CUSHION = carpetBlock("cushion/flying", MapColor.LIGHT_BLUE);
    public static final Block BUG_CUSHION = carpetBlock("cushion/bug", MapColor.PALE_GREEN);
    public static final Block POISON_CUSHION = carpetBlock("cushion/poison", MapColor.PURPLE);
    public static final Block GROUND_CUSHION = carpetBlock("cushion/ground", MapColor.BROWN);
    public static final Block ROCK_CUSHION = carpetBlock("cushion/rock", MapColor.RAW_IRON_PINK);
    public static final Block FIRE_CUSHION = carpetBlock("cushion/fire", MapColor.RED);
    public static final Block WATER_CUSHION = carpetBlock("cushion/water", MapColor.BLUE);
    public static final Block GRASS_CUSHION = carpetBlock("cushion/grass", MapColor.LIME);
    public static final Block ELECTRIC_CUSHION = carpetBlock("cushion/electric", MapColor.YELLOW);
    public static final Block ICE_CUSHION = carpetBlock("cushion/ice", MapColor.CYAN);
    public static final Block GHOST_CUSHION = carpetBlock("cushion/ghost", MapColor.PALE_PURPLE);
    public static final Block PSYCHIC_CUSHION = carpetBlock("cushion/psychic", MapColor.PINK);
    public static final Block DRAGON_CUSHION = carpetBlock("cushion/dragon", MapColor.DARK_AQUA);
    public static final Block DARK_CUSHION = carpetBlock("cushion/dark", MapColor.GRAY);
    public static final Block STEEL_CUSHION = carpetBlock("cushion/steel", MapColor.IRON_GRAY);
    public static final Block FAIRY_CUSHION = carpetBlock("cushion/fairy", MapColor.MAGENTA);
    //Wool
    public static final Block NORMAL_WOOL = woolBlock("wool/normal", MapColor.WHITE);
    public static final Block FIGHTING_WOOL = woolBlock("wool/fighting", MapColor.OAK_TAN);
    public static final Block FLYING_WOOL = woolBlock("wool/flying", MapColor.LIGHT_BLUE);
    public static final Block BUG_WOOL = woolBlock("wool/bug", MapColor.PALE_GREEN);
    public static final Block POISON_WOOL = woolBlock("wool/poison", MapColor.PURPLE);
    public static final Block GROUND_WOOL = woolBlock("wool/ground", MapColor.BROWN);
    public static final Block ROCK_WOOL = woolBlock("wool/rock", MapColor.RAW_IRON_PINK);
    public static final Block FIRE_WOOL = woolBlock("wool/fire", MapColor.RED);
    public static final Block WATER_WOOL = woolBlock("wool/water", MapColor.BLUE);
    public static final Block GRASS_WOOL = woolBlock("wool/grass", MapColor.LIME);
    public static final Block ELECTRIC_WOOL = woolBlock("wool/electric", MapColor.YELLOW);
    public static final Block ICE_WOOL = woolBlock("wool/ice", MapColor.CYAN);
    public static final Block GHOST_WOOL = woolBlock("wool/ghost", MapColor.PALE_PURPLE);
    public static final Block PSYCHIC_WOOL = woolBlock("wool/psychic", MapColor.PINK);
    public static final Block DRAGON_WOOL = woolBlock("wool/dragon", MapColor.DARK_AQUA);
    public static final Block DARK_WOOL = woolBlock("wool/dark", MapColor.GRAY);
    public static final Block STEEL_WOOL = woolBlock("wool/steel", MapColor.IRON_GRAY);
    public static final Block FAIRY_WOOL = woolBlock("wool/fairy", MapColor.MAGENTA);

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(SmearglesDecorations.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(SmearglesDecorations.MOD_ID, name),
                new BlockItem(block,new Item.Settings())
        );
    }
    private static void registerBlockItem(String name, Block block, String folder) {
        Registry.register(Registries.ITEM, Identifier.of(SmearglesDecorations.MOD_ID, name),
            new BlockItem(block,new Item.Settings())
        );
    }


    public static void registerModBlocks() {
        SmearglesDecorations.LOGGER.info("Registering Mod Blocks for "+ SmearglesDecorations.MOD_ID);

    }

    public static Block woolBlock(String id, MapColor color) {
        return registerBlock(id,
                new OrientableBlockOpposite(AbstractBlock.Settings.create()
                    .mapColor(color)
                    .strength(0.8F, 0.8F)
                    .sounds(BlockSoundGroup.WOOL)
                    .burnable()
                )
        );
    }
    public static Block carpetBlock(String id, MapColor color) {
        return registerBlock(id,
            new OrientableCarpet(AbstractBlock.Settings.create()
                    .mapColor(color)
                    .nonOpaque()
                    .strength(0.1F, 0.1F)
                    .sounds(BlockSoundGroup.WOOL)
                    .burnable()
            )
        );
    }

    public static Block rotomWashBlock(String id, MapColor color) {
        return registerBlock(id,
                new RotomWash(AbstractBlock.Settings.create()
                        .mapColor(color)
                        .requiresTool()
                        .nonOpaque()
                        .solid()
                        .strength(5.0F, 6.0F)
                        .sounds(BlockSoundGroup.METAL)
                )
        );
    }
    public static Block rotomFreezeBlock(String id, MapColor color) {
        return registerBlock(id,
                new RotomFreeze(AbstractBlock.Settings.create()
                        .mapColor(color)
                        .requiresTool()
                        .nonOpaque()
                        .strength(5.0F, 6.0F)
                        .sounds(BlockSoundGroup.METAL)
                )
        );
    }
    public static Block rotomMowBlock(String id, MapColor color) {
        return registerBlock(id,
                new RotomMow(AbstractBlock.Settings.create()
                        .mapColor(color)
                        .requiresTool()
                        .nonOpaque()
                        .strength(5.0F, 6.0F)
                        .sounds(BlockSoundGroup.METAL)
                )
        );
    }
    public static Block rotomHeatBlock(String id, MapColor color) {
        return registerBlock(id,
                new RotomHeat(AbstractBlock.Settings.create()
                        .mapColor(color)
                        .requiresTool()
                        .nonOpaque()
                        .strength(5.0F, 6.0F)
                        .luminance(createLightLevelFromLitBlockState(13))
                        .sounds(BlockSoundGroup.METAL)
                )
        );
    }
    public static Block rotomFanBlock(String id, MapColor color) {
        return registerBlock(id,
                new RotomFan(AbstractBlock.Settings.create()
                        .mapColor(color)
                        .requiresTool()
                        .nonOpaque()
                        .strength(5.0F, 6.0F)
                        .sounds(BlockSoundGroup.METAL)
                )
        );
    }
}
