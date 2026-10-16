class Solution:
    def moveZeroes(self, nums: list[int]) -> None:
        n = len(nums)
        j = 0
        for i in range(n):
            if(nums[i]!=0):
                temp = nums[j]
                nums[j] = nums[i]
                nums[i] = temp
                j += 1
        return nums

        