package net.feezmen.supermod.Item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.Tiers;

public class RubyPickaxe extends PickaxeItem {
    public RubyPickaxe() {
        super(Tiers.DIAMOND, 1, -2.8F, new Item.Properties().tab(ModCreativeModeTab.SUPER_TAB));
    }
}