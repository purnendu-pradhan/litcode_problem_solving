package com.purn.dsa;
import java.util.Arrays;
public class ReverseArray {
	
	public static int[] reverse(int[] reverse) {
		
		int n = reverse.length;
		int right = n-1;
		
		int left = 0;
		
		int[] result = new int[n];
		
		while(left < n) {
			
			result[left] = reverse[right];
			
			left++;
			right--;
		}
		
		return result;
	}

	public static void main(String[] args) {

		int[] reverse = {10, 20, 30, 40, 50};
		
		System.out.println(Arrays.toString(reverse(reverse)));
		
	}

}
