package com.org.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindDuplicate {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(1, 1, 2, 3, 4, 4, 5, 6);
		
		List<Integer> duplicates = numbers.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
				.entrySet().stream().filter(entry -> entry.getValue() > 1).map(Map.Entry :: getKey).collect(Collectors.toList());
		
		System.out.println(duplicates);
	}

}
