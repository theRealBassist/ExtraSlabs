package net.therealbassist.extraslabs.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.therealbassist.extraslabs.ExtraSlabs;
import net.therealbassist.extraslabs.block.ModBlocks;

public class ModItemGroup {
    public static final ItemGroup EXTRASLABS = FabricItemGroupBuilder.build(new Identifier(ExtraSlabs.MOD_ID, "extra_slabs"), () -> new ItemStack(ModBlocks.DIRT_SLAB));

}
