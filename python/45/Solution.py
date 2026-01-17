class Solution:
    def jump(self, nums: List[int]) -> int:
        jumps = 0
        end = 0
        farthest = 0

        for i in range(len(nums) - 1):
            # update how far we can get
            farthest = max(farthest, i + nums[i])

            # if we have reached the end of the current jump range
            if i == end:
                jumps += 1
                end = farthest
        return jumps        

