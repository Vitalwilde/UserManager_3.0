package service;

import java.sql.Connection;
import java.sql.DriverManager;


public class ConnectionDB {
    public static Connection getDBConnection(){
        Connection dbConnection = null;

        try {
            Class.forName("org.postgresql.Driver");
            dbConnection = DriverManager
                    .getConnection("jdbc:postgresql://localhost:5432/usermanager",
                            "postgres", "total7749");
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
        return dbConnection;
    }
}




