package com.purn.dsa;

import java.util.*;

public class ThreeSumProblem {

	//Brute Force Approach!
	
	public static void main(String[] args) {

		int[] nums = { -1, 0, 1, 2, -1, -4 };
		Set<List<Integer>> result = new HashSet<List<Integer>>();
		
		Arrays.sort(nums);
		for (int i = 0; i < nums.length; i++) {

			for (int j = i + 1; j < nums.length; j++) {

				for (int k = j + 1; k < nums.length; k++) {

					if (0 == nums[i] + nums[j] + nums[k]) {
						
						int[] sumElement = new int[]{nums[i], nums[j], nums[k]};

						List<Integer> triplent = Arrays.asList(nums[i], nums[j], nums[k]);

						result.add(triplent);
					}
				}
			}
		}
		System.out.println(result);
	}
	 
	
	/*
	 * public static List<List<Integer>> threeSum(int[] nums) {
	 * 
	 * Set<List<Integer>> result = new HashSet<List<Integer>>();
	 * 
	 * //int[] nums = { -1, 0, 1, 2, -1, -4 }; Arrays.sort(nums); //{-4,-1,-1,0,1,2}
	 * 
	 * for(int i = 0; i < nums.length - 2; i++) {
	 * 
	 * int left = i+1; int right = nums.length -1;
	 * 
	 * while(left < right) {
	 * 
	 * int sum = nums[i] + nums[left] + nums[right];
	 * 
	 * if(sum == 0) {
	 * 
	 * result.add(Arrays.asList(nums[i], nums[left], nums[right]));
	 * 
	 * left++; right--; }else if(sum < 0) { left++; }else { right--; } } }
	 * 
	 * return new ArrayList<>(result); }
	 * 
	 * public static void main(String[] args) {
	 * 
	 * int[] nums = { -1, 0, 1, 2, -1, -4 };
	 * 
	 * System.out.println(threeSum(nums)); }
	 */
	
	
}
