package net.dragonmaster95.smeargles_decorations.datagen.custom_recipes;

import com.mojang.serialization.MapCodec;
import net.minecraft.network.RegistryByteBuf;
import net.minecraft.network.codec.PacketCodec;
import net.minecraft.recipe.RecipeSerializer;
import net.minecraft.recipe.ShapedRecipe;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;

public interface WashingSerializer<T extends RecipeSerializer<?>> {
    RecipeSerializer<ShapedRecipe> WASHING = register("washing", new WashingRecipe.Serializer());
}
