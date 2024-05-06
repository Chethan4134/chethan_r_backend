package stringprogram;

import java.util.Scanner;

public class Anagram {
	public static void sort(char[] c) {
		for (int i = 0; i < c.length; i++) {
			for (int j = i + 1; j < c.length; j++) {
				if (c[i] > c[j]) {
					char temp = c[i];
					c[i] = c[j];
					c[j] = temp;
				}
			}
		}

	}

	public static boolean equals(char[] c1, char[] c2) {
		boolean flag = true;
		for (int i = 0; i < c1.length; i++) {
			if (c1[i] != c2[i]) {
				flag = false;
				break;
			}

		}
		return flag;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr the First name");
		String name1 = sc.next();
		System.out.println("Enetr the Second name");
		String name2 = sc.next();

		if (name1.length() != name2.length()) {
			System.out.println("The given String is not a anagram");
		} else {
			char[] c1 = name1.toCharArray();
			char[] c2 = name2.toCharArray();

			sort(c1);
			sort(c2);

			if (equals(c1, c2)) {
				System.out.println("Enterd String is Anagram");
			} else {
				System.out.println("Enterd String is Not a anagram");
			}
		}sc.close();
	}
}
