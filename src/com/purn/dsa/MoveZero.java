package com.purn.dsa;

import java.util.Arrays;

public class MoveZero {
	
	
	public static void moveZero(int[] arr) {

		int i = 0;

		for (int j = 0; j < arr.length; j++) {

			if (arr[j] != 0) {// 0 != 0 =false, 1 != 0 =true

				if (i < j) {

					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
				i++;
			}

		}
	}

	public static void main(String[] args) {

		int[] arr = { 0, 1, 0, 3, 12 };

		moveZero(arr);
		System.out.println(Arrays.toString(arr));
	}

}
