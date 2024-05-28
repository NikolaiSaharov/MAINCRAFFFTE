package net.feezmen.supermod.Item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;

public class SwordDemonLord extends SwordItem {
    public SwordDemonLord() {
        super(SwordDemonLordTier.INSTANCE, 3, -2.4F, new Item.Properties().tab(ModCreativeModeTab.SUPER_TAB));
    }
}