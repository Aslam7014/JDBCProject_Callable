package com.jsp.jdbc.callable;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;


public class JDBC_Statement_Callable {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_studentdb1?user=root&password=root");
			
			CallableStatement cst = conn.prepareCall("call addStudent(?,?,?,?)");
			cst.setInt(1, 133);
			cst.setString(2, "Shikha");
			cst.setString(3, "d@gmail.com");
			cst.setInt(4, 98);
			
			boolean row =cst.execute();
			
			if(row != false) {
				System.out.println(row +" row Inserted");
			}
			else {
				System.out.println("somethind went wrong....");
			}
			
			conn.close();
			sc.close();
		
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_studentdb1?user=root&password=root");
			
			CallableStatement cst = conn.prepareCall("call updateStudent(?,?)");
			cst.setString(1, "rupal"); // Assuming student ID is the parameter
			cst.setInt(2, 117);
			
			boolean row =cst.execute();
			
			if(row != false) {
				System.out.println(row +" row Inserted");
			}
			else {
				System.out.println("somethind went wrong....");
			}
			
			conn.close();
		
			
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_studentdb1?user=root&password=root");
			
			CallableStatement cst = conn.prepareCall("call deleteStudent(?)");
			 cst.setInt(1, 111); // Assuming student ID is the parameter
	         
			
            int row =cst.executeUpdate();
			
			if(row > 0) {
				System.out.println(row +" row Delete");
			}
			else {
				System.out.println("somethind went wrong....");
			}
			
			conn.close();boolean row1 =cst.execute();
			
			if(row1 != false) {
				System.out.println(row1 +" row Inserted");
			}
			else {
				System.out.println("somethind went wrong....");
			}
			
			conn.close();
		
			
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_studentdb1?user=root&password=root");
			
			CallableStatement cst = conn.prepareCall("call displayStudent(?,?)");
			 cst.setInt(1, 111); 
			
            boolean row1=cst.execute();
			
			if(row1 != false) {
				System.out.println(row1 +" row Inserted");
			}
			else {
				System.out.println("somethind went wrong....");
			}
			
			conn.close();
			
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
		
		
		
	}

}

//
//package com.jsp.jdbc.callable;
//
//import java.sql.CallableStatement;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;
//import java.util.Scanner;
//
//public class JDBC_Statement_Callable {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        try {
//            Class.forName("com.mysql.cj.jdbc.Driver");
//
//            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_studentdb1?user=root&password=root");
//
//            // Adding a student
//            CallableStatement addStudent = conn.prepareCall("call addStudent(?,?,?,?)");
//            addStudent.setInt(1, 111);
//            addStudent.setString(2, "Shikha");
//            addStudent.setString(3, "d@gmail.com");
//            addStudent.setInt(4, 98);
//            int addRow = addStudent.executeUpdate();
//            if (addRow > 0) {
//                System.out.println(addRow + " row Inserted");
//            } else {
//                System.out.println("Something went wrong while adding a student.");
//            }
//
//            // Updating a student (example with parameters)
//            CallableStatement updateStudent = conn.prepareCall("call updateStudent(?,?)");
//            updateStudent.setInt(1, 111); // Assuming student ID is the first parameter
//            updateStudent.setString(2, "NewName");
//            int updateRow = updateStudent.executeUpdate();
//            if (updateRow > 0) {
//                System.out.println(updateRow + " row Updated");
//            } else {
//                System.out.println("Something went wrong while updating a student.");
//            }
//
//            // Deleting a student (example with parameters)
//            CallableStatement deleteStudent = conn.prepareCall("call deleteStudent(?)");
//            deleteStudent.setInt(1, 111); // Assuming student ID is the parameter
//            int deleteRow = deleteStudent.executeUpdate();
//            if (deleteRow > 0) {
//                System.out.println(deleteRow + " row Deleted");
//            } else {
//                System.out.println("Something went wrong while deleting a student.");
//            }
//
//            // Displaying student records
//            CallableStatement displayStudent = conn.prepareCall("call displayStudent(?,?)");
//            // Assuming displayStudent requires parameters, set them before execution
//            // displayStudent.setInt(1, ...);
//            // displayStudent.setString(2, ...);
//            // Execute the statement here
//
//            conn.close();
//            sc.close();
//
//        } catch (ClassNotFoundException | SQLException e) {
//            e.printStackTrace();
//        }
//    }
//}
//
