package net.icbcll;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ICBCLL implements ModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("icbcll");

    @Override
    public void onInitialize() {
        LOGGER.info("ICBCLL Initialized!");
    }
}