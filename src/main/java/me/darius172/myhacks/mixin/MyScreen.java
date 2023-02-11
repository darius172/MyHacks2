package me.darius172.myhacks.mixin;

import me.darius172.myhacks.Darius172Menu;
import me.darius172.myhacks.MyHacks;
import net.minecraft.client.gui.screen.GameMenuScreen;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.widget.ButtonWidget;
import net.minecraft.text.LiteralTextContent;
import net.minecraft.text.Text;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(GameMenuScreen.class)

public class MyScreen extends Screen {

    protected MyScreen(Text text) {super(text);}
    @Inject(at = {@At("HEAD")}, method = {"initWidgets()V"})
    private void onInitWidgets(CallbackInfo ci)
    {
        this.addDrawableChild(new ButtonWidget(10,10,90,20,Text.of("Menu"),(button)->{
           this.client.setScreen(new Darius172Menu(this ,this.client.options));


        }));
    }


}

