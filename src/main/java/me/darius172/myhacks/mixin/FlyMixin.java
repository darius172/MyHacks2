package me.darius172.myhacks.mixin;

import net.minecraft.client.MinecraftClient;

import net.minecraft.entity.player.PlayerEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(PlayerEntity.class)
public class FlyMixin {


    private int a;

    @Inject(at = @At("HEAD"), method = "Lnet/minecraft/entity/player/PlayerEntity;tick()V")
    private void VelocityChange(CallbackInfo info) throws InterruptedException {
        MinecraftClient.getInstance().player.getAbilities().allowFlying = true ;


        //f (MinecraftClient.getInstance().player.input.jumping){

            //MinecraftClient.getInstance().player.addVelocity(0,0.2,0);

            //MinecraftClient.getInstance().player.addVelocity(0,-0.01,0);






        //}

    }

    public void tick(MinecraftClient client){
        a++;
        if (a==24){
            a=0;
            client.player.setVelocity(0,-0.05,0);
        }



    }

}
