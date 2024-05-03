package stringProgram;
import java.util.Scanner;
public class Panagram {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);  
		System.out.println("Enter the name :"); 
		String name = sc.nextLine();
		int[] freq = new int[26];
		name =name.toUpperCase();
		for(int i = 0;i<name.length(); i++) {
			freq[name.charAt(i)-65]++;
		}
		for (int i = 0; i < freq.length; i++) {
			if(freq[i]==0){
				System.out.println("the given String is panagram");
			}
			else {
				System.out.println("its not panagram");
			}
		}
		sc.close();
	}
}
