package com.pluralsight;

import static java.lang.Math.random;

public class MathApp {
    public static void main(String[] args) {
        double bobSalary= 100000;
        double garySalary=120000;
       double highestSalary= Math.max(bobSalary,garySalary);
        System.out.println("the highest salary is " + highestSalary);
        double carPrice= 10000;
        double truckPrice=20000;
        double minimum= Math.min(carPrice,truckPrice);
        System.out.println("minimum =" + minimum);
        // area of circle with radius 25
        double radius=7.5;
                double pi=3.14;
                   double area= pi* radius* radius;
                   // sqrt rt
        double sqrt=Math.sqrt(5);
        System.out.println(sqrt);
        //distance between two points (5,10) and (85,50)
        double x1=5;
        double y1=10;
                double x2=85;
                double y2=50;
                double distance= Math.sqrt((y2-y1)*(y2-y1)+(x2-x1)*(x2-x1));
        System.out.println(distance);

        // absolute value
        double abs=Math.abs(-3.8);
        System.out.println(abs);
        // random number
       double rand=Math.random();
        System.out.println(rand);


    }
}
