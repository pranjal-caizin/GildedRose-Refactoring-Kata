package com.gildedrose;

public class BackstagePasses {
    Item item;

    public BackstagePasses(Item item) {
        this.item = item;
    }

    void updateQuality() {
        if (item.quality < 50) {
            item.quality++;

            if (item.quality < 50) {
                if (item.sellIn < 11) item.quality++;
                if (item.sellIn < 6) item.quality++;
            }
        }
        item.sellIn--;
        if (item.sellIn < 0) item.quality = 0;
    }
}
