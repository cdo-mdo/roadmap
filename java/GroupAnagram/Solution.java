public class Solution {

    /*
     Iterate list of string, add to the list, also add to the list if anagram, 
     mark positions to avoid process in next iteration.
     */
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result;

        for (int i = 0; i < strs.size(); i++) {
            Add strs[i] to result;
            Mark i is already processed
            for (int j = 0; j < strs.size(); j++) {
                if (j not processed && isAnagram(strs[i], strs[j]) {
                    add strs[j] to result
                    mark j as processed
                }
            }
        }
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
}
