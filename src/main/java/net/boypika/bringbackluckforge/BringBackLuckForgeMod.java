package net.boypika.bringbackluckforge;

import net.boypika.bringbackluckforge.init.BringBackLuckForgeModItems;
import net.boypika.bringbackluckforge.init.BringBackLuckForgeModPotions;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.network.NetworkRegistry;
import net.minecraftforge.network.simple.SimpleChannel;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod("bring_back_luck_forge")
public class BringBackLuckForgeMod {
    public static final Logger LOGGER = LogManager.getLogger(BringBackLuckForgeMod.class);
    public static final String MODID = "bring_back_luck_forge";
    private static final String PROTOCOL_VERSION = "1";
    public static final SimpleChannel PACKET_HANDLER = NetworkRegistry.newSimpleChannel(new ResourceLocation("bring_back_luck_forge", "bring_back_luck_forge"), () -> {
        return "1";
    }, "1"::equals, "1"::equals);
    public BringBackLuckForgeMod() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        BringBackLuckForgeModItems.REGISTRY.register(bus);
        BringBackLuckForgeModPotions.REGISTRY.register(bus);
    }

}