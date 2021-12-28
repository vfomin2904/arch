package ru.geekbrains.system_patterns.orm;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Application {
    public static void main(String[] args) throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/spring_eshop_db_2", "root", "root");
        UserRepository repository = new UserRepository(connection);
        User deleteUser = repository.findById(3L).get();
        User updateUser = repository.findById(2L).get();
        updateUser.setLogin("newLogin");

        repository.beginTransaction();
        repository.insert(new User("newUser", "password"));
        repository.insert(new User("newUser", "password"));
        repository.delete(deleteUser);
        repository.update(updateUser);
        repository.commitTransaction();
    }
}
