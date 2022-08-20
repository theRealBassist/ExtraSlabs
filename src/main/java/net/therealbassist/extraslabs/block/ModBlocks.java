package net.therealbassist.extraslabs.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.therealbassist.extraslabs.ExtraSlabs;
import net.therealbassist.extraslabs.item.ModItemGroup;

public class ModBlocks {

    public static final Block DIRT_SLAB = registerBlock("dirt_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.DIRT)), ModItemGroup.EXTRASLABS);
    public static final Block GRAVEL_SLAB = registerBlock("gravel_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.GRAVEL)), ModItemGroup.EXTRASLABS);

    private static Block registerBlock(String name, Block block, ItemGroup tab) {
        registerBlockItem(name, block, tab);
        return Registry.register(Registry.BLOCK, new Identifier(ExtraSlabs.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup tab) {
        return Registry.register(Registry.ITEM, new Identifier(ExtraSlabs.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(tab)));
    }

    public static void registerModBlocks() {
        ExtraSlabs.LOGGER.debug("Registering ModBLocks for " + ExtraSlabs.MOD_ID);
    }
}
