package com.gildedrose;

public class Sulfuras extends UpdatableItem {
    public Sulfuras(Item item) {
        super(item);
    }

    @Override
    void updateQuality() {
        //Being a legendary item, it never has to be sold or decreases in Quality
    }
}
