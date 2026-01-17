class Solution:
    def productExceptSelf(self, nums):
        n = len(nums)
        answers = [1] * n;

        # Compute left product
        left = 1
        for i in range(n):
            answers[i] = left
            left *= nums[i]

        # Multiply by right product
        right = 1
        for i in range (n - 1, -1, -1):
            answers[i] *= right
            right *= nums[i]

        return answers

