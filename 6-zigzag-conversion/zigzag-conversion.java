class Solution {
    public String convert(String s, int numRows) {
        int n = s.length();
        if(numRows==1 || numRows>=n){
            return s;
        }
        StringBuilder sb[] = new StringBuilder[numRows];
        for(int i=0;i<numRows;i++){
            sb[i] = new StringBuilder();
        }
        int curr_row = 0;
        boolean move = false;
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            sb[curr_row].append(ch);
            if(curr_row==0 || curr_row==numRows-1){
                move = !move;
            }
            if(move == true){
                curr_row++;
            }else{
                curr_row--;
            }

        }
        StringBuilder res = new StringBuilder();
        for(int i=0;i<numRows;i++){
            res.append(sb[i]);
        }
        return res.toString();
    }
}