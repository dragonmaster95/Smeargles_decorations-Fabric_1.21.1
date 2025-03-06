package net.dragonmaster95.smeargles_decorations.datagen;


import net.dragonmaster95.smeargles_decorations.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.RecipeSerializer;
import net.minecraft.recipe.SmeltingRecipe;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {

    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter recipeExporter) {
        List<ItemConvertible> WASHABLES_WOOL = List.of(ModItems.EXAMPLE, ModItems.EXAMPLE2);

        offerSmelting(recipeExporter, WASHABLES_WOOL, RecipeCategory.MISC, Items.WHITE_WOOL, 0.25f, 100, "");
    }



    public static void offerWashing(RecipeExporter exporter, List<ItemConvertible> inputs, RecipeCategory category, ItemConvertible output, float experience, int cookingTime, String group) {
        offerMultipleOptions(exporter, RecipeSerializer.WASHING, SmeltingRecipe::new, inputs, category, output, experience, cookingTime, group, "_from_smelting");
    }
}
