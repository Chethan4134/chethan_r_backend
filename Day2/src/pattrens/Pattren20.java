package pattrens;

public class Pattren20 {
	public static void main(String[] args) {
		int n=5;
		for(int i=0; i<=n; i++) {
			for(int j=n;j>=0-i;j--) {
				System.out.print("  ");
			}
			for(int j=n;j>=2*i-1;j--) {
				System.out.print("*" + " ");
			}System.out.println();
		}
		}
}


//* * * * * * * 
//	* * * * * 
//    * * * 
//      * 
    
        