package programs;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Employee {
	private int empId;
	private String EmpName;
	private double empSal;

	public Employee() {
		super();
	}

	public Employee(int empId, String empName, double empSal) {
		super();
		this.empId = empId;
		EmpName = empName;
		this.empSal = empSal;
	}

	@Override
	public int hashCode() {
		return this.empId;
	}

	@Override
	public boolean equals(Object obj) {
		Employee emp = (Employee) obj;
		return this.hashCode() == emp.hashCode();
	}

	@Override
	public String toString() {
		return this.empId + " " + this.EmpName + " " + this.empSal;
	}

	public static void main(String[] args) {

		Set<Employee> employees = new HashSet<Employee>();

		Scanner sc = new Scanner(System.in);
		while (true) {

			System.out.println("Enter the Employee ID :");

			int id = sc.nextInt();
			System.out.println("Enter the Employee Name : ");

			String empName = sc.next();
			System.out.println("Enter the Employee Salary : ");

			double sal = sc.nextDouble();
			System.out.println("You want to add Employee Details");

			employees.add(new Employee(id, empName, sal));

			if (!sc.next().equalsIgnoreCase("yes")) {
				break;
			}
		}

//		employees.sort();

		Iterator<Employee> iteration = employees.iterator();
		while (iteration.hasNext()) {
			Employee emp1 = iteration.next();
			System.out.println(emp1);
		}
		sc.close();
	}

}
