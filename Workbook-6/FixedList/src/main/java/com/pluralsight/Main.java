package com.pluralsight;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        FixedList<Integer> numbers = new FixedList<>(3);
        numbers.add(11);
        numbers.add(4);
        numbers.add(93);
        numbers.add(42); // this line should fail

        System.out.println("Number of items in numbers list: " + numbers.getItems().size());

        FixedList<LocalDate> dates = new FixedList<>(2);
        dates.add(LocalDate.now());
        dates.add(LocalDate.now());
        // dates.add(15); // this line should fail
    }
}
