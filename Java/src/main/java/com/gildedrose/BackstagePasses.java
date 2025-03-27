package com.gildedrose;

public class BackstagePasses extends UpdatableItem {
    public BackstagePasses(Item item) {
        super(item);
    }

    @Override
    void update() {
        increaseQuality();
        decreaseSellIn();
        resetQualityIfSellByDateIsPassed();
    }

    private void decreaseSellIn() {
        item.sellIn--;
    }

    private void resetQualityIfSellByDateIsPassed() {
        if (item.sellIn < 0) item.quality = 0;
    }

    private void increaseQuality() {
        if(item.quality >= 50) return;

        item.quality++;

        if (item.quality < 50) {
            if (item.sellIn < 11) item.quality++;
            if (item.sellIn < 6) item.quality++;
        }
    }
}
