from collections import defaultdict

class Solution:
    def groupAnagrams(self, strs):
        # for each str in strs, build key and add to hash map
        # return list convert from hash map 
        res = defaultdict(list)
        for str in strs:
            count = [0] * 26
            for c in str:
                count[ord(c) - ord('a')] += 1

            res[tuple(count)].append(str)

        return res.values()

solution = Solution()
print(solution.groupAnagrams(["act", "pots", "tops", "cat", "stop", "hat"]))
