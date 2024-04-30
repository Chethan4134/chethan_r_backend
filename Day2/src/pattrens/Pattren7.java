package pattrens;

public class Pattren7 {
	public static void main(String[] args) {
		int n=6;
		int num=6;
		for(int i = n; i>1; i--) {
			 num=i;
			for(int j = 1; j < i; j++) {
				num--;
				System.out.print(num+" ");
			}System.out.println();
			num=5;
		}
	}
}


//	5 4 3 2 1 
//	4 3 2 1 
//	3 2 1 
//	2 1 
//	1 
