package veemo.kizzyjune.customcolorz.mixin;

import net.minecraft.world.level.biome.BiomeSpecialEffects;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import veemo.kizzyjune.customcolorz.ColorProcessor;
import veemo.kizzyjune.customcolorz.Config;

@Mixin(BiomeSpecialEffects.class)
public class FogColorMixin {
    @Inject(method = "getFogColor", at = @At("TAIL"), cancellable = true)
    private static void changeFogColor(CallbackInfoReturnable<Integer> ci) {
        if (Config.USE_DEFAULT_FOG_COLOR.get()) {
            ;
            ci.setReturnValue(ci.getReturnValue());
        } else {
            ci.setReturnValue(ColorProcessor.cloudColor());
        }
    }
}