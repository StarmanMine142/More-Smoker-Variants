package de.pnku.msmv.init;

import de.pnku.msmv.MoreSmokerVariants;
import de.pnku.msmv.block.MoreSmokerVariantBlock;
import de.pnku.msmv.block.MoreSmokerVariantBlockEntity;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.block.Block;
import net.minecraft.core.Registry;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.material.MapColor;

import java.util.ArrayList;
import java.util.List;

import static de.pnku.msmv.MoreSmokerVariants.LOGGER;
import static de.pnku.msmv.init.MsmvMfvBlockInit.*;

public class MsmvBlockInit {
    public static final MoreSmokerVariantBlock BIRCH_COBBLESTONE_SMOKER = new MoreSmokerVariantBlock(MapColor.SAND, "birch", "cobblestone");public static final MoreSmokerVariantBlock DARK_OAK_COBBLESTONE_SMOKER = new MoreSmokerVariantBlock(MapColor.COLOR_BROWN, "dark_oak", "cobblestone");
    public static final MoreSmokerVariantBlock SPRUCE_COBBLESTONE_SMOKER = new MoreSmokerVariantBlock(MapColor.PODZOL, "spruce", "cobblestone");
    public static final MoreSmokerVariantBlock JUNGLE_COBBLESTONE_SMOKER = new MoreSmokerVariantBlock(MapColor.DIRT, "jungle", "cobblestone");
    public static final MoreSmokerVariantBlock ACACIA_COBBLESTONE_SMOKER = new MoreSmokerVariantBlock(MapColor.COLOR_ORANGE, "acacia", "cobblestone");
    public static final MoreSmokerVariantBlock MANGROVE_COBBLESTONE_SMOKER = new MoreSmokerVariantBlock(MapColor.COLOR_RED, "mangrove", "cobblestone");
    public static final MoreSmokerVariantBlock CHERRY_COBBLESTONE_SMOKER = new MoreSmokerVariantBlock(MapColor.TERRACOTTA_WHITE, SoundType.CHERRY_WOOD, "cherry", "cobblestone");
    public static final MoreSmokerVariantBlock BAMBOO_COBBLESTONE_SMOKER = new MoreSmokerVariantBlock(MapColor.COLOR_YELLOW, SoundType.BAMBOO_WOOD, "bamboo", "cobblestone");
    public static final MoreSmokerVariantBlock CRIMSON_COBBLESTONE_SMOKER = new MoreSmokerVariantBlock(MapColor.CRIMSON_STEM, SoundType.NETHER_WOOD, "crimson", "cobblestone");
    public static final MoreSmokerVariantBlock WARPED_COBBLESTONE_SMOKER = new MoreSmokerVariantBlock(MapColor.WARPED_STEM, SoundType.NETHER_WOOD, "warped", "cobblestone");
//    public static final MoreSmokerVariantBlock BIRCH_BLACKSTONE_SMOKER = new MoreSmokerVariantBlock(MapColor.SAND, "birch", "blackstone");
//    public static final MoreSmokerVariantBlock OAK_BLACKSTONE_SMOKER = new MoreSmokerVariantBlock(MapColor.COLOR_BROWN, "oak", "blackstone");
//    public static final MoreSmokerVariantBlock DARK_OAK_BLACKSTONE_SMOKER = new MoreSmokerVariantBlock(MapColor.COLOR_BROWN, "dark_oak", "blackstone");
//    public static final MoreSmokerVariantBlock SPRUCE_BLACKSTONE_SMOKER = new MoreSmokerVariantBlock(MapColor.PODZOL, "spruce", "blackstone");
//    public static final MoreSmokerVariantBlock JUNGLE_BLACKSTONE_SMOKER = new MoreSmokerVariantBlock(MapColor.DIRT, "jungle", "blackstone");
//    public static final MoreSmokerVariantBlock ACACIA_BLACKSTONE_SMOKER = new MoreSmokerVariantBlock(MapColor.COLOR_ORANGE, "acacia", "blackstone");
//    public static final MoreSmokerVariantBlock MANGROVE_BLACKSTONE_SMOKER = new MoreSmokerVariantBlock(MapColor.COLOR_RED, "mangrove", "blackstone");
//    public static final MoreSmokerVariantBlock CHERRY_BLACKSTONE_SMOKER = new MoreSmokerVariantBlock(MapColor.TERRACOTTA_WHITE, SoundType.CHERRY_WOOD, "cherry", "blackstone");
//    public static final MoreSmokerVariantBlock BAMBOO_BLACKSTONE_SMOKER = new MoreSmokerVariantBlock(MapColor.COLOR_YELLOW, SoundType.BAMBOO_WOOD, "bamboo", "blackstone");
//    public static final MoreSmokerVariantBlock CRIMSON_BLACKSTONE_SMOKER = new MoreSmokerVariantBlock(MapColor.CRIMSON_STEM, SoundType.NETHER_WOOD, "crimson", "blackstone");
//    public static final MoreSmokerVariantBlock WARPED_BLACKSTONE_SMOKER = new MoreSmokerVariantBlock(MapColor.WARPED_STEM, SoundType.NETHER_WOOD, "warped", "blackstone");
//    public static final MoreSmokerVariantBlock BIRCH_DEEPSLATE_SMOKER = new MoreSmokerVariantBlock(MapColor.SAND, "birch", "deepslate");
//    public static final MoreSmokerVariantBlock OAK_DEEPSLATE_SMOKER = new MoreSmokerVariantBlock(MapColor.COLOR_BROWN, "oak", "deepslate");
//    public static final MoreSmokerVariantBlock DARK_OAK_DEEPSLATE_SMOKER = new MoreSmokerVariantBlock(MapColor.COLOR_BROWN, "dark_oak", "deepslate");
//    public static final MoreSmokerVariantBlock SPRUCE_DEEPSLATE_SMOKER = new MoreSmokerVariantBlock(MapColor.PODZOL, "spruce", "deepslate");
//    public static final MoreSmokerVariantBlock JUNGLE_DEEPSLATE_SMOKER = new MoreSmokerVariantBlock(MapColor.DIRT, "jungle", "deepslate");
//    public static final MoreSmokerVariantBlock ACACIA_DEEPSLATE_SMOKER = new MoreSmokerVariantBlock(MapColor.COLOR_ORANGE, "acacia", "deepslate");
//    public static final MoreSmokerVariantBlock MANGROVE_DEEPSLATE_SMOKER = new MoreSmokerVariantBlock(MapColor.COLOR_RED, "mangrove", "deepslate");
//    public static final MoreSmokerVariantBlock CHERRY_DEEPSLATE_SMOKER = new MoreSmokerVariantBlock(MapColor.TERRACOTTA_WHITE, SoundType.CHERRY_WOOD, "cherry", "deepslate");
//    public static final MoreSmokerVariantBlock BAMBOO_DEEPSLATE_SMOKER = new MoreSmokerVariantBlock(MapColor.COLOR_YELLOW, SoundType.BAMBOO_WOOD, "bamboo", "deepslate");
//    public static final MoreSmokerVariantBlock CRIMSON_DEEPSLATE_SMOKER = new MoreSmokerVariantBlock(MapColor.CRIMSON_STEM, SoundType.NETHER_WOOD, "crimson", "deepslate");
//    public static final MoreSmokerVariantBlock WARPED_DEEPSLATE_SMOKER = new MoreSmokerVariantBlock(MapColor.WARPED_STEM, SoundType.NETHER_WOOD, "warped", "deepslate");


