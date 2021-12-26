package array;

/**
 * Question: Given an array of integers arr, a lucky integer is an integer that
 * has a frequency in the array equal to its value. Return the largest lucky
 * integer in the array. If there is no lucky integer return -1.
 * 
 * Leetcode link: https://leetcode.com/problems/find-lucky-integer-in-an-array/
 * 
 * @author dynamic-coder144
 *
 */
public class FindLuckyIntegerInAnArray {
	public int findLucky(int[] arr) {
		int[] aux = new int[500];
		for (int a : arr) {
			aux[a]++;
		}
		for (int i = aux.length - 1; i > 0; i--) {
			if (aux[i] == i)
				return i;
		}
		return -1;
	}
}
