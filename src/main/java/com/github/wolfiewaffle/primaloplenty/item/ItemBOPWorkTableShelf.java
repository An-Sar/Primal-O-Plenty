package com.github.wolfiewaffle.primaloplenty.item;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemBlock;

public class ItemBOPWorkTableShelf extends ItemBlock {

	public ItemBOPWorkTableShelf(Block block) {
		super(block);
		this.setRegistryName(block.getRegistryName());
		this.setUnlocalizedName(block.getUnlocalizedName());
		this.setCreativeTab(CreativeTabs.MISC);
	}

}
