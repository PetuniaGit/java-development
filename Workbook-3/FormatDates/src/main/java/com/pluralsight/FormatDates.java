package com.pluralsight;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class FormatDates {
    public static void main(String[] args) {

        LocalDate today=LocalDate.now();
        LocalDateTime currentDateTime=LocalDateTime.now();
        DateTimeFormatter fmt=DateTimeFormatter.ofPattern("MM/dd/yyyy");
        DateTimeFormatter fmt1=DateTimeFormatter.ofPattern("MMMM d,yyyy");
        DateTimeFormatter fmt2=DateTimeFormatter.ofPattern("yyyy,dd,MM");
        DateTimeFormatter fmt3=DateTimeFormatter.ofPattern("E , MMM,d,yyyy  HH:mm");
        System.out.println("Today's date is " +today.format(fmt));
        System.out.println("Today's date is " +today.format(fmt1));
        System.out.println("Today's date is " +today.format(fmt2));
        System.out.println("Today's date and time is " +currentDateTime.format(fmt3));
    }
}
