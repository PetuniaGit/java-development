package com.pluralsight;

public class Square extends Rectangle {
    @Override
    public void getArea(){
        if (length==width){
            System.out.println(length*width);}
            else {
            System.out.println("This is not a square");
            }
        }
    }

