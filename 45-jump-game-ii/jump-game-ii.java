class Solution {
    public int jump(int[] nums) {
        int n = nums.length;
        int max_ind = 0;
        int curr = 0;
        int jumps = 0;
        for(int i=0;i<n-1;i++){
            max_ind = Math.max(max_ind,i+nums[i]);
            if(i==curr){
                jumps++;
                curr = max_ind;
            }
            
        }
        return jumps;
    }
}