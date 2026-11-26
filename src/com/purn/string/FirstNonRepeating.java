package com.purn.string;

import java.util.stream.Stream;

public class FirstNonRepeating {

	public static void main(String[] args) {

		String str = "swiss";

		/*for (int i = 0; i < str.length(); i++) {

			boolean isRepeated = false;

			for (int j = 0; j < str.length(); j++) {

				if (i != j && str.charAt(i) == str.charAt(j)) {

					isRepeated = true;
					break;
				}

			}
			if (!isRepeated) {
				System.out.println(str.charAt(i));

				return;
			}
		}

		System.out.println("No non reapted character!");*/
		
		
		String result = str.chars().mapToObj(c -> (char)c)
				.filter(ch -> str.indexOf(ch) == str.lastIndexOf(ch))
				.map(String::valueOf)
				.findFirst()
				.orElse("No non Reapted character");
		
		System.out.println(result);
	}
	

}
