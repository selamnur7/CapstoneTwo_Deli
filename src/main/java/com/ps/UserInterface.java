package com.ps;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static com.ps.Sandwich.sandwiches;

public class UserInterface {
    private static Scanner scanner = new Scanner(System.in);

    public void display(){
        int mainMenuCommand;
        System.out.println("Welcome to Selam's Sandwiches!");
        do {
            System.out.println("What would you like to purchase?");
            System.out.println("1 for Sandwich, 2 for drink, 3 for chips, or 4 to review order, or 5 to exit:");

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
                    break;

            }
        } while (mainMenuCommand != 5);
    }
    public void processCheckout(){

        System.out.println("Here is your current order of sandwiches");
        for (Sandwich orderSandwich: sandwiches) {
        Order order = new Order(orderSandwich, orderSandwich.getPrice());
            System.out.printf("\"Size:%-7s       Bread:%-7s       Meat:%-7s       Extra Meat:%-7b       Cheese:%-7s" +
                    "       Extra Cheese:%-7b       Toasted:%-7b       Toppings:%-7s       Sauces:%-7s       Sides:%-7s       Price:$%.2f\n",
                    orderSandwich.getSize(), orderSandwich.getBread(), orderSandwich.getMeats(), orderSandwich.isExtraMeat(),
                    orderSandwich.getCheese(), orderSandwich.isExtraCheese(), orderSandwich.isToasted(), String.join(", ", orderSandwich.getToppings()),
                    orderSandwich.getSauces(), orderSandwich.getSides(), orderSandwich.getPrice());
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
        Drink drink = new Drink(drinkName, drinkSize, 2.00f);
        Drink.drinkOrders.add(drink);
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
        Chips.chipOrder.add(chip);
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
