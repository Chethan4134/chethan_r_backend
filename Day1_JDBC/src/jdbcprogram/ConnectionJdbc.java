package jdbcprogram;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;



public class ConnectionJdbc {
	public static void main(String[] args) {
		
		
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Scanner sc = new Scanner(System.in);
			String url = "jdbc:mysql://localhost:3306/jdbc";
			String user = "root";
			String pass = "Sa123";
			
			Connection connection = DriverManager.getConnection(url,user,pass);
			
			String query = "insert into student (name,percentage,address) values (?,?,?)";
			
			PreparedStatement prepare = connection.prepareStatement(query);
			System.out.println("enter the name");
			prepare.setString(1, sc.next());
			System.out.println("enter the percentage");
			prepare.setDouble(2, sc.nextDouble());
			System.out.println("enter the address");
			prepare.setString(3, sc.next());
			
			int execute = prepare.executeUpdate();
		
			
			System.out.println(execute);
			sc.close();
			connection.close();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
}
