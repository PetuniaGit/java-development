package com.pluralsight;

import java.util.Scanner;

public class PayrollCalculator {
    public static void main(String[] args) {
        System.out.println("Enter Your Name");
        Scanner scan=new Scanner(System.in);
        String name= scan.nextLine();
        System.out.println("enter hours worked");
        double hoursw =scan.nextDouble();
        System.out.println("enter pay rate");
        double payrate =scan.nextDouble();
        System.out.println("Name:"+ name +" Pay:" + payrate*hoursw);
    }
}
