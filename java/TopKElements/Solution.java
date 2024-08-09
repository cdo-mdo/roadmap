import java.util.HashMap;
import java.util.Vector;

public class Solution {
public int[] topKFrequent(int[] nums, int k) {
	HashMap<Integer, Integer> frequents = new HashMap<Integer, Integer>();
	Vector<Integer> res = new Vector<Integer>();
	
	for (int num: nums) {
		Integer key = Integer.valueOf(num);	
		if (frequents.containsKey(key)) {
			int count = frequents.get(key).intValue();
			frequents.put(key, Integer.valueOf(++count));
			if (count == k) {
				res.add(key);
			}
		}
		else {
		    frequents.put(key, Integer.valueOf(1));
		}
	}
	
	int[] result = new int[res.size()];
	int index = 0;
	for (Integer n: res) {
		result[index++] = n.intValue();				
	}
	
	return result;
}

public static void main(String[] args) {
	Solution solution = new Solution();
	int[] result = solution.topKFrequent(new int[] {1, 2, 2, 3, 3, 3}, 2);
	System.out.print("[");
	for (int i = 0; i < result.length; i++) {
		if (i == result.length - 1) {
		    System.out.print(result[i]);
		}
		else {
			System.out.print(result[i] + ", ");
		}
	}
	System.out.println("]");
}
}

