//package com.crud.services;
//
//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//
//import com.crud.model.Employee;
//import com.curd.util.DataBaseUtil;
//import com.curd.util.QueryUtil;
//import com.mysql.cj.xdevapi.Statement;
//
//public class DataBaseServices {
//	DataBaseUtil dataBaseUtil = new DataBaseUtil();
//
//	public void insertEmployee(Employee employee) throws SQLException {
//		try {
//
//			Connection con = dataBaseUtil.getConnection();
//			PreparedStatement prep = con.prepareStatement(QueryUtil.insertEmployeeQuery());
//			prep.setString(1, employee.getEmployeeName());
//			prep.setString(2, employee.getEmployeeAddress());
//			prep.setDouble(3, employee.getEmployeeSalary());
//
//			int rows = prep.executeUpdate();
//			if (rows > 0) {
//				System.out.println("Record created Successfully");
//
//			} else {
//				System.out.println("Insert Record failed..");
//			}
//		} catch (Exception e) {
//			// TODO: handle exception
//		} // end catch
//	}// end insert employeee
//
//	// select all
//	public void getAllEmp() throws SQLException,RuntimeException,ClassNotFoundException {
//		try {
//			Connection con = dataBaseUtil.getConnection();
//           Statement stmt= con.createStatement();
//           ResultSet result=stmt.executeQuery(QueryUtil.getAllEmp());
//		} catch (Exception e) {
//			// TODO: handle exception
//		}
//
//	}
//
//}

package com.crud.services;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.crud.model.Employee;
import com.curd.util.DataBaseUtil;
import com.curd.util.QueryUtil;

public class DataBaseServices {
	DataBaseUtil dataBaseUtil = new DataBaseUtil();

	public void insertEmployee(Employee employee) throws SQLException {
		Connection con = null;
		PreparedStatement prep = null;

		try {
			con = dataBaseUtil.getConnection();
			prep = con.prepareStatement(QueryUtil.insertEmployeeQuery());
			prep.setString(1, employee.getEmployeeName());
			prep.setString(2, employee.getEmployeeAddress());
			prep.setDouble(3, employee.getEmployeeSalary());

			int rows = prep.executeUpdate();
			if (rows > 0) {
				System.out.println("Record created successfully");
			} else {
				System.out.println("Insert record failed.");
			}
		} catch (SQLException e) {
			e.printStackTrace(); // or log the exception
		} finally {
			if (prep != null) {
				prep.close();
			}
			if (con != null) {
				con.close();
			}
		}
	}// end of Insert

	public void getAllEmp() throws SQLException {
		Connection con = null;
		Statement stmt = null;
		ResultSet result = null;

		try {
			con = dataBaseUtil.getConnection();
			stmt = con.createStatement();
			result = stmt.executeQuery(QueryUtil.getAllEmp());

            while (result.next()) {
                // process each row from the ResultSet
//                System.out.println("Employee Name: " + result.getString("employeeName"));
//                System.out.println("Employee Address: " + result.getString("employeeAddress"));
//                System.out.println("Employee Salary: " + result.getDouble("employeeSalary"));
            	
            	printEmp(new Employee(result.getInt("empId"),
            			
            			result.getString("empName"),
            			result.getString("empAddress"),
            			result.getDouble("empSalaray")
            			));
            	
            }
		} catch (SQLException e) {
			e.printStackTrace(); // or log the exception
		} finally {
			if (result != null) {
				result.close();
			}
			if (stmt != null) {
				stmt.close();
			}
			if (con != null) {
				con.close();
			}
		}
	}// end of Select All
	
	//select by Id
	public void getAllEmpById() throws SQLException {
		Connection con = null;
		Statement stmt = null;
		ResultSet result = null;

		try {
			con = dataBaseUtil.getConnection();
			stmt = con.createStatement();
			result = stmt.executeQuery(QueryUtil.getAllEmpById());

            while (result.next()) {
                // process each row from the ResultSet
//                System.out.println("Employee Name: " + result.getString("employeeName"));
//                System.out.println("Employee Address: " + result.getString("employeeAddress"));
//                System.out.println("Employee Salary: " + result.getDouble("employeeSalary"));
            	
            	printEmp(new Employee(result.getInt("empId"),
            			
            			result.getString("empName"),
            			result.getString("empAddress"),
            			result.getDouble("empSalaray")
            			));
            	
            }
		} catch (SQLException e) {
			e.printStackTrace(); // or log the exception
		} finally {
			if (result != null) {
				result.close();
			}
			if (stmt != null) {
				stmt.close();
			}
			if (con != null) {
				con.close();
			}
		}
	}// end of Select All by id
	
	public void dleteEmp() throws SQLException {
		Connection con = null;
		Statement stmt = null;
		ResultSet result = null;

		try {
			con = dataBaseUtil.getConnection();
			stmt = con.createStatement();
			result = stmt.executeQuery(QueryUtil.deleteEmp());

            while (result.next()) {
                // process each row from the ResultSet
//                System.out.println("Employee Name: " + result.getString("employeeName"));
//                System.out.println("Employee Address: " + result.getString("employeeAddress"));
//                System.out.println("Employee Salary: " + result.getDouble("employeeSalary"));
            	
            	printEmp(new Employee(result.getInt("empId"),
            			
            			result.getString("empName"),
            			result.getString("empAddress"),
            			result.getDouble("empSalaray")
            			));
            	
            }
		} catch (SQLException e) {
			e.printStackTrace(); // or log the exception
		} finally {
			if (result != null) {
				result.close();
			}
			if (stmt != null) {
				stmt.close();
			}
			if (con != null) {
				con.close();
			}
		}
	}// end of Select All by id
	
	public void UpdateEmp() throws SQLException {
		Connection con = null;
		Statement stmt = null;
		ResultSet result = null;

		try {
			con = dataBaseUtil.getConnection();
			stmt = con.createStatement();
			result = stmt.executeQuery(QueryUtil.updateEmp());

            while (result.next()) {
                // process each row from the ResultSet
//                System.out.println("Employee Name: " + result.getString("employeeName"));
//                System.out.println("Employee Address: " + result.getString("employeeAddress"));
//                System.out.println("Employee Salary: " + result.getDouble("employeeSalary"));
            	
            	printEmp(new Employee(result.getInt("empId"),
            			
            			result.getString("empName"),
            			result.getString("empAddress"),
            			result.getDouble("empSalaray")
            			));
            	
            }
		} catch (SQLException e) {
			e.printStackTrace(); // or log the exception
		} finally {
			if (result != null) {
				result.close();
			}
			if (stmt != null) {
				stmt.close();
			}
			if (con != null) {
				con.close();
			}
		}
	}// end of Select All by id
	public void printEmp(Employee emp) {
		System.out.println("Employee ID: " + emp.getEmployeeId());
		System.out.println("Employee Name: " + emp.getEmployeeName());
		System.out.println("Employee Address: " + emp.getEmployeeAddress());
		System.out.println("Employee Salary: " + emp.getEmployeeSalary());
		System.out.println("-------------------------------------------------");
	}
	
	
	
}
