package program;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;import java.util.function.Function;
import java.util.stream.Collectors;

public class Java8program {
	public static void main(String[] args) {
		
	List<Integer>asList = Arrays.asList(1,2,5,6,3,8,55,33,66,88,2);
	
//    print even number
	List<Integer> collect = asList.stream().filter(e -> e%2==0).collect(Collectors.toList());
	System.out.println(collect);

	
//    Start with 1
//    asList.stream().map(e -> Integer.toString(e))
//    .filter(e -> e.startsWith("1")).forEach(System.out::println);
	
	
	
//  Adding the element to the one list to another set
//	Set<Integer> set = new HashSet<Integer>();
//	asList.stream().filter(e -> set.add(e)).forEach(System.out::println);
	
//  Finding the first element	
//	Integer orElse = asList.stream().findFirst().orElse(0);
//	System.out.println(orElse);
	
// Counting the elements in list
//	System.out.println(asList.stream().count());
//	System.out.println(asList.stream().distinct().count());
	
//  Find the Max value in list
//	Integer max = asList.stream().max((o1,o2) -> o1.compareTo(o2)).get();
//	System.out.println(max);
	
	
// 	non repeated First characters    and       Its another way of creating stream
//	String name = "Chethan";
//	Character ch = name.chars().mapToObj(c -> (char)c)
//	.filter(e -> name.indexOf(e)==name.lastIndexOf(e))
//	.findAny().get();
//	System.out.println(ch);
	
// 	Find the FIrst Repeated Character
//	Character ch1 = name.chars().mapToObj(c -> (char)c)
//	.filter(e -> name.indexOf(e)!=name.lastIndexOf(e))
//	.findAny().get();
//	System.out.println(ch1);
	
	
// 	Sorted method
//	asList.stream().sorted().forEach(System.out::println);
	
	
//	Descending order sort
//	asList.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);
	
//  Given an integer array numbers, return true if its repeated 
//	int size = asList.stream().distinct().collect(Collectors.toList()).size();
//	System.out.println(size != asList.size());
	
//	cube the number and print the number is greater than 50	
//  asList.stream().map(n -> n*n*n).filter(e -> e>50).forEach(System.out::println);	
	
// Write Program to print the count of each character in string
//	String name = "chethan";
//	Map<Character, Long> str = name.chars().mapToObj(c -> (char)c)
//			.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
//	System.out.println(str);
	
//	Duplicate value with Occurrence
//	List<String> name = Arrays.asList("aa","bb","bc","bb");
//	name.stream().filter(e ->Collections.frequency(name, e)>1)
//	.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
//	.forEach((str,count)-> System.out.println(str+"---->"+count));
	
	
	}
}