    public static BlockEntityType<MoreSmokerVariantBlockEntity> MORE_SMOKER_VARIANT_BLOCK_ENTITY;

    public static final List<Block> more_smokers = new ArrayList<>();

    public static void registerSmokerBlocks() {
        registerSmokerBlock(BIRCH_COBBLESTONE_SMOKER);
        registerSmokerBlock(DARK_OAK_COBBLESTONE_SMOKER);
        registerSmokerBlock(SPRUCE_COBBLESTONE_SMOKER);
        registerSmokerBlock(JUNGLE_COBBLESTONE_SMOKER);
        registerSmokerBlock(ACACIA_COBBLESTONE_SMOKER);
        registerSmokerBlock(MANGROVE_COBBLESTONE_SMOKER);
        registerSmokerBlock(CHERRY_COBBLESTONE_SMOKER);
        registerSmokerBlock(BAMBOO_COBBLESTONE_SMOKER);
        registerSmokerBlock(CRIMSON_COBBLESTONE_SMOKER);
        registerSmokerBlock(WARPED_COBBLESTONE_SMOKER);
            registerSmokerBlock(BIRCH_BLACKSTONE_SMOKER);
            registerSmokerBlock(OAK_BLACKSTONE_SMOKER);
            registerSmokerBlock(DARK_OAK_BLACKSTONE_SMOKER);
            registerSmokerBlock(SPRUCE_BLACKSTONE_SMOKER);
            registerSmokerBlock(JUNGLE_BLACKSTONE_SMOKER);
            registerSmokerBlock(ACACIA_BLACKSTONE_SMOKER);
            registerSmokerBlock(MANGROVE_BLACKSTONE_SMOKER);
            registerSmokerBlock(CHERRY_BLACKSTONE_SMOKER);
            registerSmokerBlock(BAMBOO_BLACKSTONE_SMOKER);
            registerSmokerBlock(CRIMSON_BLACKSTONE_SMOKER);
            registerSmokerBlock(WARPED_BLACKSTONE_SMOKER);
            registerSmokerBlock(BIRCH_DEEPSLATE_SMOKER);
            registerSmokerBlock(OAK_DEEPSLATE_SMOKER);
            registerSmokerBlock(DARK_OAK_DEEPSLATE_SMOKER);
            registerSmokerBlock(SPRUCE_DEEPSLATE_SMOKER);
            registerSmokerBlock(JUNGLE_DEEPSLATE_SMOKER);
            registerSmokerBlock(ACACIA_DEEPSLATE_SMOKER);
            registerSmokerBlock(MANGROVE_DEEPSLATE_SMOKER);
            registerSmokerBlock(CHERRY_DEEPSLATE_SMOKER);
            registerSmokerBlock(BAMBOO_DEEPSLATE_SMOKER);
            registerSmokerBlock(CRIMSON_DEEPSLATE_SMOKER);
            registerSmokerBlock(WARPED_DEEPSLATE_SMOKER);

        MORE_SMOKER_VARIANT_BLOCK_ENTITY = Registry.register(BuiltInRegistries.BLOCK_ENTITY_TYPE, MoreSmokerVariants.asId("more_smoker_variant"), BlockEntityType.Builder.of(MoreSmokerVariantBlockEntity::new, MsmvBlockInit.more_smokers.toArray(Block[]::new)).build(null));

    }

