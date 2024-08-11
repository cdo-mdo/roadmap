class Solution:
    def productArrayExceptSelf(self, nums):
        res = [0] * len(nums)

        left = 1
        right = 1
        for i in range(len(nums)):
            res[i] = left
            left *= nums[i]
        for i in range(len(nums) - 1, -1, -1):
            res[i] *= right
            right *= nums[i]

        return res

solution = Solution()
print(solution.productArrayExceptSelf([1, 2, 4, 6]))
