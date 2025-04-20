class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        for(String token : tokens){
            if(token.equals("+")||token.equals("-")||token.equals("*")||token.equals("/")){
                
                int val2=st.pop();
                int val1=st.pop();
                
                if(token.equals("+")){
                    st.push(val1+val2);
                }
                if(token.equals("-")){
                    st.push(val1-val2);

                }
                if(token.equals("*")){
                    st.push(val1*val2);
                }
                if(token.equals("/")){
                    st.push(val1/val2);
                }

            }
            else{
                st.push(Integer.parseInt(token));
            }
        }
        return st.pop();
    }
}