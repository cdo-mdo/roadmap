class Solution:
    def twoSum(self, nums, target):
        seens = {}
        for i in range(len(nums)):
            diff = target - nums[i]
            if (diff in seens):
                return [seens.get(diff), i]
            seens[nums[i]] = i    

        return []

solution = Solution()
print(solution.twoSum([3, 4, 5, 6], 7))        
print(solution.twoSum([4, 5, 6], 10))        
