package com.purn.leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LongestSubstring {

	
	static String longestSubstring(String str) {
		
		/*
		 * String longest = "";
		 * 
		 * 
		 * for(int i = 0; i < str.length(); i++) { Set<Character> set = new HashSet<>();
		 * 
		 * for(int j = i; j < str.length(); j++) {
		 * 
		 * char ch = str.charAt(j);
		 * 
		 * if(set.contains(ch)) { break; }
		 * 
		 * set.add(ch);
		 * 
		 * if(j - i + 1 > longest.length()) { longest = str.substring(i, j+1); } } }
		 */
		//Optimized solution
		Map<Character, Integer> lastSeen = new HashMap<>();

        int left = 0;
        int maxLength = 0;
        int start = 0;

        for (int right = 0; right < str.length(); right++) {
            char ch = str.charAt(right);

            if (lastSeen.containsKey(ch)
                    && lastSeen.get(ch) >= left) {
                left = lastSeen.get(ch) + 1;
            }

            lastSeen.put(ch, right);

            if (right - left + 1 > maxLength) {
                maxLength = right - left + 1;
                start = left;
            }
        }

        String longest = str.substring(start, start + maxLength);
		
		return longest;
	}
	public static void main(String[] args) {

		String str = "thelongestsubstring";
		
		
		System.out.println(longestSubstring(str));
	}

}
