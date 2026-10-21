class Solution:
    def findMaxConsecutiveOnes(self, nums: list[int]) -> int:
        max_count = 0
        count = 0
        for ele in nums:
            if(ele is 1):
                count+=1
            elif(ele is 0):
                max_count = max(count,max_count)
                count = 0
            max_count = max(count,max_count)
        return max_count