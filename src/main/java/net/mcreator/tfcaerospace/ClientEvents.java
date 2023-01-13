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
        CuriosRendererRegistry.register(TfcAerospaceModItems.AEROSPACEHATC.get(), ClothesCurioRendeder::new);
        CuriosRendererRegistry.register(TfcAerospaceModItems.AEROSPACESHIRTC.get(), ClothesCurioRendeder::new);
        CuriosRendererRegistry.register(TfcAerospaceModItems.AEROSPACEPANTSC.get(), ClothesCurioRendeder::new);
        CuriosRendererRegistry.register(TfcAerospaceModItems.AEROSPACESOCKSC.get(), ClothesCurioRendeder::new);
    }
}
