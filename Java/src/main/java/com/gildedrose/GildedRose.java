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
                    updateQualityAndSellinForBackstagePasses(item);
                    break;
                default:
                    updateQualityAndSellinForNormalItem(item);
                    break;
            }
        }
    }

    private static void updateQualityAndSellinForNormalItem(Item item) {
        if (item.quality > 0) item.quality--;
        item.sellIn--;
        if (item.sellIn < 0 && item.quality > 0) item.quality--;
    }

    private static void updateQualityAndSellinForBackstagePasses(Item item) {
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
