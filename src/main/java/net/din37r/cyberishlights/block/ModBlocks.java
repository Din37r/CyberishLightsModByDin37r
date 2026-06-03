package net.din37r.cyberishlights.block;

import net.din37r.cyberishlights.CyberishLights;
import net.din37r.cyberishlights.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.RedstoneLampBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(CyberishLights.MOD_ID);

    public static final DeferredBlock<Block> WHITE_NEON_LANTERN = registerBlock("white_neon_lantern",
            () -> new NeonLantern(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.SNOW)
                    .strength(3.5F)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.LANTERN)
                    .lightLevel(state -> 15)
                    .noOcclusion()
                    .forceSolidOn()));

    public static final DeferredBlock<Block> LIGHT_GRAY_NEON_LANTERN = registerBlock("light_gray_neon_lantern",
            () -> new NeonLantern(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_LIGHT_GRAY)
                    .strength(3.5F)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.LANTERN)
                    .lightLevel(state -> 15)
                    .noOcclusion()
                    .forceSolidOn()));

    public static final DeferredBlock<Block> GRAY_NEON_LANTERN = registerBlock("gray_neon_lantern",
            () -> new NeonLantern(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_GRAY)
                    .strength(3.5F)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.LANTERN)
                    .lightLevel(state -> 15)
                    .noOcclusion()
                    .forceSolidOn()));

    public static final DeferredBlock<Block> BLACK_NEON_LANTERN = registerBlock("black_neon_lantern",
            () -> new NeonLantern(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_BLACK)
                    .strength(3.5F)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.LANTERN)
                    .lightLevel(state -> 15)
                    .noOcclusion()
                    .forceSolidOn()));

    public static final DeferredBlock<Block> BROWN_NEON_LANTERN = registerBlock("brown_neon_lantern",
            () -> new NeonLantern(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_BROWN)
                    .strength(3.5F)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.LANTERN)
                    .lightLevel(state -> 15)
                    .noOcclusion()
                    .forceSolidOn()));

    public static final DeferredBlock<Block> RED_NEON_LANTERN = registerBlock("red_neon_lantern",
            () -> new NeonLantern(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_RED)
                    .strength(3.5F)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.LANTERN)
                    .lightLevel(state -> 15)
                    .noOcclusion()
                    .forceSolidOn()));

    public static final DeferredBlock<Block> ORANGE_NEON_LANTERN = registerBlock("orange_neon_lantern",
            () -> new NeonLantern(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_ORANGE)
                    .strength(3.5F)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.LANTERN)
                    .lightLevel(state -> 15)
                    .noOcclusion()
                    .forceSolidOn()));

    public static final DeferredBlock<Block> YELLOW_NEON_LANTERN = registerBlock("yellow_neon_lantern",
            () -> new NeonLantern(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_YELLOW)
                    .strength(3.5F)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.LANTERN)
                    .lightLevel(state -> 15)
                    .noOcclusion()
                    .forceSolidOn()));

    public static final DeferredBlock<Block> LIME_NEON_LANTERN = registerBlock("lime_neon_lantern",
            () -> new NeonLantern(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_LIGHT_GREEN)
                    .strength(3.5F)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.LANTERN)
                    .lightLevel(state -> 15)
                    .noOcclusion()
                    .forceSolidOn()));

    public static final DeferredBlock<Block> GREEN_NEON_LANTERN = registerBlock("green_neon_lantern",
            () -> new NeonLantern(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_GREEN)
                    .strength(3.5F)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.LANTERN)
                    .lightLevel(state -> 15)
                    .noOcclusion()
                    .forceSolidOn()));

    public static final DeferredBlock<Block> CYAN_NEON_LANTERN = registerBlock("cyan_neon_lantern",
            () -> new NeonLantern(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_CYAN)
                    .strength(3.5F)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.LANTERN)
                    .lightLevel(state -> 15)
                    .noOcclusion()
                    .forceSolidOn()));

    public static final DeferredBlock<Block> LIGHT_BLUE_NEON_LANTERN = registerBlock("light_blue_neon_lantern",
            () -> new NeonLantern(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_LIGHT_BLUE)
                    .strength(3.5F)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.LANTERN)
                    .lightLevel(state -> 15)
                    .noOcclusion()
                    .forceSolidOn()));

    public static final DeferredBlock<Block> BLUE_NEON_LANTERN = registerBlock("blue_neon_lantern",
            () -> new NeonLantern(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_BLUE)
                    .strength(3.5F)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.LANTERN)
                    .lightLevel(state -> 15)
                    .noOcclusion()
                    .forceSolidOn()));

    public static final DeferredBlock<Block> PURPLE_NEON_LANTERN = registerBlock("purple_neon_lantern",
            () -> new NeonLantern(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_PURPLE)
                    .strength(3.5F)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.LANTERN)
                    .lightLevel(state -> 15)
                    .noOcclusion()
                    .forceSolidOn()));

    public static final DeferredBlock<Block> MAGENTA_NEON_LANTERN = registerBlock("magenta_neon_lantern",
            () -> new NeonLantern(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_MAGENTA)
                    .strength(3.5F)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.LANTERN)
                    .lightLevel(state -> 15)
                    .noOcclusion()
                    .forceSolidOn()));

    public static final DeferredBlock<Block> PINK_NEON_LANTERN = registerBlock("pink_neon_lantern",
            () -> new NeonLantern(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_PINK)
                    .strength(3.5F)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.LANTERN)
                    .lightLevel(state -> 15)
                    .noOcclusion()
                    .forceSolidOn()));
    public static final DeferredBlock<Block> WHITE_NEON_LAMP = registerBlock("white_neon_lamp",
            () -> new RedstoneLampBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.REDSTONE_LAMP)
                    .mapColor(MapColor.TERRACOTTA_WHITE)
                    .strength(2.5F)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.LANTERN)
                    .lightLevel(state -> state.getValue(BlockStateProperties.LIT) ? 15 : 0)));
    public static final DeferredBlock<Block> LIGHT_GRAY_NEON_LAMP = registerBlock("light_gray_neon_lamp",
            () -> new RedstoneLampBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.REDSTONE_LAMP)
                    .mapColor(MapColor.TERRACOTTA_LIGHT_GRAY)
                    .strength(2.5F)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.LANTERN)
                    .lightLevel(state -> state.getValue(BlockStateProperties.LIT) ? 15 : 0)));
    public static final DeferredBlock<Block> GRAY_NEON_LAMP = registerBlock("gray_neon_lamp",
            () -> new RedstoneLampBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.REDSTONE_LAMP)
                    .mapColor(MapColor.TERRACOTTA_GRAY)
                    .strength(2.5F)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.LANTERN)
                    .lightLevel(state -> state.getValue(BlockStateProperties.LIT) ? 15 : 0)));
    public static final DeferredBlock<Block> BLACK_NEON_LAMP = registerBlock("black_neon_lamp",
            () -> new RedstoneLampBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.REDSTONE_LAMP)
                    .mapColor(MapColor.TERRACOTTA_BLACK)
                    .strength(2.5F)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.LANTERN)
                    .lightLevel(state -> state.getValue(BlockStateProperties.LIT) ? 15 : 0)));
    public static final DeferredBlock<Block> BROWN_NEON_LAMP = registerBlock("brown_neon_lamp",
            () -> new RedstoneLampBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.REDSTONE_LAMP)
                    .mapColor(MapColor.TERRACOTTA_BROWN)
                    .strength(2.5F)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.LANTERN)
                    .lightLevel(state -> state.getValue(BlockStateProperties.LIT) ? 15 : 0)));
    public static final DeferredBlock<Block> RED_NEON_LAMP = registerBlock("red_neon_lamp",
            () -> new RedstoneLampBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.REDSTONE_LAMP)
                    .mapColor(MapColor.TERRACOTTA_RED)
                    .strength(2.5F)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.LANTERN)
                    .lightLevel(state -> state.getValue(BlockStateProperties.LIT) ? 15 : 0)));
    public static final DeferredBlock<Block> ORANGE_NEON_LAMP = registerBlock("orange_neon_lamp",
            () -> new RedstoneLampBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.REDSTONE_LAMP)
                    .mapColor(MapColor.TERRACOTTA_ORANGE)
                    .strength(2.5F)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.LANTERN)
                    .lightLevel(state -> state.getValue(BlockStateProperties.LIT) ? 15 : 0)));
    public static final DeferredBlock<Block> YELLOW_NEON_LAMP = registerBlock("yellow_neon_lamp",
            () -> new RedstoneLampBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.REDSTONE_LAMP)
                    .mapColor(MapColor.TERRACOTTA_YELLOW)
                    .strength(2.5F)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.LANTERN)
                    .lightLevel(state -> state.getValue(BlockStateProperties.LIT) ? 15 : 0)));
    public static final DeferredBlock<Block> LIME_NEON_LAMP = registerBlock("lime_neon_lamp",
            () -> new RedstoneLampBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.REDSTONE_LAMP)
                    .mapColor(MapColor.TERRACOTTA_LIGHT_GREEN)
                    .strength(2.5F)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.LANTERN)
                    .lightLevel(state -> state.getValue(BlockStateProperties.LIT) ? 15 : 0)));
    public static final DeferredBlock<Block> GREEN_NEON_LAMP = registerBlock("green_neon_lamp",
            () -> new RedstoneLampBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.REDSTONE_LAMP)
                    .mapColor(MapColor.TERRACOTTA_GREEN)
                    .strength(2.5F)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.LANTERN)
                    .lightLevel(state -> state.getValue(BlockStateProperties.LIT) ? 15 : 0)));
    public static final DeferredBlock<Block> CYAN_NEON_LAMP = registerBlock("cyan_neon_lamp",
            () -> new RedstoneLampBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.REDSTONE_LAMP)
                    .mapColor(MapColor.TERRACOTTA_CYAN)
                    .strength(2.5F)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.LANTERN)
                    .lightLevel(state -> state.getValue(BlockStateProperties.LIT) ? 15 : 0)));
    public static final DeferredBlock<Block> LIGHT_BLUE_NEON_LAMP = registerBlock("light_blue_neon_lamp",
            () -> new RedstoneLampBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.REDSTONE_LAMP)
                    .mapColor(MapColor.TERRACOTTA_LIGHT_BLUE)
                    .strength(2.5F)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.LANTERN)
                    .lightLevel(state -> state.getValue(BlockStateProperties.LIT) ? 15 : 0)));
    public static final DeferredBlock<Block> BLUE_NEON_LAMP = registerBlock("blue_neon_lamp",
            () -> new RedstoneLampBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.REDSTONE_LAMP)
                    .mapColor(MapColor.TERRACOTTA_BLUE)
                    .strength(2.5F)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.LANTERN)
                    .lightLevel(state -> state.getValue(BlockStateProperties.LIT) ? 15 : 0)));
    public static final DeferredBlock<Block> PURPLE_NEON_LAMP = registerBlock("purple_neon_lamp",
            () -> new RedstoneLampBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.REDSTONE_LAMP)
                    .mapColor(MapColor.TERRACOTTA_PURPLE)
                    .strength(2.5F)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.LANTERN)
                    .lightLevel(state -> state.getValue(BlockStateProperties.LIT) ? 15 : 0)));
    public static final DeferredBlock<Block> MAGENTA_NEON_LAMP = registerBlock("magenta_neon_lamp",
            () -> new RedstoneLampBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.REDSTONE_LAMP)
                    .mapColor(MapColor.TERRACOTTA_MAGENTA)
                    .strength(2.5F)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.LANTERN)
                    .lightLevel(state -> state.getValue(BlockStateProperties.LIT) ? 15 : 0)));
    public static final DeferredBlock<Block> PINK_NEON_LAMP = registerBlock("pink_neon_lamp",
            () -> new RedstoneLampBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.REDSTONE_LAMP)
                    .mapColor(MapColor.TERRACOTTA_PINK)
                    .strength(2.5F)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.LANTERN)
                    .lightLevel(state -> state.getValue(BlockStateProperties.LIT) ? 15 : 0)));

    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block) {
        DeferredBlock<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
