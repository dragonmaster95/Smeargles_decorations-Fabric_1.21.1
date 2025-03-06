package net.dragonmaster95.smeargles_decorations.block;

import net.dragonmaster95.smeargles_decorations.SmearglesDecorations;
import net.dragonmaster95.smeargles_decorations.block.custom.OrientableBlock;
import net.dragonmaster95.smeargles_decorations.block.custom.OrientableCarpet;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static final Block ROTOM_WASH = registerBlock("rotom/wash",
            new OrientableBlock(AbstractBlock.Settings.create()
                .mapColor(MapColor.IRON_GRAY)
                .requiresTool()
                .nonOpaque()
                .strength(5.0F, 6.0F)
                .sounds(BlockSoundGroup.METAL)
            )
    );


    public static final Block NORMAL_CUSHION = carpetBlock("cushions/normal", MapColor.WHITE);
    public static final Block FIGHTING_CUSHION = carpetBlock("cushions/fighting", MapColor.OAK_TAN);
    public static final Block FLYING_CUSHION = carpetBlock("cushions/flying", MapColor.LIGHT_BLUE);
    public static final Block BUG_CUSHION = carpetBlock("cushions/bug", MapColor.PALE_GREEN);
    public static final Block POISON_CUSHION = carpetBlock("cushions/poison", MapColor.PURPLE);
    public static final Block GROUND_CUSHION = carpetBlock("cushions/ground", MapColor.BROWN);
    public static final Block ROCK_CUSHION = carpetBlock("cushions/rock", MapColor.RAW_IRON_PINK);
    public static final Block FIRE_CUSHION = carpetBlock("cushions/fire", MapColor.RED);
    public static final Block WATER_CUSHION = carpetBlock("cushions/water", MapColor.BLUE);
    public static final Block GRASS_CUSHION = carpetBlock("cushions/grass", MapColor.LIME);
    public static final Block ELECTRIC_CUSHION = carpetBlock("cushions/electric", MapColor.YELLOW);
    public static final Block ICE_CUSHION = carpetBlock("cushions/ice", MapColor.CYAN);
    public static final Block GHOST_CUSHION = carpetBlock("cushions/ghost", MapColor.PALE_PURPLE);
    public static final Block PSYCHIC_CUSHION = carpetBlock("cushions/psychic", MapColor.PINK);
    public static final Block DRAGON_CUSHION = carpetBlock("cushions/dragon", MapColor.DARK_AQUA);
    public static final Block DARK_CUSHION = carpetBlock("cushions/dark", MapColor.GRAY);
    public static final Block STEEL_CUSHION = carpetBlock("cushions/steel", MapColor.IRON_GRAY);
    public static final Block FAIRY_CUSHION = carpetBlock("cushions/fairy", MapColor.TERRACOTTA_PINK);

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
    public static final Block FAIRY_WOOL = woolBlock("wool/fairy", MapColor.TERRACOTTA_PINK);

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
                new OrientableBlock(AbstractBlock.Settings.create()
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
                    .breakInstantly()
                    .sounds(BlockSoundGroup.WOOL)
                    .burnable()
            )
        );
    }
}
