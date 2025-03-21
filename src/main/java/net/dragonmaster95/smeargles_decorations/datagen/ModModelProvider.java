package net.dragonmaster95.smeargles_decorations.datagen;

import net.dragonmaster95.smeargles_decorations.block.ModBlocks;
import net.dragonmaster95.smeargles_decorations.block.custom.TwoStateFlower;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.block.Block;
import net.minecraft.data.client.*;
import net.minecraft.data.client.BlockStateModelGenerator.TintType;
import net.minecraft.registry.Registries;
import net.minecraft.state.property.Properties;
import net.minecraft.util.Identifier;

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

        /*for (Block block: ModBlocks.ROTOM_HEAT_BLOCKS) {
            registerRotomHeat(blockStateModelGenerator, block);
        }*/

        registerPottableTwoStateFlower(blockStateModelGenerator,ModBlocks.FLOETTE_WHITE,ModBlocks.FLOETTE_WHITE_POTTED,BlockStateModelGenerator.TintType.NOT_TINTED);
        registerPottableTwoStateFlower(blockStateModelGenerator,ModBlocks.FLOETTE_RED,ModBlocks.FLOETTE_RED_POTTED,BlockStateModelGenerator.TintType.NOT_TINTED);
        registerPottableTwoStateFlower(blockStateModelGenerator,ModBlocks.FLOETTE_ORANGE,ModBlocks.FLOETTE_ORANGE_POTTED,BlockStateModelGenerator.TintType.NOT_TINTED);
        registerPottableTwoStateFlower(blockStateModelGenerator,ModBlocks.FLOETTE_YELLOW,ModBlocks.FLOETTE_YELLOW_POTTED,BlockStateModelGenerator.TintType.NOT_TINTED);
        registerPottableTwoStateFlower(blockStateModelGenerator,ModBlocks.FLOETTE_BLUE,ModBlocks.FLOETTE_BLUE_POTTED,BlockStateModelGenerator.TintType.NOT_TINTED);
        registerPottableTwoStateFlower(blockStateModelGenerator,ModBlocks.FLOETTE_PINK,ModBlocks.FLOETTE_PINK_POTTED,BlockStateModelGenerator.TintType.NOT_TINTED);
        registerPottableTwoStateFlower(blockStateModelGenerator,ModBlocks.FLOETTE_AZ,ModBlocks.FLOETTE_AZ_POTTED,BlockStateModelGenerator.TintType.NOT_TINTED);

        registerPottableTwoStateFlower(blockStateModelGenerator,ModBlocks.GRACIDEA,ModBlocks.GRACIDEA_POTTED,BlockStateModelGenerator.TintType.NOT_TINTED);

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

    /*
    protected void registerMedicineBottles(BlockStateModelGenerator generator, Block block) {
        Identifier identifier = ModelIds.getBlockModelId(block);
        MultipartBlockStateSupplier multipartBlockStateSupplier = MultipartBlockStateSupplier.create(block);
        List.of(
                Pair.of(Direction.NORTH, VariantSettings.Rotation.R0),
                Pair.of(Direction.EAST, VariantSettings.Rotation.R90),
                Pair.of(Direction.SOUTH, VariantSettings.Rotation.R180),
                Pair.of(Direction.WEST, VariantSettings.Rotation.R270)
        )
        .forEach(
            pair -> {
                Direction direction = (Direction)pair.getFirst();
                VariantSettings.Rotation rotation = (VariantSettings.Rotation)pair.getSecond();
                When.PropertyCondition propertyCondition = When.create().set(Properties.HORIZONTAL_FACING, direction);
                multipartBlockStateSupplier.with(
                    propertyCondition, BlockStateVariant.create().put(VariantSettings.MODEL, identifier).put(VariantSettings.Y, rotation).put(VariantSettings.UVLOCK, true)
                );
                this.supplyMedicineModels(multipartBlockStateSupplier, propertyCondition, rotation);
            }
        );
        generator.blockStateCollector.accept(multipartBlockStateSupplier);
    }

    public final void supplyMedicineModels(
            MultipartBlockStateSupplier blockStateSupplier, When.PropertyCondition facingCondition, VariantSettings.Rotation rotation
    ) {
        List.of(
                        Pair.of(Properties.SLOT_0_OCCUPIED, Models.TEMPLATE_CHISELED_BOOKSHELF_SLOT_TOP_LEFT),
                        Pair.of(Properties.SLOT_1_OCCUPIED, Models.TEMPLATE_CHISELED_BOOKSHELF_SLOT_TOP_MID),
                        Pair.of(Properties.SLOT_2_OCCUPIED, Models.TEMPLATE_CHISELED_BOOKSHELF_SLOT_TOP_RIGHT),
                        Pair.of(Properties.SLOT_3_OCCUPIED, Models.TEMPLATE_CHISELED_BOOKSHELF_SLOT_BOTTOM_LEFT),
                        Pair.of(Properties.SLOT_4_OCCUPIED, Models.TEMPLATE_CHISELED_BOOKSHELF_SLOT_BOTTOM_MID),
                        Pair.of(Properties.SLOT_5_OCCUPIED, Models.TEMPLATE_CHISELED_BOOKSHELF_SLOT_BOTTOM_RIGHT)
                )
                .forEach(pair -> {
                    BooleanProperty booleanProperty = (BooleanProperty)pair.getFirst();
                    Model model = (Model)pair.getSecond();
                    this.supplyMedicineModel(blockStateSupplier, facingCondition, rotation, booleanProperty, model, true);
                    this.supplyMedicineModel(blockStateSupplier, facingCondition, rotation, booleanProperty, model, false);
                });
    }

    public final void supplyMedicineModel(
            MultipartBlockStateSupplier blockStateSupplier,
            When.PropertyCondition facingCondition,
            VariantSettings.Rotation rotation,
            BooleanProperty property,
            Model model,
            boolean occupied
    ) {
        String string = occupied ? "_occupied" : "_empty";
        TextureMap textureMap = new TextureMap().put(TextureKey.TEXTURE, TextureMap.getSubId(Blocks.CHISELED_BOOKSHELF, string));
        blockStateSupplier.with(
                When.allOf(facingCondition, When.create().set(property, occupied)),
                BlockStateVariant.create().put(VariantSettings.MODEL, identifier).put(VariantSettings.Y, rotation)
        );
    }
    */

    protected void registerPottableTwoStateFlower(BlockStateModelGenerator generator, Block flower, Block potted_flower, TintType tintType) {
        generator.registerGeneric(potted_flower);
        Identifier id = Registries.BLOCK.getId(flower);
        Identifier id1 = id.withPath((UnaryOperator<String>)(path -> "block/" + path));
        Identifier id2 = id.withPath((UnaryOperator<String>)(path -> "block/" + path + "_bed"));
        generator.blockStateCollector.accept(
                VariantsBlockStateSupplier.create(flower)
                        .coordinate(createBooleanModelMap(TwoStateFlower.FLOWER_BED, id2, id1))
                        .coordinate(createNorthDefaultHorizontalRotationStates())
        );
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
