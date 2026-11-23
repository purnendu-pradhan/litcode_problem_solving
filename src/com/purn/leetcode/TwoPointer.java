package com.purn.leetcode;

import java.util.Arrays;

public class TwoPointer {
	
	public static boolean twoSum(int[] arr, int target) {
		
		Arrays.sort(arr);
		int left = 0;
		int right = arr.length - 1;

		while (left < right) {
			int sum = arr[left] + arr[right];
			if (sum == target) {

				System.out.println(arr[left] + "+" + arr[right] + "=" + sum);

				return true;
			}
			if (sum < target) {

				left++;
			} else {
				right--;
			}

		}
		return false;
	}

	public static void main(String[] args) {

		int[] arr = { 2, 9, 4, 8, 11, 16, 10, 7};
		int target = 20;
		twoSum(arr, target);

	}
	
	

}
