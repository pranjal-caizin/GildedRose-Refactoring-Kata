package com.gildedrose;

public class NormalItem extends UpdatableItem {
    public NormalItem(Item item) {
        super(item);
    }

    @Override
    void update() {
        if (item.quality > 0) item.quality--;
        item.sellIn--;
        if (item.sellIn < 0 && item.quality > 0) item.quality--;
    }
}
