/*
 *  UCF COP3330 Fall 2021 Assignment 20 Solution
 *  Copyright 2021 Christine Hawkins
 */

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        System.out.println("What is the order amount? ");
        double amount = input.nextDouble();

        System.out.println("What state do you live in? ");
        String state = input.next();

        double tax;
        double total;
        if (state.equalsIgnoreCase("wisconsin")) {
            System.out.println("What county do you live in? ");
            String county = input.next();
            if (county.equalsIgnoreCase("Eau Claire")) {
                tax = 0.505;
                total = tax + amount;
                System.out.printf("The tax is: $%.2f%n", tax);
                System.out.printf("The total is: $%.2f%n", total);
            } else if (county.equalsIgnoreCase("Dunn")) {
                tax = 0.504;
                total = tax+amount;
                System.out.printf("The tax is: $%.2f%n", tax);
                System.out.printf("The total is: $%.2f%n", total);
            }else{
                tax = 0.5;
                total = tax+amount;
                System.out.printf("The tax is: $%.2f%n", tax);
                System.out.printf("The total is: $%.2f%n", total);
            }
        }else if (state.equalsIgnoreCase("Illinois")) {
            tax = 0.8;
            total = amount + tax;
            System.out.printf("The tax is: $%.2f%n", tax);
            System.out.printf("The total is: $%.2f%n", total);
        } else {
            tax = 0.0;
            total = amount;
            System.out.printf("The tax is: $%.2f%n", tax);
            System.out.printf("The total is: $%.2f%n", total);
        }


    }
}

