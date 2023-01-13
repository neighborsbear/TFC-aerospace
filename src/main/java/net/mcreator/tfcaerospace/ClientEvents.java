package net.mcreator.tfcaerospace;

import com.lumintorious.tfcambiental.curios.ClothesCurioRendeder;
import net.mcreator.tfcaerospace.init.TfcAerospaceModItems;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import top.theillusivec4.curios.api.client.CuriosRendererRegistry;

public class ClientEvents {
    public static void init(IEventBus bus) {
        bus.addListener(ClientEvents::setup);
    }

    private static void setup(FMLClientSetupEvent event) {
        CuriosRendererRegistry.register(TfcAerospaceModItems.TEST_HAT.get(), ClothesCurioRendeder::new);
        CuriosRendererRegistry.register(TfcAerospaceModItems.TEST_SWEATER.get(), ClothesCurioRendeder::new);
        CuriosRendererRegistry.register(TfcAerospaceModItems.TEST_PANTS.get(), ClothesCurioRendeder::new);
        CuriosRendererRegistry.register(TfcAerospaceModItems.TEST_BOOTS.get(), ClothesCurioRendeder::new);
    }
}
