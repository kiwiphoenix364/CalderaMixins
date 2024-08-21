package net.kiwi.calderamixins;

import com.mojang.logging.LogUtils;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import net.minecraft.world.entity.player.Player;


//not sure why SHItems is red, probably gotta import something but I've got no idea what
@Mixin(SHItems.class)
public class CalderaMixins {
    @Inject(
            //not sure what to put here
            method = {""},
            remap = true,
            cancellable = true,
            at = @At(value = "HEAD")
    )
    private static int levelCostToUseHeartCrystal(Player player) {
        return 0;
    }
}