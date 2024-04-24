package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
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
      try{  BufferedReader buf=new BufferedReader(new FileReader("inventory.csv"));
      String line;
      while((line=buf.readLine())!=null){
          String[] data=line.split("\\|") ;
          Product product= new Product(Integer.parseInt(data[0]),data[1],Float.parseFloat(data[2]));
          inventory.add(product);
      }

      }
      catch(Exception e) {
          System.out.println("There was an error.");
      }
        return inventory;
    }
}