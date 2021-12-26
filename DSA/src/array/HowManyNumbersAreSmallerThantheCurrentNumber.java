package array;

import java.util.Arrays;
import java.util.HashMap;

/**
 * Question:
 * Given the array nums, for each nums[i] find out how many numbers in the array
 * are smaller than it. That is, for each nums[i] you have to count the number
 * of valid j's such that j != i and nums[j] < nums[i].Return the answer in an
 * array.
 * 
 * Leetcode link: https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/
 * @author dynamic-coder144
 *
 */
public class HowManyNumbersAreSmallerThantheCurrentNumber {
	public int[] smallerNumbersThanCurrentBruteForce(int[] nums) {
		// Brute force approach
		int[] res = new int[nums.length];
		for (int i = 0; i < nums.length; i++) {
			int count = 0;
			for (int j = 0; j < nums.length; j++) {
				if (nums[j] < nums[i])
					count++;
			}
			res[i] = count;
		}
		return res;
	}

	public int[] smallerNumbersThanCurrent(int[] nums) {
		// Using sorting approach
		int[] result = nums.clone();
		Arrays.sort(nums);
		int count = 0;
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++) {
			if (i == nums.length - 1 || nums[i] != nums[i + 1]) {
				hm.put(nums[i], count);
				count = i + 1;
			}
		}
		for (int i = 0; i < result.length; i++) {
			result[i] = hm.get(result[i]);
		}
		return result;
	}
}