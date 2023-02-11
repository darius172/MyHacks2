package me.darius172.myhacks.mixin;

import me.darius172.myhacks.MyHacks;
import net.minecraft.client.MinecraftClient;
import net.minecraft.entity.player.PlayerEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(PlayerEntity.class)

public abstract class FlyMixin {
    @Shadow public abstract void tick();

    public int TimeD = 80 ;
    @Inject(at = @At("TAIL"), method = "Lnet/minecraft/entity/player/PlayerEntity;tick()V")
    public void fly(CallbackInfo info){

        TimeD--;
        if ( MyHacks.flyenabled == true){
            if( TimeD ==10 ){
                drop();
                TimeD = 80;
            }




        }

        if (MyHacks.flyenabled ==true){
            MinecraftClient.getInstance().player.getAbilities().allowFlying = true;
        }
        else{
            MinecraftClient.getInstance().player.getAbilities().allowFlying = false;
        }

    }
    public void drop(){

        MinecraftClient.getInstance().player.setVelocity(
                MinecraftClient.getInstance().player.getVelocity().x,
                -1,
                MinecraftClient.getInstance().player.getVelocity().z
        );
    }
}
