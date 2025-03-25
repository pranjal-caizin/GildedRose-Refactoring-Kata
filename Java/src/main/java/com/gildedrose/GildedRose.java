package com.gildedrose;

class GildedRose {
    Item[] items;
    private final String SULFURAS = "Sulfuras, Hand of Ragnaros";
    private final String AGED_BRIE = "Aged Brie";
    private final String BACKSTAGE_PASSES = "Backstage passes to a TAFKAL80ETC concert";

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (Item item : items) {

            switch (item.name) {
                case SULFURAS:
                    continue;
                case AGED_BRIE:
                    new AgedBrie(item).updateQuality();
                    break;
                case BACKSTAGE_PASSES:
                    new BackstagePasses(item).updateQuality();
                    break;
                default:
                    new NormalItem(item).updateQuality();
                    break;
            }
        }
    }
}
