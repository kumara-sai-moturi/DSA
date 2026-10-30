class Solution:
    def maxProduct(self, nums: list[int]) -> int:
        n = len(nums)
        currmax = nums[0]
        currmin = nums[0]
        maxi = nums[0]
        for i in range(1,n):
            if(nums[i]<0):
                currmax,currmin = currmin,currmax
            currmax = max(nums[i],currmax*nums[i])
            currmin = min(nums[i],currmin*nums[i])
            maxi = max(maxi,currmax)
        return maxi