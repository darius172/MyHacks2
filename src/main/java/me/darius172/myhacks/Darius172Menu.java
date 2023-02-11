package me.darius172.myhacks;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.widget.ButtonWidget;
import net.minecraft.client.option.GameOptions;
import net.minecraft.text.Text;


public class Darius172Menu extends Screen {
    private final Screen parent;
    private final GameOptions setings;
    public Darius172Menu(Screen parent, GameOptions gameOptions) {
        super(Text.of("Darius172 Mod MENU"));
        this.parent = parent;
        this.setings = gameOptions;


    }
    public String FLY(){
        if (MyHacks.flyenabled==true){
            return "Flying Is ENABLED";
        }
        else {
            return "Flying is DISABLED";
        }
    }
    public String Rounding(){
        if (MyHacks.PRounding==true){
            return " Rounding";
        }
        else {
            return "Not rounding";
        }
    }




    protected void init(){
        this.addDrawableChild(new ButtonWidget(10,10,90,20,Text.of(FLY()),(button)->{
            if (MyHacks.flyenabled==true){

                MyHacks.flyenabled=false;
                MinecraftClient.getInstance().player.getAbilities().flying = false;
                button.setMessage(Text.of(FLY()));
            }else{
                MyHacks.flyenabled=true;
                MinecraftClient.getInstance().player.getAbilities().flying = true;
                button.setMessage(Text.of(FLY()));

            }



        }));
        this.addDrawableChild(new ButtonWidget(10,40,90,20,Text.of(Rounding()),(button1)->{
            if (MyHacks.PRounding==true){
                button1.setMessage(Text.of(Rounding()));
                MyHacks.PRounding=false;
            }else{
                button1.setMessage(Text.of(Rounding()));
                MyHacks.PRounding=true;
            }



        }));

    }




}
