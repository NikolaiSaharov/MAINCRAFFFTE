package net.feezmen.supermod.Item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {

    public static final CreativeModeTab SUPER_TAB = new CreativeModeTab("Super Tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.rubyHelmet.get());

        }
    };
}
