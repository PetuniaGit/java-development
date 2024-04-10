package com.pluralsight;

public class PracticeOperations {
    public static void main(String[] args) {
        String x= "hello ";
        String y="everyone ";
        String z="here";
        String a= x+y+z;
        System.out.println(a);
        double num1= 234.1;
        double num2=456.1;
        double num3=678.3;
        double num4= num1+num2;
        System.out.println(num4);
        double num5=num1-num2;
        System.out.println(num5);
        double num6=num1*num2;
        System.out.println(num6);
        double num7=(num1/num2)/num3;
        System.out.println(num7);
        for (int i=1; i<=3; i++)
            System.out.println(num7+(Math.pow(10,i)));
        }
    }

