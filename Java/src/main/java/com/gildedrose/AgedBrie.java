package com.gildedrose;

public class AgedBrie {
    Item item;

    public AgedBrie(Item item) {
        this.item = item;
    }

    void updateQuality() {
        if (item.quality < 50) item.quality++;
        item.sellIn--;
        if (item.sellIn < 0 && item.quality < 50) item.quality++;
    }
}
