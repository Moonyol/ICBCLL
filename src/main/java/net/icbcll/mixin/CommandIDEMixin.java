package net.icbcll.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Pseudo;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

//FabricLoader.getInstance().isModLoaded("modid")
@Pseudo
@Mixin(targets = "arm32x/minecraft/commandblockide/client/gui/editor/CommandBlockEditor", remap = false)
public class CommandIDEMixin {
    @ModifyConstant(method = "<init>", constant = @Constant(intValue = 32500))
    private int icbcll$IncreasedCharacterLimit(int value) {
        return Integer.MAX_VALUE;
    }
}
