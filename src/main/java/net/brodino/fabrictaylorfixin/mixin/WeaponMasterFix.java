package net.brodino.fabrictaylorfixin.mixin;

import com.bawnorton.mixinsquared.TargetHandler;
import com.minecraftserverzone.weaponmaster.setup.PlayerEntityExtension;
import net.minecraft.entity.player.PlayerEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Inject;

@Mixin(value= PlayerEntity.class, priority = 1500)
public class WeaponMasterFix {
    @TargetHandler(
            mixin = "com.minecraftserverzone.weaponmaster.mixin.ClientPlayerMixin",
            name = "getHotbarSlots"
    )

    @Inject(method = "@MixinSquared:Handler", at = @At("HEAD"))
    private void doSomething(CallbackInfo originalCi, CallbackInfo ci) {
        LOGGER.info("Injecting into handler$######$modid$targetMethod");
    }
}
