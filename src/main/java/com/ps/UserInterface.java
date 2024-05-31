package com.ps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import static com.ps.Chips.chipOrder;
import static com.ps.Drink.drinkOrders;
import static com.ps.Sandwich.sandwiches;

public class UserInterface {
    private static Scanner scanner = new Scanner(System.in);

    public void display(){
        int mainMenuCommand;
        System.out.println("Welcome to Selam's Super Sandwiches!");
        do {
            System.out.println("What would you like to purchase?");
            System.out.println("1 for Sandwich, 2 for drink, 3 for chips, 4 to review order, 5 to Choose one of our signature sandwiches, or 0 to exit:");

            mainMenuCommand = scanner.nextInt();
            scanner.nextLine();

            switch (mainMenuCommand){
                case 1:
                    processMakeSandwich();
                    break;
                case 2:
                    processOrderDrink();
                    break;
                case 3:
                    processOrderChip();
                    break;
                case 4:
                    processCheckout();
                    break;
                case 5:
                    processSignatures();
                    break;
                case 0:
                    break;

            }
        } while (mainMenuCommand != 0);
    }
    public void processCheckout(){
        float totalPrice = 0.00f;

        System.out.println("Here is your current order(s) of sandwiches");
        for (Sandwich orderSandwich: sandwiches) {
            totalPrice += orderSandwich.getPrice();
        Order order = new Order(orderSandwich, orderSandwich.getPrice());
            System.out.printf("\"Size:%-3s       Bread:%-3s       Meat:%-3s       Extra Meat:%-3b       Cheese:%-3s" +
                    "       Extra Cheese:%-3b       Toasted:%-3b       Toppings:%-3s       Sauces:%-3s       Sides:%-3s       Price:$%.2f\n",
                    orderSandwich.getSize(), orderSandwich.getBread(), orderSandwich.getMeats(), orderSandwich.isExtraMeat(),
                    orderSandwich.getCheese(), orderSandwich.isExtraCheese(), orderSandwich.isToasted(), String.join(", ", orderSandwich.getToppings()),
                    orderSandwich.getSauces(), orderSandwich.getSides(), orderSandwich.getPrice());
        }

        System.out.println("Here is your current order(s) of Drinks");
        for (Drink drink: drinkOrders) {
            totalPrice += drink.getPrice();
            Order order = new Order(drink, drink.getPrice());
            System.out.printf("\"Drink Size:%-3s       Drink:%-3s       Price:$%.2f\n",
                    drink.getDrinkSize(),
                    drink.getDrinkName(),
                    drink.getPrice());

        }
        System.out.println("Here is your current order(s) of Chips");
        for (Chips chips: chipOrder) {
            totalPrice += chips.getPrice();
            Order order = new Order(chips, chips.getPrice());
            System.out.printf("\"Chip:%-3s       Price:$%.2f\n",
                    chips.getChipName(),
                    chips.getPrice());
        }
        System.out.println("Your total is: " + totalPrice);
        System.out.println("Would you like to checkout? (Y/N)");
        String userCheckout = scanner.nextLine().trim();

        if (userCheckout.equalsIgnoreCase("Y")){
            Receipt.saveOrder();
            System.out.println("You have been checked out!");
        } else {
            System.out.println("Would you like to remove all items from your order? (Y/N)");
            String userDeleteOrder = scanner.nextLine().trim();
            if (userDeleteOrder.equalsIgnoreCase("Y")){
                sandwiches.clear();
                drinkOrders.clear();
                chipOrder.clear();
                System.out.println("All items removed. Back to main menu");
            } else {
                System.out.println("Back to main menu");
            }
        }

    }
    public void processMakeSandwich(){
        String size = chooseSize();
        String bread = chooseBread();
        String meat = chooseMeat();
        boolean extraMeat = false;

        // handles if user chooses no meat
        if (!meat.equalsIgnoreCase("NO meat")){
            extraMeat = chooseExtraMeat(); // method runs when they choose a meat
        }
        String cheese = chooseCheese();
        boolean extraCheese = false;

        // handles if user chooses no cheese
        if (!cheese.equalsIgnoreCase("NO Cheese")){
            extraCheese = chooseExtraCheese(); // method runs when they choose a cheese
        }
        boolean toasted = chooseToast();
        ArrayList<String> toppings = chooseToppings();
        String sauces = chooseSauce();
        String sides = chooseSides();

        Sandwich sandwich = new Sandwich(size, bread, meat, extraMeat, cheese, extraCheese, toasted,
                toppings, sauces, sides, 0.00f);
        float price = sandwich.getTotal();
        sandwich.setPrice(price);

        sandwiches.add(sandwich);
        sandwich.getTotal();
        System.out.println("Sandwich ordered: " + sandwich);
        System.out.println("Price: " + sandwich.getTotal());

    }
    public void processSignatures(){
        boolean leaveMenu = false;
        while (!leaveMenu) {
        System.out.println("Would you like to: ");
        System.out.println("1. Order a BLT");
        System.out.println("2. Order a Philly Cheese Steak");
        System.out.println("3. Go back to main menu");
        int signatureOption = scanner.nextInt();
        scanner.nextLine();

        switch (signatureOption) {
            case 1:
                bltSignature();
                break;
            case 2:
                phillySignature();
                break;
            case 3:
                System.out.println("Going to the main menu");
                leaveMenu = true;
                break;
            default:
                System.out.println("Returning to main menu...");
                leaveMenu = true;
                break;
        }
        }

    }
    public static BLT bltSignature() {
        System.out.println("Would you like to try one of our signature BLT's?(Y/N)");
        String signatureOption = scanner.nextLine();
        BLT newBLT = null;
        if (signatureOption.equalsIgnoreCase("Y")) {
            newBLT = new BLT();
            sandwiches.add(newBLT);
            System.out.println("BLT Ordered!");
        }
        return newBLT;
    }
    public static PhillyCheeseSteak phillySignature() {
        System.out.println("Would you like to try one of our signature Philly Cheese Steak's?(Y/N)");
        String signatureOption = scanner.nextLine();
        PhillyCheeseSteak newPhilly = null;
        if (signatureOption.equalsIgnoreCase("Y")) {
            newPhilly = new PhillyCheeseSteak();
            sandwiches.add(newPhilly);
            System.out.println("Philly Cheese Steak Ordered!");
        }
        return newPhilly;
    }
    public static String chooseSize(){
        boolean validSize = false;
        String customerSize = "";
        Sandwich.printSize();
        while (!validSize) {
            System.out.println("Which size sandwich would you like?");
            customerSize = scanner.nextLine();


            List<String> deliSize = Sandwich.populatingSize();
            for (String size : deliSize) {
                if (customerSize.equalsIgnoreCase(size)) {
                    System.out.println("You have selected a " + customerSize + " Sandwich");
                    validSize = true;
                    break;
                }
            }
            if (!validSize) {
                System.out.println("Please choose one of our Sizes");
            }
        }
        return customerSize;
    }
    public static String chooseBread(){
        boolean validBread = false;
        String customerBread = "";
        Sandwich.printBreads();
        while (!validBread) {
            System.out.println("Which type of bread would you like?");
            customerBread = scanner.nextLine();


            List<String> deliBread = Sandwich.populatingBreads();
            for (String bread : deliBread) {
                if (customerBread.equalsIgnoreCase(bread)) {
                    System.out.println("You have selected a " + customerBread + " Sandwich");
                    validBread = true;
                    break;
                }
            }
            if (!validBread) {
                System.out.println("Please choose one of the breads we have in store");
            }
        }
        return customerBread;
    }
    public static String chooseMeat(){
        boolean validMeat = false;
        String customerMeat = "";
        Sandwich.printMeats();
        while (!validMeat) {
            System.out.println("Which Meat would you like?");
            customerMeat = scanner.nextLine();


            List<String> deliMeats = Sandwich.populatingMeats();
            for (String meats : deliMeats) {
                if (customerMeat.equalsIgnoreCase(meats)) {
                    System.out.println(customerMeat + " added!");
                    validMeat = true;
                    break;
                }
            }
            if (!validMeat) {
                System.out.println("Please choose one of our meats");
            }
        }
        return customerMeat;
    }
    public static boolean chooseExtraMeat() {
        System.out.println("Would you like extra meat? (Y/N)");
        boolean extraMeat = false;
        String customerExtraMeat = scanner.nextLine();

        if (customerExtraMeat.equalsIgnoreCase("Y")) {
            System.out.println("Extra Meat added!");
            extraMeat = true;
        } else if (customerExtraMeat.equalsIgnoreCase("N")) {
            System.out.println("No extra Meat added");
            extraMeat = false;
        } else {
            System.out.println("Please Choose (Y)es or (N)o");
            do {
                customerExtraMeat = scanner.nextLine();
                if (customerExtraMeat.equalsIgnoreCase("Y")) {
                    System.out.println("Extra Meat added!");
                    extraMeat = true;
                } else if (customerExtraMeat.equalsIgnoreCase("N")) {
                    System.out.println("No extra Meat added");
                    extraMeat = false;
                }
            } while (!customerExtraMeat.equalsIgnoreCase("Y") && !customerExtraMeat.equalsIgnoreCase("N"));
        }
        return extraMeat;
    }

