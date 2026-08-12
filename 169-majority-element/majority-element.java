class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int max = 0;
        int count = 0;
        for(int ele:nums){
            if(count == 0){
                max = ele;
            }
            if(ele==max){
                count++;
            }else{
                count--;
            }
        }
        return max;
    }
}