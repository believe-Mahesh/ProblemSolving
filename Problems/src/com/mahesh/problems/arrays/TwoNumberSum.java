package com.mahesh.problems.arrays;

import java.util.Arrays;

public class TwoNumberSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {3, 5, -4, 8, 11, 1, -1, 6};
		int targetSum = 10;
		int count = twoNumberSum(arr, targetSum);
		System.out.println(count);
	}

	private static int twoNumberSum(int[] arr, int targetSum) {
		int count = 0;
		Arrays.sort(arr); //O(nlogn)
		int left = 0;
		int right = arr.length -1;
		while(left < right) {
			if(arr[left] + arr[right] == targetSum) {
				count += 1 ;
				left += 1;
				right -= 1;
			}else if(arr[left] + arr[right] > targetSum) {
				right -= 1;
			}else if(arr[left] + arr[right] < targetSum) {
				left += 1;
			}
		}
		return count;
	} 
}
