package string_program;

import java.util.Scanner;

public class Panagram {
		public static boolean isPanagram(String name) {
			name = name.toUpperCase();
			int[] freq = new int[26];
			for(int i=0;i<name.length();i++) {
				freq[name.charAt(i)-65]++;
			}
			for(int i=0;i<freq.length;i++) {
				if(freq[i]==0) {
					return false;
				}
			
			}
			return true;
		}
		
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the String value : ");
			String name = sc.next();
			
			System.out.println("Enterd Value is Panagram or Not");
			System.out.println(isPanagram(name));
			sc.close();
		}
}
