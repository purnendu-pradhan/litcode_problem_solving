package com.purn.dsa;

import java.util.Arrays;

public class ThreeSumClosest {
	
	
	public static int threeSumClosest(int[] nums, int target) {

		int result = nums[0] + nums[1] + nums[2];
		Arrays.sort(nums);
		// -4,-1,1,2
		for (int i = 0; i < nums.length - 2; i++) {

			int left = i + 1;
			int right = nums.length - 1;

			while (left < right) {

				int sum = nums[i] + nums[left] + nums[right];

				if (Math.abs((long) sum - target) < Math.abs((long) result - target)) {

					result = sum;
				}
				if (sum == target) {
					return sum;
				} else if (sum < target) {
					left++;
				} else {

					right--;

				}
			}

		}

		return result;

	}

	public static void main(String[] args) {

		int[] nums = { -1, 2, 1, -4 };

		int target = 1;

		System.out.println(threeSumClosest(nums, target));

	}

}
