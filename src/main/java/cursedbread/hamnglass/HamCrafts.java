package cursedbread.hamnglass;

import net.minecraft.core.block.Block;
import goocraft4evr.nonamedyes.crafting.recipe.RecipesBleacher;
import goocraft4evr.nonamedyes.item.ModItems;
import net.minecraft.core.data.registry.Registries;
import net.minecraft.core.item.Item;
import net.minecraft.core.item.ItemStack;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import turniplabs.halplibe.helper.ModVersionHelper;
import turniplabs.halplibe.helper.RecipeBuilder;
import turniplabs.halplibe.util.RecipeEntrypoint;

import static cursedbread.hamnglass.HamNglass.MOD_ID;


public class HamCrafts implements RecipeEntrypoint {
	public static boolean nonamedyesOn = ModVersionHelper.isModPresent("nonamedyes");

	@Override
	public void initNamespaces() {
		Registries.ITEM_GROUPS.register("hamnglass:nandcglass", Registries.stackListOf(
			Block.glass,
			HamNglass.vanilaColoredGlass,
			HamNglass.nonamedyesColoredglass));
	}

	@Override
	public void onRecipesReady() {
		//all full glass blocks

		//ham blcok crafting
		RecipeBuilder.Shaped(MOD_ID)
			.setShape("HHH", "HHH", "HHH")
			.addInput('H', Item.foodPorkchopRaw)
			.create("hamblockcrafting", HamNglass.hamBlock.getDefaultStack());
        //ham block unkrafting
		RecipeBuilder.Shapeless(MOD_ID)
			.addInput(HamNglass.hamBlock)
			.create("hamblockuncrafting", new ItemStack(Item.foodPorkchopRaw, 9));
        //a lot of same recipies for different colored glass
		for (int i = 0; i <= 15; i++) {
			RecipeBuilder.Shaped(MOD_ID)
				.setShape("HHH", "HDH", "HHH")
				.addInput('H', "hamnglass:nandcglass")
				.addInput('D', Item.dye, i)
				.create("coloredglasscrafting", new ItemStack(HamNglass.vanilaColoredGlass, 8));
		}
		if (nonamedyesOn){
			for (int i = 0; i <=11; i++) {
				RecipeBuilder.Shaped(MOD_ID)
					.setShape("HHH", "HDH", "HHH")
					.addInput('H', "hamnglass:nandcglass")
					.addInput('D', ModItems.dye, i)
					.create("coloredglasscrafting", new ItemStack(HamNglass.nonamedyesColoredglass, 8));
			}
		}
		//rehestration and a lot of same recipies for different colored glass trapddors
		Registries.ITEM_GROUPS.register("hamnglass:nandcglasstrapdoors", Registries.stackListOf(
			Block.trapdoorGlass,
			HamNglass.vanilaColoredGlassTrapdoor,
			HamNglass.nonamedyesColoredglassTrapdoor));
		for (int i = 0; i <= 15; i++) {
			RecipeBuilder.Shapeless(MOD_ID)
				.addInput("hamnglass:nandcglasstrapdoors")
				.addInput(Item.dye, i)
				.create("coloredglasstrapdoorscrafting", new ItemStack(HamNglass.vanilaColoredGlassTrapdoor, 1));
		}
		//some more crafts
		for (int i = 0; i <= 15; i++) {
			RecipeBuilder.Shaped(MOD_ID)
				.setShape("HHH", "HHH")
				.addInput('H', HamNglass.vanilaColoredGlass)
				.create("coloredglasscrafting", new ItemStack(HamNglass.vanilaColoredGlassTrapdoor, 6));
		}
		if (nonamedyesOn){
			for (int i = 0; i <= 11; i++) {
				RecipeBuilder.Shapeless(MOD_ID)
					.addInput("hamnglass:nandcglasstrapdoors")
					.addInput(ModItems.dye, i)
					.create("coloredglasstrapdoorscrafting", new ItemStack(HamNglass.nonamedyesColoredglass, 1));
			}
			for (int i = 0; i <= 11; i++) {
				RecipeBuilder.Shaped(MOD_ID)
					.setShape("HHH", "HHH")
					.addInput('H', HamNglass.nonamedyesColoredglass)
					.create("coloredglasscrafting", new ItemStack(HamNglass.nonamedyesColoredglassTrapdoor, 6));
			}
		}
	}
}
