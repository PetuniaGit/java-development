package com.pluralsight;

public class Dice {

    public int roll(){
     int randomNumber= (int) (Math.random()*6) +1;
     return randomNumber;
    }

    public static void main(String[] args) {
        int roll1=0;
        int roll2=0;
        int counter2= 0;
        int counter4=0;
        int counter6= 0;
        int counter7=0;
        Dice dice =new Dice();
        for ( int i=1;i<=100;i++){
            roll1=dice.roll();
            roll2=dice.roll();
            System.out.println("Roll"+ i + roll1+ "-" + roll2+",sum=" + roll1 +roll2);
            if (roll1+roll2==2){
                counter2++;
            }
            if (roll1+roll2==4){
                counter4++;
            }
            if ( roll1+roll2==6){
                counter6++;
            }
            if ( roll1+roll2==7){
                counter7++;
            }
        }
        System.out.println("Two counter="+counter2);
        System.out.println( "four counter=" +counter4);
        System.out.println("six counter="+counter6);
        System.out.println("seven counter="+ counter7);

    }
}
