import java.util.List;
import java.util.ArrayList;
import java.lang.String;
import java.util.Arrays;

public class Solution {

    /*
     Iterate list of string, add to the list, also add to the list if anagram, 
     mark positions to avoid process in next iteration.
     */
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<List<String>>();

        /* array to mark position that is already processed */
        int[] marks = new int[strs.length];
        for (int i = 0; i < marks.length; i++) {
            marks[i] = 1;
        }

        for (int i = 0; i < strs.length; i++) {
            if (marks[i] == 0) {
                continue;
            }
            List<String> element = new ArrayList<String>();
            element.add(strs[i]);
            marks[i] = 0;
            for (int j = 0; j < strs.length; j++) {
                if (marks[j] == 0) {
                    continue;
                }
                if (isAnagram(strs[j], strs[i])) {
                    element.add(strs[j]);
                    marks[j] = 0;
                }
            }
            result.add(element);
        }

		return result;
    }

    /**
     Check if two strings are anagram.
     */
    boolean isAnagram(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        char[] str1CharArray = str1.toCharArray();
        char[] str2CharArray = str2.toCharArray();
        for (int i = 0; i < str1CharArray.length; i++) {
            int j;
            for (j = 0; j < str2CharArray.length; j++) {
                if (str2CharArray[j] == str1CharArray[i]) {
                    str2CharArray[j] = ' ';
                    break;
                }
            }

            if (j == str2CharArray.length) {
                return false;
            }
        }

        return true;
    }

	public static void main(String[] args) {
		Solution solution = new Solution();

        List<List<String>> results = solution.groupAnagrams(new String[]{"act", "pots", "tops", "cat", "stop", "hat"});
        System.out.println(Arrays.toString(results.toArray()));

		System.out.println(Arrays.toString(solution.groupAnagrams(new String[]{"x"}).toArray()));
	}
}
