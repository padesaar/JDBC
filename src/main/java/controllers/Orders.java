package controllers;

import db.Database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Orders {
    static Connection connection = Database.DbConn();
    static PreparedStatement ps;
    static ResultSet rs;
    static Scanner scanner = new Scanner(System.in);

    public static boolean createOrdersTable() {
        try {
            ps = connection.prepareStatement(
                    "CREATE TABLE IF NOT EXISTS orders("+
                    "sale_id int NOT NULL," +
                    "item_id int NOT NULL," +
                    "qty_purchased int NOT NULL," +
                    "total int NOT NULL," +
                    "FOREIGN KEY(sale_id) REFERENCES sales(id)," +
                    "FOREIGN KEY(item_id) REFERENCES items(id))");
            ps.execute();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }

    }

    public static void getAllOrders(){



        try{
            ps = connection.prepareStatement("SELECT * FROM orders");
            rs = ps.executeQuery();

            //Loop through the result set
            while (rs.next()) {
                String id = "sale_id" + rs.getInt("sale_id");
                String qty = "qty_purchased: " + rs.getInt("qty_purchased");
                String item_total = "item_total: " + rs.getInt("item_total");
                String itemId = "item_id" + rs.getInt("item_id");


                System.out.println(id + ", " + itemId + ", " + qty + ", " +item_total);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }




}
