package com.ToMe.ToMeSetup_MoreStartItems;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import net.minecraftforge.common.config.Configuration;

public class Config extends Configuration {
	
	private static final String CATEGORY_SUPPORT = "supported_mods";
	private static Map<String, Boolean> supportMap = new HashMap<String, Boolean>();
	public static boolean debug;
	
	public Config(File cfg) {
		super(cfg);
		try {
			initConfig();
		} finally {
			if(hasChanged()) {
				save();
			}
		}
	}
	
	public void initConfig() {
		this.setCategoryComment(CATEGORY_GENERAL, "The General Configuration.");
		debug = this.getBoolean("debug", CATEGORY_GENERAL, debug, "Enables / Disables some debug output.");
		this.setCategoryComment(CATEGORY_SUPPORT, "The Support Category of this Config File.");
		for(Compat c:Compat.values()) {
			supportMap.put(c.getModid(), this.getBoolean(c.getModid(), CATEGORY_SUPPORT, true, "should " + c.getModid() + " be supported, or not?"));
		}
	}
	
	public static boolean isSupported(String modid) {
		if(supportMap.containsKey(modid)) {
			return supportMap.get(modid);
		}
		else {
			return false;
		}
	}
	
}