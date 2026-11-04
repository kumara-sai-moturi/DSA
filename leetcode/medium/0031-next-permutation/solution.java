class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int ind = -1;
        for(int i=n-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                ind = i;
                break;
            }
        }
        if(ind == -1){
            reverse(0,n-1,nums);
            return;
        }
        for(int i = n-1;i>=0;i--){
            if(nums[i]>nums[ind]){
                swap(i,ind,nums);
                break;
            }
        }
        reverse(ind+1,n-1,nums);

    }
    public static void reverse(int i,int j,int nums[]){
        while(i<=j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }
    public static void swap(int i,int j,int nums[]){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}