package cursedbread.hamnglass;

import net.fabricmc.api.ModInitializer;
import net.minecraft.core.WeightedRandomLootObject;
import net.minecraft.core.block.Block;
import net.minecraft.core.data.registry.Registries;
import net.minecraft.core.item.Item;
import net.minecraft.core.item.ItemDye;
import net.minecraft.core.item.ItemStack;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import turniplabs.halplibe.helper.BlockBuilder;
import turniplabs.halplibe.helper.RecipeBuilder;
import turniplabs.halplibe.helper.recipeBuilders.RecipeBuilderShaped;
import turniplabs.halplibe.util.GameStartEntrypoint;
import turniplabs.halplibe.util.RecipeEntrypoint;


public class HamCrafts implements RecipeEntrypoint {
	public static final String MOD_ID = "hamnglass";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onRecipesReady() {
		//all the full glass blocks
		Registries.ITEM_GROUPS.register("hamnglass:nandcglass", Registries.stackListOf(
			Block.glass,
			HamNglass.blackGlass,
			HamNglass.redGlass,
			HamNglass.greenGlass,
			HamNglass.brownGlass,
			HamNglass.blueGlass,
			HamNglass.purpleGlass,
			HamNglass.cyanGlass,
			HamNglass.lightgrayGlass,
			HamNglass.grayGlass,
			HamNglass.pinkGlass,
			HamNglass.limeGlass,
			HamNglass.yellowGlass,
			HamNglass.lightblueGlass,
			HamNglass.magentaGlass,
			HamNglass.orangeGlass,
			HamNglass.whiteGlass));
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
		RecipeBuilder.Shaped(MOD_ID)
			.setShape("HHH", "HDH", "HHH")
			.addInput('H', "hamnglass:nandcglass")
			.addInput('D', Item.dye, 0)
			.create("coloredglasscrafting", new ItemStack(HamNglass.blackGlass, 8));
		RecipeBuilder.Shaped(MOD_ID)
			.setShape("HHH", "HDH", "HHH")
			.addInput('H', "hamnglass:nandcglass")
			.addInput('D', Item.dye, 1)
			.create("coloredglasscrafting", new ItemStack(HamNglass.redGlass, 8));
		RecipeBuilder.Shaped(MOD_ID)
			.setShape("HHH", "HDH", "HHH")
			.addInput('H', "hamnglass:nandcglass")
			.addInput('D', Item.dye, 2)
			.create("coloredglasscrafting", new ItemStack(HamNglass.greenGlass, 8));
		RecipeBuilder.Shaped(MOD_ID)
			.setShape("HHH", "HDH", "HHH")
			.addInput('H', "hamnglass:nandcglass")
			.addInput('D', Item.dye, 3)
			.create("coloredglasscrafting", new ItemStack(HamNglass.brownGlass, 8));
		RecipeBuilder.Shaped(MOD_ID)
			.setShape("HHH", "HDH", "HHH")
			.addInput('H', "hamnglass:nandcglass")
			.addInput('D', Item.dye, 4)
			.create("coloredglasscrafting", new ItemStack(HamNglass.blueGlass, 8));
		RecipeBuilder.Shaped(MOD_ID)
			.setShape("HHH", "HDH", "HHH")
			.addInput('H', "hamnglass:nandcglass")
			.addInput('D', Item.dye, 5)
			.create("coloredglasscrafting", new ItemStack(HamNglass.purpleGlass, 8));
		RecipeBuilder.Shaped(MOD_ID)
			.setShape("HHH", "HDH", "HHH")
			.addInput('H', "hamnglass:nandcglass")
			.addInput('D', Item.dye, 6)
			.create("coloredglasscrafting", new ItemStack(HamNglass.cyanGlass, 8));
		RecipeBuilder.Shaped(MOD_ID)
			.setShape("HHH", "HDH", "HHH")
			.addInput('H', "hamnglass:nandcglass")
			.addInput('D', Item.dye, 7)
			.create("coloredglasscrafting", new ItemStack(HamNglass.lightgrayGlass, 8));
		RecipeBuilder.Shaped(MOD_ID)
			.setShape("HHH", "HDH", "HHH")
			.addInput('H', "hamnglass:nandcglass")
			.addInput('D', Item.dye, 8)
			.create("coloredglasscrafting", new ItemStack(HamNglass.grayGlass, 8));
		RecipeBuilder.Shaped(MOD_ID)
			.setShape("HHH", "HDH", "HHH")
			.addInput('H', "hamnglass:nandcglass")
			.addInput('D', Item.dye, 9)
			.create("coloredglasscrafting", new ItemStack(HamNglass.pinkGlass, 8));
		RecipeBuilder.Shaped(MOD_ID)
			.setShape("HHH", "HDH", "HHH")
			.addInput('H', "hamnglass:nandcglass")
			.addInput('D', Item.dye, 10)
			.create("coloredglasscrafting", new ItemStack(HamNglass.limeGlass, 8));
		RecipeBuilder.Shaped(MOD_ID)
			.setShape("HHH", "HDH", "HHH")
			.addInput('H', "hamnglass:nandcglass")
			.addInput('D', Item.dye, 11)
			.create("coloredglasscrafting", new ItemStack(HamNglass.yellowGlass, 8));
		RecipeBuilder.Shaped(MOD_ID)
			.setShape("HHH", "HDH", "HHH")
			.addInput('H', "hamnglass:nandcglass")
			.addInput('D', Item.dye, 12)
			.create("coloredglasscrafting", new ItemStack(HamNglass.lightblueGlass, 8));
		RecipeBuilder.Shaped(MOD_ID)
			.setShape("HHH", "HDH", "HHH")
			.addInput('H', "hamnglass:nandcglass")
			.addInput('D', Item.dye, 13)
			.create("coloredglasscrafting", new ItemStack(HamNglass.magentaGlass, 8));
		RecipeBuilder.Shaped(MOD_ID)
			.setShape("HHH", "HDH", "HHH")
			.addInput('H', "hamnglass:nandcglass")
			.addInput('D', Item.dye, 14)
			.create("coloredglasscrafting", new ItemStack(HamNglass.orangeGlass, 8));
		RecipeBuilder.Shaped(MOD_ID)
			.setShape("HHH", "HDH", "HHH")
			.addInput('H', "hamnglass:nandcglass")
			.addInput('D', Item.dye, 15)
			.create("coloredglasscrafting", new ItemStack(HamNglass.whiteGlass, 8));
		//rehestration and a lot of same recipies for different colored glass trapddors
		Registries.ITEM_GROUPS.register("hamnglass:nandcglasstrapdoors", Registries.stackListOf(
			Block.trapdoorGlass,
			HamNglass.blackGlasstrapdoor,
			HamNglass.redGlasstrapdoor,
			HamNglass.greenGlasstrapdoor,
			HamNglass.brownGlasstrapdoor,
			HamNglass.blueGlasstrapdoor,
			HamNglass.purpleGlasstrapdoor,
			HamNglass.cyanGlasstrapdoor,
			HamNglass.lightgrayGlasstrapdoor,
			HamNglass.grayGlasstrapdoor,
			HamNglass.pinkGlasstrapdoor,
			HamNglass.limeGlasstrapdoor,
			HamNglass.yellowGlasstrapdoor,
			HamNglass.lightblueGlasstrapdoor,
			HamNglass.magentaGlasstrapdoor,
			HamNglass.orangeGlasstrapdoor,
			HamNglass.whiteGlasstrapdoor));
		RecipeBuilder.Shapeless(MOD_ID)
			.addInput("hamnglass:nandcglasstrapdoors")
			.addInput(Item.dye, 0)
			.create("coloredglasstrapdoorscrafting", new ItemStack(HamNglass.blackGlasstrapdoor, 1));
		RecipeBuilder.Shapeless(MOD_ID)
			.addInput("hamnglass:nandcglasstrapdoors")
			.addInput(Item.dye, 1)
			.create("coloredglasstrapdoorscrafting", new ItemStack(HamNglass.redGlasstrapdoor, 1));
		RecipeBuilder.Shapeless(MOD_ID)
			.addInput("hamnglass:nandcglasstrapdoors")
			.addInput(Item.dye, 2)
			.create("coloredglasstrapdoorscrafting", new ItemStack(HamNglass.greenGlasstrapdoor, 1));
		RecipeBuilder.Shapeless(MOD_ID)
			.addInput("hamnglass:nandcglasstrapdoors")
			.addInput(Item.dye, 3)
			.create("coloredglasstrapdoorscrafting", new ItemStack(HamNglass.brownGlasstrapdoor, 1));
		RecipeBuilder.Shapeless(MOD_ID)
			.addInput("hamnglass:nandcglasstrapdoors")
			.addInput(Item.dye, 4)
			.create("coloredglasstrapdoorscrafting", new ItemStack(HamNglass.blueGlasstrapdoor, 1));
		RecipeBuilder.Shapeless(MOD_ID)
			.addInput("hamnglass:nandcglasstrapdoors")
			.addInput(Item.dye, 5)
			.create("coloredglasstrapdoorscrafting", new ItemStack(HamNglass.purpleGlasstrapdoor, 1));
		RecipeBuilder.Shapeless(MOD_ID)
			.addInput("hamnglass:nandcglasstrapdoors")
			.addInput(Item.dye, 6)
			.create("coloredglasstrapdoorscrafting", new ItemStack(HamNglass.cyanGlasstrapdoor, 1));
		RecipeBuilder.Shapeless(MOD_ID)
			.addInput("hamnglass:nandcglasstrapdoors")
			.addInput(Item.dye, 7)
			.create("coloredglasstrapdoorscrafting", new ItemStack(HamNglass.lightgrayGlasstrapdoor, 1));
		RecipeBuilder.Shapeless(MOD_ID)
			.addInput("hamnglass:nandcglasstrapdoors")
			.addInput(Item.dye, 8)
			.create("coloredglasstrapdoorscrafting", new ItemStack(HamNglass.grayGlasstrapdoor, 1));
		RecipeBuilder.Shapeless(MOD_ID)
			.addInput("hamnglass:nandcglasstrapdoors")
			.addInput(Item.dye, 9)
			.create("coloredglasstrapdoorscrafting", new ItemStack(HamNglass.pinkGlasstrapdoor, 1));
		RecipeBuilder.Shapeless(MOD_ID)
			.addInput("hamnglass:nandcglasstrapdoors")
			.addInput(Item.dye, 10)
			.create("coloredglasstrapdoorscrafting", new ItemStack(HamNglass.limeGlasstrapdoor, 1));
		RecipeBuilder.Shapeless(MOD_ID)
			.addInput("hamnglass:nandcglasstrapdoors")
			.addInput(Item.dye, 11)
			.create("coloredglasstrapdoorscrafting", new ItemStack(HamNglass.yellowGlasstrapdoor, 1));
		RecipeBuilder.Shapeless(MOD_ID)
			.addInput("hamnglass:nandcglasstrapdoors")
			.addInput(Item.dye, 12)
			.create("coloredglasstrapdoorscrafting", new ItemStack(HamNglass.lightblueGlasstrapdoor, 1));
		RecipeBuilder.Shapeless(MOD_ID)
			.addInput("hamnglass:nandcglasstrapdoors")
			.addInput(Item.dye, 13)
			.create("coloredglasstrapdoorscrafting", new ItemStack(HamNglass.magentaGlasstrapdoor, 1));
		RecipeBuilder.Shapeless(MOD_ID)
			.addInput("hamnglass:nandcglasstrapdoors")
			.addInput(Item.dye, 14)
			.create("coloredglasstrapdoorscrafting", new ItemStack(HamNglass.orangeGlasstrapdoor, 1));
		RecipeBuilder.Shapeless(MOD_ID)
			.addInput("hamnglass:nandcglasstrapdoors")
			.addInput(Item.dye, 15)
			.create("coloredglasstrapdoorscrafting", new ItemStack(HamNglass.whiteGlasstrapdoor, 1));
		//some more crafts
		RecipeBuilder.Shaped(MOD_ID)
			.setShape("HHH", "HHH")
			.addInput('H', HamNglass.blackGlass)
			.create("coloredglasscrafting", new ItemStack(HamNglass.blackGlasstrapdoor, 6));
		RecipeBuilder.Shaped(MOD_ID)
			.setShape("HHH", "HHH")
			.addInput('H', HamNglass.redGlass)
			.create("coloredglasscrafting", new ItemStack(HamNglass.redGlasstrapdoor, 6));
		RecipeBuilder.Shaped(MOD_ID)
			.setShape("HHH", "HHH")
			.addInput('H', HamNglass.greenGlass)
			.create("coloredglasscrafting", new ItemStack(HamNglass.greenGlasstrapdoor, 6));
		RecipeBuilder.Shaped(MOD_ID)
			.setShape("HHH", "HHH")
			.addInput('H', HamNglass.brownGlass)
			.create("coloredglasscrafting", new ItemStack(HamNglass.brownGlasstrapdoor, 6));
		RecipeBuilder.Shaped(MOD_ID)
			.setShape("HHH", "HHH")
			.addInput('H', HamNglass.blueGlass)
			.create("coloredglasscrafting", new ItemStack(HamNglass.blueGlasstrapdoor, 6));
		RecipeBuilder.Shaped(MOD_ID)
			.setShape("HHH", "HHH")
			.addInput('H', HamNglass.purpleGlass)
			.create("coloredglasscrafting", new ItemStack(HamNglass.purpleGlasstrapdoor, 6));
		RecipeBuilder.Shaped(MOD_ID)
			.setShape("HHH", "HHH")
			.addInput('H', HamNglass.cyanGlass)
			.create("coloredglasscrafting", new ItemStack(HamNglass.cyanGlasstrapdoor, 6));
		RecipeBuilder.Shaped(MOD_ID)
			.setShape("HHH", "HHH")
			.addInput('H', HamNglass.lightgrayGlass)
			.create("coloredglasscrafting", new ItemStack(HamNglass.lightgrayGlasstrapdoor, 6));
		RecipeBuilder.Shaped(MOD_ID)
			.setShape("HHH", "HHH")
			.addInput('H', HamNglass.grayGlass)
			.create("coloredglasscrafting", new ItemStack(HamNglass.grayGlasstrapdoor, 6));
		RecipeBuilder.Shaped(MOD_ID)
			.setShape("HHH", "HHH")
			.addInput('H', HamNglass.pinkGlass)
			.create("coloredglasscrafting", new ItemStack(HamNglass.pinkGlasstrapdoor, 6));
		RecipeBuilder.Shaped(MOD_ID)
			.setShape("HHH", "HHH")
			.addInput('H', HamNglass.limeGlass)
			.create("coloredglasscrafting", new ItemStack(HamNglass.limeGlasstrapdoor, 6));
		RecipeBuilder.Shaped(MOD_ID)
			.setShape("HHH", "HHH")
			.addInput('H', HamNglass.yellowGlass)
			.create("coloredglasscrafting", new ItemStack(HamNglass.yellowGlasstrapdoor, 6));
		RecipeBuilder.Shaped(MOD_ID)
			.setShape("HHH", "HHH")
			.addInput('H', HamNglass.lightblueGlass)
			.create("coloredglasscrafting", new ItemStack(HamNglass.lightblueGlasstrapdoor, 6));
		RecipeBuilder.Shaped(MOD_ID)
			.setShape("HHH", "HHH")
			.addInput('H', HamNglass.magentaGlass)
			.create("coloredglasscrafting", new ItemStack(HamNglass.magentaGlasstrapdoor, 6));
		RecipeBuilder.Shaped(MOD_ID)
			.setShape("HHH", "HHH")
			.addInput('H', HamNglass.orangeGlass)
			.create("coloredglasscrafting", new ItemStack(HamNglass.orangeGlasstrapdoor, 6));
		RecipeBuilder.Shaped(MOD_ID)
			.setShape("HHH", "HHH")
			.addInput('H', HamNglass.whiteGlass)
			.create("coloredglasscrafting", new ItemStack(HamNglass.whiteGlasstrapdoor, 6));
	}
}
