class Solution {
    public int compress(char[] chars) {
        int index=0;
        int i=0;
        int n= chars.length;
        while(i<n){
            char curr_char =chars[i];
            int count=0;
            while(i<n&& chars[i]==curr_char){
                count++;
                i++;
            }
            chars[index]=curr_char;
            index++;
            if(count>1){
                String count_str = String.valueOf(count); 
                for (char ch : count_str.toCharArray()) { 
                    chars[index] = ch;
                    index++;
                }
            }
        }
        return index;
        
    }
}