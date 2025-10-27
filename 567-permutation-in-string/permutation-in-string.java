class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) return false;

        int[] freq = new int[26];
        for (char c : s1.toCharArray()) freq[c - 'a']++;

        int left = 0, right = 0, count = s1.length();
        char[] arr = s2.toCharArray();

        while (right < arr.length) {
            if (freq[arr[right++] - 'a']-- > 0) count--;
            if (count == 0) return true;
            if (right - left == s1.length() && freq[arr[left++] - 'a']++ >= 0) count++;
        }
        return false;
    }
}
