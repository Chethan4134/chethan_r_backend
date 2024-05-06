package programs;

import java.util.function.Function;

public class FunctionTest {
	public static void main(String[] args) {
		Function<Integer, Integer> func = a -> a+10;
		System.out.println(func.apply(10));
	}
}
