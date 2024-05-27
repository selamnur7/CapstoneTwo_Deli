package com.ps;

public class Order {
    private Sandwich sandwich;
    private Drink drink;
    private Chips chips;
    private float price;

    public Order(Sandwich sandwich, Drink drink, Chips chips, float price) {
        this.sandwich = sandwich;
        this.drink = drink;
        this.chips = chips;
        this.price = price;
    }
    public Order(Sandwich sandwich, Chips chips, float price) {
        this.sandwich = sandwich;
        this.chips = chips;
        this.price = price;
    }
    public Order(Sandwich sandwich, Drink drink, float price) {
        this.sandwich = sandwich;
        this.drink = drink;
        this.price = price;
    }
    public Order(Sandwich sandwich, float price) {
        this.sandwich = sandwich;
        this.price = price;
    }

}
