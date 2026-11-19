package com.purn.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

	public static int romanToInt(String s) {

		int sum = 0;

		Map<Character, Integer> map = new HashMap<Character, Integer>();

		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);

		for (int i = 0; i < s.length(); i++) {

			int key = map.get(s.charAt(i));

			if (i + 1 < s.length() && key < map.get(s.charAt(i + 1))) {
				sum = sum - key;
			} else {
				sum = sum + key;
			}

		}

		return sum;

	}

	public static void main(String[] args) {

		String s = "MCMXCIV";
		System.out.println(romanToInt(s));
	}

}
