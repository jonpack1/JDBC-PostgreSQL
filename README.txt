

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SimpleDatabaseConnection {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/employees";
        String user = "jonpack1";
        String password = "VpustiMenya!";

        try (Connection conn = DriverManager.getConnection(url, user, password)) {
            if (conn != null) {
                System.out.println("Connected to the database!");
            } else {
                System.out.println("Failed to make connection!");
            }
        } catch (SQLException e) {
            System.out.println("Connection failure!");
            e.printStackTrace();
        }
    }
}

for comparison