package com.ps;

public class Drink implements Total{
    private String drinkName;
    private String drinkSize;
    private float price;

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
