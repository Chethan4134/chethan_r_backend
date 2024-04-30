package pattrens;

public class Pattren6 {
	public static void main(String[] args) {
		for(int i = 1; i<=5; i++) {
			int num=1;
			for(int j = 5; j >= i; j--) {
				System.out.print(num+" ");
				num++;
			}System.out.println();
		}
	}
}


// 	1 2 3 4 5 
//	1 2 3 4 
//	1 2 3 
//	1 2 
//	1 
