package com.pluralsight;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Program2 {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Lida", "Thompson", 23));
        people.add(new Person("John", "Doe", 30));
        people.add(new Person("Emma", "Johnson", 25));
        people.add(new Person("Olivia", "Smith", 28));
        people.add(new Person("William", "Brown", 35));
        people.add(new Person("Ava", "Jones", 22));
        people.add(new Person("James", "Garcia", 40));
        people.add(new Person("Sophia", "Martinez", 31));
        people.add(new Person("Mason", "Davis", 27));
        people.add(new Person("Isabella", "Lopez", 29));

        System.out.println("Enter a name to search.");
        String name = scan.nextLine();
        List<Person> matchingPeople = people.stream()
                .filter(person -> name.equalsIgnoreCase(person.getFirstName()) || name.equalsIgnoreCase(person.getLastName()))
                .collect(Collectors.toList());
        matchingPeople.forEach(System.out::println);

        int totalAge = people.stream()
                .mapToInt(Person::getAge)
                .sum();
        System.out.println("The average age is: " + (double) totalAge / people.size());

        int oldestAge = people.stream()
                .mapToInt(Person::getAge)
                .max()
                .getAsInt();
        System.out.println("Age of the oldest person: " + oldestAge);

        int youngestAge = people.stream()
                .mapToInt(Person::getAge)
                .min()
                .getAsInt();
        System.out.println("Age of the youngest person: " + youngestAge);
    }
}