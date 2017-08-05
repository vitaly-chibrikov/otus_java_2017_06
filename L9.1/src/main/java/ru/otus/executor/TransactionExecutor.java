package ru.otus.executor;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class TransactionExecutor extends SimpleExecutor {
    private final Connection connection;

    public TransactionExecutor(Connection connection) {
        super(connection);
        this.connection = connection;
    }

    public void execUpdate(String[] updates) {
        try {
            connection.setAutoCommit(false);
            for (String update : updates) {
                Statement stmt = connection.createStatement();
                stmt.executeUpdate(update);
                stmt.close();
            }
            connection.commit();
        } catch (SQLException e) {
            try {
                connection.rollback();
            } catch (SQLException ignore) {
            }
        }
    }

}
