package com.ToMe.ToMeSetup_MoreStartItems;

import java.io.File;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import javax.tools.JavaFileObject;
import javax.tools.StandardJavaFileManager;
import javax.tools.StandardLocation;
import javax.tools.ToolProvider;

import com.ToMe.ToMeSetup.api.StartItems.impl.StartItemContainer;
import com.ToMe.ToMeSetup.api.StartItems.impl.StartItemProvider;
//import com.google.common.reflect.ClassPath;
//import com.google.common.reflect.ClassPath.ClassInfo;

import net.minecraftforge.fml.common.Loader;

public enum Compat {
	
	ActuallyAdditions() {
		@Override
		public String getModid() {
			// TODO Auto-generated method stub
			return "actuallyadditions";
		}
		
		@Override
		public String getItemName() {
			// TODO Auto-generated method stub
			return "actuallyadditions:item_booklet";
		}
	},
	Botania() {
		@Override
		public String getModid() {
			// TODO Auto-generated method stub
			return "botania";
		}
		
		@Override
		public String getItemName() {
			// TODO Auto-generated method stub
			return "botania:lexicon";
		}
	},
	ConstructsArmory() {
		@Override
		public String getModid() {
			// TODO Auto-generated method stub
			return "conarm";
		}
		
		@Override
		public String getItemName() {
			// TODO Auto-generated method stub
			return "conarm:book";
		}
		
		@Override
		public void postInit() {
			// TODO Auto-generated method stub
			//Forcing Conarm Config for giving players a Book to false!
			try {
				Field f = Class.forName("c4.conarm.common.ConfigHandler").getDeclaredField("spawnWithBook");
				f.setAccessible(true);
				f.set(null, false);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
				MoreStartItems.log.catching(e);
			}
		}
	},
	DraconicEvolution() {
		@Override
		public String getModid() {
			// TODO Auto-generated method stub
			return "draconicevolution";
		}
		
		@Override
		public String getItemName() {
			// TODO Auto-generated method stub
			return "draconicevolution:info_tablet";
		}
	},
	ExtraUtilities2() {
		@Override
		public String getModid() {
			// TODO Auto-generated method stub
			return "extrautils2";
		}
		
		@Override
		public String getItemName() {
			// TODO Auto-generated method stub
			return "extrautils2:book";
		}
	},
	Forestry() {
		@Override
		public String getModid() {
			// TODO Auto-generated method stub
			return "forestry";
		}
		
		@Override
		public String getItemName() {
			// TODO Auto-generated method stub
			return "forestry:book_forester";
		}
		
		@Override
		public void postInit() {
			// TODO Auto-generated method stub
			try {
				Field f = Class.forName("forestry.core.config.Config").getDeclaredField("spawnWithBook");
				f.setAccessible(true);
				f.set(null, false);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				MoreStartItems.log.catching(e);
			}
		}
	},
	GalacticCraft() {
		@Override
		public String getModid() {
			// TODO Auto-generated method stub
			return "galacticraftcore";
		}
		
		@Override
		public String getItemName() {
			// TODO Auto-generated method stub
			return "galacticraftcore:prelaunch_checklist";
		}
	},
	HammerCore() {
		@Override
		public String getModid() {
			// TODO Auto-generated method stub
			return "hammercore";
		}
		
		@Override
		public String getItemName() {
			// TODO Auto-generated method stub
			return "hammercore:manual";
		}
	},
	ImmersiveEngeneering() {
		@Override
		public String getModid() {
			// TODO Auto-generated method stub
			return "immersiveengineering";
		}
		
		@Override
		public String getItemName() {
			// TODO Auto-generated method stub
			return "immersiveengineering:tool";
		}
		
		@Override
		public int getItemMeta() {
			// TODO Auto-generated method stub
			return 3;
		}
	},
	IndustrialForegoing() {
		@Override
		public String getModid() {
			// TODO Auto-generated method stub
			return "industrialforegoing";
		}
		
		@Override
		public String getItemName() {
			// TODO Auto-generated method stub
			return "industrialforegoing:book_manual";
		}
	},
	OpenBlocks() {
		@Override
		public String getModid() {
			// TODO Auto-generated method stub
			return "openblocks";
		}
		
		@Override
		public String getItemName() {
			// TODO Auto-generated method stub
			return "openblocks:info_book";
		}
	},
	RFTools() {
		@Override
		public String getModid() {
			// TODO Auto-generated method stub
			return "rftools";
		}
		
		@Override
		public String getItemName() {
			// TODO Auto-generated method stub
			return "rftools:rftools_manual";
		}
	},
	RFToolsControl() {
		@Override
		public String getModid() {
			// TODO Auto-generated method stub
			return "rftoolscontrol";
		}
		
		@Override
		public String getItemName() {
			// TODO Auto-generated method stub
			return "rftoolscontrol:rftoolscontrol_manual";
		}
		
		@Override
		public void postInit() {
			// TODO Auto-generated method stub
			try {
				Field f = Class.forName("openblocks.Config").getDeclaredField("spamInfoBook");
				f.setAccessible(true);
				f.set(null, false);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
				MoreStartItems.log.catching(e);
			}
		}
	},
	RFToolsDimensions() {
		@Override
		public String getModid() {
			// TODO Auto-generated method stub
			return "rftoolsdim";
		}
		
		@Override
		public String getItemName() {
			// TODO Auto-generated method stub
			return "rftoolsdim:rftoolsdim_manual";
		}
	},
	RFTools_shape() {
		@Override
		public String getModid() {
			// TODO Auto-generated method stub
			return "rftools";
		}
		
		@Override
		public String getItemName() {
			// TODO Auto-generated method stub
			return "rftools:rftools_shape_manual";
		}
	},
	TinkersConstruct() {
		@Override
		public String getModid() {
			// TODO Auto-generated method stub
			return "tconstruct";
		}
		
		@Override
		public String getItemName() {
			// TODO Auto-generated method stub
			return "tconstruct:book";
		}
		
		@Override
		public void postInit() {
			// TODO Auto-generated method stub
			//Forcing TConstructs Config for giving players a Book to false!
			try {
				Field f = Class.forName("slimeknights.tconstruct.common.config.Config").getDeclaredField("spawnWithBook");
				f.setAccessible(true);
				f.set(null, false);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
				MoreStartItems.log.catching(e);
			}
		}
	},
	TheOneProbe() {
		@Override
		public String getModid() {
			// TODO Auto-generated method stub
			return "theoneprobe";
		}
		
		@Override
		public String getItemName() {
			// TODO Auto-generated method stub
			return "theoneprobe:probenote";
		}
		
		@Override
		public void postInit() {
			// TODO Auto-generated method stub
			//Forcing TheOneProbes Config for giving players a Book to false!
			try {
				Field f = Class.forName("mcjty.theoneprobe.config.Config").getDeclaredField("spawnNote");
				f.setAccessible(true);
				f.set(null, false);
			} catch (Exception e) {
				// TODO: handle exception
				MoreStartItems.log.catching(e);
			}
		}
	},
	ValkyrieLib() {
		@Override
		public String getModid() {
			// TODO Auto-generated method stub
			return "valkyrielib";
		}
		
		@Override
		public String getItemName() {
			// TODO Auto-generated method stub
			return "valkyrielib:guide";
		}
		
		@Override
		public void postInit() {
			// TODO Auto-generated method stub
			try {
				//for(Field f:Class.forName("com.valkyrieofnight.vlib.m_guide.features.GItems").getDeclaredFields()) {
					//System.out.println(f.getName());
				//}
				Field f = Class.forName("com.valkyrieofnight.vlib.m_guide.features.GItems").getDeclaredField("SPAWN_GUIDE_LOGIN");
				f.setAccessible(true);
				f.set(null, false);
			} catch (Exception e) {
				// TODO: handle exception
				//e.printStackTrace();
				//MoreStartItems.log.catching(e);//Ignoring Exceptions because this is only support for old versions.
			}
			try {
				//for(ClassInfo info:ClassPath.from(ClassLoader.getSystemClassLoader()).getTopLevelClassesRecursive("com.valkyrieofnight.vlib")) {
				//for(ClassInfo info:ClassPath.from(Class.forName("com.valkyrieofnight.vlib.VLib").getClassLoader()).getTopLevelClassesRecursive("com.valkyrieofnight.vlib")) {
				//for(ClassInfo info:ClassPath.from(Class.forName("com.valkyrieofnight.vlib.VLib").getClassLoader()).getAllClasses()) {
					//if(!info.getPackageName().contains("com.valkyrieofnight.vlib")) {
						//System.out.println(info.getPackageName());
						//continue;
					//}
					//try {
						//for(Field f:info.load().getDeclaredFields()) {
							//if(f.getType().equals(boolean.class)) {
								//System.out.println("Found Field " + f.getName());
								//System.out.println("Found Field " + f.getName() + " in Class " + info.getName() + ".");
							//}
						//}
					//} catch (Exception e) {
					//} catch (Throwable e) {
						// TODO: handle exception
						//MoreStartItems.log.catching(e);
					//}
					//for(Field f:info.getClass().getDeclaredFields()) {
					//for(Field f:info.load().getDeclaredFields()) {
						//if(f.getType() == boolean.class) {
						//if(f.getType().equals(boolean.class)) {
							//System.out.println("Found Field " + f.getName());
						//}
						//System.out.println(f.getType());
						//System.out.println("Found Field " + f.getName());
					//}
					//System.out.println("Found Class " + info.getName());
				//}
				Field f = Class.forName("com.valkyrieofnight.vliblegacy.m_guide.features.GItems").getDeclaredField("SPAWN_GUIDE_LOGIN");
				f.setAccessible(true);
				f.set(null, false);
			} catch (Exception e) {
				// TODO: handle exception
				//e.printStackTrace();
				MoreStartItems.log.catching(e);
			}
		}
	};
	
	public static void init() {
		for(Compat c:Compat.values()) {
			if(!c.getModid().equals("")) {
				if(Loader.isModLoaded(c.getModid()) && Config.isSupported(c.getModid())) {
					StartItemProvider.instance.addStartItem(new StartItemContainer(c.getItemName(), c.getItemCount(), c.getItemMeta(), c.getItemNumber(), c.isOreDict()));
					c.postInit();
					if(Config.debug) {
						MoreStartItems.log.info("Initialized support for Mod " + c.getModid() + ".");
					}
				}
				else if(Config.isSupported(c.getModid())) {
					if(Config.debug) {
						MoreStartItems.log.info("Skipped support for Mod " + c.getModid() + " as it wasn't loaded.");
					}
				}
			}
		}
	}
	
	public String getModid() {
		return "";
	}
	
	public String getItemName() {
		return "";
	}
	
	public int getItemCount() {
		return 1;
	}
	
	public int getItemMeta() {
		return 0;
	}
	
	/**
	 * Only for OreDict
	 * @return how many Items with this oreDictionary Name being registered before this
	 */
	public int getItemNumber() {
		return 0;
	}
	
	public boolean isOreDict() {
		return false;
	}
	
	public void postInit() {
		
	}
	
}