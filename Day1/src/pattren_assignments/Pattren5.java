package pattren_assignments;

public class Pattren5 {
	public static void main(String []args) {
		int n = 5;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (j % 2 == 0) {
					System.out.print(0+" ");
				} else {
					System.out.print(1+" ");
				}
			}
			System.out.println();
		}
	}

}



//  1 0 1 0 1 
//  1 0 1 0 1 
//  1 0 1 0 1 
//  1 0 1 0 1 
//  1 0 1 0 1 
