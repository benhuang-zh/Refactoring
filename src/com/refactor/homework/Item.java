package com.refactor.homework;

public class Item {
    public String name;
	public int sellIn; 
    public int quality; 
    
    public Item(String name, int sellIn, int quality) {
		this.setName(name);
		this.setSellIn(sellIn);
		this.setQuality(quality);
	}

	void updateQuality() {
		String itemName = this.getName();
        if (("Aged Brie".equals(itemName))) {
            this.setSellIn(this.getSellIn() - 1);
			if (this.getQuality() < 50) {
                this.setQuality(this.getQuality() + 1);
            }
			if (this.getQuality() < 50 && this.getSellIn() < 0) {
                this.setQuality(this.getQuality() + 1);
            }
		} else if ("Backstage passes to a TAFKAL80ETC concert".equals(itemName)) {
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
		} else if ("Sulfuras, Hand of Ragnaros".equals(itemName)) {
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
