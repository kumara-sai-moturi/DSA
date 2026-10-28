# Majority Element

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an array `nums` of size `n`, return  *the majority element*.

The majority element is the element that appears more than `⌊n / 2⌋` times. You may assume that the majority element always exists in the array.

 

 **Example 1:** 

```
Input: nums = [3,2,3]
Output: 3

```

 **Example 2:** 

```
Input: nums = [2,2,1,1,1,2,2]
Output: 2

```

 

 **Constraints:** 

- n == nums.length
- 1 <= n <= 5 * 104
- -109 <= nums[i] <= 109
- The input is generated such that a majority element will exist in the array.

 

 **Follow-up:**  Could you solve the problem in linear time and in `O(1)` space?

## Solution

**Language:** Python  
**Runtime:** 9 ms (beats 63.80%)  
**Memory:** 21.3 MB (beats 72.87%)  
**Submitted:** 2026-10-28T01:50:08.578Z  

```py
class Solution:
    def majorityElement(self, nums: list[int]) -> int:
        n = len(nums)
        max = nums[n-1]
        count = 0
        nums.sort()
        for i in range(n-1,-1,-1):
            if(nums[i]==max):
                count+=1
            else:
                if(count>n//2):
                    return max
                else:
                    count = 1
                    max = nums[i]
        return max
        
        
```

---

[View on LeetCode](https://leetcode.com/problems/majority-element/)