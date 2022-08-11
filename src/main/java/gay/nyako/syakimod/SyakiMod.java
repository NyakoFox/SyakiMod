package gay.nyako.syakimod;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.CraftingTableBlock;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class SyakiMod implements ModInitializer {
    public static final String MODID = "syakimod";
    public static final Block IRON_CRAFTING_TABLE_BLOCK = new IronCraftingTableBlock(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool());
    public static final Item IRON_CRAFTING_CORE = new Item(new FabricItemSettings().group(ItemGroup.MISC));

    @Override
    public void onInitialize() {
        Registry.register(Registry.BLOCK, new Identifier(MODID, "iron_crafting_table"), IRON_CRAFTING_TABLE_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(MODID, "iron_crafting_table"), new BlockItem(IRON_CRAFTING_TABLE_BLOCK, new FabricItemSettings().group(ItemGroup.MISC)));
        Registry.register(Registry.ITEM, new Identifier(MODID, "iron_crafting_core"), IRON_CRAFTING_CORE);
    }
}
