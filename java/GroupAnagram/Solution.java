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
        String sortedStr1 = str1.sort();
        String sortedStr2 = str2.sort();
        
        return sortedStr1.equal(sortedStr2) == 0?true:false;
    }
}
