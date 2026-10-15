class Solution:
    def sumCounts(self, nums: List[int]) -> int:
        n = len(nums)
        ans = 0
        for i in range(n):
            for j in range(i,n):
                unique = set(nums[i:j+1])
                k = len(unique)
                ans += k*k
        return ans

        