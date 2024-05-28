package net.feezmen.supermod.Item;

import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Item;

public abstract class ArmorItem extends net.minecraft.world.item.ArmorItem {
    public ArmorItem(ArmorMaterial material, EquipmentSlot slot, Item.Properties properties) {
        super(material, slot, properties);

    }
}