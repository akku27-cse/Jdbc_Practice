import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DatabaseMetadata {
    public static void main(String[] args) throws SQLException,ClassNotFoundException{
          // Register Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Create Connection
            String url = "jdbc:mysql://localhost:3306/practicedb";
            String username = "root";
            String password = "Santu@721648";
            Connection con = DriverManager.getConnection(url, username, password);

            // Create PreparedStatement
            String q = "SELECT * FROM practice2";
            PreparedStatement ptmt = con.prepareStatement(q);

            java.sql.DatabaseMetaData data = con.getMetaData();

        
    }
}
