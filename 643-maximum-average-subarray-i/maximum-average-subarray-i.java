class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        int sum = 0;
        for(int i=0;i<k;i++){
            sum += nums[i];
        }
        int avg = sum;
        for(int i=k;i<n;i++){
            sum += nums[i];
            sum -= nums[i-k];
            avg = Math.max(avg,sum);
        }
        return (double)avg/k;
    }
}