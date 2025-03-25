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
}
