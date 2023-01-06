package me.darius172.myhacks.mixin;

import net.minecraft.client.MinecraftClient;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.vehicle.BoatEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(PlayerEntity.class)
public class Rounding {


@Inject(at = @At("TAIL"), method = "Lnet/minecraft/entity/player/PlayerEntity;tick()V")
    private void Rounding(CallbackInfo info) throws InterruptedException {
        double rawx = MinecraftClient.getInstance().player.getX();
        double rawy = MinecraftClient.getInstance().player.getY();
        double rawz = MinecraftClient.getInstance().player.getZ();
        double xR = Math.round(rawx*100);
        double yR = Math.round(rawy*100);
        double zR = Math.round(rawz*100);
        double x = xR/100;
        double y = yR/100;
        double z = zR/100;
        MinecraftClient.getInstance().player.setPosition(x,y,z);


    }



}
