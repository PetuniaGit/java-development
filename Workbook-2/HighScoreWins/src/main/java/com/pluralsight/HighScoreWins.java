package com.pluralsight;

import java.util.Scanner;

public class HighScoreWins {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println( " Enter a team and score information in the form 'Home:Visitor|21:9' ");
        String score= scan.nextLine();
        String[] scorearray=score.split("[:|:]");
        String team1= scorearray[0];
        String team2=scorearray[1];
         int score1team=Integer.parseInt(scorearray[2]);
        int score2team=Integer.parseInt(scorearray[3]);

        if (score1team>score2team){
            System.out.println("winner is: " + team1);}
        else {
            System.out.println(" winner is: " + team2);}

    }
}
