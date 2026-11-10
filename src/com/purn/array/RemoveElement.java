package com.purn.array;

import java.util.Arrays;

public class RemoveElement {

	public static void main(String[] args) {

		int[] nums = { 3, 2, 2, 3 };
		int value = 3;

		System.out.println("Out put " + removeElement(nums, value));

	}

	public static int removeElement(int[] nums, int val) {

		Arrays.sort(nums);
		// 3,3,2,2
		int[] tmp = new int[nums.length];

		int index = 0;

		for (int i = 0; i < nums.length; i++) {

			if (nums[i] != val) {

				tmp[index] = nums[i];

				index++;

			}
		}
		return index;

	}

}
