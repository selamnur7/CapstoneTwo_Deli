package com.ps;

import java.util.ArrayList;
import java.util.List;

public class Chips {
    private String chipName;
    private final float price = 1.50f;

    public static ArrayList<Chips> chipOrder = new ArrayList<>();
    public static List<String> populatingChips() {
        ArrayList<String> chips = new ArrayList<>();
        chips.add("Lays");
        chips.add("Doritos");
        chips.add("Cheetos");
        chips.add("funyuns");
        return chips;
    }
    public static void printChips(){
        List<String> chipOptions = Chips.populatingChips();
        for (String chip : chipOptions) {
            System.out.println(chip);
        }
    }

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
