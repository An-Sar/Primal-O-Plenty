package com.github.wolfiewaffle.primaloplenty;

import org.apache.logging.log4j.Logger;

import com.github.wolfiewaffle.primaloplenty.crafting.Recipes;
import com.github.wolfiewaffle.primaloplenty.proxy.CommonProxy;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = PrimalOPlenty.MODID, name = PrimalOPlenty.NAME, version = PrimalOPlenty.VERSION, dependencies = "required-after:primal;required-after:biomesoplenty")
public class PrimalOPlenty {
	public static final String MODID = "primaloplenty";
	public static final String NAME = "Primal O' Plenty";
	public static final String VERSION = "1.0";

	@SuppressWarnings("unused")
	private static Logger logger;

	@SidedProxy(clientSide = "com.github.wolfiewaffle.primaloplenty.proxy.ClientProxy", serverSide = "com.github.wolfiewaffle.primaloplenty.proxy.CommonProxy")
	public static CommonProxy proxy;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		proxy.preInit(event);
		logger = event.getModLog();
		//Recipes.init();
	}

	@EventHandler
	public void init(FMLInitializationEvent event) {
		proxy.init(event);
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		proxy.postInit(event);
	}

}
