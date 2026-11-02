class Solution:
    def minMoves2(self, nums: list[int]) -> int:
        n = len(nums)
        nums.sort()
        median = nums[n//2]
        count = 0
        for num in nums:
            count += abs(median-num)
        return count