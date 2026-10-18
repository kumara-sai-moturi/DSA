# Evaluate Reverse Polish Notation

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

You are given an array of strings `tokens` that represents an arithmetic expression in a Reverse Polish Notation.

Evaluate the expression. Return  *an integer that represents the value of the expression*.

 **Note**  that:

- The valid operators are '+', '-', '*', and '/'.
- Each operand may be an integer or another expression.
- The division between two integers always truncates toward zero.
- There will not be any division by zero.
- The input represents a valid arithmetic expression in a reverse polish notation.
- The answer and all the intermediate calculations can be represented in a 32-bit integer.

 

 **Example 1:** 

```
Input: tokens = ["2","1","+","3","*"]
Output: 9
Explanation: ((2 + 1) * 3) = 9

```

 **Example 2:** 

```
Input: tokens = ["4","13","5","/","+"]
Output: 6
Explanation: (4 + (13 / 5)) = 6

```

 **Example 3:** 

```
Input: tokens = ["10","6","9","3","+","-11"," *","/","* ","17","+","5","+"]
Output: 22
Explanation: ((10  *(6 / ((9 + 3)*  -11))) + 17) + 5
= ((10  *(6 / (12*  -11))) + 17) + 5
= ((10 * (6 / -132)) + 17) + 5
= ((10 * 0) + 17) + 5
= (0 + 17) + 5
= 17 + 5
= 22

```

 

 **Constraints:** 

- 1 <= tokens.length <= 104
- tokens[i] is either an operator: "+", "-", "*", or "/", or an integer in the range [-200, 200].

## Solution

**Language:** Java  
**Runtime:** 7 ms (beats 41.66%)  
**Memory:** 44.7 MB (beats 97.75%)  
**Submitted:** 2026-10-18T17:23:56.297Z  

```java
class Solution {
    public int evalRPN(String[] tokens) {
        int n = tokens.length;
        Stack<Integer>st = new Stack<>();
        for(String ele:tokens){
            if(!ele.equals("+") && 
            !ele.equals("-") && 
            !ele.equals("*") && 
            !ele.equals("/")){
                st.push(Integer.parseInt(ele));
            }else{
                int b = st.pop();
                int a = st.pop();
                if(ele.equals("+")){
                    st.push(a+b);
                }else if(ele.equals("-")){
                    st.push(a-b);
                }else if(ele.equals("*")){
                    st.push(a*b);
                }else if(ele.equals("/")){
                    st.push(a/b);
                }
            }
        }
        return st.pop();
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/evaluate-reverse-polish-notation/)