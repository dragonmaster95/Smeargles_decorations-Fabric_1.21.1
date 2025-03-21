package net.dragonmaster95.smeargles_decorations;

import net.dragonmaster95.smeargles_decorations.block.ModBlocks;
import net.dragonmaster95.smeargles_decorations.block.entity.ModBlockEntities;
import net.dragonmaster95.smeargles_decorations.item.ModItemGroups;
import net.dragonmaster95.smeargles_decorations.item.ModItems;
import net.dragonmaster95.smeargles_decorations.screenhandler.ScreenHandlerTypeInit;
import net.fabricmc.api.ModInitializer;

import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SmearglesDecorations implements ModInitializer {
	public static final String MOD_ID = "smeargles-decorations";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModItemGroups.registerItemGroups();
		ModBlockEntities.registerBlockEntities();
		ScreenHandlerTypeInit.load();
	}

	public static Identifier id(String path) {
		return Identifier.of(MOD_ID, path);
	}
}