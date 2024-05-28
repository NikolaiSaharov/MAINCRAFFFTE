package net.feezmen.supermod.Item;

import net.minecraft.world.item.HoeItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;

public class RubyHoe extends HoeItem {
    public RubyHoe() {
        super(Tiers.DIAMOND, -1, -2.0F, new Item.Properties().tab(ModCreativeModeTab.SUPER_TAB));
    }
}
