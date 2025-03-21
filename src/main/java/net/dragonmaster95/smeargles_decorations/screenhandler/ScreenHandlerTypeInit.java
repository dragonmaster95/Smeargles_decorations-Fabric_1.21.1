package net.dragonmaster95.smeargles_decorations.screenhandler;

import net.dragonmaster95.smeargles_decorations.SmearglesDecorations;
import net.dragonmaster95.smeargles_decorations.network.BlockPosPayload;
import net.fabricmc.fabric.api.screenhandler.v1.ExtendedScreenHandlerFactory;
import net.fabricmc.fabric.api.screenhandler.v1.ExtendedScreenHandlerType;
import net.minecraft.network.RegistryByteBuf;
import net.minecraft.network.codec.PacketCodec;
import net.minecraft.network.packet.CustomPayload;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.screen.ScreenHandlerType;

public class ScreenHandlerTypeInit {
    public static final ScreenHandlerType<RotomHeatScreenHandler> ROTOM_HEAT =
            register("rotom_heat", RotomHeatScreenHandler::new, BlockPosPayload.PACKET_CODEC);

    public static <T extends ScreenHandler, D extends CustomPayload> ExtendedScreenHandlerType<T,D>
        register(String name,
                 ExtendedScreenHandlerType.ExtendedFactory<T, D> factory,
                 PacketCodec<? super RegistryByteBuf, D> codec) {
        return Registry.register(
                Registries.SCREEN_HANDLER,
                SmearglesDecorations.id(name),
                new ExtendedScreenHandlerType<>(factory, codec)
        );
    }

    public static void load() {

    }
}
