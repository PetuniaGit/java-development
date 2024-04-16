package com.pluralsight;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TheaterReservations {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println( "Please enter your first and last name?");
        String FullName= scan.nextLine();
        String[] FullNameArray=FullName.split( " ");
        scan.nextLine();
        System.out.println( "What day will you be coming( MM/dd/yyyy)?");
        String date= scan.nextLine();
        DateTimeFormatter formatter;
        formatter=DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate date3=LocalDate.parse(date,formatter);
        System.out.println("how may tickets would you like?");
        int tickets=scan.nextInt();

        System.out.println(tickets +" ticket(s) reserved for " + date3+" under  "+FullNameArray[1]+", "+ FullNameArray[0]);




    }
}
