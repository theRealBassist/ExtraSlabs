package net.therealbassist.extraslabs.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.therealbassist.extraslabs.ExtraSlabs;

public class ModItems {

//    public static final Item DIRT_SLAB = registerItem("dirt_slab",
//            new Item(new FabricItemSettings().group(ModItemGroup.EXTRASLABS)));
//    public static final Item GRAVEL_SLAB = registerItem("gravel_slab",
//            new Item(new FabricItemSettings().group(ModItemGroup.EXTRASLABS)));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(ExtraSlabs.MOD_ID, name), item);
    }

    public static void registerModItems() {
        ExtraSlabs.LOGGER.debug("Registering Mod Items for " + ExtraSlabs.MOD_ID);
    }
}
