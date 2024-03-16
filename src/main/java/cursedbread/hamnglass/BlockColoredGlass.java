package cursedbread.hamnglass;

import net.minecraft.core.block.BlockGlass;
import net.minecraft.core.block.entity.TileEntity;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.enums.EnumDropCause;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.world.World;

public class BlockColoredGlass
	extends BlockGlass {
	public BlockColoredGlass(String key, int id, Material material, boolean renderInside) {
		super(key, id, Material.glass, false);
	}

	@Override
	public int getRenderBlockPass() {
		return 1;
	}
    //I just took this code from the bonus blocks, it will make glass blocks behave as glass, like breaking without silk touch behavor you know
	@Override
	public ItemStack[] getBreakResult(World world, EnumDropCause dropCause, int x, int y, int z, int meta, TileEntity tileEntity) {
		switch (dropCause) {
			case SILK_TOUCH:
			case PICK_BLOCK: {
				return new ItemStack[]{new ItemStack(this)};
			}
		}
		return null;
	}
}
