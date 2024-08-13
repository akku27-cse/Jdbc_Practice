//Cretae data babe With JDBC

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class FirstJdbcProg {
    
    public static void main(String[] args) {
        try {
            // Register the driver class
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            // Create Connection
            String url = "jdbc:mysql://localhost:3306/person";
            String username = "root";
            String password = "Santu@721648";

            Connection con = DriverManager.getConnection(url, username, password);
            
            // Create query
            String q = "CREATE TABLE emp(id INT, name VARCHAR(10))";
            Statement stmt = con.createStatement();

            // Execute
            stmt.executeUpdate(q);
            
            // Close 
            con.close();
 
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
