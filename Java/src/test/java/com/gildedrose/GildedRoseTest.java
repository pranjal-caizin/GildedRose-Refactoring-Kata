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
    void qualityDecreaseBy1ForNormalItemsTest() {
        Item[] items = new Item[] {
            new Item("item 1", 2, 4),
            new Item("item 2", 5, 7),
        };

        GildedRose app = new GildedRose(items);
        app.updateQuality();

        assertEquals(3, items[0].quality);
        assertEquals(6, items[1].quality);
    }

}
