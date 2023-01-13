
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.tfcaerospace.init;

import com.lumintorious.tfcambiental.TFCAmbiental;
import net.mcreator.tfcaerospace.TfcAerospaceMod;
import com.lumintorious.tfcambiental.item.ClothesItem;
import net.mcreator.tfcaerospace.item.*;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraft.world.item.Item;


public class TfcAerospaceModItems {
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, TfcAerospaceMod.MODID);
	public static final RegistryObject<Item> AEROSPACEHAT = ITEMS.register("aerospacehat", () -> new AerospacehatItem());
	public static final RegistryObject<Item> AEROSPACESHIRT = ITEMS.register("aerospaceshirt", () -> new AerospaceshirtItem());
	public static final RegistryObject<Item> AEROSPACEPANTS = ITEMS.register("aerospacepants", () -> new AerospacepantsItem());
	public static final RegistryObject<Item> AEROSPACESOCKS = ITEMS.register("aerospacesocks", () -> new AerospacesocksItem());
	public static final RegistryObject<Item> CFRP = ITEMS.register("cfrp", () -> new CFRPItem());
	public static final RegistryObject<Item> ALCOHOL = ITEMS.register("alcohol", () -> new AlcoholItem());
	public static final RegistryObject<Item> POLYESTER = ITEMS.register("polyester", () -> new PolyesterItem());
	public static final RegistryObject<Item> ALUMINIUMFIBER = ITEMS.register("aluminiumfiber", () -> new AluminiumfiberItem());
	public static final RegistryObject<Item> ALCOHOLJELLY = ITEMS.register("alcoholjelly", () -> new AlcoholjellyItem());
	public static final RegistryObject<Item> AIRGEL = ITEMS.register("airgel", () -> new AirgelItem());
	public static final RegistryObject<Item> AEROSPACEFIBER = ITEMS.register("aerospacefiber", () -> new AerospacefiberItem());

	public static final RegistryObject<Item> TEST_HAT = ITEMS.register(
			"test_hat",
			() -> new ClothesItem(TestClothesMaterial.MATERIAL, EquipmentSlot.HEAD, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT).durability(1))
	);
	public static final RegistryObject<Item> TEST_SWEATER = ITEMS.register(
			"test_sweater",
			() -> new ClothesItem(TestClothesMaterial.MATERIAL, EquipmentSlot.CHEST, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT).durability(1))
	);
	public static final RegistryObject<Item> TEST_PANTS = ITEMS.register(
			"test_pants",
			() -> new ClothesItem(TestClothesMaterial.MATERIAL, EquipmentSlot.LEGS, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT).durability(1))
	);
	public static final RegistryObject<Item> TEST_BOOTS = ITEMS.register(
			"test_boots",
			() -> new ClothesItem(TestClothesMaterial.MATERIAL, EquipmentSlot.FEET, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT).durability(1))
	);

	public static final RegistryObject<Item> TEST2_HAT = ITEMS.register(
			"test2_hat",
			() -> new ClothesItem(Test2ClothesMaterial.MATERIAL, EquipmentSlot.HEAD, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT).durability(1))
	);
	public static final RegistryObject<Item> TEST2_SWEATER = ITEMS.register(
			"test2_sweater",
			() -> new ClothesItem(Test2ClothesMaterial.MATERIAL, EquipmentSlot.CHEST, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT).durability(1))
	);
	public static final RegistryObject<Item> TEST2_PANTS = ITEMS.register(
			"test2_pants",
			() -> new ClothesItem(Test2ClothesMaterial.MATERIAL, EquipmentSlot.LEGS, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT).durability(1))
	);
	public static final RegistryObject<Item> TEST2_BOOTS = ITEMS.register(
			"test2_boots",
			() -> new ClothesItem(Test2ClothesMaterial.MATERIAL, EquipmentSlot.FEET, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT).durability(1))
	);

	public static final RegistryObject<Item> TEST3_HAT = ITEMS.register(
			"test3_hat",
			() -> new ClothesItem(Test3ClothesMaterial.MATERIAL, EquipmentSlot.HEAD, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT).durability(1))
	);
	public static final RegistryObject<Item> TEST3_SWEATER = ITEMS.register(
			"test3_sweater",
			() -> new ClothesItem(Test3ClothesMaterial.MATERIAL, EquipmentSlot.CHEST, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT).durability(1))
	);
	public static final RegistryObject<Item> TEST3_PANTS = ITEMS.register(
			"test3_pants",
			() -> new ClothesItem(Test3ClothesMaterial.MATERIAL, EquipmentSlot.LEGS, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT).durability(1))
	);
	public static final RegistryObject<Item> TEST3_BOOTS = ITEMS.register(
			"test3_boots",
			() -> new ClothesItem(Test3ClothesMaterial.MATERIAL, EquipmentSlot.FEET, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT).durability(1))
	);

	public static final RegistryObject<Item> TEST4_HAT = ITEMS.register(
			"test4_hat",
			() -> new ClothesItem(Test4ClothesMaterial.MATERIAL, EquipmentSlot.HEAD, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT).durability(1))
	);
	public static final RegistryObject<Item> TEST4_SWEATER = ITEMS.register(
			"test4_sweater",
			() -> new ClothesItem(Test4ClothesMaterial.MATERIAL, EquipmentSlot.CHEST, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT).durability(1))
	);
	public static final RegistryObject<Item> TEST4_PANTS = ITEMS.register(
			"test4_pants",
			() -> new ClothesItem(Test4ClothesMaterial.MATERIAL, EquipmentSlot.LEGS, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT).durability(1))
	);
	public static final RegistryObject<Item> TEST4_BOOTS = ITEMS.register(
			"test4_boots",
			() -> new ClothesItem(Test4ClothesMaterial.MATERIAL, EquipmentSlot.FEET, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT).durability(1))
	);
}
