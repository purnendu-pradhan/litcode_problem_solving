package com.purn.dsa;

public class PalindromeTwoPointer {
	
	public static boolean palindromeCheck(String str) {

		int left = 0;
		int right = str.length() - 1;

		while (left < right) {
			if (str.charAt(left) != str.charAt(right)) {

				return false;
			}
			left++;
			right--;
		}

		return true;
	}

	public static void main(String[] args) {

		String str = "madam";

		if (palindromeCheck(str)) {
			System.out.println(str + " Is a Palindrome.");
		} else {
			System.out.println(str + " Not a Palindrome.");
		}

	}

}
