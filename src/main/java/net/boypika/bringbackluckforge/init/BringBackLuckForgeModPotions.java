package net.boypika.bringbackluckforge.init;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.alchemy.Potion;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BringBackLuckForgeModPotions {
    public static final DeferredRegister<Potion> REGISTRY;
    public static final RegistryObject<Potion> BAD_LUCK_POTION;

    public BringBackLuckForgeModPotions() {
    }

    static {
        REGISTRY = DeferredRegister.create(ForgeRegistries.POTIONS, "bring_back_luck_forge");
        BAD_LUCK_POTION = REGISTRY.register("bad_luck_potion", () -> {
            return new Potion(new MobEffectInstance[]{new MobEffectInstance(MobEffects.UNLUCK, 3000, 0, false, true)});
        });
    }
}