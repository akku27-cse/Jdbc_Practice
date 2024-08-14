import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class FetchData {

    public static void main(String[] args) {
        try {
            // Register Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Create Connection
            String url = "jdbc:mysql://localhost:3306/practicedb";
            String username = "root";
            String password = "Santu@721648";
            Connection con = DriverManager.getConnection(url, username, password);
            // CREATE PREpared satte ment
            String q = "select * from practice2";
            PreparedStatement ptmt = con.prepareStatement(q);

            // execute
            ResultSet set = ptmt.executeQuery();
            // set.next();//store data from databas from of matrix 
            // System.out.println(set.getInt(1));
            // System.out.println(set.getString(2));
            // System.out.println(set.getString(3));
            // set.next();//store data from databas from of matrix 
            // System.out.println(set.getInt(1));
            // System.out.println(set.getString(2));
            // System.out.println(set.getString(3));
           

            while(set.next()){
                System.out.println(set.getInt(1));
                System.out.println(set.getString(2));
                System.out.println(set.getString(3));
            }
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
            // TODO: handle exception
        }

    }

}
