class Solution {
    public int countCommas(int n) {
        if(n<1000){
            return 0;
        }
        int count = 1;
        if(n>1000){
            count += n-1000;
        }
        return count;
    }
}