package org.burdun.electivewebsystem.JdbcConnection;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by burdun on 26.09.2014.
 */
public class WrapperConnector {

    private Connection connection;

    // Use this for Tomcat
    public WrapperConnector() {
        try {
            connection = ConnectionPool.getConnection();
        } catch (SQLException e) {
            System.err.println("not obtained connection " + e);
        }
    }
    //

    /*
    public WrapperConnector() {
        try {
            ResourceBundle resource = ResourceBundle.getBundle("database");
            String url = resource.getString("db.url");
            String user = resource.getString("db.user");
            String pass = resource.getString("db.password");
            connection = DriverManager.getConnection(url, user, pass);
        } catch (MissingResourceException e) {
            System.err.println("properties file is missing " + e);
        } catch (SQLException e) {
            System.err.println("not obtained connection " + e);
        }
    }
    */

    public Statement getStatement() throws SQLException {
        if (connection != null) {
            Statement statement = connection.createStatement();
            if (statement != null) {
                return statement;
            }
        }
        throw new SQLException("connection or statement is null");
    }

    public void closeStatement(Statement statement) {
        if (statement != null) {
            try {
                statement.close();
            } catch (SQLException e) {
                System.err.println("statement is null " + e);
            }
        }
    }

    public void closeConnection() {
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                System.err.println(" wrong connection" + e);
            }
        }
    }
// другие необходимые делегированные методы интерфейса Connection
}