package net.stall.learningmod.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.stall.learningmod.Learning;

public class ModBlocks {

    public static final Block ORANGE_BLUSHSHROOM_BLOCK = registerBlock("orange_blushroom_block",
                     new MushroomBlock(FabricBlockSettings.of(Material.WOOD).strength(4f).requiresTool().sounds(BlockSoundGroup.WOOD)), ItemGroup.MISC);

    public static final Block YELLOW_BLUSHSHROOM_BLOCK = registerBlock("yellow_blushroom_block",
            new MushroomBlock(FabricBlockSettings.of(Material.WOOD).strength(4f).requiresTool().sounds(BlockSoundGroup.WOOD)), ItemGroup.MISC);

    public static final Block BLUE_BLUSHSHROOM_BLOCK = registerBlock("blue_blushroom_block",
            new MushroomBlock(FabricBlockSettings.of(Material.WOOD).strength(4f).requiresTool().sounds(BlockSoundGroup.WOOD)), ItemGroup.MISC);

    public static final Block PURPLE_BLUSHSHROOM_BLOCK = registerBlock("purple_blushroom_block",
            new MushroomBlock(FabricBlockSettings.of(Material.WOOD).strength(4f).requiresTool().sounds(BlockSoundGroup.WOOD)), ItemGroup.MISC);


    public static final Block FUCHSIA_LANTERN = registerBlock("fuchsia_lantern",
            new LanternBlock(FabricBlockSettings.of(Material.METAL).strength(3.5f).resistance(3.5f).requiresTool().sounds(BlockSoundGroup.LANTERN).luminance(13)), ItemGroup.MISC);

    public static final Block FUCHSIA_CAMPFIRE = registerBlock("fuchsia_campfire",
            new CampfireBlock(false, 4, FabricBlockSettings.of(Material.METAL).strength(3.5f).resistance(3.5f).requiresTool().sounds(BlockSoundGroup.WOOD).luminance(13)), ItemGroup.MISC);




    public static Block registerBlock(String name, Block block, ItemGroup tab){
        registerBlockItem(name, block, tab);
        return Registry.register(Registry.BLOCK, new Identifier(Learning.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup tab){
        return Registry.register(Registry.ITEM, new Identifier(Learning.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(tab)));
    }

    public static void registerModBlocks() {
        Learning.LOGGER.debug("Registering mod block for " + Learning.MOD_ID);
    }
}
