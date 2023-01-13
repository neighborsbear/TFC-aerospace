
package net.mcreator.tfcaerospace.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;

public class AerospacehatItem extends Item {
	public AerospacehatItem() {
		super(new Item.Properties().tab(CreativeModeTab.TAB_TRANSPORTATION).stacksTo(1).fireResistant().rarity(Rarity.RARE));
	}
}
