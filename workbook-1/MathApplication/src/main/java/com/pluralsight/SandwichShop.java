package com.pluralsight;

import java.util.Scanner;

public class SandwichShop {
    public static void main(String[] args) {
        System.out.println("what kind of sandwich do you want Regular or Large");
        Scanner scan=new Scanner(System.in);
        String sandwich= scan.nextLine();
        System.out.println("what is your age");
        int age=scan.nextInt();


        if (sandwich.equalsIgnoreCase("regular")){
            if (age<=17){
                System.out.println( 5.45 -(5.45*0.1));}
            else if (age>=65){
                System.out.println( 5.45-( 5.45*0.2));}
                else {
                    System.out.println(5.45);}
        }
            if (sandwich.equalsIgnoreCase("large")){
                if (age<=17){
                    System.out.println( 8.95 -(8.95*0.1));}
                else if (age>=65){
                    System.out.println( 8.95-(  8.95 *0.2));}
                else {
                    System.out.println(8.95);}

    }
}}
