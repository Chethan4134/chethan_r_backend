package programs;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class LinkListExample {
	public static void main(String[] args) {
		
		LinkedList<Employee> employees = new LinkedList<Employee>();
	
		Scanner sc=new Scanner(System.in);
		while(true) {
//			Employee emp=new Employee();	
			System.out.println("Enter the Employee ID :");
//			emp.setId(sc.nextInt());
			int id=sc.nextInt();
			System.out.println("Enter the Employee Name : ");
//			emp.setEmpName(sc.next());
			String empName =sc.next();
			System.out.println("Enter the Employee Salary : ");
//			emp.setEmpSal(sc.nextDouble());
			double sal=sc.nextDouble();
			System.out.println("You want to add Employee Details");
//			employees.add(emp);
			employees.add(new Employee(id, empName, sal));
			
			if(!sc.next().equalsIgnoreCase("yes")) {
			break;
			}
		}
		
//		employees.sort();
		
		Iterator<Employee> iteration=employees.iterator();
		while(iteration.hasNext()) {
			Employee emp1= iteration.next();
			System.out.println(emp1);
			}
		sc.close();
	}	
}
