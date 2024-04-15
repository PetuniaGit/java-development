package com.pluralsight;

import java.util.Scanner;

public class FullNameApplication {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println(" First name ");
        String X= scan.nextLine();
        System.out.println("middle name: enter N/A if you do not have one");
        String Y=scan.nextLine();
        System.out.println("last name");
        String Z=scan.nextLine();
        System.out.println("suffix: enter N/A if you do not have one");
        String A= scan.nextLine();
        String Fullname=" ";

        if (Y.isEmpty()){
            Fullname=X+" "+Z;
        } else{ Fullname=X+" "+Y+" "+Z; }
        if (!(A.isEmpty())){
            Fullname=X+" "+ Y +" "+ Z + " " +A;
        }
        Fullname=Fullname.trim();
        System.out.println(Fullname);
    }
}
