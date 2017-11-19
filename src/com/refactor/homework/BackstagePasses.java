package com.refactor.homework;


class BackstagePasses extends Item {
    BackstagePasses(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    void updateQuality() {
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
    }
}
