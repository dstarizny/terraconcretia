package com.dstarizny.terraconcretia.block;

import com.dstarizny.terraconcretia.TerraConcretia;
import com.dstarizny.terraconcretia.item.ModItems;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.item.*;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, TerraConcretia.MOD_ID);

//    public static final RegistryObject<Block> CITRINE_BLOCK = registerBlock("citrine_block", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(9f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
//    public static final RegistryObject<Block> RAW_CITRINE_BLOCK = registerBlock("raw_citrine_block", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(7f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
//    public static final RegistryObject<Block> CITRINE_ORE = registerBlock("citrine_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(5f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
//    public static final RegistryObject<Block> DEEPSLATE_CITRINE_ORE = registerBlock("deepslate_citrine_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(5f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
//    public static final RegistryObject<Block> ENDSTONE_CITRINE_ORE = registerBlock("endstone_citrine_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(5f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
//    public static final RegistryObject<Block> NETHERRACK_CITRINE_ORE = registerBlock("netherrack_citrine_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(5f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);

//    public static final RegistryObject<Block> CITRINE_STAIRS = registerBlock("citrine_stairs", () -> new StairBlock(() -> ModBlocks.CITRINE_BLOCK.get().defaultBlockState() ,BlockBehaviour.Properties.of(Material.METAL).strength(5f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);

