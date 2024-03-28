package cursedbread.hamnglass;

import net.fabricmc.api.ModInitializer;
import net.minecraft.client.render.block.model.BlockModelRenderBlocks;
import net.minecraft.core.WeightedRandomLootObject;
import net.minecraft.core.block.BlockMushroom;
import net.minecraft.core.data.registry.Registries;
import net.minecraft.core.item.Item;
import net.minecraft.core.item.ItemDye;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.block.Block;
import net.minecraft.core.block.BlockGlass;
import net.minecraft.core.block.BlockTorch;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.item.block.ItemBlock;
import net.minecraft.core.sound.BlockSound;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import turniplabs.halplibe.helper.BlockBuilder;
import turniplabs.halplibe.helper.ItemHelper;
import turniplabs.halplibe.helper.ModVersionHelper;
import turniplabs.halplibe.helper.RecipeBuilder;
import turniplabs.halplibe.helper.recipeBuilders.RecipeBuilderShaped;
import turniplabs.halplibe.util.ConfigHandler;
import turniplabs.halplibe.util.GameStartEntrypoint;
import java.util.Properties;
import turniplabs.halplibe.util.RecipeEntrypoint;



public class HamNglass implements ModInitializer, GameStartEntrypoint {
	public static final String MOD_ID = "hamnglass";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	public static final BlockBuilder coloredglass = new BlockBuilder(MOD_ID)
		.setBlockModel(new BlockModelRenderBlocks(0))
		.setBlockSound(new BlockSound("step.stone", "random.glass", 1.0f, 1.0f))
		.setHardness(0.3F)
		.setResistance(0.3F)
		.setVisualUpdateOnMetadata()
		.setUseInternalLight();
	public static final BlockBuilder coloredglasstrapdoors = new BlockBuilder(MOD_ID)
		.setBlockModel(new BlockModelRenderBlocks(30))
		.setBlockSound(new BlockSound("step.stone", "random.glass", 1.0f, 1.0f))
		.setHardness(0.3F)
		.setResistance(0.3F)
		.setVisualUpdateOnMetadata()
		.setUseInternalLight();


	public static int blockId;


	static {
		Properties prop = new Properties();
		prop.setProperty("starting_block_id","2000");
		ConfigHandler config = new ConfigHandler(MOD_ID,prop);

		blockId = config.getInt("starting_block_id");

		config.updateConfig();
	}

	public static boolean nonamedyesOn = ModVersionHelper.isModPresent("nonamedyes");
	public static Block hamBlock;
	public static Block blackGlass;
	public static Block redGlass;
	public static Block greenGlass;
	public static Block brownGlass;
	public static Block blueGlass;
	public static Block purpleGlass;
	public static Block cyanGlass;
	public static Block lightgrayGlass;
	public static Block grayGlass;
	public static Block pinkGlass;
	public static Block limeGlass;
	public static Block yellowGlass;
	public static Block lightblueGlass;
	public static Block magentaGlass;
	public static Block orangeGlass;
	public static Block whiteGlass;

	// Yes name dye glass
	public static Block crimsonGlass;
	public static Block maroonGlass;
	public static Block ashgrayGlass;
	public static Block oliveGlass;
	public static Block ochreGlass;
	public static Block buffGlass;
	public static Block verdigrisGlass;
	public static Block lightyellowGlass;
	public static Block indigoGlass;
	public static Block xanthicGlass;
	public static Block cinnamonGlass;
	public static Block navyblueGlass;


	public static Block blackGlasstrapdoor;
	public static Block redGlasstrapdoor;
	public static Block greenGlasstrapdoor;
	public static Block brownGlasstrapdoor;
	public static Block blueGlasstrapdoor;
	public static Block purpleGlasstrapdoor;
	public static Block cyanGlasstrapdoor;
	public static Block lightgrayGlasstrapdoor;
	public static Block grayGlasstrapdoor;
	public static Block pinkGlasstrapdoor;
	public static Block limeGlasstrapdoor;
	public static Block yellowGlasstrapdoor;
	public static Block lightblueGlasstrapdoor;
	public static Block magentaGlasstrapdoor;
	public static Block orangeGlasstrapdoor;
	public static Block whiteGlasstrapdoor;

