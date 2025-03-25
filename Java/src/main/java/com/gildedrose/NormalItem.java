package com.gildedrose;

public class NormalItem {
    Item item;

    public NormalItem(Item item) {
        this.item = item;
    }

    void updateQuality() {
        if (item.quality > 0) item.quality--;
        item.sellIn--;
        if (item.sellIn < 0 && item.quality > 0) item.quality--;
    }
}
