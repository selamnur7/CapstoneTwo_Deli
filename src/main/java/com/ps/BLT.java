package com.ps;

import java.util.ArrayList;
import java.util.Arrays;

public class BLT extends Sandwich{
    public BLT(String size, String bread, String meats, boolean extraMeat, String cheese, boolean extraCheese, boolean toasted, ArrayList toppings, String sauces, String sides, float price) {
        super(size, bread, meats, extraMeat, cheese, extraCheese, toasted, toppings, sauces, sides, price);
    }

    public BLT() {
        super("8 inch", "White", "Bacon", false, "Cheddar", false, false, new ArrayList<>(Arrays.asList("Lettuce", "Tomatoes")), "Ranch", "No sides", 9.50f);
    }
}
