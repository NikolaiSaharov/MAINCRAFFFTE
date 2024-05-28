package net.feezmen.supermod.block;

import net.feezmen.supermod.Item.ModCreativeModeTab;
import net.feezmen.supermod.Item.ModItems;
import net.feezmen.supermod.SuperMod;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;



public class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, SuperMod.MOD_ID);

    public static final RegistryObject<Block> AMBER_BLOCK = registryBlock("amber_block",
            ()->new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(3f).requiresCorrectToolForDrops()), ModCreativeModeTab.SUPER_TAB);

    public static final RegistryObject<Block> AMBER_ORE = registryBlock("amber_ore",
            ()->new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(3f).requiresCorrectToolForDrops(),
                    UniformInt.of(3,7)), ModCreativeModeTab.SUPER_TAB);

    public static final RegistryObject<Block> DEEPSLATE_AMBER_ORE = registryBlock("deepslate_amber_ore",
            ()->new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(3f).requiresCorrectToolForDrops(),
                    UniformInt.of(3,7)), ModCreativeModeTab.SUPER_TAB);
    public static final RegistryObject<Block> RUBY_ORE_BLOCK = registryBlock("ruby_ore_block",
            ()->new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(3f).requiresCorrectToolForDrops(),
                    UniformInt.of(3,7)), ModCreativeModeTab.SUPER_TAB);

    public static <T extends Block>RegistryObject<T> registryBlock(String name, Supplier<T> block, CreativeModeTab tab){
        RegistryObject<T> toReturns = BLOCKS.register(name,block);
        registryBlockItem(name,toReturns,tab);
        return toReturns;
    }

    private static <T extends Block> RegistryObject<Item> registryBlockItem(String name, RegistryObject<T> toReturns, CreativeModeTab tab) {
        return ModItems.ITEMS.register(name,()->new BlockItem(toReturns.get(),new Item.Properties().tab(tab)));
    }

    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }
}
