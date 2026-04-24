
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.stellarradiance.init;

import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.GameRules;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class StellarRadianceModGameRules {
	public static final GameRules.Key<GameRules.BooleanValue> CLEAR_DEAD_ENTITIES = GameRules.register("clearDeadEntities", GameRules.Category.UPDATES, GameRules.BooleanValue.create(false));
	public static final GameRules.Key<GameRules.BooleanValue> NEXUS_EXPLOSION_WHEN_DIE = GameRules.register("nexusExplosionWhenDie", GameRules.Category.MOBS, GameRules.BooleanValue.create(true));
	public static final GameRules.Key<GameRules.IntegerValue> ENABLE_ENTITY_CLEARANCE = GameRules.register("enableEntityClearance", GameRules.Category.MISC, GameRules.IntegerValue.create(0));
	public static final GameRules.Key<GameRules.BooleanValue> MOD_ENTITY_SPEAKING = GameRules.register("modEntitySpeaking", GameRules.Category.CHAT, GameRules.BooleanValue.create(false));
	public static final GameRules.Key<GameRules.BooleanValue> SPEAR_REMOVE_ENTITY = GameRules.register("spearRemoveEntity", GameRules.Category.MISC, GameRules.BooleanValue.create(false));
	public static final GameRules.Key<GameRules.BooleanValue> SEND_PLAYER_FLY_MESSAGE_BACK = GameRules.register("sendPlayerFlyMessageBack", GameRules.Category.CHAT, GameRules.BooleanValue.create(true));
	public static final GameRules.Key<GameRules.BooleanValue> WOOD_PARASITE_EVENTS = GameRules.register("woodParasiteEvents", GameRules.Category.MOBS, GameRules.BooleanValue.create(true));
	public static final GameRules.Key<GameRules.IntegerValue> ENTITY_NAME_MAX_LENGTH = GameRules.register("entityNameMaxLength", GameRules.Category.MISC, GameRules.IntegerValue.create(65535));
	public static final GameRules.Key<GameRules.BooleanValue> SET_A_BLOCK_NO_AI = GameRules.register("setABlockNoAI", GameRules.Category.MOBS, GameRules.BooleanValue.create(true));
}
