import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    public static void main(String[] args) {
        // Load the PostgreSQL JDBC driver
        try {
            Class.forName("org.postgresql.Driver");

            // Establish a connection
            Connection conn = DriverManager.getConnection(
                    "jdbc:postgresql://localhost:5432/person",
                    "jonpack1",                             //person most likely under jonpack password
                    "VpustiMenya!"
            );

            // Check if the connection is successful
            if (conn != null) {
                System.out.println("Connected to the database!");
            } else {
                System.out.println("Failed to make connection!");
            }

            conn.close();
        } catch (ClassNotFoundException e) {
            System.out.println("PostgreSQL Driver not found!");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Connection failure!");
            e.printStackTrace();
        }
    }
}
