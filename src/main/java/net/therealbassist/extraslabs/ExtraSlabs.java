package net.therealbassist.extraslabs;

import net.fabricmc.api.ModInitializer;
import net.therealbassist.extraslabs.block.ModBlocks;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ExtraSlabs implements ModInitializer {
	public static final String MOD_ID = "extraslabs";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModBlocks.registerModBlocks();

	}
}
