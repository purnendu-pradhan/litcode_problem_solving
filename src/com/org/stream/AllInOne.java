package com.org.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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
		
		List<Character> duplicateCharacter = str1.chars()
				.mapToObj(c -> (char) c)
				.filter(c -> !seens.add(c))
				.distinct()
				.collect(Collectors.toList());
		
		//System.out.println(duplicateCharacter);
		
		
				
		
		//Duplicate Integer elements
		List<Integer> number = Arrays.asList(1,2,2,3,4,3,6,7);

		Set<Integer> seen = new HashSet<>();

		List<Integer> duplicate = number.stream().filter(n -> !seen.add(n)).distinct().collect(Collectors.toList());


		//System.out.println("Duplicate elements : "+duplicate);
		
		List<Product> products = Arrays.asList(
	            new Product(101, "Laptop", 55000),
	            new Product(102, "Mobile", 25000),
	            new Product(103, "Keyboard", 1500),
	            new Product(104, "Mouse", 800),
	            new Product(105, "Monitor", 12000)
	        );
		
		products.stream()
				.filter(p -> p.getPrice()>1500)
				.forEach(pr -> System.out.println(pr.getName()));
		
		//System.out.println(product);
		//product.forEach(pr -> System.out.println(pr.getName()));
		
		
		List<String> name = products.stream()
				.filter(p -> p.getPrice() > 1500)
				.map(p -> p.getName())
				.collect(Collectors.toList());
		
		//System.out.println(name);
		
		//Find the word that has the highest length

		String longest = "I am learning Streams API in Java";
		
		String longestlength = Arrays.stream(longest.split(" "))
				.max(Comparator.comparing(String::length))
				.get();
		
		System.out.println(longestlength);
		
		
		//Remove duplicates from the string and return in the same order
		
		String s = "dabcadefg";
		
		//s.chars().mapToObj(ch -> (char) ch).distinct().forEach(System.out::print);
		
		//Arrays.stream(s.split("")).distinct().forEach(System.out::print);
		
		//Find the 2nd Nth highest length of word
		
		String str2 = "I am learning Streams API in Java";
		
		String secondLength = Arrays.stream(str2.split(" "))
				.sorted(Comparator.comparing(String::length).reversed())
				.skip(1)
				.findFirst().get();
		System.out.println(secondLength);
		
		//Find the 2nd highest length word in a sentence
		
		int ans = Arrays.stream(str2.split(" "))
				.map(word -> word.length())
				.sorted(Comparator.reverseOrder())
				.skip(1)
				.findFirst()
				.orElse(null);
		
		//System.out.println(ans);
		
		//Find the words with a specified number of vowels(2)
		
		Stream<String> value = Arrays.stream(str2.split(" "))
						.filter(s1 -> s1.replaceAll("[^aeiouAEIOU]", "")
						.length() == 2);
		//Let's break it down:
		//- replaceAll() replaces characters matching the regular expression.
		//- [^aeiouAEIOU] means any character except vowels.
		//- "" replaces those non-vowel characters with nothing.
		//- length() counts the remaining vowels.
		//- == 2 checks whether the word contains exactly two vowels.
		
		System.out.println("**");
		//value.forEach(System.out::println);
		
		//Divide given integer list into lists of even and odd numbers
		
		int[] number1 = {1,2,3,4,5,6,7,8,9};
		
		List<Integer> integerList = Arrays.stream(number1).boxed().collect(Collectors.toList());
		System.out.println(integerList);
		
		List<List<Integer>> evenOdd = integerList.stream()
				.collect(Collectors.partitioningBy(i -> i%2 == 0))
				.entrySet()
				.stream()
				.map(x -> x.getValue())
				.collect(Collectors.toList());
		
		System.out.println(evenOdd);
	}

}
