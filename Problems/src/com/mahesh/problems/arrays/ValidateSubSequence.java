package com.mahesh.problems.arrays;

import java.util.Arrays;
import java.util.List;

/**
 * 
 *Validate the sub sequence in a array. Sub sequence must not 
 *necessarily be in the adjacent positions but must be in the 
 *same order in the parent array
 *
 */
public class ValidateSubSequence {
    public static void main (String args[]) {
    	Integer [] arr = {5, 1, 22, 25, 6, -1, 8, 10};
    	Integer [] seq = {1, 6, -1, 10};
    	System.out.println(validateSubSequence(Arrays.asList(arr), Arrays.asList(seq)));
    }
    
    private static boolean validateSubSequence(List<Integer> array, List<Integer> sequence) {
    	int arrIdx = 0;
    	int seqIdx = 0;
    	while(arrIdx < array.size() && seqIdx < sequence.size()) {
    		if(array.get(arrIdx) == sequence.get(seqIdx)) {
    			seqIdx += 1;
    		}
    		arrIdx += 1;
    	}
    	return seqIdx == sequence.size();
    }
}
