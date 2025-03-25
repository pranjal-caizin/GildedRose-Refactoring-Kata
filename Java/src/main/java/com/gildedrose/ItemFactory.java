package com.gildedrose;

import java.util.Map;
import java.util.function.Function;

public class ItemFactory {
    private static final Map<String, Function<Item, UpdatableItem>> ITEM_MAP = Map.of(
        "Aged Brie", AgedBrie::new,
        "Backstage passes to a TAFKAL80ETC concert", BackstagePasses::new
    );

    UpdatableItem updateItem(Item item) {
        return ITEM_MAP.getOrDefault(item.name, NormalItem::new).apply(item);
    }
}
