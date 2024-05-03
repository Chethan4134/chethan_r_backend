package stringProgram;
import java.util.Scanner;

public class Palindrom {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String name :");
		String name=sc.next();
		String reversename="";
		for(int i = 0; i < name.length();i++) {
			reversename=name.charAt(i)+reversename;
		}
		if(name.equals(reversename)) {
			System.out.println(name+": The given name is palindrom");
		}
		else {
			System.out.println(reversename+": The given name is not palindrom ");
		}sc.close();
	}
	
}
