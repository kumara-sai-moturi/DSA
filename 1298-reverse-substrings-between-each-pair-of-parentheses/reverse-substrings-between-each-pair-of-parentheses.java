class Solution {
    public String reverseParentheses(String s) {
        int n = s.length();
        Stack<String> st = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for(char c:s.toCharArray()){
            if(c=='('){
                st.push(sb.toString());
                sb.setLength(0);
            }else if(c==')'){
                sb.reverse();
                sb.insert(0,st.pop());
            }else{
                sb.append(c);
            }
        }
        return sb.toString();
    }
}