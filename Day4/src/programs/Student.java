package programs;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Student {
	private int slNo;
	private int age;
	private String stdName;
	private int marks;
	
	public Student(int slNo,int age, String stdName, int marks) {
		super();
		this.slNo = slNo;
		this.age = age;
		this.stdName = stdName;
		this.marks = marks;
	}

	public Student() {
		super();
	}

	@Override
	public int hashCode() {
		return this.age;
	}

	@Override
	public boolean equals(Object obj) {
		Student std = (Student) obj;
		return this.hashCode() == std.hashCode();
	}

	@Override
	public String toString() {
		return this.slNo+" "+this.age+" "+this.stdName+" "+this.marks;
	}
	
	public static void main(String[] args) {
		Set<Student> std = new HashSet<Student>();
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("Enter the Serial No of the Student :");
			int slNo = sc.nextInt();
			System.out.println("Enter the Age of the Student");
			int age = sc.nextInt();
			System.out.println("Enter the name of the Student");
			String stdName = sc.next();
			System.out.println("Enter the Marks of the Student");
			int marks = sc.nextInt();
			std.add(new Student(slNo,age,stdName,marks));
			System.out.println("You want to add Student Details");
			if (!sc.next().equalsIgnoreCase("yes")) {
				break;
			}
		}
		Iterator<Student> iteration = std.iterator();
		while (iteration.hasNext()) {
			Student std1 = iteration.next();
			System.out.println(std1);
		}
		sc.close();
	}
	
}
