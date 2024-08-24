import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ReadData {
    public static void main(String[] args) {
        try {
            // Load the PostgreSQL JDBC driver
            Class.forName("org.postgresql.Driver");

            // Establish a connection
            Connection conn = DriverManager.getConnection(
                    "jdbc:postgresql://localhost:5432/employees",
                    "jonpack1",
                    "password"
            );

            // Create a statement
            Statement stmt = conn.createStatement();

            // Execute a query to retrieve data
            String sql = "SELECT * FROM your_table"; // Replace 'your_table' with your table name
            ResultSet rs = stmt.executeQuery(sql);

            // Process the result set
            while (rs.next()) {
                // Retrieve data by column name
                int id = rs.getInt("id");
                String name = rs.getString("name");
                // Display values
                System.out.println("ID: " + id + ", Name: " + name);
            }

            // Close the resources
            rs.close();
            stmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

