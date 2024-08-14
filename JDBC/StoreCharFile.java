import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.sql.*;
public class StoreCharFile {
    public static void main(String[] args) throws SQLException,ClassNotFoundException ,FileNotFoundException{
          Class.forName("com.mysql.cj.jdbc.Driver");

            // Create Connection
            String url = "jdbc:mysql://localhost:3306/practicedb";
            String username = "root";
            String password = "Santu@721648";
            Connection con = DriverManager.getConnection(url, username, password);
         FileReader fr=new FileReader("JDBC1.txt");
         String q = "Insert into employee(id,description) values(?,?)";
         PreparedStatement pstmt=con.prepareStatement(q);

         pstmt.setInt(1, 1212);
         pstmt.setCharacterStream(2, fr);
         pstmt.executeUpdate();
         con.close();

    }
}
