package jdbcprogram;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class EmployeeData {
	private static Scanner sc = new Scanner(System.in);
	private static Connection con;

	public static void main(String[] args) {

		EmployeeData emp = new EmployeeData();

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			String url = "jdbc:mysql://localhost:3306/jdbc";
			String user = "root";
			String pass = "Sa123";

			con = DriverManager.getConnection(url, user, pass);

			System.out.println("Enter 1 Insert :");
			System.out.println("Enter 2 For Select by Id :");
			System.out.println("Enter 3 For Select All :");
			System.out.println("Enter 4 For Delete by Id : ");
			System.out.println("Enter 5 For Update : ");
			System.out.println("Enter the Number :");
			System.out.println("==================================");
			int num = sc.nextInt();
			switch (num) {
			case 1: {

				emp.insertRecord();
			}
				break;
			case 2: {
				emp.selectRecordById();
			}
				break;
			case 3: {
				emp.selectAllRecord();
			}
				break;
			case 4: {
				emp.deleteRecord();
			}
				break;
			case 5: {
				emp.update();
			}
				break;
			default:
				System.out.println("You Enterd Wrong");

			}

		} catch (Exception e) {

		}
	}

	private void insertRecord() throws SQLException {

		String query = "insert into employee (name,sal,dept) values (?,?,?)";
		PreparedStatement prepare = con.prepareStatement(query);

		while (true) {

			System.out.println("Enter the name");
			prepare.setString(1, sc.next());
			System.out.println("Enter the salary");
			prepare.setDouble(2, sc.nextDouble());
			System.out.println("Enter the department name");
			prepare.setString(3, sc.next());

			int execute = prepare.executeUpdate();

			if (execute != 0) {
				System.out.println("Iserted Record Successfully...");
			}

			System.out.println("You want to Insert New Record");
			if (!sc.next().equalsIgnoreCase("yes")) {
				break;
			}

		}
	}

	private void selectRecordById() throws SQLException {
		System.out.println("Enter the Employee Id to Check the Details : ");
		int number = sc.nextInt();
		String query = "Select * from employee where id =" + number;

		Statement state = con.createStatement();
		ResultSet result = state.executeQuery(query);

		if (result.next()) {
			int id = result.getInt(1);
			String name = result.getString(2);
			Double sal = result.getDouble(3);
			String dept = result.getString(4);

			System.out.println("Employee ID  : " + id);
			System.out.println("Employee Name : " + name);
			System.out.println("Employee Salary : " + sal);
			System.out.println("Employee Department : " + dept);
		} else {
			System.out.println("Record not Found!.");
		}
		sc.close();

	}

	private void selectAllRecord() throws SQLException {
		System.out.println("===========================================");
		String query = "Select * from employee";
		Statement state1 = con.createStatement();
		ResultSet result = state1.executeQuery(query);

		while (result.next()) {
			int id = result.getInt(1);
			String name = result.getString(2);
			Double sal = result.getDouble(3);
			String dept = result.getString(4);

			System.out.println("Employee ID  : " + id);
			System.out.println("Employee Name : " + name);
			System.out.println("Employee Salary : " + sal);
			System.out.println("Employee Department : " + dept);

			System.out.println("=======================================");
			

		}
	}

	private void deleteRecord() throws SQLException {

		System.out.println("Enter the Employee Id to delete a Record");
		int id;
		id = sc.nextInt();
		String query = "delete from employee where id =" + id;
		Statement smt = con.createStatement();
		int row = smt.executeUpdate(query);

		if (row != 0) {
			System.out.println("Record data is Deleted");
		} else {
			System.out.println("Employee Id not Found");
		}

	}

	private void update() throws SQLException {

		System.out.println("Enter 1 to update name");
		System.out.println("Enter 2 to update salary");
		System.out.println("Enter 3 to update department");

		int choice = sc.nextInt();

		System.out.println("enter id to update");
		int id = sc.nextInt();

		switch (choice) {
		case 1: {

			String query = "update employee set name = ? where id = " + id;

			PreparedStatement preparedStatement = con.prepareStatement(query);

			System.out.println("Enter new Employee name");
			preparedStatement.setString(1, sc.next());

			preparedStatement.execute();

			System.out.println("Employee name updated");

			break;
		}

		case 2: {

			String query = "update employee set sal = ? where id = " + id;

			PreparedStatement preparedStatement = con.prepareStatement(query);

			System.out.println("Enter new Updated salary");
			preparedStatement.setDouble(1, sc.nextDouble());

			preparedStatement.execute();

			System.out.println("Salary updated");

			break;
		}

		case 3: {

			String query = "update employee set dept = ? where id = " + id;

			PreparedStatement preparedStatement = con.prepareStatement(query);

			System.out.println("Enter new department name");
			preparedStatement.setString(1, sc.next());

			preparedStatement.execute();

			System.out.println("Department name updated");

			break;
		}

		default:
			System.out.println("Enterd Id is not Found");
		}

	}
}
