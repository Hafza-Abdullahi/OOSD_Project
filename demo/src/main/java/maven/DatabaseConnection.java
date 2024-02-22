package maven;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
        // Database credentials
        private static final String URL = "jdbc:mysql://localhost:3308/jdbcproject";
        private static final String USERNAME = "Hafza";
        private static final String PASSWORD = "dbpass321";


        //to be able to connect in other classes
        public static Connection getConnection() throws SQLException {
            return DriverManager.getConnection(URL, USERNAME, PASSWORD);
        }
 
    }

   
