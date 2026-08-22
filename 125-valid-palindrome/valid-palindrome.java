class Solution {
    public boolean isPalindrome(String s) {
        int n = s.length();
        StringBuilder res = new StringBuilder();
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                res.append(Character.toLowerCase(ch));
            }
        }
        int i=0;
        int j = res.length()-1;
        while(i<j){
            if(res.charAt(i)!=res.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;

    }
}