package com.ps;

import java.util.ArrayList;

public class Order {
    private Sandwich sandwich;
    private Drink drink;
    private Chips chips;
    private float price;

    public static ArrayList<Order> orders = new ArrayList<>();
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

    @Override
    public String toString() {
        return "Order{" +
                "sandwich=" + sandwich +
                ", drink=" + drink +
                ", chips=" + chips +
                ", price=" + price +
                '}';
    }
}
