package com.org.stream;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class AllInOne {

	public static void main(String[] args) {

		String input = "java spring java kafka spring java";
		//Occurrence
		Map<String, Long> occurrence = Arrays.stream(input.split(" ")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		
		//System.out.println(occurrence);
		
		List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);
		//SecondHighest
		int secondLowest = numbers.stream().distinct().sorted().skip(1).findFirst().orElseThrow();
		
		//System.out.println("Second Largest: "+secondLowest);
		//Sum
		int sum = numbers.stream().mapToInt(Integer :: intValue).sum();
		
		//System.out.println(sum);
		
		
		//Average
		Double average = numbers.stream().mapToInt(Integer :: intValue).average().orElse(0);
		
		//System.out.println(average);
		
		//first non-repeated character
		//String str = "swiss";
		String str = "Java is my programming language";
		
		Character result = str.chars().mapToObj(ch -> (char) ch).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap :: new, Collectors.counting()))
				.entrySet().stream().filter(entry -> entry.getValue() == 1).map(Map.Entry :: getKey).findFirst().orElse(null);
		
		//System.out.println(result);
		
		//Duplicate characters in a String
		String str1 = "programming";
		
		Set<Character> seens = new HashSet<>();
		
		List<Character> duplicateCharacter = str1.chars().mapToObj(c -> (char) c).filter(c -> !seens.add(c)).distinct().collect(Collectors.toList());
		
		System.out.println(duplicateCharacter);
		
		
				
		
		//Duplicate Integer elements
		List<Integer> number = Arrays.asList(1,2,2,3,4,3,6,7);

		Set<Integer> seen = new HashSet<>();

		List<Integer> duplicate = number.stream().filter(n -> !seen.add(n)).distinct().collect(Collectors.toList());


		//System.out.println("Duplicate elements : "+duplicate);
		
		
				
	}

}
