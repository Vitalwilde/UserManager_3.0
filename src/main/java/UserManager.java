import service.*;

import java.sql.SQLException;

public class UserManager {

    public static void main(String[] args) throws SQLException {
        ConnectionDB.getDBConnection();
       CreateStartTable.createNewTable();
    //    CreateOtherTable.createNewOtherTable();
        InterfaceMessages.startMessage();
        InterfaceMessages.mainMenu();

        UserService userService = new UserService();

       userService.firstUserChoice();
    }
}
