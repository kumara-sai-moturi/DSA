class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int ind = Integer.MAX_VALUE;
        int sum = 0;
        int l = 0;
        for(int i = 0;i<n;i++){
            sum += nums[i];
            while(sum>=target){
                ind = Math.min(ind,i-l+1);
                sum -= nums[l];
                l++;
            }
        }
        return ind == Integer.MAX_VALUE ? 0 : ind;
    }
}