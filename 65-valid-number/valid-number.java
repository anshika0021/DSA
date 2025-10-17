public class Solution {
    public boolean isNumber(String s) {
        s = s.trim();

        String regex = "^[+-]?((\\d+\\.\\d*)|(\\d*\\.\\d+)|(\\d+))([eE][+-]?\\d+)?$";

        return s.matches(regex);
    }
}
