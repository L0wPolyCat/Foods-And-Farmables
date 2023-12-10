package net.lowpolycat.foodsandfarmables.item;

import net.lowpolycat.foodsandfarmables.FoodsAndFarmables;
import net.lowpolycat.foodsandfarmables.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, FoodsAndFarmables.MOD_ID);

    public static final RegistryObject<CreativeModeTab> FOODS_AND_FARMABLES = CREATIVE_MODE_TABS.register("foods_and_farmables",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ModItems.ORANGE.get()))
                    .title(Component.translatable("creativetab.foods_and_farmables"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.ORANGE.get());
                        pOutput.accept(ModItems.ORANGE_PIE.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
