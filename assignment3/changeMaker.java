package assignment3;

import java.util.Scanner;

public class changeMaker {
    public static void main(String[] args) {

        int amount;
        int quarters = 0;
        int dimes = 0;
        int nickles = 0;
        int pennies = 0;

        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Enter the amount you want to change");
            amount = input.nextInt();
        }

        int originalAmount = amount;
        
        // 95
        quarters = amount/25; 
        amount = amount % 25;
        dimes = amount / 10;
        amount = amount % 10;
        nickles = amount / 5;
        amount = amount % 5;
        pennies = amount;

        System.out.println("The amount of " + originalAmount + " can be broken into: ");
        System.out.println("Quarters: " + quarters);
        System.out.println("Dimes: " + dimes);
        System.out.println("Nickles: " + nickles);
        System.out.println("Pennies: " + pennies);    
    }
}