    public static String chooseCheese(){
        boolean validCheese = false;
        String customerCheese = "";
        Sandwich.printCheeses();
        while (!validCheese) {
            System.out.println("Which cheese would you like?");
            customerCheese = scanner.nextLine();


            List<String> deliCheese = Sandwich.populatingCheeses();
            for (String cheese : deliCheese) {
                if (customerCheese.equalsIgnoreCase(cheese)) {
                    System.out.println(customerCheese + " added!");
                    validCheese = true;
                    break;
                }
            }
            if (!validCheese) {
                System.out.println("Please choose one of our cheeses");
            }
        }
        return customerCheese;
    }
    public static boolean chooseExtraCheese() {
        System.out.println("Would you like extra Cheese? (Y/N)");
        boolean extraCheese = false;
        String customerExtraCheese = scanner.nextLine();

        if (customerExtraCheese.equalsIgnoreCase("Y")) {
            System.out.println("Extra cheese added!");
            extraCheese = true;
        } else if (customerExtraCheese.equalsIgnoreCase("N")) {
            System.out.println("No extra cheese added");
            extraCheese = false;
        } else {
            System.out.println("Please Choose (Y)es or (N)o");
            do {
                customerExtraCheese = scanner.nextLine();
                if (customerExtraCheese.equalsIgnoreCase("Y")) {
                    System.out.println("Extra cheese added!");
                    extraCheese = true;
                } else if (customerExtraCheese.equalsIgnoreCase("N")) {
                    System.out.println("No extra cheese added");
                    extraCheese = false;
                }
            } while (!customerExtraCheese.equalsIgnoreCase("Y") && !customerExtraCheese.equalsIgnoreCase("N"));
        }
        return extraCheese;
    }
    public static boolean chooseToast() {
        System.out.println("Would you like your sandwich toasted? (Y/N)");
        boolean toasted = false;
        String customerToasted = scanner.nextLine();

        if (customerToasted.equalsIgnoreCase("Y")) {
            System.out.println("Will do!");
            toasted = true;
        } else if (customerToasted.equalsIgnoreCase("N")) {
            System.out.println("No toast");
            toasted = false;
        } else {
            System.out.println("Please Choose (Y)es or (N)o");
            while (!customerToasted.equalsIgnoreCase("Y") | customerToasted.equalsIgnoreCase("N"))
                customerToasted = scanner.nextLine();
        }
        return toasted;
    }
    public static ArrayList<String> chooseToppings() {
        ArrayList<String> selectedToppings = new ArrayList<>();
        boolean addMoreToppings = true;

        Sandwich.printToppings();
        List<String> deliTopping = Sandwich.populatingToppings();

        while (addMoreToppings) {

            System.out.println("Which topping would you like?");
            String customerTopping = scanner.nextLine().trim();  // Trim whitespace

            if (deliTopping.contains(customerTopping)) {
                if (!selectedToppings.contains(customerTopping)) {
                    selectedToppings.add(customerTopping);
                    System.out.println(customerTopping + " added!");
                } else {
                    System.out.println("You already selected " + customerTopping);
                }
            } else {
                System.out.println("Please choose one of our toppings");
            }

            System.out.println("Would you like to add another topping? (Y/N)");
            String moreToppings = scanner.nextLine().trim();  // Trim whitespace and handle case
            if (!moreToppings.equalsIgnoreCase("Y")) {
                addMoreToppings = false;
            }
        }
        return selectedToppings;
    }
    public static String chooseSauce(){
        boolean validSauce = false;
        String customerSauce = "";
        Sandwich.printSauces();
        while (!validSauce) {
            System.out.println("Which sauce would you like?");
            customerSauce = scanner.nextLine();


            List<String> deliSauce = Sandwich.populatingSauces();
            for (String sauce : deliSauce) {
                if (customerSauce.equalsIgnoreCase(sauce)) {
                    System.out.println(customerSauce + " added!");
                    validSauce = true;
                    break;
                }
            }
            if (!validSauce) {
                System.out.println("Please choose one of our sauces");
            }
        }
        return customerSauce;
    }
    public static String chooseSides(){
        boolean validSides = false;
        String customerSide = "";
        Sandwich.printSides();
        while (!validSides) {
            System.out.println("Which sides would you like?");
            customerSide = scanner.nextLine();


            List<String> deliSide = Sandwich.populatingSides();
            for (String side : deliSide) {
                if (customerSide.equalsIgnoreCase(side)) {
                    System.out.println(customerSide + " added!");
                    validSides = true;
                    break;
                }
            }
            if (!validSides) {
                System.out.println("Please choose one of our sides");
            }
        }
        return customerSide;
    }
    public void processOrderDrink(){
        String drinkName = orderDrink();
        String drinkSize = orderDrinkSize();
        Drink drink = new Drink(drinkName, drinkSize, 0.00f);
        float price = drink.getTotal();
        drink.setPrice(price);
        drinkOrders.add(drink);
        System.out.println("Drink ordered: " + drink);

    }

