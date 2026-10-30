# Maximum Product Subarray

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an integer array `nums`, find a subarray that has the largest product, and return  *the product*.

The test cases are generated so that the answer will fit in a  **32-bit**  integer.

 **Note**  that the product of an array with a single element is the value of that element.

 

 **​​​​​​​Example 1:** 

```
Input: nums = [2,3,-2,4]
Output: 6
Explanation: [2,3] has the largest product 6.

```

 **Example 2:** 

```
Input: nums = [-2,0,-1]
Output: 0
Explanation: The result cannot be 2, because [-2,-1] is not a subarray.

```

 

 **Constraints:** 

- 1 <= nums.length <= 2 * 104
- -10 <= nums[i] <= 10
- The product of any subarray of nums is guaranteed to fit in a 32-bit integer.

## Solution

**Language:** Python  
**Runtime:** 0 ms  
**Memory:** 19.2 MB  
**Submitted:** 2026-10-30T02:41:01.668Z  

```py
class Solution:
    def maxProduct(self, nums: list[int]) -> int:
        n = len(nums)
        currmax = nums[0]
        currmin = nums[0]
        maxi = nums[0]
        for i in range(1,n):
            if(nums[i]<0):
                currmax,currmin = currmin,currmax
            currmax = max(nums[i],currmax*nums[i])
            currmin = min(nums[i],currmin*nums[i])
            maxi = max(maxi,currmax)
        return maxi
```

---

[View on LeetCode](https://leetcode.com/problems/maximum-product-subarray/)