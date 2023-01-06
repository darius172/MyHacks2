package me.darius172.myhacks;

import net.fabricmc.api.ModInitializer;

import net.minecraft.client.MinecraftClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MyHacks implements ModInitializer{

    public static final Logger LOGGER = LoggerFactory.getLogger("modid") ;


    @Override
    public void onInitialize() {
        LOGGER.info("Hello World");


    }

    public static void superjump(){
        System.out.println("Super Jumping NOW !");
        MinecraftClient.getInstance().player.addVelocity(0,0.5,0);
    }
}

