package com.purn.array;

public class TwoDimensionalArray {

	public static void main(String[] args) {

		//Find the target index
		int target = 6;
		int[][] nums = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int rows = nums.length;
		int cols = nums[0].length;

		for (int i = 0; i < rows; i++) {

			for (int j = 0; j < cols; j++) {

				if (nums[i][j] == target) {
					System.out.println(i + " " + j);
				}
			}
		}

		// Find the Sum of Each Row

		for (int i = 0; i < rows; i++) {
			int sum = 0;

			for (int j = 0; j < cols; j++) {

				sum += nums[i][j];
			}
			System.out.println("Rows :" + i + " Sum :" + sum);
		}

		// Find the Sum of Each Column

		for (int j = 0; j < cols; j++) {

			int sum = 0;

			for (int i = 0; i < rows; i++) {

				sum += nums[i][j];
			}

			System.out.println("Column :" + j + " Sum :" + sum);
		}
		
		//Find Maximum and Minimum Element
		
		int[][] num = {{7,8,9},
					   {10,15,20},
					   {10,12,18}};
		
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;

		for (int i = 0; i < num.length; i++) {

			for (int j = 0; j < num[i].length; j++) {

				if (num[i][j] > max) {
					max = num[i][j];
				}

				if (num[i][j] < min) {
					min = num[i][j];
				}
			}
		}
		System.out.println(max + " Element");
		System.out.println(min + " Element");
		
		//Convert rows into columns and columns into rows.
		
		int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 } };

		int row = arr.length;
		int col = arr[0].length;

		int[][] result = new int[col][row];

		for (int i = 0; i < row; i++) {

			for (int j = 0; j < col; j++) {

				result[j][i] = arr[i][j];
			}
		}

		for (int[] rows1 : result) {
			for (int value : rows1) {
				System.out.print(value + " ");
			}
			System.out.println();
		}
		
		//Reverse each row
		
		int[][] arr1 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		for (int i = 0; i < arr1.length; i++) {

			int left = 0;
			int right = arr1[i].length - 1;

			while (left < right) {

				int temp = arr1[i][left];

				arr1[i][left] = arr1[i][right];

				arr1[i][right] = temp;

				left++;
				right--;
			}
		}

		for (int[] row1 : arr1) {

			for (int value : row1) {
				System.out.print(value + " ");
			}

			System.out.println();
		}

	}

}
