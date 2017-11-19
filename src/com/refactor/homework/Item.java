package com.refactor.homework;

public abstract class Item {
    public static final String AGED_BRIE = "Aged Brie";
    public static final String BACKSTAGE_PASSES_TO_A_TAFKAL80_ETC_CONCERT = "Backstage passes to a TAFKAL80ETC concert";
    public static final String SULFURAS_HAND_OF_RAGNAROS = "Sulfuras, Hand of Ragnaros";
    private String name;
    private int sellIn;
    private int quality;

    Item(String name, int sellIn, int quality) {
        this.setName(name);
        this.setSellIn(sellIn);
        this.setQuality(quality);
    }

    public static Item createItem(String name, int sellIn, int quality) {
        switch (name) {
            case AGED_BRIE:
                return new AgedBrie(name, sellIn, quality);
            case BACKSTAGE_PASSES_TO_A_TAFKAL80_ETC_CONCERT:
                return new BackstagePasses(name, sellIn, quality);
            case SULFURAS_HAND_OF_RAGNAROS:
                return new Sulfuras(name, sellIn, quality);
            default:
                return new Common(name, sellIn, quality);
        }
    }

    abstract void updateQuality();

    /* Generated getter and setter code */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSellIn() {
        return sellIn;
    }

    public void setSellIn(int sellIn) {
        this.sellIn = sellIn;
    }

    public int getQuality() {
        return quality;
    }

    public void setQuality(int quality) {
        this.quality = quality;
    }
}
