package ru.geekbrains.system_patterns.orm;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class QueryMapper {

    private final PreparedStatement updateStatement;
    private final PreparedStatement insertStatement;
    private final PreparedStatement deleteStatement;

    public QueryMapper(Connection connection) throws SQLException {
        this.updateStatement = connection.prepareStatement("UPDATE users SET username = ?, password = ? WHERE id = ?;");
        this.insertStatement = connection.prepareStatement("INSERT INTO users(username, password) VALUES(?,?)");
        this.deleteStatement = connection.prepareStatement("DELETE FROM users WHERE id = ?");
    }

    public PreparedStatement update(User user) throws SQLException {
        updateStatement.setString(1, user.getLogin());
        updateStatement.setString(2, user.getPassword());
        updateStatement.setLong(3, user.getId());
        return updateStatement;
    }

    public PreparedStatement insert(User user) throws SQLException {
        insertStatement.setString(1, user.getLogin());
        insertStatement.setString(2, user.getPassword());
        return insertStatement;
    }

    public PreparedStatement delete(User user) throws SQLException {
        deleteStatement.setLong(1, user.getId());
        return deleteStatement;
    }
}
