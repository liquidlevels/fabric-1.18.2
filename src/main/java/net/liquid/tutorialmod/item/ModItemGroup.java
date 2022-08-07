package net.liquid.tutorialmod.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.liquid.tutorialmod.TutorialMod;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup MYTHRIL = FabricItemGroupBuilder.build(new Identifier(TutorialMod.MOD_ID, "mythril"),
            () -> new ItemStack(ModItems.MYTHRIL_INGOT));

    public static final ItemGroup STOOPID_THINGS = FabricItemGroupBuilder.build(new Identifier(TutorialMod.MOD_ID, "stoopid_things"),
            () -> new ItemStack(ModItems.DILDO));

    public static final ItemGroup FOOD = FabricItemGroupBuilder.build(new Identifier(TutorialMod.MOD_ID, "food"),
            () -> new ItemStack(ModItems.FRIED_EGG));
}
