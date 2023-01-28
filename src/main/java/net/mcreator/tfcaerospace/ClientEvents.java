package net.mcreator.tfcaerospace;

import com.lumintorious.tfcambiental.curios.ClothesCurioRendeder;
import com.lumintorious.tfcambiental.curios.CurioClothesLayer;
import net.mcreator.tfcaerospace.init.TfcAerospaceModItems;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import top.theillusivec4.curios.api.client.CuriosRendererRegistry;

public class ClientEvents {
    public static void init(IEventBus bus) {
        bus.addListener(ClientEvents::setup);
    }

    private static void setup(FMLClientSetupEvent event) {
        CuriosRendererRegistry.register(TfcAerospaceModItems.AEROSPACEHAT.get(), ClothesCurioRendeder::new);
        CuriosRendererRegistry.register(TfcAerospaceModItems.AEROSPACESHIRT.get(), ClothesCurioRendeder::new);
        CuriosRendererRegistry.register(TfcAerospaceModItems.AEROSPACEPANTS.get(), ClothesCurioRendeder::new);
        CuriosRendererRegistry.register(TfcAerospaceModItems.AEROSPACESOCKS.get(), ClothesCurioRendeder::new);
        CuriosRendererRegistry.register(TfcAerospaceModItems.AEROSPACECHAT.get(), ClothesCurioRendeder::new);
        CuriosRendererRegistry.register(TfcAerospaceModItems.AEROSPACECSHIRT.get(), ClothesCurioRendeder::new);
        CuriosRendererRegistry.register(TfcAerospaceModItems.AEROSPACECPANTS.get(), ClothesCurioRendeder::new);
        CuriosRendererRegistry.register(TfcAerospaceModItems.AEROSPACECSOCKS.get(), ClothesCurioRendeder::new);
    }
}
