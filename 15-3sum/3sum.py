class Solution:
    def threeSum(self, nums: list[int]) -> list[list[int]]:
        n = len(nums)
        nums.sort()
        outer = []
        for i in range(n-2):
            if(i>0 and nums[i]==nums[i-1]):
                continue
            l = i+1
            r = n-1
            while(l<r):
                k = nums[i]+nums[l]+nums[r]
                if(k==0):
                    inner = [nums[i],nums[l],nums[r]]
                    outer.append(inner)
                    l+=1
                    r-=1
                    while(l<r and nums[l]==nums[l-1]):
                        l+=1
                    while(l<r and nums[r]==nums[r+1]):
                        r-=1
                elif(k<0):
                    l+=1
                elif(k>0):
                    r-=1
        return outer

                

        