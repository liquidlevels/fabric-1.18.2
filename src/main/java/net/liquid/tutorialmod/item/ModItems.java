package net.liquid.tutorialmod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.liquid.tutorialmod.TutorialMod;
import net.liquid.tutorialmod.item.custom.DowsingRodItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


public class ModItems {

    public static final Item MYTHRIL_INGOT = registerItem("mythril_ingot",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));

    public static final Item MYTHRIL_DUST = registerItem("mythril_dust",
            new Item(new FabricItemSettings().group(ModItemGroup.MYTHRIL)));

    public static final Item MYTHRIL_NUGGET = registerItem("mythril_nugget",
            new Item(new FabricItemSettings().group(ModItemGroup.MYTHRIL)));

    public static final Item RAW_MYTHRIL = registerItem("raw_mythril",
            new Item(new FabricItemSettings().group(ModItemGroup.MYTHRIL)));
    public static final Item DILDO = registerItem("dildo",
            new Item(new FabricItemSettings().group(ModItemGroup.STOOPID_THINGS)));

    public static final Item BIBLE = registerItem("bible",
            new Item(new FabricItemSettings().group(ModItemGroup.STOOPID_THINGS)));

    public static final Item CUM = registerItem("cum",
            new Item(new FabricItemSettings().group(ModItemGroup.STOOPID_THINGS)));

    public static final Item SOAP = registerItem("soap",
            new Item(new FabricItemSettings().group(ModItemGroup.STOOPID_THINGS)));

    public static final Item JUDIO_DUST = registerItem("judio_dust",
            new Item(new FabricItemSettings().group(ModItemGroup.STOOPID_THINGS)));

    public static final Item COOKED_CHICKEN_NUGGET = registerItem("cooked_chicken_nugget",
            new Item(new FabricItemSettings().group(ModItemGroup.STOOPID_THINGS)));

    public static final Item COOKED_CHICKEN = registerItem("cooked_chicken",
            new Item(new FabricItemSettings().group(ModItemGroup.STOOPID_THINGS)));

    public static final Item DOWSING_ROD = registerItem("dowsing_rod",
            new DowsingRodItem(new FabricItemSettings().group(ModItemGroup.STOOPID_THINGS).maxDamage(16)));

    public static final Item FRIED_EGG = registerItem("fried_egg",
            new Item(new FabricItemSettings().group(ModItemGroup.FOOD)));

    public static final Item LILAC_FLOWER_BULB = registerItem("lilac_flower_bulb",
            new Item(new FabricItemSettings().group(ModItemGroup.MYTHRIL)));

    private static Item registerItem(String name, Item item){
        return Registry.register(Registry.ITEM, new Identifier(TutorialMod.MOD_ID, name), item);
    }

    public static void registerModItems(){
        TutorialMod.LOGGER.info("Registering Mod Items for " + TutorialMod.MOD_ID);

    }
}
