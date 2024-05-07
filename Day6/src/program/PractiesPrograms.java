package program;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PractiesPrograms {
	public static void main(String[] args) {
		List<Integer> input  = Arrays.asList(1,5,3,6,9,8,4,22,55,22);
		
//  Separate odd and even number ----1
//	Map<Boolean, List<Integer>> num = input.stream()
//		.collect(Collectors.partitioningBy(e -> e%2==0));
//		System.out.println(num);
//===============================================================================================		
		
//Remove Duplicate Elements from list -----2
//		input.stream().distinct().forEach(System.out::println);
//		input.stream().distinct().collect(Collectors.toList()).forEach(System.out::println);;
//===============================================================================================		

//Frequency of each character in String ---------3
//		String name = "learning new things in java";
//	Map<Character, Long> name1 = name.chars().mapToObj(c ->(char)c)
//		.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
//	System.out.println(name1);
//===============================================================================================		
		
//Sort the List in Reverse Order ---------4
//		input.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);
//		input.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
		
//Print the multiple of 5 ------5
//		input.stream().filter(n -> n%5==0).forEach(System.out::println);
//===============================================================================================		

//Merge Two unSorted arrays ------6
//	int[] a = {4,6,3,5,8};
//	int[] b = {5,6,3,8};
//	
//	int[] c = IntStream.concat(Arrays.stream(a),Arrays.stream(b)).sorted().toArray();
//	for (int i : c) {
//		System.out.println(i);
//	}
//	
//===============================================================================================		
		
//three max and min from the list ------7
		//min
//		input.stream().sorted().limit(3).forEach(System.out::println);
//		System.out.println("=====================");
		// max
//		input.stream().sorted(Collections.reverseOrder())
//		.distinct().limit(3).forEach(System.out::println);
//===============================================================================================			
		
// Sort list of String in increasing order of their length  ------8
//		List<String> names = Arrays.asList("chethan","Akash","Scahin");
//		names.stream().sorted(Comparator.comparing(String::length)).forEach(System.out::println);
//===============================================================================================
	
//Sum and Average of all the elements in the array -------9
//	int[] array = {4,9,6,3,2,5,8,7};
//	
//	int array1 = Arrays.stream(array).sum();
//	System.out.println(array1);
//	
//	double array2 = Arrays.stream(array).average().getAsDouble();
//		System.out.println(array2);
//==============================================================================================	
		
//Frequency of each element in an array ---------10
		
//	Map<Integer, Long>num = input.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
//		System.out.println(num);
//==============================================================================================
		
//Join List of String with prefix,suffix,Delimiter  ---11
		
//		List<String> name = Arrays.asList("java is a programming language");
//		String str= name.stream().collect(Collectors.joining("Delimiter","prefix","suffix"));
//		System.out.println(str);
//===============================================================================================	
		
//Merge Two unSorted arrays remove duplicate  ------12
//		int[] a = {4,6,3,5,8};
//		int[] b = {5,6,3,8};
//		
//		int[] c = IntStream.concat(Arrays.stream(a),Arrays.stream(b)).sorted().distinct().toArray();
//		for (int i : c) {
//			System.out.println(i);
//		}
//=================================================================================================		
		
// maximum and minimum in a list	-----13
		
//		Integer l1= input.stream().max(Comparator.naturalOrder()).get();
//		System.out.println(l1);
//		
//		Integer l2= input.stream().min(Comparator.naturalOrder()).get();
//		System.out.println(l2);
//=================================================================================================		
		
//Anagram 		----14
//		String str = "race";
//		String str2 = "care";
//		
//		String s1 = Stream.of(str.split("")).map(String::toUpperCase).sorted()
//				.collect(Collectors.joining());
//		
//		String s2 = Stream.of(str2.split("")).map(String::toUpperCase).sorted()
//				.collect(Collectors.joining());
//		if(s1.equals(s2)) {
//			System.out.println("Is Anagram");
//		}
//==================================================================================================	

// Reverse an Integer array  ---15
//		Integer[] num = {4,5,6,3,2,8,9};
//		int[] number = IntStream.rangeClosed(1, num.length).map(i ->num[num.length-i]).toArray();
//		for (int j : num) {
//			System.out.println(j);
//		}
//		System.out.println("============================");
//		for (int j : number) {
//			System.out.println(j);
//		}
//==================================================================================================	
	
//Palindrom	 -----16
//		String name = "malayalam";
//		boolean name2 = IntStream.range(0, name.length()/2)
//				 .noneMatch(i ->name.charAt(i) !=name.charAt(name.length()-i-1));
//		System.out.println(name2);
//===================================================================================================
		
//Last  Element of an array   ----17
//		Integer[] num = {4,5,8,6,2};
//		int[] number = L
//		
//===================================================================================================

//Age of person in year -----18
//		LocalDate birthday = LocalDate.of(2000,11,9);
//		LocalDate today = LocalDate.now();
//		System.out.println(ChronoUnit.YEARS.between(birthday, today));

//===================================================================================================
		
//Sum of All Digits of a Number    ------19
//		int number = 123654686;
//		Long num = Stream.of(String.valueOf(number).split(""))
//				.collect(Collectors.summingLong(Integer::parseInt));
//		System.out.println(num);

//====================================================================================================	

//Second largest number in an Integer array -----20
		
//		List<Integer> array = Arrays.asList(4,9,6,5,8,6);
//		System.out.println(array.stream().sorted((o1,o2)-> o2.compareTo(o1)).skip(1).findFirst().get());
		
//====================================================================================================

//Common elements between Two array  -------21
		
//		List<Integer> array1 = Arrays.asList(2,5,7,8,5,2,36,51);
//		List<Integer> array2 = Arrays.asList(4,5,7,88,5,55,22,11,47);
//		array1.stream().filter(array2::contains).forEach(System.out::println);
		
//====================================================================================================		
		
//Sum of First 10 Natural number --------22
		
//		int num = IntStream.range(1, 11).sum();
//		System.out.println(num);

//====================================================================================================
		
//Reverse Each word of a String  -------23
		
//		String str = "Chtehan";
//		String str1 = Arrays.stream(str.split(" ")).map(word -> new StringBuffer(word)
//				.reverse()).collect(Collectors.joining(" "));
//		System.out.println(str1);
//====================================================================================================		
		
//Find string which start with number  -------24
		
//		List<String> str = Arrays.asList("Chethan","1Akash","2Sachin");
//		str.stream().filter(s -> Character.isDigit(s.charAt(0)))
//		.forEach(System.out::println);
//====================================================================================================		

//Find duplicate elements from an array -------25
//		List<Integer> listOfIntegers = Arrays.asList(4,5,8,6,3,2,7,7,5,6,9,8,9);
//		Set<Integer> set = new HashSet<Integer>();
//		Set<Integer> list = listOfIntegers.stream().filter(i -> !set.add(i))
//		.collect(Collectors.toSet());
//		System.out.println(list);
//=======================================================================================================
		
// Fibonacci Series  -------26
//	 Stream.iterate(new int[] {0,1}, f ->new int[] {f[1],f[0]+f[1]})
//		.limit(10).map(f -> f[0]).forEach(System.out::println);
//======================================================================================================	
		
	
		
	}
}
