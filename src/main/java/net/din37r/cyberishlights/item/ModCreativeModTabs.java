package net.din37r.cyberishlights.item;

import net.din37r.cyberishlights.CyberishLights;
import net.din37r.cyberishlights.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CyberishLights.MOD_ID);

    @SuppressWarnings("unused")
    public static final Supplier<CreativeModeTab> CYBERISHLIGHTS_TAB = CREATIVE_MODE_TAB.register("cyberishlights_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.LIGHT_BLUE_NEON_LAMP.get()))
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
                        output.accept(ModBlocks.WHITE_NEON_LANTERN.get());
                        output.accept(ModBlocks.LIGHT_GRAY_NEON_LANTERN.get());
                        output.accept(ModBlocks.GRAY_NEON_LANTERN.get());
                        output.accept(ModBlocks.BLACK_NEON_LANTERN.get());
                        output.accept(ModBlocks.BROWN_NEON_LANTERN.get());
                        output.accept(ModBlocks.RED_NEON_LANTERN.get());
                        output.accept(ModBlocks.ORANGE_NEON_LANTERN.get());
                        output.accept(ModBlocks.YELLOW_NEON_LANTERN.get());
                        output.accept(ModBlocks.LIME_NEON_LANTERN.get());
                        output.accept(ModBlocks.GREEN_NEON_LANTERN.get());
                        output.accept(ModBlocks.CYAN_NEON_LANTERN.get());
                        output.accept(ModBlocks.LIGHT_BLUE_NEON_LANTERN.get());
                        output.accept(ModBlocks.BLUE_NEON_LANTERN.get());
                        output.accept(ModBlocks.PURPLE_NEON_LANTERN.get());
                        output.accept(ModBlocks.MAGENTA_NEON_LANTERN.get());
                        output.accept(ModBlocks.PINK_NEON_LANTERN.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
