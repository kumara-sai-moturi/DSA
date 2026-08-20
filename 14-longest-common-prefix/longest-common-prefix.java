class Solution {
    public String longestCommonPrefix(String[] strs) {
        int n = strs.length;
        Arrays.sort(strs);
        char start[] = strs[0].toCharArray();
        char last[] = strs[n-1].toCharArray();
        StringBuilder s = new StringBuilder();
        for(int i=0;i<start.length;i++){
            if(start[i]!=last[i]){
                break;
            }
            s.append(start[i]);
        }
        return s.toString();
    }
}