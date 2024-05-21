package com.pluralsight;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class WorkingWithInterfaces {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<Person>();
        people.add( new Person("Alice", "Johnson", 45) );
        people.add( new Person("Brian", "Smith", 27) );
        people.add( new Person("Charlotte", "Smith", 26) );
        people.add( new Person("Charlotte", "Smith", 13) );
        people.add( new Person("David", "Brown", 15) );
        people.add( new Person("David", "Brown", 35) );
        people.add( new Person("David", "Brown", 22) );
        people.add( new Person("Daniel", "Brown", 15) );
        people.add( new Person("Fiona", "White", 18) );
        people.add( new Person("Grace", "Harris", 8) );
        people.add( new Person("Henry", "Mason", 19) );


        Collections.sort(people);

        for (Person person : people) {
            System.out.println(person.getFirstName()+" "+person.getLastName()+" "+person.getAge());
        }
    }
}