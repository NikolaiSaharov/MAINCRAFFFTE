package net.feezmen.supermod.Item;

import net.feezmen.supermod.Item.ModCreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tiers;

public class RubySword extends SwordItem {
    public RubySword() {
        super(Tiers.DIAMOND, 3, -2.4F, new Item.Properties().tab(ModCreativeModeTab.SUPER_TAB));
    }
}