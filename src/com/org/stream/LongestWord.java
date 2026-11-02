package com.org.stream;

import java.util.Arrays;
import java.util.Comparator;

public class LongestWord {

	public static void main(String[] args) {

		String name = "Java Spring Boot Microservices"; 
		
		String longest = Arrays.stream(name.split(" ")).max(Comparator.comparingInt(String :: length)).orElse(null);
		
		System.out.println(longest);
	}

}
