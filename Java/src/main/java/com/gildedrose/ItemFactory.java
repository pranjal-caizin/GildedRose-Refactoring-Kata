package com.gildedrose;

import java.util.Map;
import java.util.function.Function;

public class ItemFactory {
    private static final Map<String, Function<Item, UpdatableItem>> ITEM_MAP = Map.of(
        ItemNameConstants.AGED_BRIE, AgedBrie::new,
        ItemNameConstants.BACKSTAGE_PASSES, BackstagePasses::new
    );

    UpdatableItem updateItem(Item item) {
        return ITEM_MAP.getOrDefault(item.name, NormalItem::new).apply(item);
    }
}
