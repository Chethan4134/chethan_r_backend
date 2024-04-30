package pattrens;

public class Pattren10 {
public static void main(String[] args) {
		int num=1;
		for(int i=1; i<=6;i++){
			num=i;
			for(int j=1; j<i;j++) {
				num--;
					System.out.print(num +" ");
				
			}
		
			System.out.println("");
		
		}
 	}
}

//	1 
//	2 1 
//	3 2 1 
//	4 3 2 1 
//	5 4 3 2 1 