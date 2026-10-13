class Solution:
    def twoSum(self, numbers: list[int], target: int) -> list[int]:
        i=0
        j = len(numbers) -1
        while(i>=0 and j>i):
            k = numbers[i]+numbers[j]
            if(k>target):
                j-=1
            elif(k<target):
                i+=1
            elif(k==target):
                return [i+1,j+1]
        return [-1,-1]
