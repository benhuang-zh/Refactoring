package com.refactor.homework;


public class BackstagePasses extends Item {
    public BackstagePasses(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }
    void updateQuality() {
        String itemName = this.getName();
        if ((AGED_BRIE.equals(itemName))) {
            this.setSellIn(this.getSellIn() - 1);
            if (this.getQuality() < 50) {
                this.setQuality(this.getQuality() + 1);
            }
            if (this.getQuality() < 50 && this.getSellIn() < 0) {
                this.setQuality(this.getQuality() + 1);
            }
        } else if (BACKSTAGE_PASSES_TO_A_TAFKAL80_ETC_CONCERT.equals(itemName)) {
            this.setSellIn(this.getSellIn() - 1);
            if (this.getQuality() < 50) {
                this.setQuality(this.getQuality() + 1);

                if (this.getSellIn() < 10) {
                    if (this.getQuality() < 50) {
                        this.setQuality(this.getQuality() + 1);
                    }
                }

                if (this.getSellIn() < 5) {
                    if (this.getQuality() < 50) {
                        this.setQuality(this.getQuality() + 1);
                    }
                }
            }
            if (this.getSellIn() < 0) {
                this.setQuality(0);
            }
        } else if (SULFURAS_HAND_OF_RAGNAROS.equals(itemName)) {
        } else {
            this.setSellIn(this.getSellIn() - 1);
            if (this.getQuality() > 0) {
                this.setQuality(this.getQuality() - 1);
            }
            if (this.getQuality() > 0 && this.getSellIn() < 0) {
                this.setQuality(this.getQuality() - 1);
            }
        }
    }
}
