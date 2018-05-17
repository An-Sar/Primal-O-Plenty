package com.github.wolfiewaffle.primaloplenty.block;


import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IStringSerializable;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import nmd.primal.core.common.blocks.machines.DryingRack;

public class BOPCraftingBench extends DryingRack {

	private enum BOPPrimalWoods implements IStringSerializable {
		SACRED_OAK, CHERRY, UMBRAN, FIR, ETHEREAL, MAGIC, MANGROVE, PALM, REDWOOD, WILLOW, PINE, HELLBARK, JACARANDA, MAHOGANY, EBONY, EUCALYPTUS;

		@Override
		public String getName() {
			return this.name().toLowerCase();
		}
	}

	public static final PropertyEnum<BOPPrimalWoods> BOP_VARIANT = PropertyEnum.create("bopvar", BOPPrimalWoods.class);

	@Override
	public int damageDropped(IBlockState state) {
		System.out.println(state.getValue(BOP_VARIANT).ordinal());
		return state.getValue(BOP_VARIANT).ordinal();
	}

	@Override
	public int getMetaFromState(IBlockState state) {
		return state.getValue(BOP_VARIANT).ordinal();
	}

	@Override
	public IBlockState getStateFromMeta(int meta) {
		return this.getDefaultState().withProperty(BOP_VARIANT, BOPPrimalWoods.values()[meta]);
	}

	@Override
	protected BlockStateContainer createBlockState() {
		return new BlockStateContainer(this, TYPE, BOP_VARIANT);
	}

	@Override
	public TileEntity createNewTileEntity(World worldIn, int meta) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ItemStack getItem(World worldIn, BlockPos pos, IBlockState state) {
		// TODO Auto-generated method stub
		return super.getItem(worldIn, pos, state);
	}

	
}
