class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int left = 0;
        int right = m*n-1;
        while(left<=right){
            int mid = (left+right)/2;
            int row = mid/n;
            int col = mid%n;
            int midval = matrix[row][col];
            if(target == midval){
                return true;
            }
            else if(target>midval){
                left = mid+1;
            }
            else if(target<midval){
                right = mid-1;
            }
        }
        return false;
    }

}