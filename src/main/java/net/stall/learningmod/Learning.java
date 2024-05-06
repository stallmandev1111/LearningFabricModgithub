package net.stall.learningmod;

import net.fabricmc.api.ModInitializer;

import net.stall.learningmod.block.ModBlocks;
import net.stall.learningmod.block.entity.ModdedBlockEntities;
import net.stall.learningmod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Learning implements ModInitializer {
	public static final String MOD_ID = "learning";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		ModdedBlockEntities.registermodentities();
	}
}