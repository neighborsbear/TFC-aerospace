package net.mcreator.tfcaerospace.item;

import com.lumintorious.tfcambiental.modifier.TempModifier;
import com.lumintorious.tfcambiental.item.TemperatureAlteringMaterial;
import com.lumintorious.tfcambiental.api.EquipmentTemperatureProvider;
import net.dries007.tfc.common.items.TFCItems;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;
import org.jetbrains.annotations.NotNull;

public class TestClothesMaterial implements ArmorMaterial, TemperatureAlteringMaterial {
    public static final TestClothesMaterial MATERIAL = new TestClothesMaterial();

    @Override
    public int getDurabilityForSlot(EquipmentSlot pSlot) {
        return 3000;
    }

    @Override
    public int getDefenseForSlot(EquipmentSlot pSlot) {
        return 0;
    }

    @Override
    public int getEnchantmentValue() {
        return 0;
    }

    @Override
    public @NotNull SoundEvent getEquipSound() {
        return SoundEvents.WOOL_PLACE;
    } // 입는 사운드

    @Override
    public @NotNull Ingredient getRepairIngredient() {
        return Ingredient.of(new ItemStack(TFCItems.WOOL_CLOTH.get(), 1)); // 수리 제료
    }

    @Override
    public @NotNull String getName() {
        return "tfc_aerospace:test";
    }

    @Override
    public float getToughness() {
        return 0;
    }

    @Override
    public float getKnockbackResistance() {
        return 0;
    }

    @Override
    public TempModifier getTempModifier(ItemStack stack) {
        return new TempModifier(stack.getItem().getRegistryName().toString(), 12.5f, -250000f);
    }
}
