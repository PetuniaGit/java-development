package com.pluralsight;

public class Box extends Rectangle{
    protected double height;
    @Override
    public void getArea(){
        System.out.println(2*(length*width)+2*(length*height)+2*(width*height));
    }
}
