package com.ps;

public class Chips {
    private String chipName;
    private final float price = 1.50f;

    public Chips(String chipName) {
        this.chipName = chipName;
    }

    public String getChipName() {
        return chipName;
    }

    public void setChipName(String chipName) {
        this.chipName = chipName;
    }

    public float getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Chips{" +
                "chipName='" + chipName + '\'' +
                ", price=" + price +
                '}';
    }
}
