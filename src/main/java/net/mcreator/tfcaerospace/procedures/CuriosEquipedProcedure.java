package net.mcreator.tfcaerospace.procedures;

import top.theillusivec4.curios.api.event.CurioChangeEvent;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.Entity;

import net.mcreator.tfcaerospace.network.TfcAerospaceModVariables;
import net.mcreator.tfcaerospace.init.TfcAerospaceModItems;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class CuriosEquipedProcedure {
	@SubscribeEvent
	public static void onCurioEquipserver(CurioChangeEvent event) {
		execute(event, event.getEntity(), event.getTo());
	}

	public static void execute(Entity entity, ItemStack itemstack) {
		execute(null, entity, itemstack);
	}

	private static void execute(@Nullable Event event, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (itemstack.getItem() == TfcAerospaceModItems.AEROSPACEHAT.get()) {
			{
				boolean _setval = true;
				entity.getCapability(TfcAerospaceModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.aerospacehat = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
		if (itemstack.getItem() == TfcAerospaceModItems.AEROSPACESHIRT.get()) {
			{
				boolean _setval = true;
				entity.getCapability(TfcAerospaceModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.aerospaceshirt = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
		if (itemstack.getItem() == TfcAerospaceModItems.AEROSPACEPANTS.get()) {
			{
				boolean _setval = true;
				entity.getCapability(TfcAerospaceModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.aerospacepants = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
		if (itemstack.getItem() == TfcAerospaceModItems.AEROSPACESOCKS.get()) {
			{
				boolean _setval = true;
				entity.getCapability(TfcAerospaceModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.aerospacesocks = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
	}
}
