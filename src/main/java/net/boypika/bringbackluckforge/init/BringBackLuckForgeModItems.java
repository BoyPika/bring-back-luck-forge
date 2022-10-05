package net.boypika.bringbackluckforge.init;

import net.boypika.bringbackluckforge.item.LuckyCloverItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BringBackLuckForgeModItems {
    public static final DeferredRegister<Item> REGISTRY;
    public static final RegistryObject<Item> LUCKY_CLOVER;

    public BringBackLuckForgeModItems() {
    }

    static {
        REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, "bring_back_luck_forge");
        LUCKY_CLOVER = REGISTRY.register("lucky_clover", () -> {
            return new LuckyCloverItem();
        });
    }
}
