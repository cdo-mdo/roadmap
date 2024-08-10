class Solution:
    def topKFrequent(self, nums, k):
        counts = {}
        res = []
        for num in nums:
            n = counts.get(num)
            if (n == None):
                counts.update({num: 1})
            else:
                n = n + 1
                counts.update({num: n})
                if (n >= k):
                    if num not in res:
                        res.append(num)    
        
        return res                
       
solution = Solution()
res = solution.topKFrequent([1, 2, 2, 3, 3, 3], 2)
print(res)        
