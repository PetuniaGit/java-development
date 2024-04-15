package com.pluralsight;

import java.util.Arrays;
import java.util.Scanner;

public class FullNameParser {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println( " Enter your first ,middle and last name ." );
        String Fullname=scan.nextLine();
        Fullname=Fullname.trim();
        System.out.println(Fullname);
        String[] names=Fullname.split(" ");
        if (names.length==2){
            System.out.println(" first name:"+ names[0]);
            System.out.println(" middle name :none " );
            System.out.println( " last name :" + names[1]);

        }

else{
             System.out.println(" first name:"+ names[0]);
             System.out.println(" middle name :" + names[1]);
             System.out.println( " last name :" + names[2]);}



    }
}
