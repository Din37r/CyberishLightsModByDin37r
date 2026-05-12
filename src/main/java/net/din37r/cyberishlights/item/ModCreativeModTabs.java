package net.din37r.cyberishlights.item;

import net.din37r.cyberishlights.CyberishLights;
import net.din37r.cyberishlights.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CyberishLights.MOD_ID);

    public static final RegistryObject<CreativeModeTab> CYBERISHLIGHTS_TAB = CREATIVE_MODE_TABS.register("cyberishlights_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.WHITE_NEON_LAMP.get()))
                    .title(Component.translatable("creativetab.cyberishlights_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModBlocks.WHITE_NEON_LAMP.get());
                        output.accept(ModBlocks.LIGHT_GRAY_NEON_LAMP.get());
                        output.accept(ModBlocks.GRAY_NEON_LAMP.get());
                        output.accept(ModBlocks.BLACK_NEON_LAMP.get());
                        output.accept(ModBlocks.BROWN_NEON_LAMP.get());
                        output.accept(ModBlocks.RED_NEON_LAMP.get());
                        output.accept(ModBlocks.ORANGE_NEON_LAMP.get());
                        output.accept(ModBlocks.YELLOW_NEON_LAMP.get());
                        output.accept(ModBlocks.LIME_NEON_LAMP.get());
                        output.accept(ModBlocks.GREEN_NEON_LAMP.get());
                        output.accept(ModBlocks.CYAN_NEON_LAMP.get());
                        output.accept(ModBlocks.LIGHT_BLUE_NEON_LAMP.get());
                        output.accept(ModBlocks.BLUE_NEON_LAMP.get());
                        output.accept(ModBlocks.PURPLE_NEON_LAMP.get());
                        output.accept(ModBlocks.MAGENTA_NEON_LAMP.get());
                        output.accept(ModBlocks.PINK_NEON_LAMP.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
