package se.yrgo.databaser;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class App {
    private static final Logger logger = Logger.getLogger(App.class.getName());

    public static void main(String[] args) {
        String userName = System.getenv("DB_USERNAME");
        String password = System.getenv("DB_PASSWORD");
        String host = System.getenv("DB_HOST");
        String url = String.format("jdbc:mysql://%s/dbHighscore", host);

        // We need to connect to the database ourselves using JDBC
        try (Connection conn = DriverManager.getConnection(url, userName, password)) {

            // connected to the dbHighscore database
            logger.info("We are connected to the database");

        } catch (SQLException ex) {
            logger.log(Level.SEVERE, "Some lousy SQL went wrong.", ex);
        }
    }
}
