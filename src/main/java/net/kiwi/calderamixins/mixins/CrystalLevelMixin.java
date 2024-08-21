package net.kiwi.calderamixins.mixins;

import net.minecraft.world.entity.player.Player;
import net.silentchaos512.scalinghealth.utils.config.SHItems;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(SHItems.class)
public abstract class CrystalLevelMixin {


    /**
     * @author Venom
     * @reason Make heart crystals always cost 0 to use.
     */
    @Inject(method = "levelCostToUseHeartCrystal", remap = false, at = @At("HEAD"), cancellable = true)
    private static void levelCostToUseHeartCrystal(Player player, CallbackInfoReturnable<Integer> cir) {
        cir.setReturnValue(0);
    }
}