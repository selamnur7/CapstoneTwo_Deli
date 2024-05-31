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
    private ArrayList toppings;
    private String sauces;
    private String sides;
    private float price;

    public static ArrayList<Sandwich> sandwiches = new ArrayList<>();
    public static List<String> populatingSize() {
        ArrayList<String> sizeOptions = new ArrayList<>();
        sizeOptions.add("4 inch");
        sizeOptions.add("8 inch");
        sizeOptions.add("12 inch");
        return sizeOptions;
    }
    public static List<Float> populatingSizePrices() {
        ArrayList<Float> sizePrices = new ArrayList<>();
        sizePrices.add(5.50f);
        sizePrices.add(7.00f);
        sizePrices.add(8.50f);
        return sizePrices;
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
        meatOptions.add("no meat");
        return meatOptions;
    }
    public static List<Float> populatingMeatPrices() {
        ArrayList<Float> meatPrices = new ArrayList<>();
        meatPrices.add(1.00f);
        meatPrices.add(2.00f);
        meatPrices.add(3.00f);
        return meatPrices;
    }
    public static void printMeats(){
        List<String> meatOptions = Sandwich.populatingMeats();
        for (String meat : meatOptions) {
            System.out.println(meat);
        }
    }
    public static List<Float> populatingExtraMeatPrices() {
        ArrayList<Float> extraMeatPrices = new ArrayList<>();
        extraMeatPrices.add(0.50f);
        extraMeatPrices.add(1.00f);
        extraMeatPrices.add(1.50f);
        return extraMeatPrices;
    }
    public static List<String> populatingCheeses() {
        ArrayList<String> cheeseOptions = new ArrayList<>();
        cheeseOptions.add("American");
        cheeseOptions.add("Provolone");
        cheeseOptions.add("Cheddar");
        cheeseOptions.add("Swiss");
        cheeseOptions.add("no cheese");
        return cheeseOptions;
    }
    public static List<Float> populatingCheesePrices() {
        ArrayList<Float> cheesePrices = new ArrayList<>();
        cheesePrices.add(0.75f);
        cheesePrices.add(1.50f);
        cheesePrices.add(2.25f);
        return cheesePrices;
    }
    public static void printCheeses(){
        List<String> cheeseOptions = Sandwich.populatingCheeses();
        for (String cheese : cheeseOptions) {
            System.out.println(cheese);
        }
    }
    public static List<Float> populatingExtraCheesePrices() {
        ArrayList<Float> extraCheesePrices = new ArrayList<>();
        extraCheesePrices.add(0.30f);
        extraCheesePrices.add(0.60f);
        extraCheesePrices.add(0.90f);
        return extraCheesePrices;
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
        toppingOptions.add("NO toppings");
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
        sauceOptions.add("NO sauces");
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
        sidesOptions.add("NO sides");
        return sidesOptions;
    }
    public static void printSides(){
        List<String> sideOptions = Sandwich.populatingSides();
        for (String side : sideOptions) {
            System.out.println(side);
        }
    }


    public Sandwich(String size, String bread, String meats, boolean extraMeat, String cheese, boolean extraCheese, boolean toasted, ArrayList toppings, String sauces, String sides, float price) {
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

    public ArrayList getToppings() {
        return toppings;
    }

    public void setToppings(ArrayList toppings) {
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
    public String toString() {
        return "Sandwich{" +
                "size='" + size + '\'' +
                ", bread='" + bread + '\'' +
                ", meats='" + meats + '\'' +
                ", extraMeat=" + extraMeat +
                ", cheese='" + cheese + '\'' +
                ", extraCheese=" + extraCheese +
                ", toasted=" + toasted +
                ", toppings=" + toppings +
                ", sauces='" + sauces + '\'' +
                ", sides='" + sides + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public float getTotal() {
        float basePrice = price;
        basePrice = 0.00f;
        switch (this.size.toLowerCase()) {
            case "4 inch":
                basePrice = 5.50f;
                if (!this.meats.equalsIgnoreCase("no meat")){
                    basePrice += 1.00f;
                    if (this.extraMeat){
                        basePrice += 0.50f;
                    }
                }
                if (!this.cheese.equalsIgnoreCase("no cheese")){
                    basePrice += 0.75f;
                    if (this.extraCheese){
                        basePrice += 0.30f;
                    }
                }
                break;
            case "8 inch":
                basePrice = 7.00f;
                if (!this.meats.equalsIgnoreCase("no meat")){
                    basePrice += 2.00f;
                    if (this.extraMeat){
                        basePrice += 1.00f;
                    }
                }
                if (!this.cheese.equalsIgnoreCase("no cheese")){
                    basePrice += 1.50f;
                    if (this.extraCheese){
                        basePrice += 0.60f;
                    }
                }
                break;
            case "12 inch":
                basePrice = 8.50f;
                if (!this.meats.equalsIgnoreCase("no meat")){
                    basePrice += 3.00f;
                    if (this.extraMeat){
                        basePrice += 1.50f;
                    }
                }
                if (!this.cheese.equalsIgnoreCase("no cheese")){
                    basePrice += 2.25f;
                    if (this.extraCheese){
                        basePrice += 0.90f;
                    }
                }
                break;


        }

        return basePrice;
    }
}
