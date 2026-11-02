class Solution:
    def minMoves(self, nums: list[int]) -> int:
        mini = min(nums)
        count = 0
        for num in nums:
            count +=num-mini
        return count

        