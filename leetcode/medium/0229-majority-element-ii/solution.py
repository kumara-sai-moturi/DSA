class Solution:
    def majorityElement(self, nums: list[int]) -> list[int]:
        nums.sort()
        n = len(nums)
        count = 1
        list = []
        curr = nums[0]
        for i in range(1,n):
            if(nums[i]==curr):
                count+=1
            else:
                if(count > n//3):
                    list.append(curr)
                count = 1
                curr = nums[i]
        if(count>n//3):
            list.append(curr)
        return list
            