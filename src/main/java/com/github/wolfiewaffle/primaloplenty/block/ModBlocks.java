package com.github.wolfiewaffle.primaloplenty.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModBlocks {

//	public static BlockChair CHAIR_SACRED_OAK;
	public static BOPWorkTableShelf BOP_WORKTABLE_SHELF_SACRED_OAK;
	public static BOPWorkTableShelf BOP_WORKTABLE_SHELF_CHERRY;

	//public static ItemBlock BOP_WORKTABLE_SHELF_SACRED_OAK_ITEM = new ItemBlock(BOP_WORKTABLE_SHELF_SACRED_OAK);

	public static void init() {
		BOP_WORKTABLE_SHELF_SACRED_OAK = new BOPWorkTableShelf(Material.WOOD);
		BOP_WORKTABLE_SHELF_CHERRY = new BOPWorkTableShelf(Material.WOOD);
		
		initBlock(BOP_WORKTABLE_SHELF_SACRED_OAK, "bop_worktable_shelf_sacred_oak");
		initBlock(BOP_WORKTABLE_SHELF_CHERRY, "bop_worktable_shelf_cherry");
		//GameRegistry.findRegistry(Item.class).register(new ItemBlock(BOP_WORKTABLE_SHELF_CHERRY));

		System.out.println("here");
//		if (Config.ENABLE_CHAIRS) {
//			CHAIR_SACRED_OAK = new BlockChair("sacred_oak");
//		}
//		if (Config.ENABLE_TABLES) {
//			TABLE_SACRED_OAK = new BlockTable("sacred_oak");
//		}
	}

	public static void initBlock(Block block, String name) {
		block.setRegistryName(name);
		block.setUnlocalizedName(name);
		GameRegistry.findRegistry(Block.class).register(block);
	}

	@SideOnly(Side.CLIENT)
	public static void initModels() {
//		if (Config.ENABLE_CHAIRS) {
//			CHAIR_SACRED_OAK.initModel();
//		}
//		if (Config.ENABLE_TABLES) {
//			TABLE_SACRED_OAK.initModel();
//		}
	}

}
