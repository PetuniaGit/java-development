package com.pluralsight;

import java.util.Scanner;

public class RentalCarCaluclator {
    int rentaldays;
    int age;
    String tolltag;
    String GPS;
    String roadassistance;
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("what is your pickupdate");
        String pickupdate= scan.nextLine();
        System.out.println("for how many days do you want to rent the car");
        int rentaldays= scan.nextInt();
        System.out.println("do you want electronic tolltag for 3.95/day ,answer yes or no");
        String tolltag =scan.nextLine();
        System.out.println(" do you want a GPS for 2.95/day ,answer yes or no");
        String GPS=scan.nextLine();
        System.out.println("do you want roadside assistance for 3.95/day, answer yes or no");
        String roadassistance= scan.nextLine();
        System.out.println("what is your current age");
        int age=scan.nextInt();
    double basicrentalcost= rentaldays*29.99;
    double optionscost=0;
    if (tolltag.equalsIgnoreCase("yes")){

    }

    }



}
