class Solution {
    public int evalRPN(String[] tokens) {
        int n = tokens.length;
        Stack<Integer>st = new Stack<>();
        for(String ele:tokens){
            if(!ele.equals("+") && 
            !ele.equals("-") && 
            !ele.equals("*") && 
            !ele.equals("/")){
                st.push(Integer.parseInt(ele));
            }else{
                int b = st.pop();
                int a = st.pop();
                if(ele.equals("+")){
                    st.push(a+b);
                }else if(ele.equals("-")){
                    st.push(a-b);
                }else if(ele.equals("*")){
                    st.push(a*b);
                }else if(ele.equals("/")){
                    st.push(a/b);
                }
            }
        }
        return st.pop();
    }
}