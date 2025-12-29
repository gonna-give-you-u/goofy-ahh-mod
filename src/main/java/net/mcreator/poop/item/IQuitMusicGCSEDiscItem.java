
package net.mcreator.poop.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;

public class IQuitMusicGCSEDiscItem extends RecordItem {
	public IQuitMusicGCSEDiscItem() {
		super(15, () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("poop:i_quit_music_in_school")), new Item.Properties().stacksTo(64).rarity(Rarity.COMMON), 1360);
	}
}
