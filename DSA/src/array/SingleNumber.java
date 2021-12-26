package array;

import java.util.HashMap;
import java.util.Map;

/**
 * Question: Given a non-empty array of integers nums, every element appears
 * twice except for one. Find that single one.
 * 
 * You must implement a solution with a linear runtime complexity and use only
 * constant extra space.
 * 
 * Leetcode link: https://leetcode.com/problems/single-number/
 * 
 * @author dynamic-coder144
 *
 */
public class SingleNumber {
	public int singleNumberUsingHashMap(int[] nums) {

		// Approach 1: Using HashMap
		HashMap<Integer, Integer> hm = new HashMap<>();
		for (int num : nums) {
			hm.put(num, hm.getOrDefault(num, 0) + 1);
		}
		for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
			if (entry.getValue() == 1)
				return entry.getKey();
		}
		return -1;
	}

	public int singleNumberUsingXOR(int[] nums) {

		// Approach 2: Using XOR
		int ans = 0;
		for (int num : nums) {
			ans ^= num;
		}
		return ans;
	}
}
