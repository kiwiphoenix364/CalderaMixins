package net.kiwi.calderamixins.mixins;

import net.silentchaos512.scalinghealth.utils.config.SHItems;
import net.silentchaos512.scalinghealth.utils.config.SHPlayers;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import static net.silentchaos512.scalinghealth.utils.config.SHPlayers.maxHealth;
import static net.silentchaos512.scalinghealth.utils.config.SHPlayers.startingHealth;

@Mixin(SHPlayers.class)
public abstract class MaxHealthMixin {


    /**
     * @author kiwi
     * @reason Make max health be limited to 40
     */
    @Inject(method = "maxHeartCrystals", remap = false, at = @At("HEAD"), cancellable = true)
    private static void maxHeartCrystals(CallbackInfoReturnable<Integer> cir) {
        cir.setReturnValue(Math.min(maxHealth(),20) - startingHealth() / (2 * SHItems.heartCrystalIncreaseAmount()));
    }
}