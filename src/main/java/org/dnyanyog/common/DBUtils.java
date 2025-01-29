package org.dnyanyog.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBUtils {

    private static String url = "jdbc:mysql://localhost:3306/school_management";
    private static String userName = "root";
    private static String password = "shruti9160";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url, userName, password);
    }

    public static ResultSet executeSelectQuery(String query) throws SQLException {
        Connection connection = getConnection();  // Create new connection
        Statement statement = connection.createStatement();
        ResultSet result = statement.executeQuery(query);
        return result;
    }
}
