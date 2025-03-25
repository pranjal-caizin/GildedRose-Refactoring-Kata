package com.gildedrose;

class GildedRose {
    Item[] items;
    private final String SULFURAS = "Sulfuras, Hand of Ragnaros";

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (Item item : items) {
            if(item.name.equals(SULFURAS)) continue;
            new ItemFactory().updateItem(item).updateQuality();
        }
    }
}
