package me.darius172.myhacks;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.minecraft.client.MinecraftClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MyHacks implements ModInitializer{

    public static final Logger LOGGER = LoggerFactory.getLogger("modid") ;




    @Override
    public void onInitialize() {
        LOGGER.info("Hello World");







    }
    public static boolean flyenabled;
    public static boolean PRounding;
    






}

