class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        char[] chars = s.toCharArray();
        char[] chart = t.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            int j;
            for (j = 0; j < chart.length; j++) {
                if (chars[i] == chart[j]) {
                    chart[j] = ' ';
                    break;
                }
            }

            if (j == chart.length) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isAnagram("racecar", "carrace"));
        System.out.println(solution.isAnagram("jar", "jam"));
    }
}
