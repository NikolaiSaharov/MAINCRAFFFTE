package net.feezmen.supermod.Item;

import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;

public enum SwordDemonLordTier implements Tier {
    INSTANCE;

    @Override
    public int getUses() {
        return 7000;
    }

    @Override
    public float getSpeed() {
        return 10.0F;
    }

    @Override
    public float getAttackDamageBonus() {
        return 20.0F;
    }

    @Override
    public int getLevel() {
        return 5;
    }

    @Override
    public int getEnchantmentValue() {
        return 20;
    }

    @Override
    public Ingredient getRepairIngredient() {

        return Ingredient.EMPTY;
    }
}