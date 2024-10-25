package string_program;

import java.util.Scanner;

public class CountEach {
	public static void main(String args[]){    
		Scanner sc = new Scanner(System.in);  
		System.out.println("Enter the String name :"); 
		String name = sc.nextLine();
		int count[] = new int[256];   
		for (int i = 0; i < name.length(); i++){  
			count[(int) name.charAt(i)]++;  
			}    
		for (int j = 0; j < 256; j++){  
			if (count[j] != 0){       
				System.out.println((char) j + " --> " + count[j]);  
					}  
				} 
				sc.close();
			} 
}
