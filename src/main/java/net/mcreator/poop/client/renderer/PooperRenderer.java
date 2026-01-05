
package net.mcreator.poop.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.CreeperModel;

import net.mcreator.poop.entity.PooperEntity;

public class PooperRenderer extends MobRenderer<PooperEntity, CreeperModel<PooperEntity>> {
	public PooperRenderer(EntityRendererProvider.Context context) {
		super(context, new CreeperModel<PooperEntity>(context.bakeLayer(ModelLayers.CREEPER)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(PooperEntity entity) {
		return new ResourceLocation("poop:textures/entities/pooper.png");
	}
}
