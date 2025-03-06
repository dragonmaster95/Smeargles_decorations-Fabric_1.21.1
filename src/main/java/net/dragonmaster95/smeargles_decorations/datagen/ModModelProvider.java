package net.dragonmaster95.smeargles_decorations.datagen;

import net.dragonmaster95.smeargles_decorations.block.ModBlocks;
import net.dragonmaster95.smeargles_decorations.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.block.Block;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.ROTOM_WASH);

        registerWoolAndCarpet(blockStateModelGenerator, ModBlocks.NORMAL_WOOL, ModBlocks.NORMAL_CUSHION);
        registerWoolAndCarpet(blockStateModelGenerator, ModBlocks.FIGHTING_WOOL, ModBlocks.FIGHTING_CUSHION);
        registerWoolAndCarpet(blockStateModelGenerator, ModBlocks.FLYING_WOOL, ModBlocks.FLYING_CUSHION);
        registerWoolAndCarpet(blockStateModelGenerator, ModBlocks.BUG_WOOL, ModBlocks.BUG_CUSHION);
        registerWoolAndCarpet(blockStateModelGenerator, ModBlocks.POISON_WOOL, ModBlocks.POISON_CUSHION);
        registerWoolAndCarpet(blockStateModelGenerator, ModBlocks.GROUND_WOOL, ModBlocks.GROUND_CUSHION);
        registerWoolAndCarpet(blockStateModelGenerator, ModBlocks.ROCK_WOOL, ModBlocks.ROCK_CUSHION);
        registerWoolAndCarpet(blockStateModelGenerator, ModBlocks.FIRE_WOOL, ModBlocks.FIRE_CUSHION);
        registerWoolAndCarpet(blockStateModelGenerator, ModBlocks.WATER_WOOL, ModBlocks.WATER_CUSHION);
        registerWoolAndCarpet(blockStateModelGenerator, ModBlocks.GRASS_WOOL, ModBlocks.GRASS_CUSHION);
        registerWoolAndCarpet(blockStateModelGenerator, ModBlocks.ELECTRIC_WOOL, ModBlocks.ELECTRIC_CUSHION);
        registerWoolAndCarpet(blockStateModelGenerator, ModBlocks.ICE_WOOL, ModBlocks.ICE_CUSHION);
        registerWoolAndCarpet(blockStateModelGenerator, ModBlocks.GHOST_WOOL, ModBlocks.GHOST_CUSHION);
        registerWoolAndCarpet(blockStateModelGenerator, ModBlocks.PSYCHIC_WOOL, ModBlocks.PSYCHIC_CUSHION);
        registerWoolAndCarpet(blockStateModelGenerator, ModBlocks.DRAGON_WOOL, ModBlocks.DRAGON_CUSHION);
        registerWoolAndCarpet(blockStateModelGenerator, ModBlocks.DARK_WOOL, ModBlocks.DARK_CUSHION);
        registerWoolAndCarpet(blockStateModelGenerator, ModBlocks.STEEL_WOOL, ModBlocks.STEEL_CUSHION);
        registerWoolAndCarpet(blockStateModelGenerator, ModBlocks.FAIRY_WOOL, ModBlocks.FAIRY_CUSHION);


    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        //itemModelGenerator.register(ModItems.EXAMPLE_ITEM, Models.GENERATED);
    }

    protected void registerWoolAndCarpet(BlockStateModelGenerator generator, Block wool, Block carpet) {
        generator.registerNorthDefaultHorizontalRotation(wool);
        generator.registerNorthDefaultHorizontalRotation(carpet);
    }
}
