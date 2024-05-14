package com.pluralsight;


public class Rectangle extends shape {
    protected double length;
    protected double width;
     @Override
    public void getArea(){

        System.out.println(length*width);
    }
}
