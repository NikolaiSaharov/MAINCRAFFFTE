package net.feezmen.supermod.Item;

import net.feezmen.supermod.Item.ModItems;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;

public class ModArmorMaterial {
    public static final ArmorMaterial RUBY = new ArmorMaterial() {
        private static final int[] HEALTH_PER_SLOT = new int[]{13, 15, 16, 11};
        private static final int[] SLOT_PROTECTIONS = new int[]{2, 5, 6, 2};

        @Override
        public int getDurabilityForSlot(EquipmentSlot slot) {
            return HEALTH_PER_SLOT[slot.getIndex()] * 10;
        }

        @Override
        public int getDefenseForSlot(EquipmentSlot slot) {
            return SLOT_PROTECTIONS[slot.getIndex()];
        }

        @Override
        public int getEnchantmentValue() {
            return 10;
        }

        @Override
        public SoundEvent getEquipSound() {
            return SoundEvents.ARMOR_EQUIP_DIAMOND;
        }

        @Override
        public Ingredient getRepairIngredient() {
            return Ingredient.of(ModItems.rubyOre.get());
        }

        @Override
        public String getName() {
            return "ruby"; // Используйте "ruby", а не "ruby_ore"
        }

        @Override
        public float getToughness() {
            return 0;
        }

        @Override
        public float getKnockbackResistance() {
            return 0;
        }
    };
}