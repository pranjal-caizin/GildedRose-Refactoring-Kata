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

    @Test
    void qualityIncreasesTwiceAfterSellDateTest() {
        Item item = new Item("Aged Brie", 0, 10);
        AgedBrie agedBrie = new AgedBrie(item);

        agedBrie.updateQuality();

        assertEquals(12, item.quality);
        assertEquals(-1, item.sellIn);
    }

    @Test
    void qualityDoesNotExceedFiftyTest() {
        Item item = new Item("Aged Brie", 5, 50);
        AgedBrie agedBrie = new AgedBrie(item);

        agedBrie.updateQuality();

        assertEquals(50, item.quality);
        assertEquals(4, item.sellIn);
    }

    @Test
    void qualityIncreasesButDoesNotExceedFiftyAfterSellDateTest() {
        Item item = new Item("Aged Brie", 0, 49);
        AgedBrie agedBrie = new AgedBrie(item);

        agedBrie.updateQuality();

        assertEquals(50, item.quality);
        assertEquals(-1, item.sellIn);
    }
}
