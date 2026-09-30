class Solution {
    public boolean find132pattern(int[] nums) {
        int n = Integer.MIN_VALUE;
        Stack<Integer>s = new Stack<>();
        for(int i=nums.length-1;i>=0;i--){
            if(nums[i]<n){
                return true;
            }else{
                while(!s.isEmpty() && nums[i]>s.peek()){
                    n = s.pop();
                }
                s.push(nums[i]);
            }
        }
        return false;

    }
}