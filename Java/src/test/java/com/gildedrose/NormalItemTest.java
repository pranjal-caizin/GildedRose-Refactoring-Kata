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
}
