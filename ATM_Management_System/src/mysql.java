import java.sql.*;

public class mysql {
    Connection c;
    Statement s;

    public mysql() {
        try {
            // Load MySQL JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish Connection (Check database name, username, and password)
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/atm_db", "root", ""); 

            // Create a Statement object
            s = c.createStatement();

            System.out.println("Database Connected Successfully!");

        } catch (Exception e) {
            System.out.println("Database Connection Failed: " + e);
        }
    }

    public static void main(String[] args) {
        new mysql(); // Test database connection
    }
}
