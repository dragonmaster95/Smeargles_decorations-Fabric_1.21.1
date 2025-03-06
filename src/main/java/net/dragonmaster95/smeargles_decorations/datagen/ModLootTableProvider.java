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
        addDrop(ModBlocks.ROTOM_WASH);
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
