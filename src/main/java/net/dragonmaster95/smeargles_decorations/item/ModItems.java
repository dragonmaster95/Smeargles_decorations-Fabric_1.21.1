package net.dragonmaster95.smeargles_decorations.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.dragonmaster95.smeargles_decorations.SmearglesDecorations;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    //public static final Item TEST_BLOCK = registerItem("test_block", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(SmearglesDecorations.MOD_ID, name), item);
    }

    public static void registerModItems() {
        SmearglesDecorations.LOGGER.info("Registering Mod Items for "+ SmearglesDecorations.MOD_ID);

        /*ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(TEST_BLOCK);
        });*/
    }
}
