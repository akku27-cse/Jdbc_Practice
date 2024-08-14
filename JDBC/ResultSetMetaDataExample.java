import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ResultSetMetaDataExample {

    public static void main(String[] args) throws ClassNotFoundException,SQLException {

        try {
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

            // Execute Query
            ResultSet set = ptmt.executeQuery();

            // Get ResultSet MetaData
            java.sql.ResultSetMetaData data = set.getMetaData(); // Use the fully qualified name here

            // Print column details
            System.out.println("Column count: " + data.getColumnCount());
            System.out.println("Column 1 name: " + data.getColumnName(1));
            System.out.println("Column 2 name: " + data.getColumnName(2));
            System.out.println("Column 3 name: " + data.getColumnName(3));
            System.out.println("Column 3 name: " + data.getColumnTypeName(1));
            System.out.println("Column 3 name: " + data.getColumnTypeName(2));
            System.out.println("Column 3 name: " + data.getColumnTypeName(3));


            // Close the connection
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
