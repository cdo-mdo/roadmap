public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        result[0] = 0; result[1] = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] result = solution.twoSum(new int[]{3, 4, 5, 6}, 7);
        System.out.println("[" + result[0] + ", " + result[1] + "]");
        result = solution.twoSum(new int[]{4, 5, 6}, 10);
        System.out.println("[" + result[0] + ", " + result[1] + "]");
    }
}
