package net.mcreator.tfcaerospace.item;

import com.lumintorious.tfcambiental.modifier.TempModifier;
import com.lumintorious.tfcambiental.item.TemperatureAlteringMaterial;
import com.lumintorious.tfcambiental.api.EquipmentTemperatureProvider;
import com.lumintorious.tfcambiental.modifier.EnvironmentalModifier;
import net.dries007.tfc.util.climate.Climate;
import net.mcreator.tfcaerospace.init.TfcAerospaceModItems;
import net.minecraft.world.level.Level;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;
import org.jetbrains.annotations.NotNull;

import java.util.Optional;

public class TestClothesMaterial implements ArmorMaterial, TemperatureAlteringMaterial {
    public static final TestClothesMaterial MATERIAL = new TestClothesMaterial();

    @Override
    public int getDurabilityForSlot(EquipmentSlot pSlot) {
        return 40000;
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
        return Ingredient.of(new ItemStack(TfcAerospaceModItems.AEROSPACEFIBER.get(), 1)); // 수리 재료
    }

    @Override
    public @NotNull String getName() {
        return "tfc_aerospace:test_cloth";
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
        float avg = EnvironmentalModifier.avg; // I don't know how to call the variable.
        return new TempModifier(stack.getItem().getRegistryName().toString(), (25f - avg)/4f, -250f);
    }
}
