class Solution:
    def fib(self, n: int) -> int:
        return self.func(n)
        
    def func(self,n):
        if(n <= 1):
            return n
        return self.func(n-1)+self.func(n-2)
        