//sql emp3;

package com.curd.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseUtil {

	private static final String Driver_Path="com.mysql.cj.jdbc.Driver";

	private static final String Database_Url="jdbc:mysql://localhost:3306/Person";
	private static final String userName="root";
	private static final String password="Santu@721648";
	public DataBaseUtil() {
		
		
		try {
			Class.forName(Driver_Path);		
		} catch (Exception e) {
			// TODO: handle exception
			throw new RuntimeException("Something went Wrong");
			
		}
	
		
	}//end Of Constructor
	
	public Connection getConnection() throws SQLException,RuntimeException {
   return DriverManager.getConnection(Database_Url,userName,password);
		
	}//end of get connection
}


/*package com.curd.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseUtil {
    private static final String Database_Url = "jdbc:mysql://localhost:3306/Person";
    private static final String Driver_Path = "com.mysql.cj.jdbc.Driver";
    private static final String Username = "yourUsername"; // Replace with your DB username
    private static final String Password = "yourPassword"; // Replace with your DB password

    public DataBaseUtil() {
        try {
            Class.forName(Driver_Path);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("Database Driver not found", e);
        }
    }

    public Connection getConnection() {
        try {
            return DriverManager.getConnection(Database_Url, Username, Password);
        } catch (SQLException e) {
            throw new RuntimeException("Failed to connect to the database", e);
        }
    }
}
*/