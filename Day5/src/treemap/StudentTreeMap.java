package treemap;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;


public class StudentTreeMap {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		TreeMap<Integer, Student> details = new TreeMap<Integer, Student>();
		while(true) {
			
			System.err.println("Enter the Student ID : ");
			int id = sc.nextInt();
			System.out.println("Enter the Student name : ");
			String name  = sc.next();
			System.out.println("Enter the Student age : ");
			int age = sc.nextInt();
			System.out.println("You Want to Add more Student Details");
			details.put(id, new Student(id,name,age));
			if (!sc.next().equalsIgnoreCase("yes")) {
				break;
			}
		}sc.close();
		
		Set<Entry<Integer,Student>> entrySet = details.entrySet();
		for (Entry<Integer, Student> entry : entrySet) {
			System.out.println(entry.getKey()+"------>" + entry.getValue());
		}
	}
}
