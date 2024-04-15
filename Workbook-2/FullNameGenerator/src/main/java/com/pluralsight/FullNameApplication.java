package com.pluralsight;

import java.util.Scanner;

public class FullNameApplication {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your First name ,Middle initial , Last name and suffix.");
        String Fullname= scan.nextLine();
        Fullname=Fullname.trim();
        System.out.println(Fullname);
    }
}
