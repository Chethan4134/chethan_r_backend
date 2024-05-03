package arrayprogram;

import java.util.Scanner;

public class Example {
	
	public static void assendingOrder(int[] number) {
		for (int i = 0; i < number.length; i++) {
			int temp;
			for (int j = i+1; j < number.length; j++) {
				if(number[i] > number[j]) {
					temp = number[i];
					number[i] = number[j];
					number[j] = temp;
				}
			}
		}
		System.out.println("After Sorting AssendingOrder");
		for (int i = 0; i <number.length; i++) {
			System.out.println(number[i]);
		}
		
	}
	
	public static void desendingOrder(int[] number) {
		for (int i = 0; i <number.length; i++) {
			int temp;
			for (int j = i+1; j < number.length; j++) {
				if(number[i] <number[j]) {
					temp = number[i];
					number[i] = number[j];
					number[j] = temp;
				}
			}
		}
		System.out.println("After Sorting DesendingOrder");
		for (int i  = 0; i < number.length; i++) {
			System.out.println(number[i]);
		}
	}
	
	public static void main(String[] args) {
//		int [] value = {1,3,4,5};
//		System.out.println(value[2]);		
//		value[2] = 5;
//		System.err.println(value[2]);

//		String[] name = new String[5];
//		name[0] = "chethan";
//		name[1] = "Akash";
//		name[2] = "Smitha";
//		name[3] = "Sachin";
//		name[4] = "Robin";
//	
//		for(int i=0;i<name.length;i++){
//			System.err.println(name[i]);
//		}
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Size of the Array");

		int size = sc.nextInt();

		int[] number = new int[size];
		System.out.println("Enter the number");

		for (int i = 0; i <= size - 1; i++) {
			number[i] = sc.nextInt();
		}
		System.out.println("Enterd numbers");

		for (int i = 0; i < number.length; i++) {
			System.out.println(number[i]);
		}
		assendingOrder(number);
		desendingOrder(number);
		sc.close();
	}
}
