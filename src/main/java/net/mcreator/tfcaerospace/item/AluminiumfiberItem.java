
package net.mcreator.tfcaerospace.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;

public class AluminiumfiberItem extends Item {
	public AluminiumfiberItem() {
		super(new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(64).fireResistant().rarity(Rarity.COMMON));
	}
}
