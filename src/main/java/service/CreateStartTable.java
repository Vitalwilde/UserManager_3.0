package service;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateStartTable {
    public static void createNewTable() throws SQLException {
        Connection dbConnection = null;
        Statement stmt = null;

        String createTableSQL = "CREATE TABLE dbuser ("
                             + "id BIGSERIAL NOT NULL PRIMARY KEY, "
                             + "first_name VARCHAR(50) NOT NULL, "
                             + "last_name VARCHAR(50) NOT NULL, "
                             + "userGender VARCHAR(20) NOT NULL, "
                             + "date_of_birth DATE NOT NULL, "
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
