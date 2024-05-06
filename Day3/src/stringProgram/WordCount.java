package stringprogram;

import java.util.Scanner;

public class WordCount {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String name :");
		String name=sc.next();
		int count=0;
		for(int i = 0; i < name.length(); i++) {
			count++;
		}
		System.out.println(count+ ": Is the Count of the given words");
		sc.close();
	}
}
