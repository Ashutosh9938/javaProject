package cc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

// Connecting our Java files with the database.
public class connect {
    Connection c;
    Statement s;

    public connect() {
        try {
            // Installing JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Connecting to the database
            c = DriverManager.getConnection("jdbc:mysql://localhost/courcemgmt", "root", "");
            s = c.createStatement();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}
