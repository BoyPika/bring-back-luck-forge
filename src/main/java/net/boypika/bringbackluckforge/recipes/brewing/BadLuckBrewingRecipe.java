package net.boypika.bringbackluckforge.recipes.brewing;

import net.boypika.bringbackluckforge.init.BringBackLuckForgeModPotions;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.item.alchemy.PotionUtils;
import net.minecraft.world.item.alchemy.Potions;
import net.minecraftforge.common.brewing.BrewingRecipeRegistry;
import net.minecraftforge.common.brewing.IBrewingRecipe;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;

@EventBusSubscriber(
        bus = Bus.MOD
)
public class BadLuckBrewingRecipe implements IBrewingRecipe {
    public BadLuckBrewingRecipe() {
    }

    @SubscribeEvent
    public static void init(FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {
            return BrewingRecipeRegistry.addRecipe(new BadLuckBrewingRecipe());
        });
    }

    public boolean isInput(ItemStack input) {
        Item inputItem = input.getItem();
        return (inputItem == Items.POTION || inputItem == Items.SPLASH_POTION || inputItem == Items.LINGERING_POTION) && PotionUtils.getPotion(input) == Potions.LUCK;
    }

    public boolean isIngredient(ItemStack ingredient) {
        return ingredient.getItem() == Items.FERMENTED_SPIDER_EYE;
    }

    public ItemStack getOutput(ItemStack input, ItemStack ingredient) {
        return this.isInput(input) && this.isIngredient(ingredient) ? PotionUtils.setPotion(new ItemStack(input.getItem()), (Potion)BringBackLuckForgeModPotions.BAD_LUCK_POTION.get()) : ItemStack.EMPTY;
    }
}
