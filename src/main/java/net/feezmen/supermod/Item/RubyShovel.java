package net.feezmen.supermod.Item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;

public class RubyShovel extends ShovelItem {
    public RubyShovel() {
        super(Tiers.DIAMOND, 1.5F, -3.0F, new Item.Properties().tab(ModCreativeModeTab.SUPER_TAB));
    }
}
