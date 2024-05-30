package com.ps;

import java.util.ArrayList;
import java.util.List;

public class Drink implements Total{
    private String drinkName;
    private String drinkSize;
    private float price;

    public static ArrayList<Drink> drinkOrders = new ArrayList<>();
    public static List<String> populatingDrinks() {
        ArrayList<String> drinks = new ArrayList<>();
        drinks.add("Lemonade");
        drinks.add("Fruit punch");
        drinks.add("Ice tea");
        drinks.add("Strawberry Lemonade");
        return drinks;
    }
    public static void printDrinks(){
        List<String> drinkOptions = Drink.populatingDrinks();
        for (String drink : drinkOptions) {
            System.out.println(drink);
        }
    }
    public static List<String> populatingDrinkSize() {
        ArrayList<String> drinkSizeOptions = new ArrayList<>();
        drinkSizeOptions.add("4 inch");
        drinkSizeOptions.add("8 inch");
        drinkSizeOptions.add("12 inch");
        return drinkSizeOptions;
    }
    public static void printSize(){
        List<String> drinkSizeOptions = Drink.populatingDrinkSize();
        for (String size : drinkSizeOptions) {
            System.out.println(size);
        }
    }
    public Drink(String drinkName, String drinkSize, float price) {
        this.drinkName = drinkName;
        this.drinkSize = drinkSize;
        this.price = price;
    }

    public String getDrinkName() {
        return drinkName;
    }

    public void setDrinkName(String drinkName) {
        this.drinkName = drinkName;
    }

    public String getDrinkSize() {
        return drinkSize;
    }

    public void setDrinkSize(String drinkSize) {
        this.drinkSize = drinkSize;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Drink{" +
                "drinkName='" + drinkName + '\'' +
                ", drinkSize='" + drinkSize + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public float getTotal() {
        return this.getPrice();
    }
}
