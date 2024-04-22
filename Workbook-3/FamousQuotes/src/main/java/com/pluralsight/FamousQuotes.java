package com.pluralsight;

import java.util.Scanner;

public class FamousQuotes {
    public static void main(String[] args) {


                String[] quotes=new String[10];
                quotes[1]=("Life is a canvas, and you are the artist. Paint your dreams, embrace the colors, and create a masterpiece.");
                quotes [2]=("In the tapestry of life, every thread counts. Embrace the diversity and richness of experiences.");
                quotes [3]=("Life's beauty lies not only in the grand moments but also in the smallest details. Cherish them all.");
                quotes [4]=("Life is a precious gift; every breath is a reminder of its beauty and wonder.");
                quotes [5]=("Amidst life's chaos, find beauty in the simplicity of a moment, the warmth of a smile, and the kindness of a heart.");
                quotes [6]=("Life's beauty is not always in its perfection but in its imperfections, for they add depth and character to our journey.");
                quotes [7]=("The beauty of life is that every dawn brings new possibilities, every dusk offers reflections, and every moment is a chance to grow.");
                quotes [8]=("Life's beauty is found in the connections we make, the love we share, and the memories we create.");
                quotes [9]=("Life's beauty is like a sunrise; it's worth waking up for, and even on cloudy days, its essence still shines through.");
                quotes [0]=("Life's beauty is in its resilience, its ability to bloom amidst adversity, and its capacity to inspire hope even in the darkest of times.");
                Scanner scan=new Scanner(System.in);
                int x;
                while (true) {System.out.println("Enter a number from 1 to 10." );
                    try{  x=scan.nextInt();
                        System.out.println(quotes[x-1]);}
                    catch (Exception e){
                        System.out.println("Your number is out of range.");
                        System.out.println("Try again.");}



        }

    }
}
