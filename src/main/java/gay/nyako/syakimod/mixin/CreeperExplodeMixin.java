package gay.nyako.syakimod.mixin;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.mob.CreeperEntity;
import net.minecraft.entity.mob.HostileEntity;
import net.minecraft.world.GameRules;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(CreeperEntity.class)
public abstract class CreeperExplodeMixin extends HostileEntity {

    protected CreeperExplodeMixin(EntityType<? extends HostileEntity> entityType, World world) {
        super(entityType, world);
    }

    @Redirect(method = "explode()V", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/GameRules;getBoolean(Lnet/minecraft/world/GameRules$Key;)Z"))
    private boolean explodeRedirect(GameRules gameRules, GameRules.Key<GameRules.BooleanRule> key) {
        return false;
    }
}
