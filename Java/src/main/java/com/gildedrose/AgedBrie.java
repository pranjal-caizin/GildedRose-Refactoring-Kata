package com.gildedrose;

public class AgedBrie extends UpdatableItem {
    public AgedBrie(Item item) {
        super(item);
    }

    @Override
    void updateQuality() {
        if (item.quality < 50) item.quality++;
        item.sellIn--;
        if (item.sellIn < 0 && item.quality < 50) item.quality++;
    }
}
