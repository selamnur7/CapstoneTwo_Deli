package com.ps;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Random;

import static com.ps.Chips.chipOrder;
import static com.ps.Drink.drinkOrders;
import static com.ps.Sandwich.sandwiches;

public class Receipt {
    public static void saveOrder() {
        try {

            LocalDate thisDay = LocalDate.now();
            String receiptDate = thisDay.toString();
            LocalTime thisTime = LocalTime.now();
            String receiptTime = thisTime.toString();
            Random rand = new Random();
            int orderNumber = rand.nextInt(9001);

            String fileName = "Number " + orderNumber + ".csv";
            BufferedWriter bufWriter = new BufferedWriter(new FileWriter(fileName));

            for (Sandwich orderSandwich: sandwiches) {
                bufWriter.write(String.format("Day:%s|Time:%s|Size:%s|Bread:%s|Meat:%-3s|Extra Meat:%b|Cheese:%s|Extra Cheese:%b|Toasted:%b|Toppings:%s|Sauces:%s|Sides:%s|Price:$%.2f\n",
                        receiptDate, receiptTime , orderSandwich.getSize(), orderSandwich.getBread(), orderSandwich.getMeats(), orderSandwich.isExtraMeat(),
                        orderSandwich.getCheese(), orderSandwich.isExtraCheese(), orderSandwich.isToasted(), String.join(", ", orderSandwich.getToppings()),
                        orderSandwich.getSauces(), orderSandwich.getSides(), orderSandwich.getPrice()));
            }
            for (Drink drink: drinkOrders) {
                bufWriter.write(String.format("Drink Size:%s|Drink:%s|Price:$%.2f\n",
                        drink.getDrinkSize(),
                        drink.getDrinkName(),
                        drink.getPrice()));

            }
            for (Chips chips: chipOrder) {
                bufWriter.write(String.format("Chip:%s|Price:$%.2f\n",
                        chips.getChipName(),
                        chips.getPrice()));
            }
            bufWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
