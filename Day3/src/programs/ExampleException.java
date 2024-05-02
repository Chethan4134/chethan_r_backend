package programs;

public class ExampleException {
	public static void main(String[] args) {
		try {
			int[] number= {1,5,3,6,9};
			System.out.println(number[9]);
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		finally {
			System.err.println(randomException());
		}
	}
	public static String randomException() {
		try {
			int number =10/0;
			System.out.println(number);
			return "try";
		}catch(Exception e)
		{
			return "catch";
		}
//		finally {
//			return "finally";
//		}
		
	}
}
