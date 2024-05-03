package stringProgram;

import java.util.Scanner;

public class Reverse {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String name :");
		String name=sc.next();
		String reversename="";
		for(int i = 0; i < name.length();i++) {
			reversename=name.charAt(i)+reversename;
		}
		System.out.println("the reverse of the given String is :"+reversename);
		sc.close();
	}
}
	
