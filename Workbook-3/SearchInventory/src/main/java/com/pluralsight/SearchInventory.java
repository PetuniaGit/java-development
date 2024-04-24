package com.pluralsight;

import java.util.ArrayList;
import java.util.Scanner;
public class SearchInventory {
   public static void main(String[] args) {
        ArrayList<Product> inventory = getInventory();
        Scanner scanner = new Scanner(System.in);
        System.out.println("We carry the following inventory: ");
        for (int i = 0; i < inventory.size(); i++) {
            Product p =inventory.get(i);
            System.out.printf("id: %d %s Price: $%.2f \n", p.getId(), p.getName(), p.getPrice());
        }
    }

    public static ArrayList<Product> getInventory() {
        ArrayList<Product> inventory = new ArrayList<Product>();
        Product product1=new Product(1,"Soap",4.09f);
        Product product2=new Product(2,"Body wash",7.09f);
        Product product3=new Product(3,"Conditioner",8.09f);
        Product product4=new Product(4,"Shampoo",5.09f);
        inventory.add(product1);
        inventory.add(product2);
        inventory.add(product3);
        inventory.add(product4);

        return inventory;
    }
}