import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    /*
     Calculate product of all element in array except the current porsition.
     Function returns array of that product.
     */
    public int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];

        int left = 1;
        int right = 1;

        for (int i = 0; i < nums.length; i++) {
            res[i] = left;
            left *= nums[i];
        }
        for (int i = nums.length - 1; i >= 0; i--) {
            res[i] *= right;
            right *= nums[i];
        }

        return res;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] res = solution.productExceptSelf(new int[]{1, 2, 4, 6});

        Integer[] listInt = new Integer[res.length];
        for (int i = 0; i < res.length; i++){
            listInt[i] = Integer.valueOf(res[i]);
        }
        List<Integer> list = new ArrayList<Integer>(Arrays.asList(listInt));

        System.out.println(list.toString());
    }
}
