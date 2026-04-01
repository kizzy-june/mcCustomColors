package veemo.kizzyjune.customcolorz.mixin;

import net.minecraft.world.level.biome.Biome;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import veemo.kizzyjune.customcolorz.ColorProcessor;
import veemo.kizzyjune.customcolorz.Config;

@Mixin(Biome.class)
public class SkyColorMixin {
    @Inject(method = "getSkyColor", at = @At("TAIL"), cancellable = true)
    private static void changeSkyColor(CallbackInfoReturnable<Integer> ci) {
        if (Config.USE_DEFAULT_SKY_COLOR.get()) {
            ;
            ci.setReturnValue(ci.getReturnValue());
        } else {
            ci.setReturnValue(ColorProcessor.skyColor());
        }
    }
}
