import java.sql.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class AccountingLedger {
    // Initialize the scanner.
    static Scanner scan = new Scanner(System.in);

    // Create the variables.
    static LocalDateTime currentTime;
    static DateTimeFormatter fmt;
    static String DateTime;
    static LocalDate todaysDate = LocalDate.now();
    static int thisMonth = todaysDate.getMonthValue();
    static int thisYear = todaysDate.getYear();
    static boolean foundTransaction;

    // Database credentials
    static final String DB_URL = "jdbc:mysql://localhost:3306/AccountingLedger";
    static final String USER = "root";
    static final String PASS = "Password345@";

    public static void main(String[] args) {
        homePage();
    }

    // Create the homePage method.
    public static void homePage() {
        // Ask the user what they want to do.
        System.out.print("What would you like to do? ");
        System.out.println("Enter 1 to Add Deposit");
        System.out.println("Enter 2 Make Payment ");
        System.out.println("Enter 3 to view Ledger");
        System.out.println("Enter 4 to Exit");

        int userChoice = scan.nextInt();
        scan.nextLine();
        if (userChoice == 1) {
            addDeposit();
        } else if (userChoice == 2) {
            makePayment();
        } else if (userChoice == 3) {
            ledger();
        } else if (userChoice == 4) {
            System.exit(0);
        } else {
            System.out.print("Invalid input. Please try again: ");
            homePage();
            userChoice = scan.nextInt();
        }
    }

    // Create the addDeposit method.
    public static void addDeposit() {
        System.out.println("\nPlease enter the deposit information:");
        System.out.print("Please enter deposit description: ");
        String depositDescription = scan.nextLine();
        System.out.print("Please enter deposit vendor: ");
        String depositVendor = scan.nextLine();
        System.out.print("Please enter deposit amount: ");
        double depositAmount = scan.nextDouble();
        scan.nextLine();

        LocalDateTime currentTime = LocalDateTime.now();
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String DateTime = currentTime.format(fmt);

        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/AccountingLedger", "root","Password345@");
             PreparedStatement pstmt = conn.prepareStatement("INSERT INTO transactions (datetime, description, vendor, amount) VALUES (?, ?, ?, ?)")) {
            pstmt.setString(1, DateTime);
            pstmt.setString(2, depositDescription);
            pstmt.setString(3, depositVendor);
            pstmt.setDouble(4, depositAmount);
            pstmt.executeUpdate();
            System.out.println("\nDeposit information added to the database successfully.\n");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        homePage();
    }

    // Create the makePayment method.
    public static void makePayment() {
        System.out.println("\nPlease enter the payment information:");
        System.out.print("Enter payment description: ");
        String paymentDescription = scan.nextLine();
        System.out.print("Enter payment vendor: ");
        String paymentVendor = scan.nextLine();
        System.out.print("Enter payment amount (as negative): ");
        double paymentAmount = scan.nextDouble();
        scan.nextLine();

        LocalDateTime currentTime = LocalDateTime.now();
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String DateTime = currentTime.format(fmt);

        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/AccountingLedger", "root","Password345@");
             PreparedStatement pstmt = conn.prepareStatement("INSERT INTO transactions (datetime, description, vendor, amount) VALUES (?, ?, ?, ?)")) {
            pstmt.setString(1, DateTime);
            pstmt.setString(2, paymentDescription);
            pstmt.setString(3, paymentVendor);
            pstmt.setDouble(4, paymentAmount);
            pstmt.executeUpdate();
            System.out.println("\nPayment information added to the database successfully.\n");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        homePage();
    }

    // Create the ledger method.
    public static void ledger() {
        System.out.print("Please select an option: ");
        System.out.println("Enter 1 to display all transactions");
        System.out.println("Enter 2 to display Deposits");
        System.out.println("Enter 3 to display Payments");
        System.out.println("Enter 4 to display Reports");
        System.out.println("Enter 5 to go back to Home");

        int ledgerInput = scan.nextInt();

        if (ledgerInput == 1) {
            allTransaction();
        } else if (ledgerInput == 2) {
            viewDeposits();
        } else if (ledgerInput == 3) {
            viewPayments();
        } else if (ledgerInput == 4) {
            viewReports();
        } else if (ledgerInput == 5) {
            homePage();
        } else {
            System.out.print("Invalid input. Please try again: ");
            ledgerInput = scan.nextInt();
        }
    }

    public static void allTransaction() {
        foundTransaction = false;
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/AccountingLedger", "root","Password345@");
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM transactions ORDER BY datetime DESC")) {
            while (rs.next()) {
                System.out.println(rs.getTimestamp("datetime") + "|" + rs.getString("description") + "|" + rs.getString("vendor") + "|" + rs.getDouble("amount"));
                foundTransaction = true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        if (!foundTransaction) {
            System.out.println("No transactions found.");
        }
        ledger();
    }

    // Create the viewDeposits method.
    public static void viewDeposits() {
        foundTransaction = false;
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/AccountingLedger", "root","Password345@");
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM transactions WHERE amount > 0 ORDER BY datetime DESC")) {
            while (rs.next()) {
                System.out.println(rs.getTimestamp("datetime") + "|" + rs.getString("description") + "|" + rs.getString("vendor") + "|" + rs.getDouble("amount"));
                foundTransaction = true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        if (!foundTransaction) {
            System.out.println("No deposits found.");
        }
        ledger();
    }

    // Create the viewPayments method.
    public static void viewPayments() {
        foundTransaction = false;
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/AccountingLedger", "root","Password345@");
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM transactions WHERE amount < 0 ORDER BY datetime DESC")) {
            while (rs.next()) {
                System.out.println(rs.getTimestamp("datetime") + "|" + rs.getString("description") + "|" + rs.getString("vendor") + "|" + rs.getDouble("amount"));
                foundTransaction = true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        if (!foundTransaction) {
            System.out.println("No payments found.");
        }
        ledger();
    }

    // Create the viewReports method.
    public static void viewReports() {
        System.out.print("Choose an option: ");
        System.out.println("\nEnter 1 to search transactions of current Month.");
        System.out.println("Enter 2 to search transactions of Previous Month.");
        System.out.println("Enter 3 to search transactions of current Year.");
        System.out.println("Enter 4 to search transactions of Previous Year");
        System.out.println("Enter 5 to search by Vendor");
        System.out.println("Enter 7 to go Back");

        int userInput = scan.nextInt();
        scan.nextLine();

        if (userInput == 1) {
            monthToDate();
        } else if (userInput == 2) {
            previousMonth();
        } else if (userInput == 3) {
            yearToDate();
        } else if (userInput == 4) {
            previousYear();
        } else if (userInput == 5) {
            searchByVendor();
        } else if (userInput == 7) {
            ledger();
        } else {
            System.out.print("Invalid input. Please try again: ");
            userInput = scan.nextInt();
        }
    }

    // Create monthToDate method.
    public static void monthToDate() {
        boolean foundTransaction = false;
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/AccountingLedger", "root","Password345@");
             PreparedStatement pstmt = conn.prepareStatement("SELECT * FROM transactions WHERE MONTH(datetime) = ? AND YEAR(datetime) = ? ORDER BY datetime DESC")) {
            pstmt.setInt(1, thisMonth);
            pstmt.setInt(2, thisYear);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                System.out.println(rs.getTimestamp("datetime") + "|" + rs.getString("description") + "|" + rs.getString("vendor") + "|" + rs.getDouble("amount"));
                foundTransaction = true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        if (!foundTransaction) {
            System.out.println("No transactions found for the current month.");
        }
        viewReports();
    }

    // Create previousMonth method.
    public static void previousMonth() {
        foundTransaction = false;
        int prevMonth = thisMonth == 1 ? 12 : thisMonth - 1;
        int year = thisMonth == 1 ? thisYear - 1 : thisYear;
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/AccountingLedger", "root","Password345@");
             PreparedStatement pstmt = conn.prepareStatement("SELECT * FROM transactions WHERE MONTH(datetime) = ? AND YEAR(datetime) = ? ORDER BY datetime DESC")) {
            pstmt.setInt(1, prevMonth);
            pstmt.setInt(2, year);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                System.out.println(rs.getTimestamp("datetime") + "|" + rs.getString("description") + "|" + rs.getString("vendor") + "|" + rs.getDouble("amount"));
                foundTransaction = true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        if (!foundTransaction) {
            System.out.println("No transactions found for the previous month.");
        }
        viewReports();
    }

    // Create yearToDate method.
    public static void yearToDate() {
        foundTransaction = false;
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/AccountingLedger", "root","Password345@");
             PreparedStatement pstmt = conn.prepareStatement("SELECT * FROM transactions WHERE YEAR(datetime) = ? ORDER BY datetime DESC")) {
            pstmt.setInt(1, thisYear);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                System.out.println(rs.getTimestamp("datetime") + "|" + rs.getString("description") + "|" + rs.getString("vendor") + "|" + rs.getDouble("amount"));
                foundTransaction = true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        if (!foundTransaction) {
            System.out.println("No transactions found for the current year.");
        }
        viewReports();
    }

    // Create previousYear method.
    public static void previousYear() {
        foundTransaction = false;
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/AccountingLedger", "root","Password345@");
             PreparedStatement pstmt = conn.prepareStatement("SELECT * FROM transactions WHERE YEAR(datetime) = ? ORDER BY datetime DESC")) {
            pstmt.setInt(1, thisYear - 1);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                System.out.println(rs.getTimestamp("datetime") + "|" + rs.getString("description") + "|" + rs.getString("vendor") + "|" + rs.getDouble("amount"));
                foundTransaction = true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        if (!foundTransaction) {
            System.out.println("No transactions found for the previous year.");
        }
        viewReports();
    }

    // Create searchByVendor method.
    public static void searchByVendor() {
        System.out.print("Please enter the name of the vendor: ");
        String vendor = scan.nextLine();
        foundTransaction = false;
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/AccountingLedger", "root","Password345@");
             PreparedStatement pstmt = conn.prepareStatement("SELECT * FROM transactions WHERE vendor = ? ORDER BY datetime DESC")) {
            pstmt.setString(1, vendor);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                System.out.println(rs.getTimestamp("datetime") + "|" + rs.getString("description") + "|" + rs.getString("vendor") + "|" + rs.getDouble("amount"));
                foundTransaction = true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        if (!foundTransaction) {
            System.out.println("No transactions found for the vendor.");
        }
        viewReports();
    }
}


