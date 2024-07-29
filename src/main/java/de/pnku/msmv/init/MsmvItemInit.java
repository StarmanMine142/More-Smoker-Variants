package de.pnku.msmv.init;

import de.pnku.msmv.MoreSmokerVariants;
import de.pnku.msmv.block.MoreSmokerVariantBlock;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.core.Registry;

public class MsmvItemInit {
    public static final BlockItem BIRCH_COBBLESTONE_SMOKER_I = new BlockItem(MsmvBlockInit.BIRCH_COBBLESTONE_SMOKER, new Item.Properties());
    public static final BlockItem DARK_OAK_COBBLESTONE_SMOKER_I = new BlockItem(MsmvBlockInit.DARK_OAK_COBBLESTONE_SMOKER, new Item.Properties());
    public static final BlockItem SPRUCE_COBBLESTONE_SMOKER_I = new BlockItem(MsmvBlockInit.SPRUCE_COBBLESTONE_SMOKER, new Item.Properties());
    public static final BlockItem JUNGLE_COBBLESTONE_SMOKER_I = new BlockItem(MsmvBlockInit.JUNGLE_COBBLESTONE_SMOKER, new Item.Properties());
    public static final BlockItem ACACIA_COBBLESTONE_SMOKER_I = new BlockItem(MsmvBlockInit.ACACIA_COBBLESTONE_SMOKER, new Item.Properties());
    public static final BlockItem MANGROVE_COBBLESTONE_SMOKER_I = new BlockItem(MsmvBlockInit.MANGROVE_COBBLESTONE_SMOKER, new Item.Properties());
    public static final BlockItem CHERRY_COBBLESTONE_SMOKER_I = new BlockItem(MsmvBlockInit.CHERRY_COBBLESTONE_SMOKER, new Item.Properties());
    public static final BlockItem BAMBOO_COBBLESTONE_SMOKER_I = new BlockItem(MsmvBlockInit.BAMBOO_COBBLESTONE_SMOKER, new Item.Properties());
    public static final BlockItem CRIMSON_COBBLESTONE_SMOKER_I = new BlockItem(MsmvBlockInit.CRIMSON_COBBLESTONE_SMOKER, new Item.Properties());
    public static final BlockItem WARPED_COBBLESTONE_SMOKER_I = new BlockItem(MsmvBlockInit.WARPED_COBBLESTONE_SMOKER, new Item.Properties());


    public static void registerSmokerItems() {
        registerSmokerItem(BIRCH_COBBLESTONE_SMOKER_I, Items.SMOKER);
        registerSmokerItem(DARK_OAK_COBBLESTONE_SMOKER_I, BIRCH_COBBLESTONE_SMOKER_I);
        registerSmokerItem(SPRUCE_COBBLESTONE_SMOKER_I, DARK_OAK_COBBLESTONE_SMOKER_I);
        registerSmokerItem(JUNGLE_COBBLESTONE_SMOKER_I, SPRUCE_COBBLESTONE_SMOKER_I);
        registerSmokerItem(ACACIA_COBBLESTONE_SMOKER_I, JUNGLE_COBBLESTONE_SMOKER_I);
        registerSmokerItem(MANGROVE_COBBLESTONE_SMOKER_I, ACACIA_COBBLESTONE_SMOKER_I);
        registerSmokerItem(CHERRY_COBBLESTONE_SMOKER_I, MANGROVE_COBBLESTONE_SMOKER_I);
        registerSmokerItem(BAMBOO_COBBLESTONE_SMOKER_I, CHERRY_COBBLESTONE_SMOKER_I);
        registerSmokerItem(CRIMSON_COBBLESTONE_SMOKER_I, BAMBOO_COBBLESTONE_SMOKER_I);
        registerSmokerItem(WARPED_COBBLESTONE_SMOKER_I, CRIMSON_COBBLESTONE_SMOKER_I);
    }

    private static void registerSmokerItem(BlockItem smoker, Item smokerAfter) {
        Registry.register(BuiltInRegistries.ITEM, MoreSmokerVariants.asId(((MoreSmokerVariantBlock) smoker.getBlock()).smokerWoodType + "_" + ((MoreSmokerVariantBlock) smoker.getBlock()).smokerStoneType + "_smoker"), smoker);

        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.FUNCTIONAL_BLOCKS).register(entries -> entries.addAfter(smokerAfter, smoker));
    }
}