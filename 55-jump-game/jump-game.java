class Solution {
    public boolean canJump(int[] nums) {
        int max_reach = 0;
        int n = nums.length;
        for(int i=0;i<n;i++){
            if(i>max_reach){
                return false;
            }
            max_reach = Math.max(max_reach,i+nums[i]);
            if(max_reach>=n-1){
                return true;
            }
        }
        return false;
    }
}