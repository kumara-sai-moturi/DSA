# Majority Element II

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an integer array of size `n`, find all elements that appear more than `⌊n / 3⌋` times.

 

 **Example 1:** 

```
Input: nums = [3,2,3]
Output: [3]

```

 **Example 2:** 

```
Input: nums = [1]
Output: [1]

```

 **Example 3:** 

```
Input: nums = [1,2]
Output: [1,2]

```

 

 **Constraints:** 

- 1 <= nums.length <= 5 * 104
- -109 <= nums[i] <= 109

 

 **Follow up:**  Could you solve the problem in linear time and in `O(1)` space?

## Solution

**Language:** Python  
**Runtime:** 6 ms (beats 72.49%)  
**Memory:** 22.4 MB (beats 72.30%)  
**Submitted:** 2026-10-30T02:32:49.198Z  

```py
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
            
```

---

[View on LeetCode](https://leetcode.com/problems/majority-element-ii/)