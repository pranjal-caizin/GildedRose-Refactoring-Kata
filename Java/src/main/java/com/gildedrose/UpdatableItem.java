package com.gildedrose;

abstract class UpdatableItem {
    Item item;

    public UpdatableItem(Item item) {
        this.item = item;
    }

    abstract void update();
}
