
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.tfcaerospace.init;

import net.mcreator.tfcaerospace.item.*;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.tfcaerospace.TfcAerospaceMod;

public class TfcAerospaceModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, TfcAerospaceMod.MODID);
	public static final RegistryObject<Item> AEROSPACEHAT = REGISTRY.register("aerospacehat", () -> new AerospacehatItem());
	public static final RegistryObject<Item> AEROSPACESHIRT = REGISTRY.register("aerospaceshirt", () -> new AerospaceshirtItem());
	public static final RegistryObject<Item> AEROSPACEPANTS = REGISTRY.register("aerospacepants", () -> new AerospacepantsItem());
	public static final RegistryObject<Item> AEROSPACESOCKS = REGISTRY.register("aerospacesocks", () -> new AerospacesocksItem());
	public static final RegistryObject<Item> CFRP = REGISTRY.register("cfrp", () -> new CFRPItem());
	public static final RegistryObject<Item> ALCOHOL = REGISTRY.register("alcohol", () -> new AlcoholItem());
	public static final RegistryObject<Item> POLYESTER = REGISTRY.register("polyester", () -> new PolyesterItem());
	public static final RegistryObject<Item> ALUMINIUMFIBER = REGISTRY.register("aluminiumfiber", () -> new AluminiumfiberItem());
	public static final RegistryObject<Item> ALCOHOLJELLY = REGISTRY.register("alcoholjelly", () -> new AlcoholjellyItem());
	public static final RegistryObject<Item> AIRGEL = REGISTRY.register("airgel", () -> new AirgelItem());
	public static final RegistryObject<Item> AEROSPACEFIBER = REGISTRY.register("aerospacefiber", () -> new AerospacefiberItem());

	public static final RegistryObject<Item> TEST_HAT = REGISTRY.register(
			"test_hat",
			() -> new ClothesItem(TestClothesMaterial.MATERIAL, EquipmentSlot.HEAD, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT).durability(1))
	);
	public static final RegistryObject<Item> TEST_SWEATER = REGISTRY.register(
			"test_sweater",
			() -> new ClothesItem(TestClothesMaterial.MATERIAL, EquipmentSlot.CHEST, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT).durability(1))
	);
	public static final RegistryObject<Item> TEST_PANTS = REGISTRY.register(
			"test_pants",
			() -> new ClothesItem(TestClothesMaterial.MATERIAL, EquipmentSlot.LEGS, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT).durability(1))
	);
	public static final RegistryObject<Item> TEST_BOOTS = REGISTRY.register(
			"test_boots",
			() -> new ClothesItem(TestClothesMaterial.MATERIAL, EquipmentSlot.FEET, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT).durability(1))
	);
}
