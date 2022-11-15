package service;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class CreateOtherTable {


    public static void createNewOtherTable() throws SQLException {
        Scanner scan = new Scanner(System.in);
        String nameNewTable = scan.nextLine().toLowerCase();
        Connection dbConnection = null;
        Statement stmt = null;


        String createTableSQL = "CREATE TABLE " + nameNewTable + "("
                                + "id BIGSERIAL NOT NULL PRIMARY KEY, "
                                + "first_name VARCHAR(50) NOT NULL, "
                                + "last_name VARCHAR(50) NOT NULL, "
                                + "userGender VARCHAR(20) NOT NULL, "
                                + "userAge INT(100) NOT NULL, "
                                + "userPsychotype VARCHAR(30) NOT NULL "
                                + ")";
        try {
            dbConnection = ConnectionDB.getDBConnection();
            stmt = dbConnection.createStatement();
            stmt.execute(createTableSQL);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (stmt != null) {
                stmt.close();
            }
            if (dbConnection != null) {
                dbConnection.close();
            }
        }
    }
}
