package com.pluralsight;

public class ShapeDriver {
    public static void main(String[] args) {
        shape s=new shape();
        s.getArea();
        Rectangle r=new Rectangle();
        r.length=3;
        r.width=5;
        r.getArea();
        Square Sq=new Square();
        Sq.length=6;
        Sq.width=6;
        Sq.getArea();
        Box bx=new Box();
        bx.height=10;
        bx.width=4;
        bx.length=5;
        bx.getArea();


    }
}
