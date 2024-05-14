package com.pluralsight;

import java.util.Scanner;

public class Menu {
    static public Scanner scan=new Scanner(System.in);
    public static void main(String[] args) {
      menu();
    }
    public static void menu(){

        System.out.println("Choose a shape to calculate it's area");
        System.out.println("Enter 1 for square");
        System.out.println("Enter 2 for rectangle ");
        System.out.println("Enter 3 for Box");
        int x=scan.nextInt();
        switch(x){
            case 1 :
                AreaSquare();
                break;
            case 2 :
                AreaRectangle();
                break;
            case 3:
                TotalAreaBox();
                break;
            default:
                System.out.println("invalid entry choose again");
                menu();

        }

    }

    private static void TotalAreaBox() {
        Box bx1=new Box();
        System.out.println("what is the length");
        bx1.length=scan.nextDouble();
        System.out.println("what is the width");
        bx1.width=scan.nextDouble();
        System.out.println("what is the height");
        bx1.height=scan.nextDouble();
        System.out.println("The total surface area of the Box is "); bx1.getArea();
    }

    private static void AreaRectangle() {
        Rectangle r1= new Rectangle();
        System.out.println("what is the length");
        r1.length=scan.nextDouble();
        System.out.println("what is the width");
        r1.width=scan.nextDouble();
        System.out.println("The area of the Rectangle is "); r1.getArea();
    }

    public static void AreaSquare(){
        Square sq1=new Square();
        System.out.println("what is the length");
        sq1.length=scan.nextDouble();
        System.out.println("what is the width");
        sq1.width=scan.nextDouble();
        System.out.println("The area of the square is ");  sq1.getArea();

    }


}
