package com.gildedrose;

public class AgedBrie extends UpdatableItem {
    private final int MAX_QUALITY = 50;

    public AgedBrie(Item item) {
        super(item);
    }

    @Override
    void update() {
        increaseQuality();
        decreaseSellIn();
        if (item.sellIn < 0) increaseQuality();
    }

    private void decreaseSellIn() {
        item.sellIn--;
    }

    private void increaseQuality() {
        if (item.quality < MAX_QUALITY) item.quality++;
    }
}

