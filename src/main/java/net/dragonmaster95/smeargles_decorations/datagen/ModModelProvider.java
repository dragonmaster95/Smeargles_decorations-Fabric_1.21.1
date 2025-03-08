package net.dragonmaster95.smeargles_decorations.datagen;

import com.google.gson.JsonElement;
import net.dragonmaster95.smeargles_decorations.block.ModBlocks;
import net.dragonmaster95.smeargles_decorations.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.data.client.*;
import net.minecraft.registry.Registries;
import net.minecraft.state.property.Properties;
import net.minecraft.util.Identifier;

import java.util.function.BiConsumer;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

import static net.minecraft.data.client.BlockStateModelGenerator.*;

public class ModModelProvider extends FabricModelProvider {

    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.ROTOM_WASH_ROTOM);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.ROTOM_WASH_SHINY);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.ROTOM_WASH_POKEDEX);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.ROTOM_WASH_WHITE);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.ROTOM_WASH_LIGHT_GRAY);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.ROTOM_WASH_GRAY);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.ROTOM_WASH_BLACK);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.ROTOM_WASH_BROWN);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.ROTOM_WASH_RED);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.ROTOM_WASH_ORANGE);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.ROTOM_WASH_YELLOW);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.ROTOM_WASH_LIME);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.ROTOM_WASH_GREEN);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.ROTOM_WASH_CYAN);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.ROTOM_WASH_LIGHT_BLUE);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.ROTOM_WASH_BLUE);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.ROTOM_WASH_PURPLE);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.ROTOM_WASH_MAGENTA);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.ROTOM_WASH_PINK);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.ROTOM_FREEZE_ROTOM);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.ROTOM_FREEZE_SHINY);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.ROTOM_FREEZE_POKEDEX);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.ROTOM_FREEZE_WHITE);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.ROTOM_FREEZE_LIGHT_GRAY);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.ROTOM_FREEZE_GRAY);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.ROTOM_FREEZE_BLACK);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.ROTOM_FREEZE_BROWN);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.ROTOM_FREEZE_RED);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.ROTOM_FREEZE_ORANGE);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.ROTOM_FREEZE_YELLOW);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.ROTOM_FREEZE_LIME);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.ROTOM_FREEZE_GREEN);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.ROTOM_FREEZE_CYAN);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.ROTOM_FREEZE_LIGHT_BLUE);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.ROTOM_FREEZE_BLUE);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.ROTOM_FREEZE_PURPLE);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.ROTOM_FREEZE_MAGENTA);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.ROTOM_FREEZE_PINK);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.ROTOM_MOW_ROTOM);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.ROTOM_MOW_SHINY);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.ROTOM_MOW_POKEDEX);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.ROTOM_MOW_WHITE);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.ROTOM_MOW_LIGHT_GRAY);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.ROTOM_MOW_GRAY);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.ROTOM_MOW_BLACK);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.ROTOM_MOW_BROWN);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.ROTOM_MOW_RED);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.ROTOM_MOW_ORANGE);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.ROTOM_MOW_YELLOW);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.ROTOM_MOW_LIME);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.ROTOM_MOW_GREEN);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.ROTOM_MOW_CYAN);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.ROTOM_MOW_LIGHT_BLUE);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.ROTOM_MOW_BLUE);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.ROTOM_MOW_PURPLE);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.ROTOM_MOW_MAGENTA);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.ROTOM_MOW_PINK);
        registerRotomHeat(blockStateModelGenerator,ModBlocks.ROTOM_HEAT_ROTOM);
        registerRotomHeat(blockStateModelGenerator,ModBlocks.ROTOM_HEAT_SHINY);
        registerRotomHeat(blockStateModelGenerator,ModBlocks.ROTOM_HEAT_POKEDEX);
        registerRotomHeat(blockStateModelGenerator,ModBlocks.ROTOM_HEAT_WHITE);
        registerRotomHeat(blockStateModelGenerator,ModBlocks.ROTOM_HEAT_LIGHT_GRAY);
        registerRotomHeat(blockStateModelGenerator,ModBlocks.ROTOM_HEAT_GRAY);
        registerRotomHeat(blockStateModelGenerator,ModBlocks.ROTOM_HEAT_BLACK);
        registerRotomHeat(blockStateModelGenerator,ModBlocks.ROTOM_HEAT_BROWN);
        registerRotomHeat(blockStateModelGenerator,ModBlocks.ROTOM_HEAT_RED);
        registerRotomHeat(blockStateModelGenerator,ModBlocks.ROTOM_HEAT_ORANGE);
        registerRotomHeat(blockStateModelGenerator,ModBlocks.ROTOM_HEAT_YELLOW);
        registerRotomHeat(blockStateModelGenerator,ModBlocks.ROTOM_HEAT_LIME);
        registerRotomHeat(blockStateModelGenerator,ModBlocks.ROTOM_HEAT_GREEN);
        registerRotomHeat(blockStateModelGenerator,ModBlocks.ROTOM_HEAT_CYAN);
        registerRotomHeat(blockStateModelGenerator,ModBlocks.ROTOM_HEAT_LIGHT_BLUE);
        registerRotomHeat(blockStateModelGenerator,ModBlocks.ROTOM_HEAT_BLUE);
        registerRotomHeat(blockStateModelGenerator,ModBlocks.ROTOM_HEAT_PURPLE);
        registerRotomHeat(blockStateModelGenerator,ModBlocks.ROTOM_HEAT_MAGENTA);
        registerRotomHeat(blockStateModelGenerator,ModBlocks.ROTOM_HEAT_PINK);
        registerRotomFan(blockStateModelGenerator,ModBlocks.ROTOM_FAN_ROTOM);
        registerRotomFan(blockStateModelGenerator,ModBlocks.ROTOM_FAN_SHINY);
        registerRotomFan(blockStateModelGenerator,ModBlocks.ROTOM_FAN_POKEDEX);
        registerRotomFan(blockStateModelGenerator,ModBlocks.ROTOM_FAN_WHITE);
        registerRotomFan(blockStateModelGenerator,ModBlocks.ROTOM_FAN_LIGHT_GRAY);
        registerRotomFan(blockStateModelGenerator,ModBlocks.ROTOM_FAN_GRAY);
        registerRotomFan(blockStateModelGenerator,ModBlocks.ROTOM_FAN_BLACK);
        registerRotomFan(blockStateModelGenerator,ModBlocks.ROTOM_FAN_BROWN);
        registerRotomFan(blockStateModelGenerator,ModBlocks.ROTOM_FAN_RED);
        registerRotomFan(blockStateModelGenerator,ModBlocks.ROTOM_FAN_ORANGE);
        registerRotomFan(blockStateModelGenerator,ModBlocks.ROTOM_FAN_YELLOW);
        registerRotomFan(blockStateModelGenerator,ModBlocks.ROTOM_FAN_LIME);
        registerRotomFan(blockStateModelGenerator,ModBlocks.ROTOM_FAN_GREEN);
        registerRotomFan(blockStateModelGenerator,ModBlocks.ROTOM_FAN_CYAN);
        registerRotomFan(blockStateModelGenerator,ModBlocks.ROTOM_FAN_LIGHT_BLUE);
        registerRotomFan(blockStateModelGenerator,ModBlocks.ROTOM_FAN_BLUE);
        registerRotomFan(blockStateModelGenerator,ModBlocks.ROTOM_FAN_PURPLE);
        registerRotomFan(blockStateModelGenerator,ModBlocks.ROTOM_FAN_MAGENTA);
        registerRotomFan(blockStateModelGenerator,ModBlocks.ROTOM_FAN_PINK);

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

    protected void registerRotomFan(BlockStateModelGenerator generator, Block fan) {
        Identifier id = Registries.BLOCK.getId(fan);
        Identifier id1 = id.withPath((UnaryOperator<String>)(path -> "block/" + path));
        Identifier id2 = id.withPath((UnaryOperator<String>)(path -> "block/rotom/fan/on/" + path.substring(path.lastIndexOf("/")+1)));
        generator.blockStateCollector.accept(
                VariantsBlockStateSupplier.create(fan)
                        .coordinate(createBooleanModelMap(Properties.POWERED, id2, id1))
                        .coordinate(createNorthDefaultHorizontalRotationStates())
        );
    }

    protected void registerRotomHeat(BlockStateModelGenerator generator, Block fan) {
        Identifier id = Registries.BLOCK.getId(fan);
        Identifier id1 = id.withPath((UnaryOperator<String>)(path -> "block/" + path));
        Identifier id2 = id.withPath((UnaryOperator<String>)(path -> "block/rotom/heat/open/" + path.substring(path.lastIndexOf("/")+1)));
        generator.blockStateCollector.accept(
                VariantsBlockStateSupplier.create(fan)
                        .coordinate(createBooleanModelMap(Properties.OPEN, id2, id1))
                        .coordinate(createNorthDefaultHorizontalRotationStates())
        );
    }
}
