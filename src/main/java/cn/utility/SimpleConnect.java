package cn.utility;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SimpleConnect {

    public Connection connect() {

        Connection conn = null;

        String url = "jdbc:mysql://localhost:3306/test";
        String username = "root";
        String password = "132456";

        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(url, username, password);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return conn;
    }


}
