# Max Consecutive Ones

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a binary array `nums`, return  *the maximum number of consecutive* `1` *'s in the array*.

 

 **Example 1:** 

```
Input: nums = [1,1,0,1,1,1]
Output: 3
Explanation: The first two digits or the last three digits are consecutive 1s. The maximum number of consecutive 1s is 3.

```

 **Example 2:** 

```
Input: nums = [1,0,1,1,0,1]
Output: 2

```

 

 **Constraints:** 

- 1 <= nums.length <= 105
- nums[i] is either 0 or 1.

## Solution

**Language:** Python  
**Runtime:** 21 ms (beats 27.04%)  
**Memory:** 21.6 MB (beats 99.51%)  
**Submitted:** 2026-10-21T10:38:48.723Z  

```py
class Solution:
    def findMaxConsecutiveOnes(self, nums: list[int]) -> int:
        max_count = 0
        count = 0
        for ele in nums:
            if(ele is 1):
                count+=1
            elif(ele is 0):
                max_count = max(count,max_count)
                count = 0
            max_count = max(count,max_count)
        return max_count
```

---

[View on LeetCode](https://leetcode.com/problems/max-consecutive-ones/)