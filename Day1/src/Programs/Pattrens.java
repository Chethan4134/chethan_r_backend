package Programs;

public class Pattrens {
	public static void main(String[] args) {
		
		for(int i=1; i<=5;i++)
		{
			for(int j=1; j<=i;j++) {
				if(i>j && i==j) {
				System.out.print( " ");
				}
				else {
					System.out.print(" "+"*");
				}
			}
		
			System.out.println("");
		}
 	}

}


//	*
//	* *
//	* * *
//	* * * *
//	* * * * *