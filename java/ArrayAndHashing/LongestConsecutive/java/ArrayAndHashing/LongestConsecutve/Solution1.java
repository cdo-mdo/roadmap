package java.ArrayAndHashing.LongestConsecutve;

import java.util.HashSet;

public class Solution1 {
	public int longestConsectutive(int[] nums) {
		HashSet<Integer> sets = new HashSet<Integer>();
		
		for (int num: nums) {
			sets.add(num);
		}
		
		int longestCount = 0;
		
		for (int num: nums) {
			if (!sets.contains(Integer.valueOf(num - 1))) {
				// num is start of a sequence, begin to count
				int next = num + 1;
				int count = 1;
				while(sets.contains(Integer.valueOf(next))) {
					count++;
					next++;
				}
			}
			if (longestCount < count) {
				longestCount = count;
			}
		}
		return longestCount;
	}

	public static void main(String[] args) {
		Solution1 solution = new Solution1();
		System.out.println(solution.longestConsectutive(new int[] {2, 20, 4, 10, 3, 4, 5}))
	}
}
