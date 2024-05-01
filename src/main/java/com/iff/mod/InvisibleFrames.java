package com.iff.mod;



import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;


import org.slf4j.Logger;
import com.mojang.logging.LogUtils;

import net.minecraftforge.event.entity.player.PlayerInteractEvent.EntityInteract;




@Mod(InvisibleFrames.MODID)
public class InvisibleFrames {
    public static final String MODID = "iff";
    public static final Logger LOGGER = LogUtils.getLogger();

    @Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.FORGE,modid = MODID)
    public static class FrameInteract
    {
        @SubscribeEvent
        public static void onFrameInteract(EntityInteract event){
            if (event == null || event.getTarget() == null){return;}
            
            if (event.getTarget().getType().toString().equalsIgnoreCase("entity.minecraft.item_frame"))
            {
                event.getTarget().setInvisible(true);
                
            }
        }
    }
}
