package cursedbread.hamnglass;

import net.minecraft.core.block.BlockTrapDoor;
import net.minecraft.core.block.entity.TileEntity;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.enums.EnumDropCause;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.util.helper.Side;
import net.minecraft.core.world.World;
import turniplabs.halplibe.helper.TextureHelper;

import static cursedbread.hamnglass.HamNglass.MOD_ID;

public class NonameColoredTrapdoors extends BlockTrapDoor {
	public NonameColoredTrapdoors(String key, int id) {
		super(key, id, Material.glass, false);
	}
	@Override
	public void setBlockBoundsForItemRender() {
		float offset = 0.1875F;
		this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, offset, 1.0F);
	}
	@Override
	public void setBlockBoundsForBlockRender(int i) {
		float f = 0.1875F;
		if (isTrapdoorOpen(i)) {
			if ((i & 3) == 0) {
				this.setBlockBounds(0.0F, 0.0F, 1.0F - f, 1.0F, 1.0F, 1.0F);
			}

			if ((i & 3) == 1) {
				this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, f);
			}

			if ((i & 3) == 2) {
				this.setBlockBounds(1.0F - f, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
			}

			if ((i & 3) == 3) {
				this.setBlockBounds(0.0F, 0.0F, 0.0F, f, 1.0F, 1.0F);
			}
		} else if (isUpperHalf(i)) {
			this.setBlockBounds(0.0F, 1.0F - f, 0.0F, 1.0F, 1.0F, 1.0F);
		} else {
			this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, f, 1.0F);
		}
	}

	@Override
	public int getRenderBlockPass() {
		return 1;
	}

	public int getBlockTextureFromSideAndMetadata(Side side, int meta) {
		if (meta == 0) {
			return TextureHelper.getOrCreateBlockTextureIndex(MOD_ID, "glass/crimson_glass.png");
		}
		if (meta == 1) {
			return TextureHelper.getOrCreateBlockTextureIndex(MOD_ID, "glass/maroon_glass.png");
		}
		if (meta == 2) {
			return TextureHelper.getOrCreateBlockTextureIndex(MOD_ID, "glass/ash_gray_glass..png");
		}
		if (meta == 3) {
			return TextureHelper.getOrCreateBlockTextureIndex(MOD_ID, "glass/olive_glass.png");
		}
		if (meta == 4) {
			return TextureHelper.getOrCreateBlockTextureIndex(MOD_ID, "glass/ochre_glass.png");
		}
		if (meta == 5) {
			return TextureHelper.getOrCreateBlockTextureIndex(MOD_ID, "glass/buff_glass.png");
		}
		if (meta == 6) {
			return TextureHelper.getOrCreateBlockTextureIndex(MOD_ID, "glass/verdigris_glass.png");
		}
		if (meta == 7) {
			return TextureHelper.getOrCreateBlockTextureIndex(MOD_ID, "glass/light_yellow_glass.png");
		}
		if (meta == 8) {
			return TextureHelper.getOrCreateBlockTextureIndex(MOD_ID, "glass/indigo_glass.png");
		}
		if (meta == 9) {
			return TextureHelper.getOrCreateBlockTextureIndex(MOD_ID, "glass/xanthic_glass.png");
		}
		if (meta == 10) {
			return TextureHelper.getOrCreateBlockTextureIndex(MOD_ID, "glass/cinnamon_glass.png");
		}
		if (meta == 11) {
			return TextureHelper.getOrCreateBlockTextureIndex(MOD_ID, "glass/navy_blue_glass.png");
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
