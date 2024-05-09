package jdbcprogram;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
import java.sql.Statement;



public class StudentDatabase {
	
	private static Scanner sc = new Scanner(System.in);
	private static Connection con;
	
	public static void main(String[] args) {
		
		StudentDatabase student = new StudentDatabase();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url = "jdbc:mysql://localhost:3306/jdbc";
			String user = "root";
			String pass = "Sa123";
			
			con = DriverManager.getConnection(url,user,pass);
			
			System.out.println("Enter 1 Insert :");
			System.out.println("Enter 2 For Select :");
			
			System.out.println("Enter the Number :");
			int num = sc.nextInt();
			switch (num) {
			case 1: {
				
				student.insertRecord();
			}
			case 2 : {
				student.selectRecord();
			}
			case 3 : {
				student.updateRecord();
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + num);
			}
			
		} catch (Exception e) {
			
		}
	}
	
	private void insertRecord() throws SQLException{
		
		String query = "insert into student (name,percentage,address) values (?,?,?)";
		
		PreparedStatement prepare = con.prepareStatement(query);
		System.out.println("Enter the name");
		prepare.setString(1, sc.next());
		System.out.println("Enter the percentage");
		prepare.setDouble(2, sc.nextDouble());
		System.out.println("Enter the address");
		prepare.setString(3, sc.next());
		
		int execute = prepare.executeUpdate();
		
		if(execute != 0) {
			System.out.println("Iserted Record Successfully...");
		}
		
	}
	
	private void selectRecord() throws SQLException{
		
		System.out.println("Enter the RollNumber to find thr result : ");
		int number = sc.nextInt();
		String query = "Select * from student where id ="+number;
		
		
		Statement state = con.createStatement();
		ResultSet result = state.executeQuery(query);
		
		if(result.next()) {
			int rollNumber = result.getInt(1);
			String name = result.getString(2);
			Double percentage = result.getDouble(3);
			String address = result.getString(4);
			
			
			System.out.println("RollNumber  : "+rollNumber);
			System.out.println("Student Name : "+name);
			System.out.println("Student Percentage : "+percentage);
			System.out.println("Student address : "+address);
		}else {
			System.out.println("Record not Found!.");
		}
		
	}
	
	private void updateRecord() throws SQLException{
		
	}
	
}
