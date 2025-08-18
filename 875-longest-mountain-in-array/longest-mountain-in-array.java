class Solution {
    public int longestMountain(int[] arr) {
        int n = arr.length;
        int maxlen = 0;
        for(int i =1;i<n-1;i++){
            if(arr[i-1]<arr[i] && arr[i]>arr[i+1]){
                int left = i;
                int right = i;
                while(left >0 && arr[left]>arr[left-1]){
                    left--;
                }
                while(right < n-1 &&arr[right]>arr[right+1]){
                    right++;
                }
                maxlen = Math.max(maxlen,right-left+1);
            }
            
        }
        return maxlen;
    }
}