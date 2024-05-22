package com.pluralsight;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class GenericMethods {

    // Method to remove duplicates from an ArrayList
    public static <E> ArrayList<E> removeDuplicates(ArrayList<E> list) {
        Set<E> set = new HashSet<>(list);
        return new ArrayList<>(set);
    }

    // Method to merge two lists of the same type, alternating elements
    public static <E> ArrayList<E> mergeLists(List<E> list1, List<E> list2) {
        ArrayList<E> mergedList = new ArrayList<>();
        int size1 = list1.size();
        int size2 = list2.size();
        int maxSize = Math.max(size1, size2);

        for (int i = 0; i < maxSize; i++) {
            if (i < size1) {
                mergedList.add(list1.get(i));
            }
            if (i < size2) {
                mergedList.add(list2.get(i));
            }
        }

        return mergedList;
    }

    // Method to reverse the elements of a list
    public static <E> ArrayList<E> reverseList(List<E> list) {
        ArrayList<E> reversedList = new ArrayList<>(list.size());
        for (int i = list.size() - 1; i >= 0; i--) {
            reversedList.add(list.get(i));
        }
        return reversedList;
    }

    public static void main(String[] args) {
        // Test removeDuplicates
        ArrayList<Integer> listWithDuplicates = new ArrayList<>();
        listWithDuplicates.add(1);
        listWithDuplicates.add(2);
        listWithDuplicates.add(2);
        listWithDuplicates.add(3);
        listWithDuplicates.add(3);
        listWithDuplicates.add(3);
        System.out.println("Original list: " + listWithDuplicates);
        ArrayList<Integer> listWithoutDuplicates = removeDuplicates(listWithDuplicates);
        System.out.println("List without duplicates: " + listWithoutDuplicates);

        // Test mergeLists
        List<String> list1 = new ArrayList<>();
        list1.add("a");
        list1.add("b");
        list1.add("c");

        List<String> list2 = new ArrayList<>();
        list2.add("1");
        list2.add("2");
        list2.add("3");
        list2.add("4");

        System.out.println("List 1: " + list1);
        System.out.println("List 2: " + list2);
        ArrayList<String> mergedList = mergeLists(list1, list2);
        System.out.println("Merged list: " + mergedList);

        // Test reverseList
        List<Character> listToReverse = new ArrayList<>();
        listToReverse.add('A');
        listToReverse.add('B');
        listToReverse.add('C');
        listToReverse.add('D');
        System.out.println("Original list: " + listToReverse);
        ArrayList<Character> reversedList = reverseList(listToReverse);
        System.out.println("Reversed list: " + reversedList);
    }
}

