package net.feezmen.supermod.Item;

import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;

public class RubyAxe extends AxeItem {
    public RubyAxe() {
        super(Tiers.DIAMOND, 6, -3.0F, new Item.Properties().tab(ModCreativeModeTab.SUPER_TAB));
    }
}