//    public static final RegistryObject<Block> WHITE_CONCRETE_STAIRS = registerBlock("white_concrete_stairs", () -> new StairBlock(() -> Blocks.WHITE_CONCRETE.defaultBlockState() ,BlockBehaviour.Properties.of(Material.METAL).strength(5f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);

    public static final RegistryObject<Block> BLACK_CONCRETE_SLAB = registerBlock("black_concrete_slab", () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE).strength(1.8f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> BLUE_CONCRETE_SLAB = registerBlock("blue_concrete_slab", () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE).strength(1.8f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> BROWN_CONCRETE_SLAB = registerBlock("brown_concrete_slab", () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE).strength(1.8f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> CYAN_CONCRETE_SLAB = registerBlock("cyan_concrete_slab", () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE).strength(1.8f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> GRAY_CONCRETE_SLAB = registerBlock("gray_concrete_slab", () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE).strength(1.8f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> GREEN_CONCRETE_SLAB = registerBlock("green_concrete_slab", () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE).strength(1.8f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> LIGHT_BLUE_CONCRETE_SLAB = registerBlock("light_blue_concrete_slab", () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE).strength(1.8f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> LIGHT_GRAY_CONCRETE_SLAB = registerBlock("light_gray_concrete_slab", () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE).strength(1.8f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> LIME_CONCRETE_SLAB = registerBlock("lime_concrete_slab", () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE).strength(1.8f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> MAGENTA_CONCRETE_SLAB = registerBlock("magenta_concrete_slab", () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE).strength(1.8f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> ORANGE_CONCRETE_SLAB = registerBlock("orange_concrete_slab", () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE).strength(1.8f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> PINK_CONCRETE_SLAB = registerBlock("pink_concrete_slab", () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE).strength(1.8f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> PURPLE_CONCRETE_SLAB = registerBlock("purple_concrete_slab", () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE).strength(1.8f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> RED_CONCRETE_SLAB = registerBlock("red_concrete_slab", () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE).strength(1.8f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> WHITE_CONCRETE_SLAB = registerBlock("white_concrete_slab", () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE).strength(1.8f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> YELLOW_CONCRETE_SLAB = registerBlock("yellow_concrete_slab", () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE).strength(1.8f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);


    public static final RegistryObject<Block> BLACK_GLAZED_TERRACOTTA_SLAB = registerBlock("black_glazed_terracotta_slab", () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE).strength(1.4f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> BLUE_GLAZED_TERRACOTTA_SLAB = registerBlock("blue_glazed_terracotta_slab", () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE).strength(1.4f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> BROWN_GLAZED_TERRACOTTA_SLAB = registerBlock("brown_glazed_terracotta_slab", () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE).strength(1.4f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> CYAN_GLAZED_TERRACOTTA_SLAB = registerBlock("cyan_glazed_terracotta_slab", () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE).strength(1.4f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> GRAY_GLAZED_TERRACOTTA_SLAB = registerBlock("gray_glazed_terracotta_slab", () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE).strength(1.4f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> GREEN_GLAZED_TERRACOTTA_SLAB = registerBlock("green_glazed_terracotta_slab", () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE).strength(1.4f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> LIGHT_BLUE_GLAZED_TERRACOTTA_SLAB = registerBlock("light_blue_glazed_terracotta_slab", () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE).strength(1.4f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> LIGHT_GRAY_GLAZED_TERRACOTTA_SLAB = registerBlock("light_gray_glazed_terracotta_slab", () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE).strength(1.4f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> LIME_GLAZED_TERRACOTTA_SLAB = registerBlock("lime_glazed_terracotta_slab", () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE).strength(1.4f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> MAGENTA_GLAZED_TERRACOTTA_SLAB = registerBlock("magenta_glazed_terracotta_slab", () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE).strength(1.4f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> ORANGE_GLAZED_TERRACOTTA_SLAB = registerBlock("orange_glazed_terracotta_slab", () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE).strength(1.4f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> PINK_GLAZED_TERRACOTTA_SLAB = registerBlock("pink_glazed_terracotta_slab", () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE).strength(1.4f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> PURPLE_GLAZED_TERRACOTTA_SLAB = registerBlock("purple_glazed_terracotta_slab", () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE).strength(1.4f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> RED_GLAZED_TERRACOTTA_SLAB = registerBlock("red_glazed_terracotta_slab", () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE).strength(1.4f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> WHITE_GLAZED_TERRACOTTA_SLAB = registerBlock("white_glazed_terracotta_slab", () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE).strength(1.4f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> YELLOW_GLAZED_TERRACOTTA_SLAB = registerBlock("yellow_glazed_terracotta_slab", () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE).strength(1.4f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);

    public static final RegistryObject<Block> BLACK_TERRACOTTA_SLAB = registerBlock("black_terracotta_slab", () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE).strength(1.25f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> BLUE_TERRACOTTA_SLAB = registerBlock("blue_terracotta_slab", () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE).strength(1.25f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> BROWN_TERRACOTTA_SLAB = registerBlock("brown_terracotta_slab", () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE).strength(1.25f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> CYAN_TERRACOTTA_SLAB = registerBlock("cyan_terracotta_slab", () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE).strength(1.25f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> GRAY_TERRACOTTA_SLAB = registerBlock("gray_terracotta_slab", () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE).strength(1.25f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> GREEN_TERRACOTTA_SLAB = registerBlock("green_terracotta_slab", () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE).strength(1.25f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> LIGHT_BLUE_TERRACOTTA_SLAB = registerBlock("light_blue_terracotta_slab", () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE).strength(1.25f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> LIGHT_GRAY_TERRACOTTA_SLAB = registerBlock("light_gray_terracotta_slab", () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE).strength(1.25f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> LIME_TERRACOTTA_SLAB = registerBlock("lime_terracotta_slab", () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE).strength(1.25f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> MAGENTA_TERRACOTTA_SLAB = registerBlock("magenta_terracotta_slab", () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE).strength(1.25f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> ORANGE_TERRACOTTA_SLAB = registerBlock("orange_terracotta_slab", () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE).strength(1.25f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> PINK_TERRACOTTA_SLAB = registerBlock("pink_terracotta_slab", () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE).strength(1.25f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> PURPLE_TERRACOTTA_SLAB = registerBlock("purple_terracotta_slab", () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE).strength(1.25f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> RED_TERRACOTTA_SLAB = registerBlock("red_terracotta_slab", () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE).strength(1.25f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> WHITE_TERRACOTTA_SLAB = registerBlock("white_terracotta_slab", () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE).strength(1.25f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> YELLOW_TERRACOTTA_SLAB = registerBlock("yellow_terracotta_slab", () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE).strength(1.25f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);

//    public static final RegistryObject<Block> ORANGE_CONCRETE_WALL = registerBlock("orange_concrete_wall", () -> new WallBlock(BlockBehaviour.Properties.of(Material.METAL).strength(1.8f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
//    public static final RegistryObject<Block> WHITE_CONCRETE_WALL = registerBlock("white_concrete_wall", () -> new WallBlock(BlockBehaviour.Properties.of(Material.METAL).strength(1.8f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
// ****************************************** WALL ******************************************************************************************
    public static final RegistryObject<Block> BLACK_CONCRETE_WALL = registerBlock("black_concrete_wall", () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE).strength(1.8f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> BLUE_CONCRETE_WALL = registerBlock("blue_concrete_wall", () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE).strength(1.8f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> BROWN_CONCRETE_WALL = registerBlock("brown_concrete_wall", () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE).strength(1.8f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> CYAN_CONCRETE_WALL = registerBlock("cyan_concrete_wall", () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE).strength(1.8f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> GRAY_CONCRETE_WALL = registerBlock("gray_concrete_wall", () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE).strength(1.8f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> GREEN_CONCRETE_WALL = registerBlock("green_concrete_wall", () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE).strength(1.8f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> LIGHT_BLUE_CONCRETE_WALL = registerBlock("light_blue_concrete_wall", () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE).strength(1.8f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> LIGHT_GRAY_CONCRETE_WALL = registerBlock("light_gray_concrete_wall", () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE).strength(1.8f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> LIME_CONCRETE_WALL = registerBlock("lime_concrete_wall", () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE).strength(1.8f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> MAGENTA_CONCRETE_WALL = registerBlock("magenta_concrete_wall", () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE).strength(1.8f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> ORANGE_CONCRETE_WALL = registerBlock("orange_concrete_wall", () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE).strength(1.8f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> PINK_CONCRETE_WALL = registerBlock("pink_concrete_wall", () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE).strength(1.8f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> PURPLE_CONCRETE_WALL = registerBlock("purple_concrete_wall", () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE).strength(1.8f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> RED_CONCRETE_WALL = registerBlock("red_concrete_wall", () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE).strength(1.8f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> WHITE_CONCRETE_WALL = registerBlock("white_concrete_wall", () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE).strength(1.8f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> YELLOW_CONCRETE_WALL = registerBlock("yellow_concrete_wall", () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE).strength(1.8f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);

    public static final RegistryObject<Block> BLACK_GLAZED_TERRACOTTA_WALL = registerBlock("black_glazed_terracotta_wall", () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE).strength(1.4f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> BLUE_GLAZED_TERRACOTTA_WALL = registerBlock("blue_glazed_terracotta_wall", () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE).strength(1.4f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> BROWN_GLAZED_TERRACOTTA_WALL = registerBlock("brown_glazed_terracotta_wall", () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE).strength(1.4f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> CYAN_GLAZED_TERRACOTTA_WALL = registerBlock("cyan_glazed_terracotta_wall", () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE).strength(1.4f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> GRAY_GLAZED_TERRACOTTA_WALL = registerBlock("gray_glazed_terracotta_wall", () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE).strength(1.4f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> GREEN_GLAZED_TERRACOTTA_WALL = registerBlock("green_glazed_terracotta_wall", () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE).strength(1.4f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> LIGHT_BLUE_GLAZED_TERRACOTTA_WALL = registerBlock("light_blue_glazed_terracotta_wall", () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE).strength(1.4f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> LIGHT_GRAY_GLAZED_TERRACOTTA_WALL = registerBlock("light_gray_glazed_terracotta_wall", () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE).strength(1.4f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> LIME_GLAZED_TERRACOTTA_WALL = registerBlock("lime_glazed_terracotta_wall", () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE).strength(1.4f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> MAGENTA_GLAZED_TERRACOTTA_WALL = registerBlock("magenta_glazed_terracotta_wall", () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE).strength(1.4f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> ORANGE_GLAZED_TERRACOTTA_WALL = registerBlock("orange_glazed_terracotta_wall", () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE).strength(1.4f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> PINK_GLAZED_TERRACOTTA_WALL = registerBlock("pink_glazed_terracotta_wall", () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE).strength(1.4f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> PURPLE_GLAZED_TERRACOTTA_WALL = registerBlock("purple_glazed_terracotta_wall", () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE).strength(1.4f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> RED_GLAZED_TERRACOTTA_WALL = registerBlock("red_glazed_terracotta_wall", () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE).strength(1.4f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> WHITE_GLAZED_TERRACOTTA_WALL = registerBlock("white_glazed_terracotta_wall", () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE).strength(1.4f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> YELLOW_GLAZED_TERRACOTTA_WALL = registerBlock("yellow_glazed_terracotta_wall", () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE).strength(1.4f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);

    public static final RegistryObject<Block> BLACK_TERRACOTTA_WALL = registerBlock("black_terracotta_wall", () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE).strength(1.25f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> BLUE_TERRACOTTA_WALL = registerBlock("blue_terracotta_wall", () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE).strength(1.25f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> BROWN_TERRACOTTA_WALL = registerBlock("brown_terracotta_wall", () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE).strength(1.25f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> CYAN_TERRACOTTA_WALL = registerBlock("cyan_terracotta_wall", () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE).strength(1.25f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> GRAY_TERRACOTTA_WALL = registerBlock("gray_terracotta_wall", () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE).strength(1.25f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> GREEN_TERRACOTTA_WALL = registerBlock("green_terracotta_wall", () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE).strength(1.25f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> LIGHT_BLUE_TERRACOTTA_WALL = registerBlock("light_blue_terracotta_wall", () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE).strength(1.25f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> LIGHT_GRAY_TERRACOTTA_WALL = registerBlock("light_gray_terracotta_wall", () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE).strength(1.25f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> LIME_TERRACOTTA_WALL = registerBlock("lime_terracotta_wall", () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE).strength(1.25f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> MAGENTA_TERRACOTTA_WALL = registerBlock("magenta_terracotta_wall", () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE).strength(1.25f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> ORANGE_TERRACOTTA_WALL = registerBlock("orange_terracotta_wall", () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE).strength(1.25f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> PINK_TERRACOTTA_WALL = registerBlock("pink_terracotta_wall", () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE).strength(1.25f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> PURPLE_TERRACOTTA_WALL = registerBlock("purple_terracotta_wall", () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE).strength(1.25f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> RED_TERRACOTTA_WALL = registerBlock("red_terracotta_wall", () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE).strength(1.25f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> WHITE_TERRACOTTA_WALL = registerBlock("white_terracotta_wall", () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE).strength(1.25f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> YELLOW_TERRACOTTA_WALL = registerBlock("yellow_terracotta_wall", () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE).strength(1.25f).requiresCorrectToolForDrops()), CreativeModeTab.TAB_BUILDING_BLOCKS);



    public static void register(IEventBus eventbus) {
        BLOCKS.register(eventbus);
    }

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab, String tooltipKey) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab,tooltipKey);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab, String tooltipKey) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                                                  new Item.Properties().tab(tab))  {
            @Override
            public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltip, TooltipFlag pFlag) {
                pTooltip.add(new TranslatableComponent(tooltipKey));
            }
        } );
    }


    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }

}
