package com.gildedrose;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BackstagePassesTest {
    @Test
    void qualityIncreasesByOneWhenSellDateIsAboveTen() {
        Item item = new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20);
        BackstagePasses backstagePasses = new BackstagePasses(item);

        backstagePasses.updateQuality();

        assertEquals(21, item.quality );
        assertEquals(14, item.sellIn);
    }

    @Test
    void qualityIncreasesByTwoWhenSellDateIsBetweenTenAndSixTest() {
        Item item = new Item("Backstage passes to a TAFKAL80ETC concert", 10, 20);
        BackstagePasses backstagePasses = new BackstagePasses(item);

        backstagePasses.updateQuality();

        assertEquals(22, item.quality);
        assertEquals(9, item.sellIn);
    }

    @Test
    void qualityIncreasesByThreeWhenSellDateIsInBetweenFiveAndOneTest() {
        Item item = new Item("Backstage passes to a TAFKAL80ETC concert", 5, 20);
        BackstagePasses backstagePasses = new BackstagePasses(item);

        backstagePasses.updateQuality();

        assertEquals(23, item.quality);
        assertEquals(4, item.sellIn);
    }

    @Test
    void qualityDropsToZeroAfterConcert() {
        Item item = new Item("Backstage passes to a TAFKAL80ETC concert", 0, 20);
        BackstagePasses backstagePasses = new BackstagePasses(item);

        backstagePasses.updateQuality();

        assertEquals(0, item.quality);
        assertEquals(-1, item.sellIn);
    }

    @Test
    void qualityNeverExceedsFiftyTest() {
        Item item = new Item("Backstage passes to a TAFKAL80ETC concert", 5, 50);
        BackstagePasses backstagePasses = new BackstagePasses(item);

        backstagePasses.updateQuality();

        assertEquals(50, item.quality);
        assertEquals(4, item.sellIn);
    }

    @Test
    void qualityIncreasesButDoesNotExceedFiftyTest() {
        Item item = new Item("Backstage passes to a TAFKAL80ETC concert", 5, 49);
        BackstagePasses backstagePasses = new BackstagePasses(item);

        backstagePasses.updateQuality();

        assertEquals(50, item.quality);
        assertEquals(4, item.sellIn);
    }
}
