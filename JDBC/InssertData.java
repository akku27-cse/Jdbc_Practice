import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;

public class InssertData {
     public static void main(String[] args) {
        boolean bool=true;
        try {
            Scanner sc=new Scanner(System.in);
            // Register the driver class
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            // Create Connection
            String url = "jdbc:mysql://localhost:3306/person";
            String username = "root";
            String password = "Santu@721648";

            Connection con = DriverManager.getConnection(url, username, password);
            
            // Create query
            String q = "Insert into emp(id,name) value(?,?)";
            PreparedStatement pstmt=con.prepareStatement(q);
            //Statement stmt = con.createStatement();
            System.out.println("Enter Name:");
            String name=sc.nextLine();
            System.out.println("Enter Id:");
         int id=sc.nextInt();
       

            // Execute
pstmt.setInt(1, id);
pstmt.setString(2, name);

pstmt.executeUpdate();
            // Close 
            con.close();
 
        } catch (Exception e) {
            e.printStackTrace();
        bool=false;
        }
        if(bool==true){
            System.out.println("Insert data Succesully");
        }
    }
}
