package de.pnku.msmv;

import de.pnku.msmv.init.MsmvBlockInit;
import de.pnku.msmv.init.MsmvItemInit;
import de.pnku.msmv.init.MsmvMfvItemInit;
import de.pnku.msmv.poi.MsmvPointOfInterestTypes;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.resources.ResourceLocation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MoreSmokerVariants implements ModInitializer {
    public static final String MODID = "lolmsmv";
    public static boolean isMfvLoaded = false;
    public static final Logger LOGGER = LoggerFactory.getLogger(MODID);

    @Override
    public void onInitialize() {
        if (FabricLoader.getInstance().isModLoaded("lolmfv")) {
            isMfvLoaded = true;
            LOGGER.info("MFV loaded");
        }
        if (isMfvLoaded) { MsmvBlockInit.registerSmokerBlocks(); LOGGER.info("rSB"); } else { MsmvBlockInit.registerCobblestoneSmokerBlocks(); LOGGER.info("rCSB");}
        MsmvItemInit.registerSmokerItems(); LOGGER.info("rSI");
        if (isMfvLoaded) {    MsmvMfvItemInit.registerMfvSmokerItems(); LOGGER.info("rMSI"); }
        MsmvPointOfInterestTypes.init(); LOGGER.info("MPOITinit");
    }

    public static ResourceLocation asId(String path) {
        return new ResourceLocation(MODID, path);
    }
}