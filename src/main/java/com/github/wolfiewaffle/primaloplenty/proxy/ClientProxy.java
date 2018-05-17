package com.github.wolfiewaffle.primaloplenty.proxy;

import com.github.wolfiewaffle.primaloplenty.block.ModBlocks;
import com.github.wolfiewaffle.primaloplenty.client.render.tiles.RenderBOPWorkTableShelf;

import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import nmd.primal.core.client.render.tiles.RenderWorkTableShelf;
import nmd.primal.core.common.tiles.storage.TileWorkTableShelf;

public class ClientProxy extends CommonProxy {

	@Override
	public void preInit(FMLPreInitializationEvent event) {
		super.preInit(event);
		ModBlocks.initModels();
		ClientRegistry.bindTileEntitySpecialRenderer(TileWorkTableShelf.class, new RenderBOPWorkTableShelf());
	}

}
