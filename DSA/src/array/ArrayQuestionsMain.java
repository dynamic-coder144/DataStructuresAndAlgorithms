package array;

import java.util.Arrays;

public class ArrayQuestionsMain {

	public static void main(String[] args) {
		// Leetcode 136
		System.out.println("Leetcode 136");
		SingleNumber singleNumber = new SingleNumber();
		System.out.println(singleNumber.singleNumberUsingHashMap(new int[] { 4, 1, 2, 1, 2 }));
		System.out.println(singleNumber.singleNumberUsingXOR(new int[] { 4, 1, 2, 1, 2 }));

		// Leetcode 1207
		System.out.println("\n" + "Leetcode 1207");
		UniqueNumberOfOccurrences uniqueOccurences = new UniqueNumberOfOccurrences();
		System.out.println(uniqueOccurences.uniqueOccurrencesUsingArray(new int[] { 1, 2, 2, 1, 1, 3 }));
		System.out.println(uniqueOccurences.uniqueOccurrences(new int[] { 1, 2, 2, 1, 1, 3 }));

		// Leetcode 1365
		System.out.println("\n" + "Leetcode 1365");
		HowManyNumbersAreSmallerThantheCurrentNumber smallerthanCurrent = new HowManyNumbersAreSmallerThantheCurrentNumber();
		System.out.println(
				Arrays.toString(smallerthanCurrent.smallerNumbersThanCurrentBruteForce(new int[] { 8, 1, 2, 2, 3 })));
		System.out.println(Arrays.toString(smallerthanCurrent.smallerNumbersThanCurrent(new int[] { 8, 1, 2, 2, 3 })));

		// Leetcode 1394
		System.out.println("\n" + "Leetcode 1394");
		FindLuckyIntegerInAnArray luckyInteger = new FindLuckyIntegerInAnArray();
		System.out.println(luckyInteger.findLucky(new int[] { 2, 2, 3, 4 }));
	}

}
