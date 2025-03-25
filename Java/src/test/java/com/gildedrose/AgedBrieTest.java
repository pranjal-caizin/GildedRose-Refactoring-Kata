package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AgedBrieTest {

    @Test
    void qualityIncreasesByOneBeforeSellDateTest() {
        Item item = new Item("Aged Brie", 5, 10);

        AgedBrie agedBrie = new AgedBrie(item);
        agedBrie.updateQuality();

        assertEquals(11, item.quality);
        assertEquals(4, item.sellIn);
    }
}
