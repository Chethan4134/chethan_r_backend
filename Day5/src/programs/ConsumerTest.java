package programs;


import java.util.function.Consumer;

public class ConsumerTest {
	public static void main(String[] args) {
		Consumer<String> con = a -> System.out.println("Chethan");
		con.accept("akash");
		
	}
}
