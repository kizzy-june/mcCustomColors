package veemo.kizzyjune.customcolorz.mixin;

import net.minecraft.client.renderer.CloudRenderer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import veemo.kizzyjune.customcolorz.ColorProcessor;
import veemo.kizzyjune.customcolorz.Config;

@Mixin(CloudRenderer.class)
public class CloudColorMixin {
    @Inject(method = "getColor", at = @At("TAIL"), cancellable = true)
    private static void changeCloudColor(CallbackInfoReturnable<Integer> ci) {
        if (Config.USE_DEFAULT_CLOUD_COLOR.get()) {;
            ci.setReturnValue(ci.getReturnValue());
        } else {
            ci.setReturnValue(ColorProcessor.cloudColor());
        }
    }
}