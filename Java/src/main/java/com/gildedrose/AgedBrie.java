package com.gildedrose;

public class AgedBrie extends UpdatableItem {
    public AgedBrie(Item item) {
        super(item);
    }

    @Override
    void updateQuality() {
        increaseQuality();
        item.sellIn--;
        if (item.sellIn < 0) increaseQuality();
    }

    private void increaseQuality() {
        if (item.quality < 50) item.quality++;
    }
}

