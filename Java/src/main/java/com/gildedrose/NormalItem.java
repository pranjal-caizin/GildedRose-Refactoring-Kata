package com.gildedrose;

public class NormalItem extends UpdatableItem {
    public NormalItem(Item item) {
        super(item);
    }

    @Override
    void update() {
        decreaseQuality();
        item.sellIn--;
        if (item.sellIn < 0) decreaseQuality();
    }

    private void decreaseQuality() {
        if (item.quality > 0) item.quality--;
    }
}
