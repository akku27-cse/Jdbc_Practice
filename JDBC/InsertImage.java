import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertImage {

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
            String q = "INSERT INTO empl(name, image) VALUES(?, ?)";
            
            // Prepare statement
            PreparedStatement stmt = con.prepareStatement(q);
            stmt.setString(1, "Santu");
            
            // Reading the image file
            FileInputStream fis = new FileInputStream("1.jpeg");
            stmt.setBinaryStream(2, fis, fis.available());
            
            // Execute the query
            stmt.executeUpdate();  // No need to pass the query string here
            
            // Close the resources
            //stmt.close();
            con.close();
            //fis.close();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
//CREATE TABLE empl (name VARCHAR(20),image BLOB);
