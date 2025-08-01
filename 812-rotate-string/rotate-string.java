class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length() != goal.length()){
            return false;
        }
        String one = s+s;
        return one.contains(goal);
    }
}