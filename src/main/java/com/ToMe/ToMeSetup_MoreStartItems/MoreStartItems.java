package com.ToMe.ToMeSetup_MoreStartItems;

import org.apache.logging.log4j.Logger;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(name=MoreStartItems.NAME,modid=MoreStartItems.MODID,version=MoreStartItems.VERSION,acceptedMinecraftVersions=MoreStartItems.MCVERSION,dependencies=MoreStartItems.DEPENDENCIES)
public class MoreStartItems {
	
	public static final String NAME = "ToMeSetup-MoreStartItems";
	public static final String MODID = "morestartitems";
	public static final String VERSION = "1.0";
	public static final String MCVERSION = "[1.12,1.12.2]";
	public static final String DEPENDENCIES = "required-after:tomesetup;" +
												"after:actuallyadditions;" +
												"after:botania;" +
												"after:conarm;" +
												//"before:conarm;" +
												"after:draconicevolution;" +
												"after:extrautils2;" +
												"after:forestry;" +
												"after:galacticraftcore;" +
												"after:hammercore;" +
												"after:industrialforegoing;" +
												"after:rftools;" +
												"after:rftoolscontrol;" +
												"after:rftoolsdim;" +
												"after:tconstruct;" +
												"after:theoneprobe;" +
												"after:valkyrielib";
	
	public static Logger log;
	protected Config cfg;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent e) {
		log = e.getModLog();
		cfg = new Config(e.getSuggestedConfigurationFile());
	}
	
	@EventHandler
	public void Init(FMLInitializationEvent e) {
		Compat.init();
	}
	
}