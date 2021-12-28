package ru.geekbrains.system_patterns.orm;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UnitOfWork {

    private final Connection conn;
    private final QueryMapper queryMapper;

    private final List<User> newUsers = new ArrayList<>();
    private final List<User> updateUsers = new ArrayList<>();
    private final List<User> deleteUsers = new ArrayList<>();

    public UnitOfWork(Connection conn) throws SQLException {
        this.conn = conn;
        this.queryMapper = new QueryMapper(conn);
    }

    public void registerNew(User user) {
        this.newUsers.add(user);
    }

    public void registerUpdate(User user) {
        this.updateUsers.add(user);
    }

    public void registerDelete(User user) {
        this.deleteUsers.add(user);
    }

    public void commit() {
        insert();
        update();
        delete();
    }

    private void update() {
        updateUsers.forEach(user -> {
            try {
                queryMapper.update(user).executeUpdate();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        });
        updateUsers.clear();
    }

    private void insert() {
        newUsers.forEach(user -> {
            try {
                queryMapper.insert(user).executeUpdate();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        });
        newUsers.clear();
    }

    private void delete() {
        deleteUsers.forEach(user -> {
            try {
                queryMapper.delete(user).executeUpdate();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        });
        deleteUsers.clear();
    }
}
