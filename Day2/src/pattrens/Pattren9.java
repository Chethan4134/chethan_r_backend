package pattrens;

public class Pattren9 {
	public static void main(String[] args) {
		int n=5;
		int num=0;
		for(int i = 0; i<n;i++) {
			num=i;
			for(int j=n; j>i;j--) {
				num++;
				System.out.print(num+" ");
			}System.out.println();
			num=6;
		}
	}
}


//	1 2 3 4 5 
//	2 3 4 5 
//	3 4 5 
//	4 5 
//	5 