    public static void registerCobblestoneSmokerBlocks() {
        registerSmokerBlock(BIRCH_COBBLESTONE_SMOKER);
        registerSmokerBlock(DARK_OAK_COBBLESTONE_SMOKER);
        registerSmokerBlock(SPRUCE_COBBLESTONE_SMOKER);
        registerSmokerBlock(JUNGLE_COBBLESTONE_SMOKER);
        registerSmokerBlock(ACACIA_COBBLESTONE_SMOKER);
        registerSmokerBlock(MANGROVE_COBBLESTONE_SMOKER);
        registerSmokerBlock(CHERRY_COBBLESTONE_SMOKER);
        registerSmokerBlock(BAMBOO_COBBLESTONE_SMOKER);
        registerSmokerBlock(CRIMSON_COBBLESTONE_SMOKER);
        registerSmokerBlock(WARPED_COBBLESTONE_SMOKER);

        MORE_SMOKER_VARIANT_BLOCK_ENTITY = Registry.register(BuiltInRegistries.BLOCK_ENTITY_TYPE, MoreSmokerVariants.asId("more_smoker_variant"), BlockEntityType.Builder.of(MoreSmokerVariantBlockEntity::new, MsmvBlockInit.more_smokers.toArray(Block[]::new)).build(null));

    }

    private static void registerSmokerBlock(MoreSmokerVariantBlock smoker) {
        Registry.register(BuiltInRegistries.BLOCK, MoreSmokerVariants.asId(((MoreSmokerVariantBlock) smoker).smokerWoodType + "_" + ((MoreSmokerVariantBlock) smoker).smokerStoneType + "_smoker"), smoker);
        more_smokers.add(smoker);
        LOGGER.info("Registered" + smoker);
    }
}
