class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        Set<List<Integer>>set = new HashSet<>();
        Arrays.sort(nums);
        for(int i=0;i<n-2;i++){
            int left = i+1;
            int right = n-1;
            while(left<right){
                int k = nums[i]+nums[left]+nums[right];
                if(k==0){
                    List<Integer>list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[left]);
                    list.add(nums[right]);
                    set.add(list);
                    left++;
                    right--;
                }else if(k<0){
                    left++;
                }else if(k>0){
                    right--;
                }
            }
        }
        return new ArrayList<>(set);
    }
}