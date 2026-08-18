class Solution {
    public int largestInteger(int[] nums, int k) {
        int n = nums.length;
        HashSet<Integer>set = new HashSet<>();
        HashMap<Integer,Integer>map = new HashMap<>();
        int i = 0;
        while(i<=n-k){
            set.clear();
            for(int j=i;j<i+k;j++){
                set.add(nums[j]);
            }
            for(int ele:set){
                map.put(ele,map.getOrDefault(ele,0)+1);
            }
            i++;
        }
        int p = -1;
        for(int ele:map.keySet()){
            if(map.get(ele)==1){
                p = Math.max(p,ele);
            }
        }
        return p;
    }
}