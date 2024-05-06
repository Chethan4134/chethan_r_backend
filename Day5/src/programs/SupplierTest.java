package programs;

import java.util.function.Supplier;

public class SupplierTest {
	
	public static void main(String[] args) {
		Supplier<String> sup = () -> {
			return "chethan";	
		};
	System.out.println(sup.get());
	}
}