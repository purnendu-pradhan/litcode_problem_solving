package com.org.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StartsWithOne {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(10, 15, 20, 11, 25, 100, 34);
		
		List<Integer> startWithOne = numbers.stream().map(String :: valueOf)
				.filter(s -> s.startsWith("1")).map(Integer :: valueOf).collect(Collectors.toList());
		
		System.out.println(startWithOne);
		
	}

}
