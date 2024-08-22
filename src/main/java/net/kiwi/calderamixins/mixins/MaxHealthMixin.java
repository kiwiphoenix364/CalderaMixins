package net.kiwi.calderamixins.mixins;

import net.silentchaos512.scalinghealth.utils.config.SHPlayers;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(SHPlayers.class)
public abstract class MaxHealthMixin {


    /**
     * @author kiwi
     * @reason Make max health be limited to 40
     */
    @Inject(method = "maxHealth", remap = false, at = @At("HEAD"), cancellable = true)
    private static void maxHealth(CallbackInfoReturnable<Integer> cir) {
        cir.setReturnValue(40);
    }
}