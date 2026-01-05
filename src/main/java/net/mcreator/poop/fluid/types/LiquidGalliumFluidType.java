
package net.mcreator.poop.fluid.types;

import org.joml.Vector3f;

import net.minecraftforge.fluids.FluidType;
import net.minecraftforge.common.SoundActions;
import net.minecraftforge.client.extensions.common.IClientFluidTypeExtensions;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.BlockAndTintGetter;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;
import net.minecraft.client.renderer.FogRenderer;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.Minecraft;
import net.minecraft.client.Camera;

import java.util.function.Consumer;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.shaders.FogShape;

public class LiquidGalliumFluidType extends FluidType {
	public LiquidGalliumFluidType() {
		super(FluidType.Properties.create().fallDistanceModifier(0F).canExtinguish(true).supportsBoating(true).canHydrate(true).motionScale(0.00875D).density(4700).viscosity(1100).temperature(315)
				.sound(SoundActions.BUCKET_FILL, SoundEvents.BUCKET_FILL).sound(SoundActions.BUCKET_EMPTY, SoundEvents.BUCKET_EMPTY).sound(SoundActions.FLUID_VAPORIZE, SoundEvents.FIRE_EXTINGUISH));
	}

	@Override
	public void initializeClient(Consumer<IClientFluidTypeExtensions> consumer) {
		consumer.accept(new IClientFluidTypeExtensions() {
			private static final ResourceLocation STILL_TEXTURE = new ResourceLocation("poop:block/gallium_i_think");
			private static final ResourceLocation FLOWING_TEXTURE = new ResourceLocation("poop:block/gallium_i_think");
			private static final ResourceLocation RENDER_OVERLAY_TEXTURE = new ResourceLocation("poop:textures/gallium_i_think.png");

			@Override
			public ResourceLocation getStillTexture() {
				return STILL_TEXTURE;
			}

			@Override
			public ResourceLocation getFlowingTexture() {
				return FLOWING_TEXTURE;
			}

			@Override
			public ResourceLocation getRenderOverlayTexture(Minecraft mc) {
				return RENDER_OVERLAY_TEXTURE;
			}

			@Override
			public Vector3f modifyFogColor(Camera camera, float partialTick, ClientLevel level, int renderDistance, float darkenWorldAmount, Vector3f fluidFogColor) {
				return new Vector3f(0.7058823529f, 0.7294117647f, 0.7882352941f);
			}

			public void modifyFogRender(Camera camera, FogRenderer.FogMode mode, float renderDistance, float partialTick, float nearDistance, float farDistance, FogShape shape) {
				Entity entity = camera.getEntity();
				Level world = entity.level();
				RenderSystem.setShaderFogShape(FogShape.SPHERE);
				RenderSystem.setShaderFogStart(0.01f);
				RenderSystem.setShaderFogEnd(0.02f);
			}

			@Override
			public int getTintColor() {
				return -4138753;
			}

			@Override
			public int getTintColor(FluidState state, BlockAndTintGetter world, BlockPos pos) {
				return Minecraft.getInstance().level.getBiome(pos).value().getFogColor() | 0xFF000000;
			}
		});
	}
}
