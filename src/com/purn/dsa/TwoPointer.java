package com.purn.dsa;

public class TwoPointer {
	
	public static boolean twoSum(int[] arr, int target) {
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

		int[] arr = { 2, 3, 4, 8, 9, 11 };
		int target = 20;
		//Arrays.sort(arr);
		twoSum(arr, target);

	}
	
	

}
