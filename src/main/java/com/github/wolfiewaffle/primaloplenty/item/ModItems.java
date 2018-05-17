package com.github.wolfiewaffle.primaloplenty.item;

import com.github.wolfiewaffle.primaloplenty.block.ModBlocks;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {
	public static ItemBOPWorkTableShelf BOP_WORKTABLE_SHELF_SACRED_OAK_ITEM;
	public static ItemBOPWorkTableShelf BOP_WORKTABLE_SHELF_CHERRY_ITEM;
	public static ItemBOPWorkTableShelf BOP_WORKTABLE_SHELF_UMBRAN_ITEM;

	public static void init() {
		initShelf(BOP_WORKTABLE_SHELF_SACRED_OAK_ITEM, ModBlocks.BOP_WORKTABLE_SHELF_SACRED_OAK);
		initShelf(BOP_WORKTABLE_SHELF_CHERRY_ITEM, ModBlocks.BOP_WORKTABLE_SHELF_CHERRY);
		
		//GameRegistry.findRegistry(Item.class).register(new ItemBlock(BOP_WORKTABLE_SHELF_CHERRY));

		System.out.println("here");
//		if (Config.ENABLE_CHAIRS) {
//			CHAIR_SACRED_OAK = new BlockChair("sacred_oak");
//		}
//		if (Config.ENABLE_TABLES) {
//			TABLE_SACRED_OAK = new BlockTable("sacred_oak");
//		}
	}

	public static void initShelf(Item item, Block block) {
		item = new ItemBOPWorkTableShelf(block);
		GameRegistry.findRegistry(Item.class).register(item);
		initModel(item);
	}

	public static void initModel(Item item) {
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName().toString(),"inventory"));
	}

}
