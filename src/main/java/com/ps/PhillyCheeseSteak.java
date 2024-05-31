package com.ps;

import java.util.ArrayList;
import java.util.Arrays;

public class PhillyCheeseSteak extends Sandwich{
    public PhillyCheeseSteak(String size, String bread, String meats, boolean extraMeat, String cheese, boolean extraCheese, boolean toasted, ArrayList toppings, String sauces, String sides, float price) {
        super(size, bread, meats, extraMeat, cheese, extraCheese, toasted, toppings, sauces, sides, price);
    }

    public PhillyCheeseSteak() {
        super("8 inch", "White", "Steak", true, "American Cheese", true, true, new ArrayList<>(Arrays.asList("Peppers")), "Mayo", "no sides", 11.00f);
    }
}
