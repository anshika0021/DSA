public class Solution {
    public boolean isNumber(String s) {
        // Trim leading and trailing spaces
        s = s.trim();

        // Regex for valid number (case-insensitive 'e')
        String regex = "^[+-]?((\\d+\\.\\d*)|(\\d*\\.\\d+)|(\\d+))([eE][+-]?\\d+)?$";

        // Return whether string matches regex
        return s.matches(regex);
    }
}
