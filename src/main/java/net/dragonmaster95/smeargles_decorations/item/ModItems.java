package net.dragonmaster95.smeargles_decorations.item;

import net.dragonmaster95.smeargles_decorations.SmearglesDecorations;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.Block;
import net.minecraft.block.entity.BannerPattern;
import net.minecraft.item.BannerPatternItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.dragonmaster95.smeargles_decorations.utils.ModTags;

public class ModItems {
    //public static final Item TEST_BLOCK = registerItem("test_block", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(SmearglesDecorations.MOD_ID, name), item);
    }

    public static void registerModItems() {
        SmearglesDecorations.LOGGER.info("Registering Mod Items for " + SmearglesDecorations.MOD_ID);

        //ItemGroupEvents.modifyEntriesEvent(ItemGroups.)
        /*ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(TEST_BLOCK);
        });*/
    }

    private static Item registerBanner(String id, TagKey<BannerPattern> patternItemTag, Item.Settings settings) {
        return Registry.register(
                Registries.ITEM,
                Identifier.of(SmearglesDecorations.MOD_ID, id),
                new BannerPatternItem(patternItemTag, settings)
        );
    }
}
