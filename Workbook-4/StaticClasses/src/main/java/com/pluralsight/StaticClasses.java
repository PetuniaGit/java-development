package com.pluralsight;

public class StaticClasses {

    private StaticClasses(String firstName, String lastName){}

    // Create our static methods
    public static String format(String firstName, String lastName){
        return String.format("%s, %s", lastName, firstName);
    }
    public static String format(String prefix, String firstName, String middleName, String lastName, String suffix){
        return String.format("%s, %s %s %s, %s", lastName, prefix, firstName, middleName, suffix);
    }
    public static String format(String fullName){
        String[] name = fullName.split(" ");
        if (name.length == 5){
            return String.format("%s %s %s %s, %s", name[3], name[0], name[1], name[2], name[4]);
        } else if (name.length == 4) {
            return String.format("%s %s %s, %s", name[2], name[0], name[1], name[3]);
        } else if (name.length == 3) {
            return String.format("%s %s %s", name[1], name[0], name[2]);
        } else {
            return String.format("%s, %s", name[1], name[0]);
        }
    }
}