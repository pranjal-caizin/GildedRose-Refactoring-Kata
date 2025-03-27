package com.gildedrose;

public class BackstagePasses extends UpdatableItem {
    public BackstagePasses(Item item) {
        super(item);
    }

    @Override
    void update() {
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
