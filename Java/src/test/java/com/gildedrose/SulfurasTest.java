package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SulfurasTest {

    @Test
    void qualityAndSellinDoesNotChangeForSulfurasBeforeSellByDateTest() {
        Item item= new Item("Sulfuras, Hand of Ragnaros", 2, 4);

        Sulfuras sulfuras = new Sulfuras(item);
        sulfuras.updateQuality();

        assertEquals(4, item.quality);
        assertEquals(2, item.sellIn);
    }

    @Test
    void qualityAndSellinDoesNotChangeForSulfurasAfterSellByDateTest() {
        Item[] items = new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", -1, 4)
        };

        GildedRose app = new GildedRose(items);
        app.update();

        assertEquals(4, items[0].quality);
        assertEquals(-1, items[0].sellIn);
    }
}
