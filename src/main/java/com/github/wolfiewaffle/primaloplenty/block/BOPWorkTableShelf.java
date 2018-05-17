package com.github.wolfiewaffle.primaloplenty.block;


import net.minecraft.block.material.Material;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import nmd.primal.core.common.blocks.storage.WorkTableShelf;
import nmd.primal.core.common.tiles.storage.TileWorkTableShelf;

public class BOPWorkTableShelf extends WorkTableShelf {

	public BOPWorkTableShelf(Material material) {
		super(material);
	}

//	@Override
//	public int damageDropped(IBlockState state) {
//		System.out.println(state.getValue(FACING).ordinal());
//		return state.getValue(BOP_VARIANT).ordinal();
//	}

	@Override
	public int getMetaFromState(IBlockState state) {
		return state.getValue(FACING).getHorizontalIndex();
	}

	@Override
	public IBlockState getStateFromMeta(int meta) {
		System.out.println(meta);
		return this.getDefaultState().withProperty(FACING, getHorizontalFacingFromIndex(meta));
	}

	@Override
	protected BlockStateContainer createBlockState() {
		return new BlockStateContainer(this, FACING);
	}

//	@Override
//	public ItemStack getItem(World worldIn, BlockPos pos, IBlockState state) {
//		return new ItemStack(Item.getItemFromBlock(this));
//	}

//	@Override
//	// TODO Auto-generated method  stub
//	public TileEntity createNewTileEntity(World worldIn, int meta) {
//		TileWorkTableShelf te = new TileWorkTableShelf();
//		System.out.println("int " + te);
//		return te;
//	}
//
//	@Override
//	public TileEntity createTileEntity(World world, IBlockState state) {
//		TileWorkTableShelf te = new TileWorkTableShelf();
//		return te;
//	}

	@Override
	public IBlockState getActualState(IBlockState state, IBlockAccess worldIn, BlockPos pos) {
		return state;
	}

}
