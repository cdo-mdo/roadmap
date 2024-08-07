class Solution:
    def isAnagram(self, s, t):
        if (len(s) != len(t)):
            return False

        if (sorted(s) != sorted(t)):
            return False
        else:
            return True    

if __name__ == "__main__":
    solution = Solution()
    print(solution.isAnagram('racecar', 'carrace'))
    print(solution.isAnagram('jar', 'jam'))
    print(solution.isAnagram('jar', 'ja'))
