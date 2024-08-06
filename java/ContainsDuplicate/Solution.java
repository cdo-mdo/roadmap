import java.util.HashSet;

public class Solution {
    static boolean hasDuplicate(int[] nums) {
        HashSet<Integer> checks = new HashSet<Integer>();
        for (int num: nums) {
            if (checks.contains(num)) {
                return true;
            }
            checks.add(num);
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(hasDuplicate(new int[]{1, 2, 3, 3}));
        System.out.println(hasDuplicate(new int[]{1, 2, 3, 4}));
    }
}
