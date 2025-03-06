package net.dragonmaster95.smeargles_decorations.block;

import net.dragonmaster95.smeargles_decorations.SmearglesDecorations;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.HorizontalFacingBlock;
import net.minecraft.block.MapColor;
import net.minecraft.block.enums.NoteBlockInstrument;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static final Block ROTOM_WASH = registerBlock("rotom_wash",
            new Block(HorizontalFacingBlock.Settings.create()
                .mapColor(MapColor.IRON_GRAY)
                .requiresTool()
                .strength(5.0F, 6.0F)
                .sounds(BlockSoundGroup.METAL)
    ));

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
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
            entries.add(ModBlocks.ROTOM_WASH);
        });

    }
}
