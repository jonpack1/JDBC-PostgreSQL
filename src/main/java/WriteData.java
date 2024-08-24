import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class WriteData {
    public static void main(String[] args) {
        try {
            // Load the PostgreSQL JDBC driver
            Class.forName("org.postgresql.Driver");

            // Establish a connection
            Connection conn = DriverManager.getConnection(
                    "jdbc:postgresql://localhost:5432/employees",
                    "jonpack1",
                    "VpustiMenya!"
            );

            // Create an SQL INSERT statement
            String sql = "INSERT INTO your_table (id, name) VALUES (?, ?)"; // Replace 'your_table' with your table name
            PreparedStatement pstmt = conn.prepareStatement(sql);

            // Set the values for the placeholders
            pstmt.setInt(1, 1); // id
            pstmt.setString(2, "John Doe"); // name

            // Execute the insert statement
            pstmt.executeUpdate();

            // Close the resources
            pstmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

