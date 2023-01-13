
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.tfcaerospace.init;

import net.mcreator.tfcaerospace.TfcAerospaceMod;
import com.lumintorious.tfcambiental.item.ClothesItem;
import net.mcreator.tfcaerospace.item.*;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Rarity;
import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraft.world.item.Item;


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

	public static final RegistryObject<Item> AEROSPACEHATC = ITEMS.register(
			"aerospacehatC",
			() -> new ClothesItem(AerospaceHeatClothesMaterial.MATERIAL, EquipmentSlot.HEAD, new Item.Properties().tab(CreativeModeTab.TAB_TRANSPORTATION).durability(1).rarity(Rarity.RARE))
	);
	public static final RegistryObject<Item> AEROSPACESHIRTC = ITEMS.register(
			"aerospaceshirtC",
			() -> new ClothesItem(AerospaceHeatClothesMaterial.MATERIAL, EquipmentSlot.CHEST, new Item.Properties().tab(CreativeModeTab.TAB_TRANSPORTATION).durability(1).rarity(Rarity.RARE))
	);
	public static final RegistryObject<Item> AEROSPACEPANTSC = ITEMS.register(
			"aerospacepantsC",
			() -> new ClothesItem(AerospaceHeatClothesMaterial.MATERIAL, EquipmentSlot.LEGS, new Item.Properties().tab(CreativeModeTab.TAB_TRANSPORTATION).durability(1).rarity(Rarity.RARE))
	);
	public static final RegistryObject<Item> AEROSPACESOCKSC = ITEMS.register(
			"aerospacesocksC",
			() -> new ClothesItem(AerospaceHeatClothesMaterial.MATERIAL, EquipmentSlot.FEET, new Item.Properties().tab(CreativeModeTab.TAB_TRANSPORTATION).durability(1).rarity(Rarity.RARE))
	);
}
