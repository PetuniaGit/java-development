package com.pluralsight;

public class ForLoop {
    public static void main(String[] args)  throws InterruptedException{

        for (int y=10;y>=1;y--){
            System.out.println(y);
            Thread.sleep(1000);
        }
        System.out.println("Launch");
    }
}
