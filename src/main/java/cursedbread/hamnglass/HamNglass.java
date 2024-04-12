package cursedbread.hamnglass;

import net.fabricmc.api.ModInitializer;
import net.minecraft.client.render.block.model.BlockModelRenderBlocks;
import net.minecraft.core.block.tag.BlockTags;
import net.minecraft.core.item.Item;
import net.minecraft.core.block.Block;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.item.block.ItemBlockPainted;
import net.minecraft.core.sound.BlockSound;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import turniplabs.halplibe.helper.BlockBuilder;
import turniplabs.halplibe.helper.ModVersionHelper;
import turniplabs.halplibe.util.ConfigHandler;
import turniplabs.halplibe.util.GameStartEntrypoint;
import java.util.Properties;


public class HamNglass implements ModInitializer, GameStartEntrypoint {
	public static final String MOD_ID = "hamnglass";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	public static final BlockBuilder coloredglass = new BlockBuilder(MOD_ID)
		.setBlockModel(new BlockModelRenderBlocks(0))
		.setBlockSound(new BlockSound("step.stone", "random.glass", 1.0f, 1.0f))
		.setHardness(0.3F)
		.setResistance(0.3F)
		.setVisualUpdateOnMetadata()
		.setTags(BlockTags.NOT_IN_CREATIVE_MENU)
		.setUseInternalLight();
	public static final BlockBuilder coloredglasstrapdoors = new BlockBuilder(MOD_ID)
		.setBlockModel(new BlockModelRenderBlocks(30))
		.setBlockSound(new BlockSound("step.stone", "random.glass", 1.0f, 1.0f))
		.setHardness(0.3F)
		.setResistance(0.3F)
		.setVisualUpdateOnMetadata()
		.setTags(BlockTags.NOT_IN_CREATIVE_MENU)
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
	public static Block vanilaColoredGlass;
	public static Block nonamedyesColoredglass;
	public static Block vanilaColoredGlassTrapdoor;
	public static Block nonamedyesColoredglassTrapdoor;
	private void initializeBlockDetails() {
		Item.itemsList[vanilaColoredGlass.id] = new ItemBlockPainted(vanilaColoredGlass, false);
		Item.itemsList[nonamedyesColoredglass.id] = new ItemBlockPainted(nonamedyesColoredglass, false);
		Item.itemsList[vanilaColoredGlassTrapdoor.id] = new ItemBlockPainted(vanilaColoredGlassTrapdoor, false);
		Item.itemsList[nonamedyesColoredglassTrapdoor.id] = new ItemBlockPainted(nonamedyesColoredglassTrapdoor, false);
	}
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
		vanilaColoredGlass = coloredglass
			.setTextures("glass/black_glass.png").setTextures("glass/red_glass.png").setTextures("glass/green_glass.png").setTextures("glass/brown_glass.png").setTextures("glass/blue_glass.png").setTextures("glass/purple_glass.png").setTextures("glass/cyan_glass.png").setTextures("glass/light_gray_glass.png")
			.setTextures("glass/gray_glass.png").setTextures("glass/pink_glass.png").setTextures("glass/lime_glass.png").setTextures("glass/yellow_glass.png").setTextures("glass/light_blue_glass.png").setTextures("glass/magenta_glass.png").setTextures("glass/orange_glass.png").setTextures("glass/white_glass.png")
			.build(new VanilaBlockColoredGlass("vanila.colored.Glass", startingBlockId++, Material.glass, false));
		if (nonamedyesOn) {
			nonamedyesColoredglass = coloredglass
				.setTextures("glass/crimson_glass.png").setTextures("glass/maroon_glass.png").setTextures("glass/ash_gray_glass.png").setTextures("glass/olive_glass.png").setTextures("glass/ochre_glass.png").setTextures("glass/buff_glass.png")
				.setTextures("glass/verdigris_glass.png").setTextures("glass/light_yellow_glass.png").setTextures("glass/indigo_glass.png").setTextures("glass/xanthic_glass.png").setTextures("glass/cinnamon_glass.png").setTextures("glass/navy_blue_glass.png")
				.build(new NonameBlockColoredGlass("noname.colored.Glass", startingBlockId++, Material.glass, false));
		}
		//funny glass trapdoors
		vanilaColoredGlassTrapdoor = coloredglasstrapdoors
			.setTextures("glass/black_glass.png").setTextures("glass/red_glass.png").setTextures("glass/green_glass.png").setTextures("glass/brown_glass.png").setTextures("glass/blue_glass.png").setTextures("glass/purple_glass.png").setTextures("glass/cyan_glass.png").setTextures("glass/light_gray_glass.png")
			.setTextures("glass/gray_glass.png").setTextures("glass/pink_glass.png").setTextures("glass/lime_glass.png").setTextures("glass/yellow_glass.png").setTextures("glass/light_blue_glass.png").setTextures("glass/magenta_glass.png").setTextures("glass/orange_glass.png").setTextures("glass/white_glass.png")
			.build(new VanilaColoredTrapdoors("vanila.colored.Glasstrapdoor", startingBlockId++));
		if (nonamedyesOn){
			nonamedyesColoredglassTrapdoor = coloredglasstrapdoors
				.setTextures("glass/crimson_glass.png").setTextures("glass/maroon_glass.png").setTextures("glass/ash_gray_glass.png").setTextures("glass/olive_glass.png").setTextures("glass/ochre_glass.png").setTextures("glass/buff_glass.png")
				.setTextures("glass/verdigris_glass.png").setTextures("glass/light_yellow_glass.png").setTextures("glass/indigo_glass.png").setTextures("glass/xanthic_glass.png").setTextures("glass/cinnamon_glass.png").setTextures("glass/navy_blue_glass.png")
				.build(new NonameColoredTrapdoors("noname.colored.Glasstrapdoor", startingBlockId++));
		}
	}

	@Override
	public void afterGameStart() {


	}

}
