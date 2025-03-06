package net.dragonmaster95.smeargles_decorations.datagen;

import net.dragonmaster95.smeargles_decorations.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(BlockTags.WOOL)
                .add(ModBlocks.NORMAL_WOOL)
                .add(ModBlocks.FIGHTING_WOOL)
                .add(ModBlocks.FLYING_WOOL)
                .add(ModBlocks.BUG_WOOL)
                .add(ModBlocks.POISON_WOOL)
                .add(ModBlocks.GROUND_WOOL)
                .add(ModBlocks.ROCK_WOOL)
                .add(ModBlocks.FIRE_WOOL)
                .add(ModBlocks.WATER_WOOL)
                .add(ModBlocks.GRASS_WOOL)
                .add(ModBlocks.ELECTRIC_WOOL)
                .add(ModBlocks.ICE_WOOL)
                .add(ModBlocks.GHOST_WOOL)
                .add(ModBlocks.PSYCHIC_WOOL)
                .add(ModBlocks.DRAGON_WOOL)
                .add(ModBlocks.DARK_WOOL)
                .add(ModBlocks.STEEL_WOOL)
                .add(ModBlocks.FAIRY_WOOL);

        getOrCreateTagBuilder(BlockTags.WOOL_CARPETS)
                .add(ModBlocks.NORMAL_CUSHION)
                .add(ModBlocks.FIGHTING_CUSHION)
                .add(ModBlocks.FLYING_CUSHION)
                .add(ModBlocks.BUG_CUSHION)
                .add(ModBlocks.POISON_CUSHION)
                .add(ModBlocks.GROUND_CUSHION)
                .add(ModBlocks.ROCK_CUSHION)
                .add(ModBlocks.FIRE_CUSHION)
                .add(ModBlocks.WATER_CUSHION)
                .add(ModBlocks.GRASS_CUSHION)
                .add(ModBlocks.ELECTRIC_CUSHION)
                .add(ModBlocks.ICE_CUSHION)
                .add(ModBlocks.GHOST_CUSHION)
                .add(ModBlocks.PSYCHIC_CUSHION)
                .add(ModBlocks.DRAGON_CUSHION)
                .add(ModBlocks.DARK_CUSHION)
                .add(ModBlocks.STEEL_CUSHION)
                .add(ModBlocks.FAIRY_CUSHION);

        /*getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.ROTOM_WASH);*/
    }
}
