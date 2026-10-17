class Solution:
    def maxArea(self, height: list[int]) -> int:
        n = len(height)
        max_area = 0
        i = 0
        j = n-1
        while(i<j):
            width = j-i
            h = min(height[i],height[j])
            area = width*h
            max_area = max(max_area,area)
            if(height[i]<height[j]):
                i+=1
            else:
                j-=1
        return max_area      