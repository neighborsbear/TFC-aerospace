
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.tfcaerospace.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.furnace.FurnaceFuelBurnTimeEvent;

import net.minecraft.world.item.ItemStack;

@Mod.EventBusSubscriber
public class TfcAerospaceModFuels {
	@SubscribeEvent
	public static void furnaceFuelBurnTimeEvent(FurnaceFuelBurnTimeEvent event) {
		ItemStack itemstack = event.getItemStack();
		if (itemstack.getItem() == TfcAerospaceModItems.ALCOHOLJELLY.get())
			event.setBurnTime(40000);
	}
}
