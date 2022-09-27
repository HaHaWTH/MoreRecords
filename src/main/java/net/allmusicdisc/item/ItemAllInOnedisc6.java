
package net.allmusicdisc.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.ItemRecord;
import net.minecraft.item.Item;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import net.allmusicdisc.ElementsAllmusicdiscMod;

@ElementsAllmusicdiscMod.ModElement.Tag
public class ItemAllInOnedisc6 extends ElementsAllmusicdiscMod.ModElement {
	@GameRegistry.ObjectHolder("allmusicdisc:all_in_onedisc_6")
	public static final Item block = null;
	public ItemAllInOnedisc6(ElementsAllmusicdiscMod instance) {
		super(instance, 24);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new MusicDiscItemCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("allmusicdisc:all_in_onedisc_6", "inventory"));
	}
	public static class MusicDiscItemCustom extends ItemRecord {
		public MusicDiscItemCustom() {
			super("all_in_onedisc_6", ElementsAllmusicdiscMod.sounds.get(new ResourceLocation("allmusicdisc:allinonemusic.psi_missing")));
			setUnlocalizedName("all_in_onedisc_6");
			setRegistryName("all_in_onedisc_6");
			setCreativeTab(CreativeTabs.MISC);
		}
	}
}
