package veemo.kizzyjune.customcolorz.mixin;

import net.minecraft.client.renderer.BiomeColors;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import veemo.kizzyjune.customcolorz.ColorProcessor;
import veemo.kizzyjune.customcolorz.Config;

@Mixin(BiomeColors.class)
public class OtherColorsMixin {
    @Inject(method = "getAverageFoliageColor", at = @At("TAIL"), cancellable = true)
    private static void changeFoliageColor(CallbackInfoReturnable<Integer> ci) {
        if (Config.USE_DEFAULT_FOLIAGE_COLOR.get()) {
            ;
            ci.setReturnValue(ci.getReturnValue());
        } else {
            ci.setReturnValue(ColorProcessor.foliageColor());
        }
    }

    @Inject(method = "getAverageGrassColor", at = @At("TAIL"), cancellable = true)
    private static void changeGrassColor(CallbackInfoReturnable<Integer> ci) {
        if (Config.USE_DEFAULT_GRASS_COLOR.get()) {
            ;
            ci.setReturnValue(ci.getReturnValue());
        } else {
            ci.setReturnValue(ColorProcessor.grassColor());
        }
    }

    @Inject(method = "getAverageWaterColor", at = @At("TAIL"), cancellable = true)
    private static void changeWaterColor(CallbackInfoReturnable<Integer> ci) {
        if (Config.USE_DEFAULT_WATER_COLOR.get()) {
            ;
            ci.setReturnValue(ci.getReturnValue());
        } else {
            ci.setReturnValue(ColorProcessor.waterColor());
        }
    }
}
