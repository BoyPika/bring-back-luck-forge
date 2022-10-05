package net.boypika.bringbackluckforge.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;

public class LuckyCloverItem extends Item {
    public LuckyCloverItem() {
        super((new Item.Properties()).tab(CreativeModeTab.TAB_BREWING).stacksTo(64).fireResistant().rarity(Rarity.COMMON));
    }
}
