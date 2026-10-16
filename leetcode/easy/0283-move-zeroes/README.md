# Move Zeroes

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an integer array `nums`, move all `0`'s to the end of it while maintaining the relative order of the non-zero elements.

 **Note**  that you must do this in-place without making a copy of the array.

 

 **Example 1:** 

```
Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]

```

 **Example 2:** 

```
Input: nums = [0]
Output: [0]

```

 

 **Constraints:** 

- 1 <= nums.length <= 104
- -231 <= nums[i] <= 231 - 1

 

 **Follow up:**  Could you minimize the total number of operations done?

## Solution

**Language:** Python  
**Runtime:** 6 ms (beats 44.99%)  
**Memory:** 20.4 MB (beats 89.72%)  
**Submitted:** 2026-10-16T01:38:54.811Z  

```py
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

        
```

---

[View on LeetCode](https://leetcode.com/problems/move-zeroes/)