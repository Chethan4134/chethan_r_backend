package employee;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;


public class EmployeeMap {
	public static void main(String[] args) {
		HashMap<Integer, Employee> details = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		while (true) {

			System.out.println("Enter the Employee ID :");
			int id = sc.nextInt();
			System.out.println("Enter the Employee Name : ");
			String name = sc.next();
			System.out.println("Enter the Employee Designation : ");
			String designation = sc.next();
			System.out.println("Enter the Employee Department : ");
			String department = sc.next();
			System.out.println("You want to add Employee Details");

			details.put(id, new Employee(id,name,designation,department));

			if (!sc.next().equalsIgnoreCase("yes")) {
				break;
			}
		}
		sc.close();
		Set<Entry<Integer,Employee>> entrySet = details.entrySet();
		for (Entry<Integer, Employee> entry : entrySet) {
			System.out.println(entry.getKey()+"------>" + entry.getValue());
		}
		
		
	}
}
