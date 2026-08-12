class Solution {
    public int findPeakElement(int[] nums) {
        int n = nums.length;
        int l = 0;
        int h = n-1;
        while(l<h){
            int mid = l + (h-l)/2;
            if(nums[mid]>nums[mid+1]){
                h = mid;
            }else{
                l = mid+1;
            }
        }
        return l;
    }
}