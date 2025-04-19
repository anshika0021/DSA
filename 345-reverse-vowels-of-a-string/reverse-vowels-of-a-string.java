class Solution {
    public String reverseVowels(String s) {
        String vowels = "aeiouAEIOU";
        char[] arr = s.toCharArray();
        int i = 0, j = arr.length - 1;
        while (i < j) {
            while (i < j && vowels.indexOf(arr[i]) == -1) i++;
            while (i < j && vowels.indexOf(arr[j]) == -1) j--;
            char temp = arr[i];
            arr[i++] = arr[j];
            arr[j--] = temp;
        }
        return new String(arr);
    }
}
