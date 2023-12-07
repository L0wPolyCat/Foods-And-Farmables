package net.lowpolycat.foodsandfarmables.item;

import net.lowpolycat.foodsandfarmables.FoodsAndFarmables;
import net.lowpolycat.foodsandfarmables.block.ModBlocks;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemNameBlockItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, FoodsAndFarmables.MOD_ID);

    public static final RegistryObject<Item> ORANGE = ITEMS.register("orange",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ORANGE_SEEDS = ITEMS.register("orange_seeds",
            () -> new ItemNameBlockItem(ModBlocks.ORANGE_BUSH.get(), new Item.Properties()));
    public static final RegistryObject<Item> ORANGE_PIE = ITEMS.register("orange_pie",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
