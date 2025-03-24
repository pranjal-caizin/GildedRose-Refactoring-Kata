package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GildedRoseTest {

    @Test
    void foo() {
        Item[] items = new Item[] { new Item("foo", 0, 0) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("foo", app.items[0].name);
    }

    @Test
    void qualityAndSellinDecreaseBy1ForNormalItemsTest() {
        Item[] items = new Item[] {
            new Item("Normal Item", 2, 4)
        };

        GildedRose app = new GildedRose(items);
        app.updateQuality();

        assertEquals(3, items[0].quality);
        assertEquals(1, items[0].sellIn);
    }

    @Test
    void qualityIncreasesOverTimeByOneForAgedBrieTest() {
        Item[] items = new Item[] {
            new Item("Aged Brie", 2, 4)
        };

        GildedRose app = new GildedRose(items);
        app.updateQuality();

        assertEquals(5, items[0].quality);
        assertEquals(1, items[0].sellIn);
    }

    @Test
    void qualityAndSellinDoesNotDecreaseForSulfurasTest() {
        Item[] items = new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", 2, 4)
        };

        GildedRose app = new GildedRose(items);
        app.updateQuality();

        assertEquals(4, items[0].quality);
        assertEquals(2, items[0].sellIn);
    }

    @Test
    void qualityDegradesTwiceAfterSellByDateForNormalItemsTest() {
        Item[] items = new Item[] {
            new Item("Normal Item", 0, 4)
        };

        GildedRose app = new GildedRose(items);
        app.updateQuality();

        assertEquals(2, items[0].quality);
        assertEquals(-1, items[0].sellIn);
    }

    @Test
    void qualityNeverGoesNegativeTest() {
        Item[] items = new Item[] {
            new Item("Item", 4, 0)
        };

        GildedRose app = new GildedRose(items);
        app.updateQuality();

        assertEquals(0, items[0].quality);
        assertEquals(3, items[0].sellIn);
    }

}
