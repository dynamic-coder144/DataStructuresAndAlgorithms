package array;

import java.util.HashMap;
import java.util.HashSet;

/**
 * Question: Given an array of integers arr, return true if the number of
 * occurrences of each value in the array is unique, or false otherwise.
 * 
 * Leetcode link: https://leetcode.com/problems/unique-number-of-occurrences/
 * 
 * @author dynamic-coder144
 *
 */
public class UniqueNumberOfOccurrences {
	public boolean uniqueOccurrencesUsingArray(int[] arr) {
		// This approach uses an extra array and a HashMap
		int[] aux = new int[2000];
		for (int a : arr) {
			aux[a + 1000]++;
		}
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		for (int a = 0; a < aux.length; a++) {
			if (aux[a] != 0) {
				if (hm.containsValue(aux[a])) {
					return false;
				}
				hm.put(a, aux[a]);
			}
		}
		return true;
	}

	public boolean uniqueOccurrences(int[] arr) {
		// Approach 2: Using HashMap and HashSet
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		for (int i = 0; i < arr.length; i++) {
			hm.put(arr[i], hm.getOrDefault(arr[i], 0) + 1);
		}

		HashSet<Integer> hs = new HashSet<Integer>(hm.values());
		return hm.size() == hs.size();
	}
}
