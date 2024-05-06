package net.stall.learningmod.block.entity;

import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.block.entity.CampfireBlockEntity;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.stall.learningmod.Learning;
import net.stall.learningmod.block.ModBlocks;

public class ModdedBlockEntities {

    public static final BlockEntityType<CampfireBlockEntity> FUCHSIA_CAMPFIRE = Registry.register(
            Registry.BLOCK_ENTITY_TYPE,
            new Identifier(Learning.MOD_ID, "fuchsia_campfire"),
            FabricBlockEntityTypeBuilder.create(CampfireBlockEntity::new, ModBlocks.FUCHSIA_CAMPFIRE).build()
    );
    public static void registermodentities(){

        Learning.LOGGER.info("Registering modded entities");
    }
}