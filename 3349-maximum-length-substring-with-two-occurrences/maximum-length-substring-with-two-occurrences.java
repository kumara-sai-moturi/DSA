class Solution {
    public int maximumLengthSubstring(String s) {
        int n = s.length();
        int freq[] = new int[26];
        int l = 0;
        int len = 0;
        for(int i=0;i<n;i++){
            freq[s.charAt(i)-'a']++;
            while(freq[s.charAt(i)-'a']>2){
                freq[s.charAt(l)-'a']--;
                l++;
            }
            len = Math.max(len,i-l+1);
        }
        return len;
    }
}