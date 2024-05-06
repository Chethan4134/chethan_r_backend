package stringprogram;

import java.util.Scanner;

public class AllVowels {
	public static boolean isAllVowelsPresent(String str) {
		str = str.toLowerCase();
	    boolean found = true;
	    String vowels = "aeiou";
	    for (char ch : vowels.toCharArray()) {
	        if (str.indexOf(ch) == -1) {
	            found = false;
	            break;
	        }
	    }
	    return found;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String name : ");
		String str = sc.next();
		System.out.println(isAllVowelsPresent(str));
		sc.close();
	}
}
