import java.util.List;
import java.util.ArrayList;
import java.lang.String;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;

public class Solution {

    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> res = new HashMap<>();

        for (String str: strs) {
            int[] count = new int[26];

            for (char c: str.toCharArray()) {
                count[c - 'a']++;
            }

            StringBuffer sb = new StringBuffer();
            for (int i = 0; i < 26; i++) {
                sb.append('#');
                sb.append(count[i]);
            }
            String key = sb.toString();

            if (!res.containsKey(key)) {
                res.put(key, new ArrayList<>());
            }
            res.get(key).add(str);
        }

        return new ArrayList<>(res.values());
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        List<List<String>> results = solution.groupAnagrams(new String[]{"act", "pots", "tops", "cat", "stop", "hat"});
        System.out.println(Arrays.toString(results.toArray()));

        System.out.println(Arrays.toString(solution.groupAnagrams(new String[]{"x"}).toArray()));
    }
}
