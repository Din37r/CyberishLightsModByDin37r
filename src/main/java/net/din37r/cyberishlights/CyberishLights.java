package net.din37r.cyberishlights;

import net.din37r.cyberishlights.block.ModBlocks;
import net.din37r.cyberishlights.item.ModCreativeModTabs;
import net.din37r.cyberishlights.item.ModItems;
import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;

@Mod(CyberishLights.MOD_ID)
public class CyberishLights {
    public static final String MOD_ID = "cyberishlights";
    public static final Logger LOGGER = LogUtils.getLogger();
    public CyberishLights(IEventBus modEventBus) {

        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);

        ModCreativeModTabs.register(modEventBus);
    }
}
