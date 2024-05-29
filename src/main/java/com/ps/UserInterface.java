package com.ps;

import java.util.List;
import java.util.Scanner;

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
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;

            }
        } while (mainMenuCommand != 5);
    }
    public void processMakeSandwich(){
        chooseSize();
        chooseBread();
        chooseMeat();
        chooseCheese();
        chooseToppings();
        chooseSauce();
        chooseSides();
    }
    public static void chooseSize(){
        boolean validSize = false;
        Sandwich.printSize();
        while (!validSize) {
            System.out.println("Which size sandwich would you like?");
            String customerSize = scanner.nextLine();


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
    }
    public static void chooseBread(){
        boolean validBread = false;
        Sandwich.printBreads();
        while (!validBread) {
            System.out.println("Which type of bread would you like?");
            String customerBread = scanner.nextLine();


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
    }
    public static void chooseMeat(){
        boolean validMeat = false;
        Sandwich.printMeats();
        while (!validMeat) {
            System.out.println("Which Meat would you like?");
            String customerMeat = scanner.nextLine();


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
    }
    public static void chooseCheese(){
        boolean validCheese = false;
        Sandwich.printCheeses();
        while (!validCheese) {
            System.out.println("Which cheeze would you like?");
            String customerCheese = scanner.nextLine();


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
    }
    public static void chooseToppings(){
        boolean validToppings = false;
        Sandwich.printToppings();
        while (!validToppings) {
            System.out.println("Which topping would you like?");
            String customerTopping = scanner.nextLine();


            List<String> deliTopping = Sandwich.populatingToppings();
            for (String topping : deliTopping) {
                if (customerTopping.equalsIgnoreCase(topping)) {
                    System.out.println(customerTopping + " added!");
                    validToppings = true;
                    break;
                }
            }
            if (!validToppings) {
                System.out.println("Please choose one of our toppings");
            }
        }
    }
    public static void chooseSauce(){
        boolean validSauce = false;
        Sandwich.printSauces();
        while (!validSauce) {
            System.out.println("Which sauce would you like?");
            String customerSauce = scanner.nextLine();


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
    }
    public static void chooseSides(){
        boolean validSides = false;
        Sandwich.printSides();
        while (!validSides) {
            System.out.println("Which sides would you like?");
            String customerSide = scanner.nextLine();


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
    }


}
