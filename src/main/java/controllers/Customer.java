package controllers;

import db.Database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Customer {

    //Create a table for the class above if and only
    //if it doesn't already exist.

    static Connection connection = Database.DbConn();
    static PreparedStatement ps;
    static ResultSet rs;
    static Scanner scanner = new Scanner(System.in);

    public static boolean createCustomerTable() {
        try {
            ps = connection.prepareStatement(
                    "CREATE TABLE IF NOT EXISTS customer(" +
                    "id serial," +
                    "first_name varchar(255)," +
                   " last_name varchar(255)," +
                    "email varchar(255)," +
                    "PRIMARY KEY(id))");
            ps.execute();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }

    }

    public static void getAllCustomers(){



        try{
            ps = connection.prepareStatement("SELECT * FROM customer");
            rs = ps.executeQuery();

            //Loop through the result set
            while (rs.next()) {
                String id = "id: " + rs.getInt("id");
                String firstName = "first_name: " + rs.getString("first_name");
                String lastName = "last_name: " + rs.getString("last_name");
                String email = "email: " + rs.getString("email");

                System.out.println(id + ", " + firstName + ", " + lastName + ", " + email);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
