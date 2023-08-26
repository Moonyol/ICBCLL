package net.icbcll.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Pseudo;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

//FabricLoader.getInstance().isModLoaded("modid")
@Pseudo
@Mixin(targets = "bettercommandblockui/main/ui/screen/AbstractBetterCommandBlockScreen", remap = false)
public class BetterCommandBlockUIMixin {
    @ModifyConstant(method = "init", constant = @Constant(intValue = 32500))
    private int icbcll$IncreasedCharacterLimit(int value) {
        return Integer.MAX_VALUE;
    }
}
