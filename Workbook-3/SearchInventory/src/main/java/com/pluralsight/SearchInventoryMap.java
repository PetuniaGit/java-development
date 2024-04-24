package com.pluralsight;



import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class SearchInventoryMap {
    // the key is the product id, the value is a product object
    static HashMap<Integer, Product> inventory =
            new HashMap<Integer, Product>();
    public static void main(String[] args) {
        loadInventory();
        Scanner scanner = new Scanner(System.in);
        System.out.print("What item # are you interested in? ");
        int id = scanner.nextInt();
        Product matchedProduct = inventory.get(id);
        if (matchedProduct == null) {
            System.out.println("We don't carry that product");
            return;
        }
        System.out.printf("We carry %s and the price is $%.2f",
                matchedProduct.getName(), matchedProduct.getPrice());

    }

    public static void loadInventory() {
       try{ BufferedReader buf=new BufferedReader(new FileReader("inventory.csv"));
        String line=buf.readLine();


       }
       catch(Exception e){

       }

} }