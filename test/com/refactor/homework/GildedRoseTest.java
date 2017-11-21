package com.refactor.homework;

import org.junit.Test;

import static org.junit.Assert.*;

public class GildedRoseTest {

    @Test
    public void once_the_sell_by_date_has_passed_Quality_degrades_twice_as_fast() {
        Item item = Item.create("+5 Dexterity Vest", 0, 10);
        GildedRose.addItem(item);
        GildedRose.updateQuality();

        assertEquals(8, item.getQuality());
    }

    @Test
    public void the_Quality_of_an_item_is_never_negative(){
        Item item = Item.create("+5 Dexterity Vest", 0, 0);
        GildedRose.addItem(item);
        GildedRose.updateQuality();

        assertEquals(0, item.getQuality());
    }

    @Test
    public void Aged_Brie_actually_increases_in_Quality_the_older_it_gets(){
        Item item = Item.create("Aged Brie", 1, 0);
        GildedRose.addItem(item);
        GildedRose.updateQuality();

        assertEquals(1, item.getQuality());
    }

    @Test
    public void the_Quality_of_an_item_is_never_more_than_50(){
        Item item = Item.create("Aged Brie", 1, 50);
        GildedRose.addItem(item);
        GildedRose.updateQuality();

        assertEquals(50, item.getQuality());
    }

    @Test
    public void Sulfuras_being_a_legendary_item_never_has_to_be_sold_or_decreases_in_Quality(){
        Item item = Item.create("Sulfuras, Hand of Ragnaros", 5, 10);
        GildedRose.addItem(item);
        GildedRose.updateQuality();

        assertEquals(5, item.getSellIn());
        assertEquals(10, item.getQuality());
    }

    @Test
    public void Backstage_passes_Quality_increases_in_Quality_as_its_SellIn_value_approaches(){
        Item item = Item.create("Backstage passes to a TAFKAL80ETC concert", 15, 10);
        GildedRose.addItem(item);
        GildedRose.updateQuality();

        assertEquals(14, item.getSellIn());
        assertEquals(11, item.getQuality());
    }

    @Test
    public void Backstage_passes_Quality_increases_2_when_there_are_10_days_or_less(){
        Item item = Item.create("Backstage passes to a TAFKAL80ETC concert", 10, 10);
        GildedRose.addItem(item);
        GildedRose.updateQuality();

        assertEquals(9, item.getSellIn());
        assertEquals(12, item.getQuality());
    }

    @Test
    public void Backstage_passes_Quality_increases_3_when_there_are_3_days_or_less(){
        Item item = Item.create("Backstage passes to a TAFKAL80ETC concert", 4, 10);
        GildedRose.addItem(item);
        GildedRose.updateQuality();

        assertEquals(3, item.getSellIn());
        assertEquals(13, item.getQuality());
    }

    @Test
    public void Backstage_passes_Quality_drops_to_0_after_the_concert(){
        Item item = Item.create("Backstage passes to a TAFKAL80ETC concert", 0, 10);
        GildedRose.addItem(item);
        GildedRose.updateQuality();

        assertEquals(-1, item.getSellIn());
        assertEquals(0, item.getQuality());
    }
}