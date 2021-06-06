package com.mahesh.problems.arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FourNumberSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {7, 6, 4, -1, 1, 2};
		int targetSum = 16;
		System.out.println(fourNumberSum(arr, targetSum));

	}
	
	private static int fourNumberSum(int [] arr, int targetSum) {
		List<Integer[]> list = new ArrayList<>();
		Map<Integer, List<Integer[]>> map = new HashMap<>();
		for(int index = 1; index < arr.length - 1; index ++) {
			for(int incrementalIndex = index + 1;  
					incrementalIndex < arr.length; incrementalIndex ++) {
				int sum = arr[index] + arr[incrementalIndex];
				int diff = targetSum - sum;
				if(map.containsKey(diff)) {
					for(Integer [] intArr : map.get(diff)) {
						list.add(new Integer [] {intArr[0], intArr[1], arr[index], arr[incrementalIndex]});
					}
				}			
			}
			
			for(int decrementIndex = index - 1; 
					decrementIndex >= 0; decrementIndex --) {
				int sum = arr[index] + arr[decrementIndex];
				if(map.containsKey(sum)) {
					map.get(sum).add(new Integer[] {arr[index], arr[decrementIndex]});
				}else {
					List<Integer[]> pairList = new ArrayList<>();
					pairList.add(new Integer[] {arr[index], arr[decrementIndex]});
					map.put(sum, pairList);
				}
			}
		}
		return list.size();
	}
}
