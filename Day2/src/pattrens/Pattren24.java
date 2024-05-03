package pattrens;

public class Pattren24 {
	public static void main(String[] args) {
			int n=5;
			
			for(int i=1;i<=n;i++) {
				for(int j=1;j<=n-i;j++) {	
					System.out.print("  ");
				}
				int x=n-i+1;
				for(int j=1;j<=i*2-1;j++) {	
					if(j<i) {
						System.out.print(x++ +" ");
					}
					else
						System.out.print(x-- +" ");
				}
				System.out.println();
				
			}
		}
	}


//  		  5 
//			4 5 4 
//		  3 4 5 4 3 
//		2 3 4 5 4 3 2 
//	  1 2 3 4 5 4 3 2 1 
