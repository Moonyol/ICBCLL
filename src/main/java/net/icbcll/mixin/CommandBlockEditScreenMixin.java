package net.icbcll.mixin;

import net.minecraft.client.gui.screen.ingame.AbstractCommandBlockScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(AbstractCommandBlockScreen.class)
public class CommandBlockEditScreenMixin {
    @ModifyConstant(method = "init", constant = @Constant(intValue = 32500))
    private int icbcll$IncreasedCharacterLimit(int value) {
        return Integer.MAX_VALUE;
    }
}