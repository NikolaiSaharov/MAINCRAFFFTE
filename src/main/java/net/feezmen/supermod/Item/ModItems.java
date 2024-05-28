package net.feezmen.supermod.Item;

import com.google.common.eventbus.EventBus;
import net.feezmen.supermod.SuperMod;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static net.feezmen.supermod.Item.ModArmorMaterial.RUBY;

public class ModItems {

    public static final DeferredRegister<Item>ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, SuperMod.MOD_ID);

    public static final RegistryObject<Item> AMBER = ITEMS.register("amber",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SUPER_TAB)));

    public static final RegistryObject<Item> figAmber = ITEMS.register("fig_amber",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SUPER_TAB)));

    public static final RegistryObject<Item> figRuby = ITEMS.register("fig_ruby",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SUPER_TAB)));

    public static final RegistryObject<Item> rubyOre = ITEMS.register("ruby_ore",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SUPER_TAB)));

    public static final RegistryObject<Item> rubyHelmet = ITEMS.register("ruby_helmet",
            () -> new RubyArmorItem(RUBY, EquipmentSlot.HEAD, new Item.Properties().tab(ModCreativeModeTab.SUPER_TAB)));
    public static final RegistryObject<Item> rubyChestplate = ITEMS.register("ruby_chestplate",
            () -> new RubyArmorItem(RUBY, EquipmentSlot.CHEST, new Item.Properties().tab(ModCreativeModeTab.SUPER_TAB)));
    public static final RegistryObject<Item> rubyLegs = ITEMS.register("ruby_legs",
            () -> new RubyArmorItem(RUBY, EquipmentSlot.LEGS, new Item.Properties().tab(ModCreativeModeTab.SUPER_TAB)));
    public static final RegistryObject<Item> rubyBoots = ITEMS.register("ruby_boots",
            () -> new RubyArmorItem(RUBY, EquipmentSlot.FEET, new Item.Properties().tab(ModCreativeModeTab.SUPER_TAB)));

    public static final RegistryObject<Item> rubySword = ITEMS.register("ruby_sword", RubySword::new);
    public static final RegistryObject<Item> rubyPickaxe = ITEMS.register("ruby_pickaxe", RubyPickaxe::new);
    public static final RegistryObject<Item> rubyAxe = ITEMS.register("ruby_axe", RubyAxe::new);
    public static final RegistryObject<Item> rubyHoe = ITEMS.register("ruby_hoe", RubyHoe::new);
    public static final RegistryObject<Item> rubyShovel = ITEMS.register("ruby_shovel", RubyShovel::new);
    public static final RegistryObject<Item> SwordDemonLord = ITEMS.register("sword", SwordDemonLord::new);




    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }

}

