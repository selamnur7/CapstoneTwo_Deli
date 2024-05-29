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
        Sandwich.printSize();
        System.out.println("How big would you like your sandwich to be?");
        String customerSize = scanner.nextLine();
        if (!customerSize.equalsIgnoreCase("Small")
                || !customerSize.equalsIgnoreCase("Medium")
                || !customerSize.equalsIgnoreCase("Large")){
            System.out.println("Pick a size please");
            customerSize = scanner.nextLine();
        }
    }


}
