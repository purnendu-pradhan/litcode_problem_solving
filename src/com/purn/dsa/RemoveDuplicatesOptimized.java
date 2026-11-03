package com.purn.dsa;

public class RemoveDuplicatesOptimized {

	public static void main(String[] args) {

		int[] nums = { 1, 1, 2 };

		int k = removeDuplicates(nums);

		System.out.println("Unique count: " + k);

		System.out.println("Unique elements:");

		for (int i = 0; i < k; i++) {
			System.out.print(nums[i] + " ");
		}
	}

	public static int removeDuplicates(int[] nums) {

		if (nums.length == 0) {
			return 0;
		}

		int i = 0;

		for (int j = 1; j < nums.length; j++) {

			if (nums[i] != nums[j]) {

				i++;

				nums[i] = nums[j];
			}
		}

		return i + 1;
	}
}