	// Yes name dye glass trapdoors
	public static Block crimsonGlasstrapdoor;
	public static Block maroonGlasstrapdoor;
	public static Block ashgrayGlasstrapdoor;
	public static Block oliveGlasstrapdoor;
	public static Block ochreGlasstrapdoor;
	public static Block buffGlasstrapdoor;
	public static Block verdigrisGlasstrapdoor;
	public static Block lightyellowGlasstrapdoor;
	public static Block indigoGlasstrapdoor;
	public static Block xanthicGlasstrapdoor;
	public static Block cinnamonGlasstrapdoor;
	public static Block navyblueGlasstrapdoor;
	@Override
	public void onInitialize() {
		LOGGER.info("Mmmmm, ham and glass");
	}

	@Override
	public void beforeGameStart() {
		int startingBlockId = blockId;

		//funny ham block \/

		hamBlock = new BlockBuilder(MOD_ID)
			.setTextures("extra/ham_block.png")
			.setBlockModel(new BlockModelRenderBlocks(0))
			.setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.8f))
			.build(new Block("hamBlock", startingBlockId++, Material.dirt));

		//funny glass blocks \/

		blackGlass = coloredglass
			.setTextures("glass/black_glass.png")
			.build(new BlockColoredGlass("blackGlass", startingBlockId++, Material.glass, false));

		redGlass = coloredglass
			.setTextures("glass/red_glass.png")
			.build(new BlockColoredGlass("redGlass", startingBlockId++, Material.glass, false));

		greenGlass = coloredglass
			.setTextures("glass/green_glass.png")
			.build(new BlockColoredGlass("greenGlass", startingBlockId++, Material.glass, false));

		brownGlass = coloredglass
			.setTextures("glass/brown_glass.png")
			.build(new BlockColoredGlass("brownGlass", startingBlockId++, Material.glass, false));

		blueGlass = coloredglass
			.setTextures("glass/blue_glass.png")
			.build(new BlockColoredGlass("blueGlass", startingBlockId++, Material.glass, false));

		purpleGlass = coloredglass
			.setTextures("glass/purple_glass.png")
			.build(new BlockColoredGlass("purpleGlass", startingBlockId++, Material.glass, false));

		cyanGlass = coloredglass
			.setTextures("glass/cyan_glass.png")
			.build(new BlockColoredGlass("cyanGlass", startingBlockId++, Material.glass, false));

		lightgrayGlass = coloredglass
			.setTextures("glass/light_gray_glass.png")
			.build(new BlockColoredGlass("lightgrayGlass", startingBlockId++, Material.glass, false));

		grayGlass = coloredglass
			.setTextures("glass/gray_glass.png")
			.build(new BlockColoredGlass("grayGlass", startingBlockId++, Material.glass, false));

		pinkGlass = coloredglass
			.setTextures("glass/pink_glass.png")
			.build(new BlockColoredGlass("pinkGlass", startingBlockId++, Material.glass, false));

		limeGlass = coloredglass
			.setTextures("glass/lime_glass.png")
			.build(new BlockColoredGlass("limeGlass", startingBlockId++, Material.glass, false));

		yellowGlass = coloredglass
			.setTextures("glass/yellow_glass.png")
			.build(new BlockColoredGlass("yellowGlass", startingBlockId++, Material.glass, false));

		lightblueGlass = coloredglass
			.setTextures("glass/light_blue_glass.png")
			.build(new BlockColoredGlass("lightblueGlass", startingBlockId++, Material.glass, false));

		magentaGlass = coloredglass
			.setTextures("glass/magenta_glass.png")
			.build(new BlockColoredGlass("magentaGlass", startingBlockId++, Material.glass, false));

		orangeGlass = coloredglass
			.setTextures("glass/orange_glass.png")
			.build(new BlockColoredGlass("orangeGlass", startingBlockId++, Material.glass, false));

		whiteGlass = coloredglass
			.setTextures("glass/white_glass.png")
			.build(new BlockColoredGlass("whiteGlass", startingBlockId++, Material.glass, false));

			if (nonamedyesOn){
				crimsonGlass = coloredglass
					.setTextures("glass/crimson_glass.png")
					.build(new BlockColoredGlass("crimsonGlass", startingBlockId++, Material.glass, false));
				maroonGlass = coloredglass
					.setTextures("glass/maroon_glass.png")
					.build(new BlockColoredGlass("maroonGlass", startingBlockId++, Material.glass, false));
				ashgrayGlass = coloredglass
					.setTextures("glass/ash_gray_glass.png")
					.build(new BlockColoredGlass("ashgrayGlass", startingBlockId++, Material.glass, false));
				oliveGlass = coloredglass
					.setTextures("glass/olive_glass.png")
					.build(new BlockColoredGlass("oliveGlass", startingBlockId++, Material.glass, false));
				ochreGlass = coloredglass
					.setTextures("glass/ochre_glass.png")
					.build(new BlockColoredGlass("ochreGlass", startingBlockId++, Material.glass, false));
				buffGlass = coloredglass
					.setTextures("glass/buff_glass.png")
					.build(new BlockColoredGlass("buffGlass", startingBlockId++, Material.glass, false));
				verdigrisGlass = coloredglass
					.setTextures("glass/verdigris_glass.png")
					.build(new BlockColoredGlass("verdigrisGlass", startingBlockId++, Material.glass, false));
				lightyellowGlass = coloredglass
					.setTextures("glass/light_yellow_glass.png")
					.build(new BlockColoredGlass("lightyellowGlass", startingBlockId++, Material.glass, false));
				indigoGlass = coloredglass
					.setTextures("glass/indigo_glass.png")
					.build(new BlockColoredGlass("indigoGlass", startingBlockId++, Material.glass, false));
				xanthicGlass = coloredglass
					.setTextures("glass/xanthic_glass.png")
					.build(new BlockColoredGlass("xanthicGlass", startingBlockId++, Material.glass, false));
				cinnamonGlass = coloredglass
					.setTextures("glass/cinnamon_glass.png")
					.build(new BlockColoredGlass("cinnamonGlass", startingBlockId++, Material.glass, false));
				navyblueGlass = coloredglass
					.setTextures("glass/navy_blue_glass.png")
					.build(new BlockColoredGlass("navyblueGlass", startingBlockId++, Material.glass, false));
			}


		//funny glass trapdoors

		blackGlasstrapdoor = coloredglasstrapdoors
			.setTextures("glass/black_glass.png")
			.build(new ColoredTrapdoors("blackGlasstrapdoor", startingBlockId++));
		redGlasstrapdoor = coloredglasstrapdoors
			.setTextures("glass/red_glass.png")
			.build(new ColoredTrapdoors("redGlasstrapdoor", startingBlockId++));
		greenGlasstrapdoor = coloredglasstrapdoors
			.setTextures("glass/green_glass.png")
			.build(new ColoredTrapdoors("greenGlasstrapdoor", startingBlockId++));
		brownGlasstrapdoor = coloredglasstrapdoors
			.setTextures("glass/brown_glass.png")
			.build(new ColoredTrapdoors("brownGlasstrapdoor", startingBlockId++));
		blueGlasstrapdoor = coloredglasstrapdoors
			.setTextures("glass/blue_glass.png")
			.build(new ColoredTrapdoors("blueGlasstrapdoor", startingBlockId++));
		purpleGlasstrapdoor = coloredglasstrapdoors
			.setTextures("glass/purple_glass.png")
			.build(new ColoredTrapdoors("purpleGlasstrapdoor", startingBlockId++));
		cyanGlasstrapdoor = coloredglasstrapdoors
			.setTextures("glass/cyan_glass.png")
			.build(new ColoredTrapdoors("cyanGlasstrapdoor", startingBlockId++));
		lightgrayGlasstrapdoor = coloredglasstrapdoors
			.setTextures("glass/light_gray_glass.png")
			.build(new ColoredTrapdoors("lightgrayGlasstrapdoor", startingBlockId++));
		grayGlasstrapdoor = coloredglasstrapdoors
			.setTextures("glass/gray_glass.png")
			.build(new ColoredTrapdoors("grayGlasstrapdoor", startingBlockId++));
		pinkGlasstrapdoor = coloredglasstrapdoors
			.setTextures("glass/pink_glass.png")
			.build(new ColoredTrapdoors("pinkGlasstrapdoor", startingBlockId++));
		limeGlasstrapdoor = coloredglasstrapdoors
			.setTextures("glass/lime_glass.png")
			.build(new ColoredTrapdoors("limeGlasstrapdoor", startingBlockId++));
		yellowGlasstrapdoor = coloredglasstrapdoors
			.setTextures("glass/yellow_glass.png")
			.build(new ColoredTrapdoors("yellowGlasstrapdoor", startingBlockId++));
		lightblueGlasstrapdoor = coloredglasstrapdoors
			.setTextures("glass/light_blue_glass.png")
			.build(new ColoredTrapdoors("lightblueGlasstrapdoor", startingBlockId++));
		magentaGlasstrapdoor = coloredglasstrapdoors
			.setTextures("glass/magenta_glass.png")
			.build(new ColoredTrapdoors("magentaGlasstrapdoor", startingBlockId++));
		orangeGlasstrapdoor = coloredglasstrapdoors
			.setTextures("glass/orange_glass.png")
			.build(new ColoredTrapdoors("orangeGlasstrapdoor", startingBlockId++));
		whiteGlasstrapdoor = coloredglasstrapdoors
			.setTextures("glass/white_glass.png")
			.build(new ColoredTrapdoors("whiteGlasstrapdoor", startingBlockId++));

		if (nonamedyesOn){
			crimsonGlasstrapdoor = coloredglasstrapdoors
				.setTextures("glass/crimson_glass.png")
				.build(new ColoredTrapdoors("crimsonGlasstrapdoor", startingBlockId++));
			maroonGlasstrapdoor = coloredglasstrapdoors
				.setTextures("glass/maroon_glass.png")
				.build(new ColoredTrapdoors("maroonGlasstrapdoor", startingBlockId++));
			ashgrayGlasstrapdoor = coloredglasstrapdoors
				.setTextures("glass/ash_gray_glass.png")
				.build(new ColoredTrapdoors("ashgrayGlasstrapdoor", startingBlockId++));
			oliveGlasstrapdoor = coloredglasstrapdoors
				.setTextures("glass/olive_glass.png")
				.build(new ColoredTrapdoors("oliveGlasstrapdoor", startingBlockId++));
			ochreGlasstrapdoor = coloredglasstrapdoors
				.setTextures("glass/ochre_glass.png")
				.build(new ColoredTrapdoors("ochreGlasstrapdoor", startingBlockId++));
			buffGlasstrapdoor = coloredglasstrapdoors
				.setTextures("glass/buff_glass.png")
				.build(new ColoredTrapdoors("buffGlasstrapdoor", startingBlockId++));
			verdigrisGlasstrapdoor = coloredglasstrapdoors
				.setTextures("glass/verdigris_glass.png")
				.build(new ColoredTrapdoors("verdigrisGlasstrapdoor", startingBlockId++));
			lightyellowGlasstrapdoor = coloredglasstrapdoors
				.setTextures("glass/light_yellow_glass.png")
				.build(new ColoredTrapdoors("lightyellowGlasstrapdoor", startingBlockId++));
			indigoGlasstrapdoor = coloredglasstrapdoors
				.setTextures("glass/indigo_glass.png")
				.build(new ColoredTrapdoors("indigoGlasstrapdoor", startingBlockId++));
			xanthicGlasstrapdoor = coloredglasstrapdoors
				.setTextures("glass/xanthic_glass.png")
				.build(new ColoredTrapdoors("xanthicGlasstrapdoor", startingBlockId++));
			cinnamonGlasstrapdoor = coloredglasstrapdoors
				.setTextures("glass/cinnamon_glass.png")
				.build(new ColoredTrapdoors("cinnamonGlasstrapdoor", startingBlockId++));
			navyblueGlasstrapdoor = coloredglasstrapdoors
				.setTextures("glass/navy_blue_glass.png")
				.build(new ColoredTrapdoors("navyblueGlasstrapdoor", startingBlockId++));
		}

	}

	@Override
	public void afterGameStart() {


	}

}
