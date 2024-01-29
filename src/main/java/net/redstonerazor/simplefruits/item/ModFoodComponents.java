package net.redstonerazor.simplefruits.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class ModFoodComponents {
    public static final FoodComponent BANANA = new FoodComponent.Builder().hunger(4).saturationModifier(0.3f).build();
    public static final FoodComponent ORANGE = new FoodComponent.Builder().hunger(4).saturationModifier(0.3f).build();
    public static final FoodComponent PEAR = new FoodComponent.Builder().hunger(4).saturationModifier(0.3f).build();
    public static final FoodComponent FIG = new FoodComponent.Builder().hunger(4).saturationModifier(0.3f).build();
    public static final FoodComponent PLUM = new FoodComponent.Builder().hunger(4).saturationModifier(0.3f).build();
    public static final FoodComponent CHERRY = new FoodComponent.Builder().hunger(2).saturationModifier(0.3f).build();

    public static final FoodComponent GOLDEN_BANANA = new FoodComponent.Builder().hunger(4).saturationModifier(1.2f)
            .statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 2400, 0), 1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 300, 0), 1.0f).alwaysEdible().build();
    public static final FoodComponent GOLDEN_ORANGE = new FoodComponent.Builder().hunger(4).saturationModifier(1.2f)
            .statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 2400, 0), 1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.JUMP_BOOST, 600, 0), 1.0f).alwaysEdible().build();
    public static final FoodComponent GOLDEN_PEAR = new FoodComponent.Builder().hunger(4).saturationModifier(1.2f)
            .statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 2400, 0), 1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 600, 0), 1.0f).alwaysEdible().build();
    public static final FoodComponent GOLDEN_FIG = new FoodComponent.Builder().hunger(4).saturationModifier(1.2f)
            .statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 2400, 0), 1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 900, 0), 1.0f).alwaysEdible().build();
    public static final FoodComponent GOLDEN_PLUM = new FoodComponent.Builder().hunger(4).saturationModifier(1.2f)
            .statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 2400, 0), 1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.WATER_BREATHING, 900, 0), 1.0f).alwaysEdible().build();
    public static final FoodComponent GOLDEN_CHERRY = new FoodComponent.Builder().hunger(4).saturationModifier(1.2f).build();
    public static final FoodComponent POISON_APPLE = new FoodComponent.Builder().hunger(4).saturationModifier(0.1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.POISON, 400, 0), 1.0f).build();
}
