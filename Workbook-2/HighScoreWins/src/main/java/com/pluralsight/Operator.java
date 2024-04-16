package com.pluralsight;

import javax.imageio.stream.ImageInputStream;
public class Operator
{
    public static void main(String[] args){
        System.out.println(basicMath("+", 4, 7));
        System.out.println(basicMath("-",15,18));
        System.out.println(basicMath("*",5,5));
        System.out.println(basicMath("/",49,7));
    }
    public static Integer basicMath(String op, int v1, int v2)
    {
        switch (op){
            case "+":
                return v1 + v2;
            case "-":
                return v1 -v2;
            case "*":
                return v1*v2;
            case "/":
                return v1/v2; }

        return 0;


    }
}
