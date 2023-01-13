package net.mcreator.tfcaerospace.item;

import com.lumintorious.tfcambiental.modifier.TempModifier;
import com.lumintorious.tfcambiental.item.TemperatureAlteringMaterial;
import net.mcreator.tfcaerospace.init.TfcAerospaceModItems;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;
import net.minecraft.world.item.crafting.Ingredient;
import org.jetbrains.annotations.NotNull;

public class AerospaceClothesMaterial implements ArmorMaterial, TemperatureAlteringMaterial {
    public static final AerospaceClothesMaterial MATERIAL = new AerospaceClothesMaterial();

    @Override
    public int getDurabilityForSlot(EquipmentSlot pSlot) {
        return 40000;
    }

    @Override
    public int getDefenseForSlot(EquipmentSlot pSlot) {
        return 2;
    }

    @Override
    public int getEnchantmentValue() {
        return 22;
    }

    @Override
    public @NotNull SoundEvent getEquipSound() {
        return SoundEvents.WOOL_PLACE;
    } // 입는 사운드

    @Override
    public @NotNull Ingredient getRepairIngredient() {
        return Ingredient.of(new ItemStack(TfcAerospaceModItems.AEROSPACEFIBER.get(), 1)); // 수리 재료
    }

    @Override
    public @NotNull String getName() {
        return "tfc_aerospace:aerospace_cloth";
    }

    @Override
    public float getToughness() {
        return 0.5f;
    }

    @Override
    public float getKnockbackResistance() {
        return 0;
    }


    @Override
    public TempModifier getTempModifier(ItemStack stack) {
        float tem = -30;
        return new TempModifier(stack.getItem().getRegistryName().toString(), (25f - tem)/4f, -300f);
    }
}