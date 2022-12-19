package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {

    //Declare the connection outside the try/catch block to
    //allow you return it after the commands have been executed.

    public static Connection DbConn() {

        Connection connection = null;

        try{
            connection = DriverManager.getConnection(
                    "jdbc:postgresql://babar.db.elephantsql.com/hbxjswcz",
                    "hbxjswcz",
                    "eGjFxNZztQ5Hf0QnPjf3qLz6OYK5z1uH");


        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return connection;
    }

}
