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
        CuriosRendererRegistry.register(TfcAerospaceModItems.TEST2_HAT.get(), ClothesCurioRendeder::new);
        CuriosRendererRegistry.register(TfcAerospaceModItems.TEST2_SWEATER.get(), ClothesCurioRendeder::new);
        CuriosRendererRegistry.register(TfcAerospaceModItems.TEST2_PANTS.get(), ClothesCurioRendeder::new);
        CuriosRendererRegistry.register(TfcAerospaceModItems.TEST2_BOOTS.get(), ClothesCurioRendeder::new);
        CuriosRendererRegistry.register(TfcAerospaceModItems.TEST3_HAT.get(), ClothesCurioRendeder::new);
        CuriosRendererRegistry.register(TfcAerospaceModItems.TEST3_SWEATER.get(), ClothesCurioRendeder::new);
        CuriosRendererRegistry.register(TfcAerospaceModItems.TEST3_PANTS.get(), ClothesCurioRendeder::new);
        CuriosRendererRegistry.register(TfcAerospaceModItems.TEST3_BOOTS.get(), ClothesCurioRendeder::new);
        CuriosRendererRegistry.register(TfcAerospaceModItems.TEST4_HAT.get(), ClothesCurioRendeder::new);
        CuriosRendererRegistry.register(TfcAerospaceModItems.TEST4_SWEATER.get(), ClothesCurioRendeder::new);
        CuriosRendererRegistry.register(TfcAerospaceModItems.TEST4_PANTS.get(), ClothesCurioRendeder::new);
        CuriosRendererRegistry.register(TfcAerospaceModItems.TEST4_BOOTS.get(), ClothesCurioRendeder::new);
    }
}
