class Solution:
    def majorityElement(self, nums: list[int]) -> int:
        n = len(nums)
        max = nums[n-1]
        count = 0
        nums.sort()
        for i in range(n-1,-1,-1):
            if(nums[i]==max):
                count+=1
            else:
                if(count>n//2):
                    return max
                else:
                    count = 1
                    max = nums[i]
        return max
        
        