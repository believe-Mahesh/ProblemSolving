package com.mahesh.problems.arrays;

import java.util.Arrays;

public class ThreeNumberSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {12, 3, 1, 2, -6, 5, -8, 6};
		int targetSum = 0;
		System.out.print(threeNumberSum(arr, targetSum));
		
	}
	
	private static int threeNumberSum (int[] arr, int sum) {
		Arrays.sort(arr);
		int count = 0;
		for(int index = 0; index < (arr.length-2); index++ ) {
			int left = index + 1;
			int right = arr.length -1;
			while(left < right) {
				if (arr[index] + arr[left] + arr[right] == sum) {
					count +=1;
					left += 1;
					right -= 1;
				}else if(arr[index] + arr[left] + arr[right] > sum) {
					right -= 1;
				}else if(arr[index] + arr[left] + arr[right] < sum) {
					left += 1;
				}
			}
		}
		return count;
	}

}
