class Solution:
    def hIndex(self, citations: List[int]) -> int:
        # sort citation descending
        citations.sort(reverse=True)

        h = 0
        for i in range(len(citations)):
            # i + 1 papers have at least citations[i] citations
            if citations[i] >= i + 1:
                h = h + 1
            else:
                break
        return h    

