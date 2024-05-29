package com.ps;

import java.util.ArrayList;
import java.util.List;

public class Sandwich implements Total{
    private String size;
    private String bread;
    private String meats;
    private boolean extraMeat;
    private String cheese;
    private boolean extraCheese;
    private boolean toasted;
    private String toppings;
    private String sauces;
    private String sides;
    private float price;

    public ArrayList<Sandwich> sandwiches = new ArrayList<>();
    public static List<String> populatingSize() {
        ArrayList<String> sizeOptions = new ArrayList<>();
        sizeOptions.add("Small");
        sizeOptions.add("Medium");
        sizeOptions.add("Large");
        return sizeOptions;
    }
    public static void printSize(){
        List<String> sizeOptions = Sandwich.populatingSize();
        for (String size : sizeOptions) {
            System.out.println(size);
        }
    }
    public static List<String> populatingBreads() {
        ArrayList<String> breadOptions = new ArrayList<>();
        breadOptions.add("White");
        breadOptions.add("Wheat");
        breadOptions.add("Rye");
        breadOptions.add("Wrap");
        return breadOptions;
    }
    public static void printBreads(){
        List<String> breadOptions = Sandwich.populatingBreads();
        for (String bread : breadOptions) {
            System.out.println(bread);
        }
    }
    public static List<String> populatingMeats() {
        ArrayList<String> meatOptions = new ArrayList<>();
        meatOptions.add("Steak");
        meatOptions.add("Ham");
        meatOptions.add("Salami");
        meatOptions.add("Roast Beef");
        meatOptions.add("Chicken");
        meatOptions.add("Bacon");
        return meatOptions;
    }
    public static void printMeats(){
        List<String> meatOptions = Sandwich.populatingMeats();
        for (String meat : meatOptions) {
            System.out.println(meat);
        }
    }
    public static List<String> populatingCheeses() {
        ArrayList<String> cheeseOptions = new ArrayList<>();
        cheeseOptions.add("American");
        cheeseOptions.add("Provolone");
        cheeseOptions.add("Cheddar");
        cheeseOptions.add("Swiss");
        return cheeseOptions;
    }
    public static void printCheeses(){
        List<String> cheeseOptions = Sandwich.populatingCheeses();
        for (String cheese : cheeseOptions) {
            System.out.println(cheese);
        }
    }
    public static List<String> populatingToppings() {
        ArrayList<String> toppingOptions = new ArrayList<>();
        toppingOptions.add("Lettuce");
        toppingOptions.add("Peppers");
        toppingOptions.add("Onions");
        toppingOptions.add("Tomatoes");
        toppingOptions.add("Jalapenos");
        toppingOptions.add("Cucumbers");
        toppingOptions.add("Pickles");
        toppingOptions.add("Guacamole");
        toppingOptions.add("Mushrooms");
        return toppingOptions;
    }
    public static void printToppings(){
        List<String> toppingOptions = Sandwich.populatingToppings();
        for (String topping : toppingOptions) {
            System.out.println(topping);
        }
    }
    public static List<String> populatingSauces() {
        ArrayList<String> sauceOptions = new ArrayList<>();
        sauceOptions.add("Mayo");
        sauceOptions.add("Mustard");
        sauceOptions.add("Ketchup");
        sauceOptions.add("Ranch");
        sauceOptions.add("Thousand Islands");
        sauceOptions.add("Vinaigrette");
        return sauceOptions;
    }
    public static void printSauces(){
        List<String> sauceOptions = Sandwich.populatingSauces();
        for (String sauce : sauceOptions) {
            System.out.println(sauce);
        }
    }
    public static List<String> populatingSides() {
        ArrayList<String> sidesOptions = new ArrayList<>();
        sidesOptions.add("Au jus");
        sidesOptions.add("Sauce");
        return sidesOptions;
    }
    public static void printSides(){
        List<String> sideOptions = Sandwich.populatingSides();
        for (String side : sideOptions) {
            System.out.println(side);
        }
    }


    public Sandwich(String size, String bread, String meats, boolean extraMeat, String cheese, boolean extraCheese, boolean toasted, String toppings, String sauces, String sides, float price, ArrayList<Sandwich> sandwiches) {
        this.size = size;
        this.bread = bread;
        this.meats = meats;
        this.extraMeat = extraMeat;
        this.cheese = cheese;
        this.extraCheese = extraCheese;
        this.toasted = toasted;
        this.toppings = toppings;
        this.sauces = sauces;
        this.sides = sides;
        this.price = price;
        this.sandwiches = sandwiches;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getBread() {
        return bread;
    }

    public void setBread(String bread) {
        this.bread = bread;
    }

    public String getMeats() {
        return meats;
    }

    public void setMeats(String meats) {
        this.meats = meats;
    }

    public boolean isExtraMeat() {
        return extraMeat;
    }

    public void setExtraMeat(boolean extraMeat) {
        this.extraMeat = extraMeat;
    }

    public String getCheese() {
        return cheese;
    }

    public void setCheese(String cheese) {
        this.cheese = cheese;
    }

    public boolean isExtraCheese() {
        return extraCheese;
    }

    public void setExtraCheese(boolean extraCheese) {
        this.extraCheese = extraCheese;
    }

    public boolean isToasted() {
        return toasted;
    }

    public void setToasted(boolean toasted) {
        this.toasted = toasted;
    }

    public String getToppings() {
        return toppings;
    }

    public void setToppings(String toppings) {
        this.toppings = toppings;
    }

    public String getSauces() {
        return sauces;
    }

    public void setSauces(String sauces) {
        this.sauces = sauces;
    }

    public String getSides() {
        return sides;
    }

    public void setSides(String sides) {
        this.sides = sides;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public ArrayList<Sandwich> getSandwiches() {
        return sandwiches;
    }

    public void setSandwiches(ArrayList<Sandwich> sandwiches) {
        this.sandwiches = sandwiches;
    }

    @Override
    public float getTotal() {
            return this.getPrice();
    }
}
