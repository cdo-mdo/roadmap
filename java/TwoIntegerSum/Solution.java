import java.util.HashMap;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> seens = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (seens.containsKey(diff)) {
                return new int[]{seens.get(diff), i};
            }
            seens.put(nums[i], i);
        }

        return new int[] {};
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] result = solution.twoSum(new int[]{3, 4, 5, 6}, 7);
        System.out.println("[" + result[0] + ", " + result[1] + "]");
        result = solution.twoSum(new int[]{4, 5, 6}, 10);
        System.out.println("[" + result[0] + ", " + result[1] + "]");
    }
}