    public static String orderDrink(){
        boolean validDrink = false;
        String customerDrink = "";
        Drink.printDrinks();
        while (!validDrink) {
            System.out.println("Which fountain drink would you like?");
            customerDrink = scanner.nextLine();


            List<String> deliDrinks = Drink.populatingDrinks();
            for (String drink : deliDrinks) {
                if (customerDrink.equalsIgnoreCase(drink)) {
                    System.out.println(customerDrink + " added!");
                    validDrink = true;
                    break;
                }
            }
            if (!validDrink) {
                System.out.println("Please choose one of the drinks that we offer");
            }
        }
        return customerDrink;
    }
    public static String orderDrinkSize(){
        System.out.println("What size drink would you like? ");
        boolean validSize = false;
        String customerSize = "";
        Drink.printSize();
        while (!validSize) {
            System.out.println("Which size drink would you like?");
            customerSize = scanner.nextLine();


            List<String> deliSize = Drink.populatingDrinkSize();
            for (String size : deliSize) {
                if (customerSize.equalsIgnoreCase(size)) {
                    System.out.println("You have selected a " + customerSize + " Drink");
                    validSize = true;
                    break;
                }
            }
            if (!validSize) {
                System.out.println("Please choose one of our Sizes");
            }
        }
        return customerSize;
    }
    public void processOrderChip(){
        String chipName = userChip();
        Chips chip = new Chips(chipName);
        chipOrder.add(chip);
        System.out.println("Chip ordered: " + chip);
    }
    public static String userChip(){
        boolean validChip = false;
        String customerChip = "";
        Chips.printChips();
        while (!validChip) {
            System.out.println("Which type of chip would you like?");
            customerChip = scanner.nextLine();


            List<String> deliChips = Chips.populatingChips();
            for (String chip : deliChips) {
                if (customerChip.equalsIgnoreCase(chip)) {
                    System.out.println(customerChip + " added!");
                    validChip = true;
                    break;
                }
            }
            if (!validChip) {
                System.out.println("Please choose one of the chips that we offer");
            }
        }
        return customerChip;
    }



}
