package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NormalItemTest {

    @Test
    void qualityDecreasesByOneBeforeSellDateTest() {
        Item item = new Item("Normal Item", 5, 10);
        NormalItem normalItem = new NormalItem(item);

        normalItem.updateQuality();

        assertEquals(9, item.quality);
        assertEquals(4, item.sellIn);
    }

    @Test
    void qualityDecreasesTwiceAfterSellDateTest() {
        Item item = new Item("Normal Item", 0, 4);
        NormalItem normalItem = new NormalItem(item);

        normalItem.updateQuality();

        assertEquals(2, item.quality);
        assertEquals(-1, item.sellIn);
    }
}
