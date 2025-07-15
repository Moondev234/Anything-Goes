package net.shadedev.anythinggoes.item;

import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.shadedev.anythinggoes.AnythingGoes;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(AnythingGoes.MOD_ID);

    public static final DeferredItem<Item> BANANA = ITEMS.register("banana",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BANANA_PEEL = ITEMS.register("banana_peel",
            () -> new Item(new Item.Properties()));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
