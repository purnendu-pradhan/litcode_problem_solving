package com.purn.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupingAnagram {
	
	public static List<List<String>> groupingAnagram(String[] strs){
		
		Map<String, List<String>> map = new HashMap<String, List<String>>();
		
		for(String s : strs) {
			char[] ch = s.toCharArray();
			
			Arrays.sort(ch);
			
			String key = new String(ch);
			
			map.computeIfAbsent(key, k -> new ArrayList<>()).add(s);
		}
		
		return new ArrayList<>(map.values());
	}

	public static void main(String[] args) {

		String[] strs = {"eat","tea","tan","ate","nat","bat"};
		
		System.out.println(groupingAnagram(strs));
	}

}
