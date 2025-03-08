package net.dragonmaster95.smeargles_decorations.datagen;

import net.dragonmaster95.smeargles_decorations.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.Block;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.Item;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.entry.LeafEntry;
import net.minecraft.loot.function.ApplyBonusLootFunction;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.ROTOM_WASH_ROTOM);
        addDrop(ModBlocks.ROTOM_WASH_SHINY);
        addDrop(ModBlocks.ROTOM_WASH_POKEDEX);
        addDrop(ModBlocks.ROTOM_WASH_WHITE);
        addDrop(ModBlocks.ROTOM_WASH_LIGHT_GRAY);
        addDrop(ModBlocks.ROTOM_WASH_GRAY);
        addDrop(ModBlocks.ROTOM_WASH_BLACK);
        addDrop(ModBlocks.ROTOM_WASH_BROWN);
        addDrop(ModBlocks.ROTOM_WASH_RED);
        addDrop(ModBlocks.ROTOM_WASH_ORANGE);
        addDrop(ModBlocks.ROTOM_WASH_YELLOW);
        addDrop(ModBlocks.ROTOM_WASH_LIME);
        addDrop(ModBlocks.ROTOM_WASH_GREEN);
        addDrop(ModBlocks.ROTOM_WASH_CYAN);
        addDrop(ModBlocks.ROTOM_WASH_LIGHT_BLUE);
        addDrop(ModBlocks.ROTOM_WASH_BLUE);
        addDrop(ModBlocks.ROTOM_WASH_PURPLE);
        addDrop(ModBlocks.ROTOM_WASH_MAGENTA);
        addDrop(ModBlocks.ROTOM_WASH_PINK);
        addDrop(ModBlocks.ROTOM_FREEZE_ROTOM);
        addDrop(ModBlocks.ROTOM_FREEZE_SHINY);
        addDrop(ModBlocks.ROTOM_FREEZE_POKEDEX);
        addDrop(ModBlocks.ROTOM_FREEZE_WHITE);
        addDrop(ModBlocks.ROTOM_FREEZE_LIGHT_GRAY);
        addDrop(ModBlocks.ROTOM_FREEZE_GRAY);
        addDrop(ModBlocks.ROTOM_FREEZE_BLACK);
        addDrop(ModBlocks.ROTOM_FREEZE_BROWN);
        addDrop(ModBlocks.ROTOM_FREEZE_RED);
        addDrop(ModBlocks.ROTOM_FREEZE_ORANGE);
        addDrop(ModBlocks.ROTOM_FREEZE_YELLOW);
        addDrop(ModBlocks.ROTOM_FREEZE_LIME);
        addDrop(ModBlocks.ROTOM_FREEZE_GREEN);
        addDrop(ModBlocks.ROTOM_FREEZE_CYAN);
        addDrop(ModBlocks.ROTOM_FREEZE_LIGHT_BLUE);
        addDrop(ModBlocks.ROTOM_FREEZE_BLUE);
        addDrop(ModBlocks.ROTOM_FREEZE_PURPLE);
        addDrop(ModBlocks.ROTOM_FREEZE_MAGENTA);
        addDrop(ModBlocks.ROTOM_FREEZE_PINK);
        addDrop(ModBlocks.ROTOM_MOW_ROTOM);
        addDrop(ModBlocks.ROTOM_MOW_SHINY);
        addDrop(ModBlocks.ROTOM_MOW_POKEDEX);
        addDrop(ModBlocks.ROTOM_MOW_WHITE);
        addDrop(ModBlocks.ROTOM_MOW_LIGHT_GRAY);
        addDrop(ModBlocks.ROTOM_MOW_GRAY);
        addDrop(ModBlocks.ROTOM_MOW_BLACK);
        addDrop(ModBlocks.ROTOM_MOW_BROWN);
        addDrop(ModBlocks.ROTOM_MOW_RED);
        addDrop(ModBlocks.ROTOM_MOW_ORANGE);
        addDrop(ModBlocks.ROTOM_MOW_YELLOW);
        addDrop(ModBlocks.ROTOM_MOW_LIME);
        addDrop(ModBlocks.ROTOM_MOW_GREEN);
        addDrop(ModBlocks.ROTOM_MOW_CYAN);
        addDrop(ModBlocks.ROTOM_MOW_LIGHT_BLUE);
        addDrop(ModBlocks.ROTOM_MOW_BLUE);
        addDrop(ModBlocks.ROTOM_MOW_PURPLE);
        addDrop(ModBlocks.ROTOM_MOW_MAGENTA);
        addDrop(ModBlocks.ROTOM_MOW_PINK);
        addDrop(ModBlocks.ROTOM_HEAT_ROTOM);
        addDrop(ModBlocks.ROTOM_HEAT_SHINY);
        addDrop(ModBlocks.ROTOM_HEAT_POKEDEX);
        addDrop(ModBlocks.ROTOM_HEAT_WHITE);
        addDrop(ModBlocks.ROTOM_HEAT_LIGHT_GRAY);
        addDrop(ModBlocks.ROTOM_HEAT_GRAY);
        addDrop(ModBlocks.ROTOM_HEAT_BLACK);
        addDrop(ModBlocks.ROTOM_HEAT_BROWN);
        addDrop(ModBlocks.ROTOM_HEAT_RED);
        addDrop(ModBlocks.ROTOM_HEAT_ORANGE);
        addDrop(ModBlocks.ROTOM_HEAT_YELLOW);
        addDrop(ModBlocks.ROTOM_HEAT_LIME);
        addDrop(ModBlocks.ROTOM_HEAT_GREEN);
        addDrop(ModBlocks.ROTOM_HEAT_CYAN);
        addDrop(ModBlocks.ROTOM_HEAT_LIGHT_BLUE);
        addDrop(ModBlocks.ROTOM_HEAT_BLUE);
        addDrop(ModBlocks.ROTOM_HEAT_PURPLE);
        addDrop(ModBlocks.ROTOM_HEAT_MAGENTA);
        addDrop(ModBlocks.ROTOM_HEAT_PINK);
        addDrop(ModBlocks.ROTOM_FAN_ROTOM);
        addDrop(ModBlocks.ROTOM_FAN_SHINY);
        addDrop(ModBlocks.ROTOM_FAN_POKEDEX);
        addDrop(ModBlocks.ROTOM_FAN_WHITE);
        addDrop(ModBlocks.ROTOM_FAN_LIGHT_GRAY);
        addDrop(ModBlocks.ROTOM_FAN_GRAY);
        addDrop(ModBlocks.ROTOM_FAN_BLACK);
        addDrop(ModBlocks.ROTOM_FAN_BROWN);
        addDrop(ModBlocks.ROTOM_FAN_RED);
        addDrop(ModBlocks.ROTOM_FAN_ORANGE);
        addDrop(ModBlocks.ROTOM_FAN_YELLOW);
        addDrop(ModBlocks.ROTOM_FAN_LIME);
        addDrop(ModBlocks.ROTOM_FAN_GREEN);
        addDrop(ModBlocks.ROTOM_FAN_CYAN);
        addDrop(ModBlocks.ROTOM_FAN_LIGHT_BLUE);
        addDrop(ModBlocks.ROTOM_FAN_BLUE);
        addDrop(ModBlocks.ROTOM_FAN_PURPLE);
        addDrop(ModBlocks.ROTOM_FAN_MAGENTA);
        addDrop(ModBlocks.ROTOM_FAN_PINK);

        addDrop(ModBlocks.NORMAL_WOOL);
        addDrop(ModBlocks.NORMAL_CUSHION);
        addDrop(ModBlocks.FIGHTING_WOOL);
        addDrop(ModBlocks.FIGHTING_CUSHION);
        addDrop(ModBlocks.FLYING_WOOL);
        addDrop(ModBlocks.FLYING_CUSHION);
        addDrop(ModBlocks.BUG_WOOL);
        addDrop(ModBlocks.BUG_CUSHION);
        addDrop(ModBlocks.POISON_WOOL);
        addDrop(ModBlocks.POISON_CUSHION);
        addDrop(ModBlocks.GROUND_WOOL);
        addDrop(ModBlocks.GROUND_CUSHION);
        addDrop(ModBlocks.ROCK_WOOL);
        addDrop(ModBlocks.ROCK_CUSHION);
        addDrop(ModBlocks.FIRE_WOOL);
        addDrop(ModBlocks.FIRE_CUSHION);
        addDrop(ModBlocks.WATER_WOOL);
        addDrop(ModBlocks.WATER_CUSHION);
        addDrop(ModBlocks.GRASS_WOOL);
        addDrop(ModBlocks.GRASS_CUSHION);
        addDrop(ModBlocks.ELECTRIC_WOOL);
        addDrop(ModBlocks.ELECTRIC_CUSHION);
        addDrop(ModBlocks.ICE_WOOL);
        addDrop(ModBlocks.ICE_CUSHION);
        addDrop(ModBlocks.GHOST_WOOL);
        addDrop(ModBlocks.GHOST_CUSHION);
        addDrop(ModBlocks.PSYCHIC_WOOL);
        addDrop(ModBlocks.PSYCHIC_CUSHION);
        addDrop(ModBlocks.DRAGON_WOOL);
        addDrop(ModBlocks.DRAGON_CUSHION);
        addDrop(ModBlocks.DARK_WOOL);
        addDrop(ModBlocks.DARK_CUSHION);
        addDrop(ModBlocks.STEEL_WOOL);
        addDrop(ModBlocks.STEEL_CUSHION);
        addDrop(ModBlocks.FAIRY_WOOL);
        addDrop(ModBlocks.FAIRY_CUSHION);

        //addDrop(ModBlocks.ORE_BLOCK, multipleOreDrops(ModBlocks.ORE_BLOCK, ModItems.ORE_ITEM, 2, 7));
    }


    public LootTable.Builder multipleOreDrops(Block drop, Item item, float minDrops, float maxDrops) {
        RegistryWrapper.Impl<Enchantment> impl = this.registryLookup.getWrapperOrThrow(RegistryKeys.ENCHANTMENT);
        return this.dropsWithSilkTouch(drop, this.applyExplosionDecay(drop, ((LeafEntry.Builder<?>)
                ItemEntry.builder(item).apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(minDrops,maxDrops))))
                .apply(ApplyBonusLootFunction.oreDrops((impl.getOrThrow((Enchantments.FORTUNE)))))));
    }
}
