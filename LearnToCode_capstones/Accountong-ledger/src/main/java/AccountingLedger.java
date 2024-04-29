import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class AccountingLedger {
    static Scanner scan=new Scanner(System.in);

    public static void homePage(){
        System.out.print("What would you like to do? ");
        System.out.println("Enter 1 to Add Deposit");
        System.out.println("Enter 2 Make Payment ");
        System.out.println("Enter 3 to view Ledger");
        System.out.println("Enter 4 to  Exit");

        int userChoice=scan.nextInt();
        if (userChoice==1) {
            // Call addDeposit method.
            addDeposit();
            // If user chose P.
        } else if (userChoice==2) {
            // Call makePayment method.
            makePayment();
            // If user chose L.
        } else if (userChoice==3) {
            // Call ledger method.
            ledger();
            // If user chose X.
        } else if (userChoice==4) {
            // Quit.
            System.exit(0);
            // If user entered a wrong input.
        } else {
            System.out.print("Invalid input. Please try again: ");
            userChoice = scan.nextInt();
        }
    }
    private static void addDeposit() {
        // Ask user to enter their deposit information.
        System.out.println("\nPlease enter the deposit information:");

        // Ask user to enter the deposit information.
        System.out.print("Enter deposit description: ");
        String depositDescription = scan.nextLine();

        // Ask user to enter deposit vendor.
        System.out.print("Enter deposit vendor: ");
        String depositVendor = scan.nextLine();

        // Ask user to enter deposit amount.
        System.out.print("Enter deposit amount: ");
        double depositAmount = scan.nextDouble();
        scan.nextLine();

        // Get current date and time.
        LocalDateTime currentTime = LocalDateTime.now();

        // Set the format for the date and time.
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy-MM-dd|HH:mm:ss");

        // Format the date and time.
        String  DateTime = currentTime.format(fmt);

        // Write the deposit information into the csv.
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("transactions.csv", true))) {
            writer.write("\n" + DateTime + "|" + depositDescription + "|" + depositVendor + "|" + depositAmount);

            // Success messsage.
            System.out.println("\nDeposit information added to transactions.csv successfully.\n");
            // If an error occured, print error.
        } catch (IOException e) {
            System.out.println("\nAn error occurred while writing to the file: " + e.getMessage() + "\n");
        }

    }
    private static void makePayment() {
    }
    private static void ledger() {
    }









}


