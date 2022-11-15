package repository;

import entity.User;
import service.ConnectionDB;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class UserRepository {

    public static void saveUser(User user) throws SQLException {
        ConnectionDB.getDBConnection();
        Connection c = null;
        Statement stmt = null;

        String addUserSQL = "INSERT INTO dbuser (first_name, last_name, userGender, userAge, userPsychotype)"
                            + " VALUES " + "('"+user.getUserFirstName()
                            +"','"+user.getUserLastName()
                            +"','"+user.getUserGender()
                            +"','"+user.getUserAge()
                            +"','"+ user.getUserPsychotype()+"')";

        try {
            c = ConnectionDB.getDBConnection();
            stmt = c.createStatement();
            stmt.execute(addUserSQL);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (stmt != null) {
                stmt.close();
            }
            if (c != null) {
                c.close();
            }
        }
        System.out.println(user);
        System.out.println();
    }

//    public void searchUserByIdInRepository(Integer userId) throws UserNotFoundExc {
//        validateUserId(userId);
//        System.out.println(userStorage.get(userId));
//        System.out.println();
//    }
//
//    private static void validateUserId(Integer userId) throws UserNotFoundExc {
//        if (userStorage.containsKey(userId)) {
//            return;
//        }
//        throw new UserNotFoundExc("Пользователь не найден! Повторите запрос");
//    }
//
//    public void searchUserByNameInRepository(String userFirstName, String userLastName) throws UserNotFoundExc {
//        Optional<User> userFromRepository = userStorage.values().stream()
//                .filter(user -> user.getUserFirstName().equalsIgnoreCase(userFirstName))
//                .filter(user -> user.getUserLastName().equalsIgnoreCase(userLastName))
//                .findFirst();
//        User user = userFromRepository.orElseThrow(() -> new UserNotFoundExc("Пользователь c данным именем не найден! Повторите запрос"));
//        System.out.println(user);
//        System.out.println();
//    }
//
//    public void deletingUserInRepository(Integer scanUserId) throws UserNotFoundExc {
//        userStorage.remove(scanUserId);
//        System.out.println();
//        InterfaceMessages.userDeleted();
//    }
//
//    public void updatingUserInRepository(User user, Integer scanUserId) {
//        userStorage.replace(scanUserId, user);
//        user.setId(scanUserId);
//        InterfaceMessages.userUpdated();
//        System.out.println();
//        System.out.println(userStorage.get(scanUserId));
//
//    }
}


