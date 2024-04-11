package com.pluralsight;

import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("enter a number");
        double num1 = scan.nextDouble();
        System.out.println("enter another number");
        double num2 = scan.nextDouble();
        System.out.println("Choose A,S,M or D");
        String letter1 = scan.next();

        if (letter1.equals( "A")) {
            System.out.println(num1 + num2);
        } else if (letter1.equals( "S")) {
            System.out.println(num1 - num2);
        } else if (letter1.equals("M")) {
            System.out.println(num1 * num2);
        } else if (letter1.equals( "D")) {
            System.out.println(num1 / num2);
        } else {
            System.out.println("invalid input");

        }

    }
}

