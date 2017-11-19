package com.refactor.homework;

import java.util.ArrayList;
import java.util.List;


public class GildedRose {

    private static List<Item> items = null;

    public static void main(String[] args) {

        System.out.println("OMGHAI!");

        items = new ArrayList<Item>();
        items.add(Item.createItem("+5 Dexterity Vest", 10, 20));
        items.add(Item.createItem("Aged Brie", 2, 0));
        items.add(Item.createItem("Elixir of the Mongoose", 5, 7));
        items.add(Item.createItem("Sulfuras, Hand of Ragnaros", 0, 80));
        items.add(Item.createItem("Backstage passes to a TAFKAL80ETC concert", 15, 20));
        items.add(Item.createItem("Conjured Mana Cake", 3, 6));

        updateQuality();
    }

    static void addItem(Item item) {
        items = new ArrayList<Item>();
        items.add(item);
    }

    public static void updateQuality() {
        for (Item item : items) {
            item.updateQuality();
        }

    }

}