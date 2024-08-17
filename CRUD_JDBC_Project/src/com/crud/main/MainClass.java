//package com.crud.main;
//
//import java.util.Scanner;
//
//public class MainClass {
//public static void main(String[] args) throws RuntimeException {
//	boolean isRunning=true;
//try(Scanner sc=new Scanner(System.in);) {
//	while(true) {
//	System.out.println("Enter Choice");
//	System.out.println("1. Insert");
//	System.out.println("2.SelectAll");
//	System.out.println("3. Select Emp By Id");
//	System.out.println("4. Delete Emp");
//	System.out.println("5. Update Emp");
//	System.out.println("6. Exit");
//	
//int choice=Integer.parseInt(sc.nextLine());
//
//switch(choice) {
//
//case 1:
//	System.out.println(choice);
//	break;
//case 2:
//	System.out.println(choice);
//	break;
//
//case 3:
//	System.out.println(choice);
//	break;
//
//case 4:
//	System.out.println(choice);
//	break;
//
//case 5:
//	System.out.println(choice);
//	break;
//case 6:
//	System.out.println("Thank you And Exit");
//	isRunning=false;
//	break;
//default:
//	System.out.println("Incorrect choicee");
//	break;
//
//}
//}
//
//
//}
//
//
//
//
//}
//}

package com.crud.main;

import java.sql.SQLException;
import java.util.Scanner;

import com.crud.model.Employee;
import com.crud.services.DataBaseServices;

public class MainClass {
    public static void main(String[] args) throws SQLException {
        boolean isRunning = true;
        Scanner sc = null;
        DataBaseServices d=new DataBaseServices();
        try {
            sc = new Scanner(System.in);
            while (isRunning) {
                System.out.println("Enter Choice");
                System.out.println("1. Insert");
                System.out.println("2. Select All");
                System.out.println("3. Select Emp By Id");
                System.out.println("4. Delete Emp");
                System.out.println("5. Update Emp");
                System.out.println("6. Exit");
                
                try {
                    int choice = Integer.parseInt(sc.nextLine());
                    
                    switch (choice) {
                        case 1:
                        	System.out.println("Enter Name , Address , Salary");
                        	//new Employee(sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()));
                           d.insertEmployee(new Employee(sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine())));
                            break;
                        case 2:
                            d.getAllEmp();
                            break;
                        case 3:
                           d.getAllEmpById();
                            break;
                        case 4:
                        	 d.dleteEmp();
                            break;
                        case 5:
                           d.UpdateEmp();
                            break;
                        case 6:
                            System.out.println("Thank you. Exiting...");
                            isRunning = false;
                            break;
                        default:
                            System.out.println("Incorrect choice. Please try again.");
                            break;
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter a number.");
                }
            }
        } finally {
            if (sc != null) {
                sc.close();
            }
        }
    }
    
    
    
   
    
}
