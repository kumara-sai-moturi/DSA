
class Solution:
    def maximumSubarraySum(self, nums: list[int], k: int) -> int:
        n = len(nums)
        max_sum = 0
        window_sum = 0
        freq = {}

        for i in range(n):
            window_sum += nums[i]
            freq[nums[i]] = freq.get(nums[i], 0) + 1

            if i >= k:
                left = nums[i - k]
                window_sum -= left
                freq[left] -= 1

                if freq[left] == 0:
                    del freq[left]

            if i >= k - 1 and len(freq) == k:
                max_sum = max(max_sum, window_sum)

        return max_sum
