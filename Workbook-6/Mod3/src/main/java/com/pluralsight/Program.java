package com.pluralsight;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
   static  Scanner scan=new Scanner(System.in);
    public static void main(String[] args) {
        List<Person> people= new ArrayList<>();
        people.add(new Person("Lida","Thompson",23 ));
        people.add(new Person("John", "Doe", 30));
        people.add(new Person("Emma", "Johnson", 25));
        people.add(new Person("Olivia", "Smith", 28));
        people.add( new Person("William", "Brown", 35));
        people.add(new Person("Ava", "Jones", 22));
        people.add( new Person("James", "Garcia", 40));
        people.add( new Person("Sophia", "Martinez", 31));
        people.add(new Person("Mason", "Davis", 27));
        people.add(new Person("Isabella", "Lopez", 29));

        System.out.println("Enter a name to search.");
        String name=scan.nextLine();
        for(Person person: people){
            if (name.equalsIgnoreCase(person.getFirstName()) || name.equalsIgnoreCase(person.getLastName())){
                System.out.println(person);
            }
        }
       int totalAge=0;
        for(Person person: people){
            totalAge += person.getAge();
        }
        System.out.println( "the average age is" + totalAge/people.size());

        int oldestAge = getOldest(people);
        System.out.println("Age of the oldest person: " + oldestAge);

        int youngestAge = getYoungest(people);
        System.out.println("Age of the youngest person: " + youngestAge);

    }

    private static int getOldest(List<Person> people) {

        int maximumAge = Integer.MIN_VALUE;


        for (Person person : people) {
            maximumAge = Math.max(maximumAge, person.getAge());
        }

        // Print.
        return maximumAge;}
    private static int getYoungest(List<Person> people) {

        int minimimAge = Integer.MAX_VALUE;


        for (Person person : people) {
            minimimAge = Math.min(minimimAge, person.getAge());
        }

        return minimimAge;}
}
