package com.pluralsight;

import java.util.Arrays;

public class Teststatistics {
    public static void main(String[] args) {
        int[] array={95,92,93,94,95,96,97,98,99,100};
        int maxValue=highScore(array);
        System.out.println("highscore="+ maxValue);
        System.out.println( "highscore"+Arrays.stream(array).max());
        System.out.println("average="+Arrays.stream(array).average());
        System.out.println("low score=" + Arrays.stream(array).min());
    }
    public static int highScore(int[] array){
        int highscore=array[0];
        for(int i=1;i< array.length; i++) {
            if (array[i] > highscore) {
                highscore = array[i];
            }
        }
            return highscore;
    }

}
