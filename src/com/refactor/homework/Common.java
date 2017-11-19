package com.refactor.homework;


class Common extends Item {
    Common(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    void updateQuality() {
        this.setSellIn(this.getSellIn() - 1);
        if (this.getQuality() > 0) {
            this.setQuality(this.getQuality() - 1);
        }
        if (this.getQuality() > 0 && this.getSellIn() < 0) {
            this.setQuality(this.getQuality() - 1);
        }
    }

}
