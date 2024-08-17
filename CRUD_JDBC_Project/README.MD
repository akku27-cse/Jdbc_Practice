



##query
```
package com.curd.util;

public class QueryUtil {

	public static String insertEmployeeQuery() {
		return "INSERT INTO emp3 (empName,empAddress,empSalaray) values(?,?,?)";
	}
	public static String getAllEmp() {
		return "select * from emp3";
	}
	public static String getAllEmpById() {
		return "select * from emp3 where empId=2";
	}
	public static String deleteEmp() {
		return "delete from emp3 where empId=2";
	}
	public static String updateEmp() {
		return "UPDATE emp3 SET   empAddress= Dnk WHERE CustomerID = 1";
	}
}
```
