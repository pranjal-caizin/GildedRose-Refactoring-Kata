package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SulfurasTest {

    @Test
    void qualityAndSellinDoesNotChangeForSulfurasBeforeSellByDateTest() {
        Item item= new Item("Sulfuras, Hand of Ragnaros", 2, 4);
        Sulfuras sulfuras = new Sulfuras(item);

        sulfuras.update();

        assertEquals(4, item.quality);
        assertEquals(2, item.sellIn);
    }

    @Test
    void qualityAndSellinDoesNotChangeForSulfurasAfterSellByDateTest() {
        Item item = new Item("Sulfuras, Hand of Ragnaros", -1, 4);
        Sulfuras sulfuras = new Sulfuras(item);

        sulfuras.update();

        assertEquals(4, item.quality);
        assertEquals(-1, item.sellIn);
    }
}
