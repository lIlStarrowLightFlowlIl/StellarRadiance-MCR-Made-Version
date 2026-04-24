
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.stellarradiance.init;

import org.lwjgl.glfw.GLFW;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.client.event.RegisterKeyMappingsEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.Minecraft;
import net.minecraft.client.KeyMapping;

import net.mcreator.stellarradiance.network.ZMessage;
import net.mcreator.stellarradiance.network.XMessage;
import net.mcreator.stellarradiance.network.VMessage;
import net.mcreator.stellarradiance.network.UMessage;
import net.mcreator.stellarradiance.network.RightMessage;
import net.mcreator.stellarradiance.network.RMessage;
import net.mcreator.stellarradiance.network.LeftMessage;
import net.mcreator.stellarradiance.network.GMessage;
import net.mcreator.stellarradiance.network.BMessage;
import net.mcreator.stellarradiance.StellarRadianceMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class StellarRadianceModKeyMappings {
	public static final KeyMapping R = new KeyMapping("key.stellar_radiance.r", GLFW.GLFW_KEY_R, "key.categories.misc") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				StellarRadianceMod.PACKET_HANDLER.sendToServer(new RMessage(0, 0));
				RMessage.pressAction(Minecraft.getInstance().player, 0, 0);
				R_LASTPRESS = System.currentTimeMillis();
			} else if (isDownOld != isDown && !isDown) {
				int dt = (int) (System.currentTimeMillis() - R_LASTPRESS);
				StellarRadianceMod.PACKET_HANDLER.sendToServer(new RMessage(1, dt));
				RMessage.pressAction(Minecraft.getInstance().player, 1, dt);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping V = new KeyMapping("key.stellar_radiance.v", GLFW.GLFW_KEY_V, "key.categories.misc") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				StellarRadianceMod.PACKET_HANDLER.sendToServer(new VMessage(0, 0));
				VMessage.pressAction(Minecraft.getInstance().player, 0, 0);
				V_LASTPRESS = System.currentTimeMillis();
			} else if (isDownOld != isDown && !isDown) {
				int dt = (int) (System.currentTimeMillis() - V_LASTPRESS);
				StellarRadianceMod.PACKET_HANDLER.sendToServer(new VMessage(1, dt));
				VMessage.pressAction(Minecraft.getInstance().player, 1, dt);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping X = new KeyMapping("key.stellar_radiance.x", GLFW.GLFW_KEY_X, "key.categories.misc") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				StellarRadianceMod.PACKET_HANDLER.sendToServer(new XMessage(0, 0));
				XMessage.pressAction(Minecraft.getInstance().player, 0, 0);
				X_LASTPRESS = System.currentTimeMillis();
			} else if (isDownOld != isDown && !isDown) {
				int dt = (int) (System.currentTimeMillis() - X_LASTPRESS);
				StellarRadianceMod.PACKET_HANDLER.sendToServer(new XMessage(1, dt));
				XMessage.pressAction(Minecraft.getInstance().player, 1, dt);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping Z = new KeyMapping("key.stellar_radiance.z", GLFW.GLFW_KEY_Z, "key.categories.misc") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				StellarRadianceMod.PACKET_HANDLER.sendToServer(new ZMessage(0, 0));
				ZMessage.pressAction(Minecraft.getInstance().player, 0, 0);
				Z_LASTPRESS = System.currentTimeMillis();
			} else if (isDownOld != isDown && !isDown) {
				int dt = (int) (System.currentTimeMillis() - Z_LASTPRESS);
				StellarRadianceMod.PACKET_HANDLER.sendToServer(new ZMessage(1, dt));
				ZMessage.pressAction(Minecraft.getInstance().player, 1, dt);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping B = new KeyMapping("key.stellar_radiance.b", GLFW.GLFW_KEY_B, "key.categories.misc") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				StellarRadianceMod.PACKET_HANDLER.sendToServer(new BMessage(0, 0));
				BMessage.pressAction(Minecraft.getInstance().player, 0, 0);
				B_LASTPRESS = System.currentTimeMillis();
			} else if (isDownOld != isDown && !isDown) {
				int dt = (int) (System.currentTimeMillis() - B_LASTPRESS);
				StellarRadianceMod.PACKET_HANDLER.sendToServer(new BMessage(1, dt));
				BMessage.pressAction(Minecraft.getInstance().player, 1, dt);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping U = new KeyMapping("key.stellar_radiance.u", GLFW.GLFW_KEY_U, "key.categories.misc") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				StellarRadianceMod.PACKET_HANDLER.sendToServer(new UMessage(0, 0));
				UMessage.pressAction(Minecraft.getInstance().player, 0, 0);
				U_LASTPRESS = System.currentTimeMillis();
			} else if (isDownOld != isDown && !isDown) {
				int dt = (int) (System.currentTimeMillis() - U_LASTPRESS);
				StellarRadianceMod.PACKET_HANDLER.sendToServer(new UMessage(1, dt));
				UMessage.pressAction(Minecraft.getInstance().player, 1, dt);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping G = new KeyMapping("key.stellar_radiance.g", GLFW.GLFW_KEY_G, "key.categories.misc") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				StellarRadianceMod.PACKET_HANDLER.sendToServer(new GMessage(0, 0));
				GMessage.pressAction(Minecraft.getInstance().player, 0, 0);
				G_LASTPRESS = System.currentTimeMillis();
			} else if (isDownOld != isDown && !isDown) {
				int dt = (int) (System.currentTimeMillis() - G_LASTPRESS);
				StellarRadianceMod.PACKET_HANDLER.sendToServer(new GMessage(1, dt));
				GMessage.pressAction(Minecraft.getInstance().player, 1, dt);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping RIGHT = new KeyMapping("key.stellar_radiance.right", GLFW.GLFW_KEY_UNKNOWN, "key.categories.misc") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				StellarRadianceMod.PACKET_HANDLER.sendToServer(new RightMessage(0, 0));
				RightMessage.pressAction(Minecraft.getInstance().player, 0, 0);
				RIGHT_LASTPRESS = System.currentTimeMillis();
			} else if (isDownOld != isDown && !isDown) {
				int dt = (int) (System.currentTimeMillis() - RIGHT_LASTPRESS);
				StellarRadianceMod.PACKET_HANDLER.sendToServer(new RightMessage(1, dt));
				RightMessage.pressAction(Minecraft.getInstance().player, 1, dt);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping LEFT = new KeyMapping("key.stellar_radiance.left", GLFW.GLFW_KEY_UNKNOWN, "key.categories.misc") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				StellarRadianceMod.PACKET_HANDLER.sendToServer(new LeftMessage(0, 0));
				LeftMessage.pressAction(Minecraft.getInstance().player, 0, 0);
				LEFT_LASTPRESS = System.currentTimeMillis();
			} else if (isDownOld != isDown && !isDown) {
				int dt = (int) (System.currentTimeMillis() - LEFT_LASTPRESS);
				StellarRadianceMod.PACKET_HANDLER.sendToServer(new LeftMessage(1, dt));
				LeftMessage.pressAction(Minecraft.getInstance().player, 1, dt);
			}
			isDownOld = isDown;
		}
	};
	private static long R_LASTPRESS = 0;
	private static long V_LASTPRESS = 0;
	private static long X_LASTPRESS = 0;
	private static long Z_LASTPRESS = 0;
	private static long B_LASTPRESS = 0;
	private static long U_LASTPRESS = 0;
	private static long G_LASTPRESS = 0;
	private static long RIGHT_LASTPRESS = 0;
	private static long LEFT_LASTPRESS = 0;

	@SubscribeEvent
	public static void registerKeyMappings(RegisterKeyMappingsEvent event) {
		event.register(R);
		event.register(V);
		event.register(X);
		event.register(Z);
		event.register(B);
		event.register(U);
		event.register(G);
		event.register(RIGHT);
		event.register(LEFT);
	}

	@Mod.EventBusSubscriber({Dist.CLIENT})
	public static class KeyEventListener {
		@SubscribeEvent
		public static void onClientTick(TickEvent.ClientTickEvent event) {
			if (Minecraft.getInstance().screen == null) {
				R.consumeClick();
				V.consumeClick();
				X.consumeClick();
				Z.consumeClick();
				B.consumeClick();
				U.consumeClick();
				G.consumeClick();
				RIGHT.consumeClick();
				LEFT.consumeClick();
			}
		}
	}
}
