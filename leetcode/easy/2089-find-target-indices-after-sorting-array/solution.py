class Solution:
    def targetIndices(self, nums: list[int], target: int) -> list[int]:
        nums.sort()
        n = len(nums)
        arr = []
        for i in range(n):
            if(nums[i]==target):
                arr.append(i)
            elif(nums[i]>target):
                break
        return arr
        