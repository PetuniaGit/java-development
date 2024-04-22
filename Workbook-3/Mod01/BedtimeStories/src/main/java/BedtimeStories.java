import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class BedtimeStories {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println(" which story do you want displayed." +
                "\nEnter 1 for 'Goldilocks' "+
                "\nEnter 2 for 'hansel and gretel'"+
                "\nEnter 3 for 'mary had a little lamb'.");
        int x= scan.nextInt();
        int linenumber=1;
try{
        switch (x){
            case 1:
                FileInputStream fis= new FileInputStream("goldilocks.txt");
                 Scanner scanner= new Scanner(fis);
                 String input ;
                 while( scanner.hasNextLine()){
                     input=linenumber+"." +scanner.nextLine();
                     System.out.println(input);
                     linenumber++;
                 }
                 break;
            case 2:
                FileInputStream fis1= new FileInputStream("hansel_and_gretel.txt");
                Scanner scanner1= new Scanner(fis1);
                String input1 ;
                while( scanner1.hasNextLine()){
                    input1=linenumber+"."+scanner1.nextLine();
                    System.out.println(input1);
                    linenumber++;}
                break;
            case 3:
                FileInputStream fis2= new FileInputStream("hansel_and_gretel.txt");
                Scanner scanner2= new Scanner(fis2);
                String input2 ;
                while( scanner2.hasNextLine()){
                    input2=linenumber+"."+scanner2.nextLine();
                    System.out.println(input2);
                    linenumber++;}
                break;

        }}
catch(IOException e){
    e.printStackTrace();
}



    }
}
