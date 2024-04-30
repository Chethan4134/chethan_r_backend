package pattrens;

public class Pattren13 {
	public static void main(String[] args) {

		for(int i = 1; i<=6; i++) {
			
			for(int j = 6; j >= 1; j--) {
				if(j>i) {
					System.out.print(i+" ");
				}
					else {
						System.out.print(" ");
					
				}
			}System.out.println();
		}	
	
}
}

//	1 1 1 1 1  
//	2 2 2 2   
//	3 3 3    
//	4 4     
//	5      
    
