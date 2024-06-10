package com.pluralsight;
import java.sql.*;

public class NorthwindTraders2 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // Load MySQL Driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        // Open a connection to the database
        Connection connection;
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/northwind", "root","Password345@");

        // Create a statement
        PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM products");

        // Execute query
        ResultSet resultSet = preparedStatement.executeQuery();

        // Loop through the results
        while (resultSet.next()) {
            System.out.printf("""
                    Product ID: %d
                    Name:\t%s
                    Price\t%.2f
                    Stock\t%d
                    ------------------
                    """,resultSet.getInt("productid"),resultSet.getString("productname"),
                    resultSet.getDouble("unitprice"),resultSet.getInt("unitsinstock"));
        }


        // Close connection
        resultSet.close();
        preparedStatement.close();
        connection.close();
    }
}
