package net.mcreator.poop.configuration;

import net.minecraftforge.common.ForgeConfigSpec;

public class GoofyAhhModServerConfigConfiguration {
	public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
	public static final ForgeConfigSpec SPEC;

	public static final ForgeConfigSpec.ConfigValue<Boolean> ENTITY_DELETERS_PLAYERS;
	public static final ForgeConfigSpec.ConfigValue<Boolean> REI_BREAKS_BLOCKS;
	public static final ForgeConfigSpec.ConfigValue<Boolean> BARRIER_ARMOUR_SET_BONUS;
	public static final ForgeConfigSpec.ConfigValue<Boolean> OLD_NUKE_BEHAVIOUR;
	public static final ForgeConfigSpec.ConfigValue<Boolean> ANTICARBON_AUTO_EXPLOSION;
	public static final ForgeConfigSpec.ConfigValue<Boolean> LRAD_EARMUFFS_NEEDED;
	public static final ForgeConfigSpec.ConfigValue<Boolean> LITHIUM_WATER_REACTION;
	public static final ForgeConfigSpec.ConfigValue<Double> GALLIUM_TEMP_THRESHOLD;
	static {
		BUILDER.push("Server/Сервер/伺服器");
		ENTITY_DELETERS_PLAYERS = BUILDER.comment("Whether items such as Rickroll or Obama Sphere can kill players. 諸如瑞克搖和奧巴馬球的實體刪除器是否可以殺死玩家。").define("Entity deleters kill players", false);
		REI_BREAKS_BLOCKS = BUILDER.comment("Whether the explosion from swinging an unstable Adachi Rei breaks blocks. 擺動不穩定的足立零的爆炸是否可以破壞方塊。").define("Adachi Rei exploding breaks blocks", false);
		BARRIER_ARMOUR_SET_BONUS = BUILDER.comment("Whether entities wearing full barrier armour are invincible. 穿完整屏障盔甲的實體是否不可傷害。").define("Barrier Armour Set Bonus", true);
		OLD_NUKE_BEHAVIOUR = BUILDER.comment("Nuke explodes in the old way. 核彈用舊的爆炸方法。").define("Old Nuke Behaviour", false);
		ANTICARBON_AUTO_EXPLOSION = BUILDER.comment("Whether anticarbon explodes on inventory tick. 反碳物品爛刻時是否自動爆炸。").define("Anticarbon automatically explodes", true);
		LRAD_EARMUFFS_NEEDED = BUILDER.comment("Whether earmuffs are needed to protect players from LRADs.").define("LRAD damages players without earmuffs", true);
		LITHIUM_WATER_REACTION = BUILDER.comment("Whether lithium will \"turn into\" hydrogen when haver is in water.").define("Lithium reacts with water", true);
		GALLIUM_TEMP_THRESHOLD = BUILDER.comment("Biome temperature where gallium changes between solid and liquid (value should be 100x that you find on minecraft.wiki).").define("Gallium biome temperature threshold", (double) 100);
		BUILDER.pop();

		SPEC = BUILDER.build();
	}

}
