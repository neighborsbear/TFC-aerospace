
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.tfcaerospace.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;
import net.mcreator.tfcaerospace.item.PolyesterItem;
import net.mcreator.tfcaerospace.item.CFRPItem;
import net.mcreator.tfcaerospace.item.AluminiumfiberItem;
import net.mcreator.tfcaerospace.item.AlcoholjellyItem;
import net.mcreator.tfcaerospace.item.AlcoholItem;
import net.mcreator.tfcaerospace.item.AirgelItem;
import net.mcreator.tfcaerospace.item.AerospacefiberItem;
import net.mcreator.tfcaerospace.TfcAerospaceMod;

import net.mcreator.tfcaerospace.item.AerospaceClothesMaterial;
import net.mcreator.tfcaerospace.item.AerospaceHeatClothesMaterial;


import com.lumintorious.tfcambiental.item.ClothesItem;
import net.mcreator.tfcaerospace.item.*;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Rarity;


public class TfcAerospaceModItems {
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, TfcAerospaceMod.MODID);
	public static final RegistryObject<Item> CFRP = ITEMS.register("cfrp", () -> new CFRPItem());
	public static final RegistryObject<Item> ALCOHOL = ITEMS.register("alcohol", () -> new AlcoholItem());
	public static final RegistryObject<Item> POLYESTER = ITEMS.register("polyester", () -> new PolyesterItem());
	public static final RegistryObject<Item> ALUMINIUMFIBER = ITEMS.register("aluminiumfiber", () -> new AluminiumfiberItem());
	public static final RegistryObject<Item> ALCOHOLJELLY = ITEMS.register("alcoholjelly", () -> new AlcoholjellyItem());
	public static final RegistryObject<Item> AIRGEL = ITEMS.register("airgel", () -> new AirgelItem());
	public static final RegistryObject<Item> AEROSPACEFIBER = ITEMS.register("aerospacefiber", () -> new AerospacefiberItem());
	public static final RegistryObject<Item> AEROSPACEHAT = ITEMS.register(
			"aerospacehat",
			() -> new ClothesItem(AerospaceClothesMaterial.MATERIAL, EquipmentSlot.HEAD, new Item.Properties().tab(CreativeModeTab.TAB_TRANSPORTATION).durability(1).rarity(Rarity.RARE))
	);
	public static final RegistryObject<Item> AEROSPACESHIRT = ITEMS.register(
			"aerospaceshirt",
			() -> new ClothesItem(AerospaceClothesMaterial.MATERIAL, EquipmentSlot.CHEST, new Item.Properties().tab(CreativeModeTab.TAB_TRANSPORTATION).durability(1).rarity(Rarity.RARE))
	);
	public static final RegistryObject<Item> AEROSPACEPANTS = ITEMS.register(
			"aerospacepants",
			() -> new ClothesItem(AerospaceClothesMaterial.MATERIAL, EquipmentSlot.LEGS, new Item.Properties().tab(CreativeModeTab.TAB_TRANSPORTATION).durability(1).rarity(Rarity.RARE))
	);
	public static final RegistryObject<Item> AEROSPACESOCKS = ITEMS.register(
			"aerospacesocks",
			() -> new ClothesItem(AerospaceClothesMaterial.MATERIAL, EquipmentSlot.FEET, new Item.Properties().tab(CreativeModeTab.TAB_TRANSPORTATION).durability(1).rarity(Rarity.RARE))
	);

	public static final RegistryObject<Item> AEROSPACECHAT = ITEMS.register(
			"aerospacechat",
			() -> new ClothesItem(AerospaceHeatClothesMaterial.MATERIAL, EquipmentSlot.HEAD, new Item.Properties().tab(CreativeModeTab.TAB_TRANSPORTATION).durability(1).rarity(Rarity.RARE))
	);
	public static final RegistryObject<Item> AEROSPACECSHIRT = ITEMS.register(
			"aerospacecshirt",
			() -> new ClothesItem(AerospaceHeatClothesMaterial.MATERIAL, EquipmentSlot.CHEST, new Item.Properties().tab(CreativeModeTab.TAB_TRANSPORTATION).durability(1).rarity(Rarity.RARE))
	);
	public static final RegistryObject<Item> AEROSPACECPANTS = ITEMS.register(
			"aerospacecpants",
			() -> new ClothesItem(AerospaceHeatClothesMaterial.MATERIAL, EquipmentSlot.LEGS, new Item.Properties().tab(CreativeModeTab.TAB_TRANSPORTATION).durability(1).rarity(Rarity.RARE))
	);
	public static final RegistryObject<Item> AEROSPACECSOCKS = ITEMS.register(
			"aerospacecsocks",
			() -> new ClothesItem(AerospaceHeatClothesMaterial.MATERIAL, EquipmentSlot.FEET, new Item.Properties().tab(CreativeModeTab.TAB_TRANSPORTATION).durability(1).rarity(Rarity.RARE))
	);
}
