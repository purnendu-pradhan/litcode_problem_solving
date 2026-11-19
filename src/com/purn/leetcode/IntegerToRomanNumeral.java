package com.purn.leetcode;

public class IntegerToRomanNumeral {

	public static String convertToRoman(int num) {

		int[] values = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };

		String[] symbols = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };

		StringBuilder result = new StringBuilder();

		for (int i = 0; i < values.length; i++) {

			while (num >= values[i]) {
				result.append(symbols[i]);

				num = num - values[i];

			}

		}
		return result.toString();
	}

	public static void main(String[] args) {

		int num = 3749;// MMMDCCXLIX

		System.out.println(convertToRoman(num));
	}

}
