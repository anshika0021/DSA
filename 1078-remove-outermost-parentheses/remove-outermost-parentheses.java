class Solution {
    public String removeOuterParentheses(String s) {
        String s1 = new String();
        int x =1;
        int c = 1;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '('){
                c++;
            }
            else{
                c--;
            }
            if(c == 1){
                s1 = s1+s.substring(x,i);
                x=i+2;
            }
        }
        return s1;
        
    }
}