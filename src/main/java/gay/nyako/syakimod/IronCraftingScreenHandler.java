package gay.nyako.syakimod;

import net.minecraft.block.Blocks;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.screen.CraftingScreenHandler;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.screen.ScreenHandlerContext;

public class IronCraftingScreenHandler extends CraftingScreenHandler {
    public IronCraftingScreenHandler(int syncId, PlayerInventory playerInventory, ScreenHandlerContext context) {
        super(syncId, playerInventory, context);
    }

    public boolean canUse(PlayerEntity player) {
        return canUse(this.context, player, SyakiMod.IRON_CRAFTING_TABLE_BLOCK);
    }
}
