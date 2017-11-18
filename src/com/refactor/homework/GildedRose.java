package com.refactor.homework;

import java.util.ArrayList;
import java.util.List;


public class GildedRose {

    private static List<Item> items = null;

    public static void main(String[] args) {

        System.out.println("OMGHAI!");

        items = new ArrayList<Item>();
        items.add(new Item("+5 Dexterity Vest", 10, 20));
        items.add(new Item("Aged Brie", 2, 0));
        items.add(new Item("Elixir of the Mongoose", 5, 7));
        items.add(new Item("Sulfuras, Hand of Ragnaros", 0, 80));
        items.add(new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20));
        items.add(new Item("Conjured Mana Cake", 3, 6));

        updateQuality();
    }

    static void addItem(Item item) {
        items = new ArrayList<Item>();
        items.add(item);
    }

    public static void updateQuality() {
        for (Item item : items) {
            String itemName = item.getName();
            if (!"Sulfuras, Hand of Ragnaros".equals(itemName)) {
                item.setSellIn(item.getSellIn() - 1);
            }

            if (("Aged Brie".equals(itemName))) {
                if (item.getQuality() < 50) {
                    item.setQuality(item.getQuality() + 1);
                }
            } else if ("Backstage passes to a TAFKAL80ETC concert".equals(itemName)) {
                if (item.getQuality() < 50) {
                    item.setQuality(item.getQuality() + 1);

                    if (item.getSellIn() < 10) {
                        if (item.getQuality() < 50) {
                            item.setQuality(item.getQuality() + 1);
                        }
                    }

                    if (item.getSellIn() < 5) {
                        if (item.getQuality() < 50) {
                            item.setQuality(item.getQuality() + 1);
                        }
                    }
                }
            } else {
                if (item.getQuality() > 0) {
                    if (!"Sulfuras, Hand of Ragnaros".equals(itemName)) {
                        item.setQuality(item.getQuality() - 1);
                    }
                }
            }


            if ("Aged Brie".equals(itemName)) {
                if (item.getQuality() < 50 && item.getSellIn() < 0) {
                    item.setQuality(item.getQuality() + 1);
                }
            } else if ("Backstage passes to a TAFKAL80ETC concert".equals(itemName)) {
                if (item.getSellIn() < 0) {
                    item.setQuality(0);
                }
            } else {
                if (item.getQuality() > 0 && item.getSellIn() < 0) {
                    if (!"Sulfuras, Hand of Ragnaros".equals(itemName)) {
                        item.setQuality(item.getQuality() - 1);
                    }
                }
            }
        }

    }

}