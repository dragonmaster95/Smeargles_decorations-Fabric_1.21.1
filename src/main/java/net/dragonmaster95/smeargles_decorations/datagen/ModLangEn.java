package net.dragonmaster95.smeargles_decorations.datagen;

import net.dragonmaster95.smeargles_decorations.SmearglesDecorations;
import net.dragonmaster95.smeargles_decorations.block.entity.custom.RotomHeatBE;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableTextContent;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

public class ModLangEn extends FabricLanguageProvider {
    public ModLangEn(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    private static void addText(@NotNull TranslationBuilder builder, @NotNull Text text, @NotNull String value) {
        if (text.getContent() instanceof TranslatableTextContent translatableTextContent) {
            builder.add(translatableTextContent.getKey(), value);
        } else {
            SmearglesDecorations.LOGGER.warn("Failed to add translation for text: {}", text.getString());
        }
    }

    @Override
    public void generateTranslations(RegistryWrapper.WrapperLookup registryLookup, TranslationBuilder translationBuilder) {
        addText(translationBuilder, RotomHeatBE.TITLE, "Rotom Oven");
    }
}