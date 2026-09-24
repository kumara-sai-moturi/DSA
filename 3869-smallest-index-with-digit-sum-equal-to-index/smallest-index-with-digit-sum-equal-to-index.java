class Solution {
    public int smallestIndex(int[] nums) {
        int n = nums.length;
        for(int i=0;i<n;i++){
            int k = nums[i];
            if(k<9){
                if(k==i){
                    return i;
                }
            }else{
                int sum = 0;
                while(k>0){
                    sum += k%10;
                    k = k/10;
                }
                if(sum==i){
                    return i;
                }
            }
        }
        return -1;
    }
}