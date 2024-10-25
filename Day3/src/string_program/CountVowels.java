package string_program;

import java.util.Scanner;

public class CountVowels {

	public static void countVowels(String name) {
		int count = 0;
		for (int i = 0; i < name.length(); i++) {
			char ch = name.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
					|| ch == 'O' || ch == 'U') {
				count++;
			}
		}
		System.out.println("Vowel present in the given String is : " + count);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr the String name");
		String name = sc.next();
		countVowels(name);
		sc.close();
	}
}
