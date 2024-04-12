package cursedbread.hamnglass;

import net.minecraft.core.block.BlockGlass;
import net.minecraft.core.block.entity.TileEntity;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.enums.EnumDropCause;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.util.helper.Side;
import net.minecraft.core.world.World;
import turniplabs.halplibe.helper.TextureHelper;

import static cursedbread.hamnglass.HamNglass.MOD_ID;

public class VanilaBlockColoredGlass
	extends BlockGlass {
	public VanilaBlockColoredGlass(String key, int id, Material material, boolean renderInside) {
		super(key, id, Material.glass, false);
	}

	@Override
	public int getRenderBlockPass() {
		return 1;
	}
	public int getBlockTextureFromSideAndMetadata(Side side, int meta) {
		if (meta == 0) {
			return TextureHelper.getOrCreateBlockTextureIndex(MOD_ID, "glass/black_glass.png");
		}
		if (meta == 1) {
			return TextureHelper.getOrCreateBlockTextureIndex(MOD_ID, "glass/red_glass.png");
		}
		if (meta == 2) {
			return TextureHelper.getOrCreateBlockTextureIndex(MOD_ID, "glass/green_glass..png");
		}
		if (meta == 3) {
			return TextureHelper.getOrCreateBlockTextureIndex(MOD_ID, "glass/brown_glass.png");
		}
		if (meta == 4) {
			return TextureHelper.getOrCreateBlockTextureIndex(MOD_ID, "glass/blue_glass.png");
		}
		if (meta == 5) {
			return TextureHelper.getOrCreateBlockTextureIndex(MOD_ID, "glass/purple_glass.png");
		}
		if (meta == 6) {
			return TextureHelper.getOrCreateBlockTextureIndex(MOD_ID, "glass/cyan_glass.png");
		}
		if (meta == 7) {
			return TextureHelper.getOrCreateBlockTextureIndex(MOD_ID, "glass/light_gray_glass.png");
		}
		if (meta == 8) {
			return TextureHelper.getOrCreateBlockTextureIndex(MOD_ID, "glass/gray_glass.png");
		}
		if (meta == 9) {
			return TextureHelper.getOrCreateBlockTextureIndex(MOD_ID, "glass/pink_glass.png");
		}
		if (meta == 10) {
			return TextureHelper.getOrCreateBlockTextureIndex(MOD_ID, "glass/lime_glass.png");
		}
		if (meta == 11) {
			return TextureHelper.getOrCreateBlockTextureIndex(MOD_ID, "glass/yellow_glass.png");
		}
		if (meta == 12) {
			return TextureHelper.getOrCreateBlockTextureIndex(MOD_ID, "glass/light_blue_glass.png");
		}
		if (meta == 13) {
			return TextureHelper.getOrCreateBlockTextureIndex(MOD_ID, "glass/magenta_glass.png");
		}
		if (meta == 14) {
			return TextureHelper.getOrCreateBlockTextureIndex(MOD_ID, "glass/orange_glass.png");
		}
		if (meta == 15) {
			return TextureHelper.getOrCreateBlockTextureIndex(MOD_ID, "glass/white_glass.png");
		}
		return meta;
	}
	@Override
	public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, TileEntity tileEntity) {
		switch (dropCause) {
			case SILK_TOUCH:
			case PICK_BLOCK: {
				return new ItemStack[]{new ItemStack(this, 1, meta)};
			}
		}
		return null;
	}
}
