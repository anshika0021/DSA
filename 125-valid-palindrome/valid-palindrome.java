class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        s = s.replaceAll("[^a-z0-9]","");
        int low = 0;
        int a = s.length();
        int high = a-1;
        while(low<high){
            if(s.charAt(low) != s.charAt(high)){
                return false;
            }
            low++;
            high--;
            
        }
        return true;
    }
}