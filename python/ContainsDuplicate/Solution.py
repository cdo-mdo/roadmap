
class Solution:
    def hasDuplicate(self, nums):
        checks = set()
        for num in nums:
            if num in checks:
                return True
            checks.add(num)
        return False

if __name__ == "__main__":
    solution = Solution()
    print(solution.hasDuplicate([1, 2, 3, 3]))
    print(solution.hasDuplicate([1, 2, 3, 4]))
