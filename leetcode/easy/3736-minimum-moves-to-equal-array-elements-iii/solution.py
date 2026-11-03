class Solution:
    def minMoves(self, nums: List[int]) -> int:
        n = len(nums)
        nums.sort()
        maxi = nums[n-1]
        count = 0
        for ele in nums:
            count += maxi-ele
        return count