import service.CreateStartTable;
import service.ConnectionDB;
import service.InterfaceMessages;
import service.UserService;

import java.sql.SQLException;

public class UserManager {

    public static void main(String[] args) throws SQLException {
        ConnectionDB.getDBConnection();
        CreateStartTable.createNewTable();
        InterfaceMessages.startMessage();
        InterfaceMessages.mainMenu();
        UserService userService = new UserService();

  //      userService.firstUserChoice();
    }
}
