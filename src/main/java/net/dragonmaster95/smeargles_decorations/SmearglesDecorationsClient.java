package net.dragonmaster95.smeargles_decorations;

import net.dragonmaster95.smeargles_decorations.block.ModBlocks;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;

public class SmearglesDecorationsClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.ROTOM_WASH, RenderLayer.getCutout());
    }
}
