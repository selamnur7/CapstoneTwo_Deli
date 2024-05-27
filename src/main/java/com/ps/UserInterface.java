package com.ps;

import java.util.Scanner;

public class UserInterface {
    private static Scanner scanner = new Scanner(System.in);

    public void display(){
        int mainMenuCommand;
        do {
            System.out.println("Welcome to Selam's Sandwiches!");
            System.out.println("What would you like to purchase?");
            System.out.println("1 for Sandwich, 2 for drink, 3 for chips, or 4 to review order, or 5 to exit:");

            mainMenuCommand = scanner.nextInt();

            switch (mainMenuCommand){
                case 1:
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


}
