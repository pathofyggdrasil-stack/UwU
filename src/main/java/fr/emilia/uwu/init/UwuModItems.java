/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package fr.emilia.uwu.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;

import net.minecraft.world.item.Item;

import fr.emilia.uwu.item.BigPooitemItem;
import fr.emilia.uwu.UwuMod;

public class UwuModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(UwuMod.MODID);
	public static final DeferredItem<Item> BIG_POOITEM;
	static {
		BIG_POOITEM = REGISTRY.register("big_pooitem", BigPooitemItem::new);
	}
	// Start of user code block custom items
	// End of user code block custom items
}