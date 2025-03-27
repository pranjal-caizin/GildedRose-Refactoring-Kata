package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NormalItemTest {

    @Test
    void qualityDecreasesByOneBeforeSellDateTest() {
        Item item = new Item("Normal Item", 5, 10);
        NormalItem normalItem = new NormalItem(item);

        normalItem.update();

        assertEquals(9, item.quality);
        assertEquals(4, item.sellIn);
    }

    @Test
    void qualityDecreasesTwiceAfterSellDateTest() {
        Item item = new Item("Normal Item", 0, 4);
        NormalItem normalItem = new NormalItem(item);

        normalItem.update();

        assertEquals(2, item.quality);
        assertEquals(-1, item.sellIn);
    }

    @Test
    void qualityNeverGoesNegativeTest() {
        Item item = new Item("Normal Item", 5, 0);
        NormalItem normalItem = new NormalItem(item);

        normalItem.update();

        assertEquals(0, item.quality);
        assertEquals(4, item.sellIn);
    }

    @Test
    void qualityNeverGoesNegativeEvenAfterSellDateTest() {
        Item item = new Item("Normal Item", 0, 1);
        NormalItem normalItem = new NormalItem(item);

        normalItem.update();

        assertEquals(0, item.quality);
        assertEquals(-1, item.sellIn);
    }
}
