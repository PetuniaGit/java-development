package com.pluralsight;

import java.util.Scanner;

public class SandwichShop {
    public static void main(String[] args) {
        System.out.println("what kind of sandwich do you want Regular , Large");
        Scanner scan=new Scanner(System.in);
        String sandwich= scan.nextLine();
        System.out.println("do you want it loaded answer yes or no");
        String ys= scan.nextLine();
        System.out.println("what is your age");
        int age=scan.nextInt();


        if (sandwich.equalsIgnoreCase("regular")){
            if (ys.equalsIgnoreCase("no")){
            if (age<=17){
                System.out.println( 5.45 -(5.45*0.1));}
            else if (age>=65){
                System.out.println( 5.45-( 5.45*0.2));}
                else {
                    System.out.println(5.45);}}
            if (ys.equalsIgnoreCase("yes")){
                if (age<=17){
                System.out.println( 5.45 -(5.45*0.1)+1);}
            else if (age>=65){
                System.out.println( 5.45-( 5.45*0.2)+1);}
            else {
                System.out.println(5.45+1);}}
        }
            if (sandwich.equalsIgnoreCase("large")){
                if (ys.equalsIgnoreCase("no")){
                if (age<=17){
                    System.out.println( 8.95 -(8.95*0.1));}
                else if (age>=65){
                    System.out.println( 8.95-(  8.95 *0.2));}
                else {
                    System.out.println(8.95);}}

                    if (ys.equalsIgnoreCase("yes")){
                        if (age<=17){
                            System.out.println( 8.95 -(8.95*0.1)+1.75);}
                        else if (age>=65){
                            System.out.println( 8.95-(  8.95 *0.2)+1.75);}
                        else {
                            System.out.println(8.95+1.75);}}



    }
}}
