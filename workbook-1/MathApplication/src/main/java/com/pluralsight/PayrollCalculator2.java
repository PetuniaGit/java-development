package com.pluralsight;

import java.util.Scanner;

public class PayrollCalculator2 {
    public static void main(String[] args) {
        System.out.println("Enter Your Name");
        Scanner scan=new Scanner(System.in);
        String name= scan.nextLine();
        System.out.println("enter hours worked");
        double hoursw =scan.nextDouble();
        System.out.println("enter pay rate");
        double payrate =scan.nextDouble();
        System.out.println("Name:"+ name +"your total pay is" + multiply(payrate,hoursw));
    }
    public static double multiply(double payrate,double hoursw){
        return payrate*hoursw;
    }
}
