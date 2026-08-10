class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n = numbers.length;
        int i = 0;
        int j = n-1;
        while(i<n && j>=0){
            int k = numbers[i]+numbers[j];
            if(k==target){
                return new int[]{i+1,j+1};
            }else if(k<target){
                i++;
            }else{
                j--;
            }
        }
        return new int[]{-1,-1};
    }
}