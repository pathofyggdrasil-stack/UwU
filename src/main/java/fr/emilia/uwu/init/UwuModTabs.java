/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package fr.emilia.uwu.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import fr.emilia.uwu.UwuMod;

public class UwuModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, UwuMod.MODID);
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> EMILIASTAB = REGISTRY.register("emiliastab",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.uwu.emiliastab")).icon(() -> new ItemStack(UwuModItems.BIG_POOITEM.get())).displayItems((parameters, tabData) -> {
				tabData.accept(UwuModItems.BIG_POOITEM.get());
			}).build());
}