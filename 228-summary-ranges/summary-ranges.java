class Solution {
    public List<String> summaryRanges(int[] nums) {
        int n = nums.length;
        List<String>list = new ArrayList<>();
        int start = 0;
        for(int i=0;i<n;i++){
            if(i==n-1 || nums[i+1]!=nums[i]+1){
                if(start==i){
                    list.add("" + nums[start]);
                }else{
                    list.add(nums[start] + "->" + nums[i]);
                }
                start = i+1;
            }
        }
        return list;
    }
}