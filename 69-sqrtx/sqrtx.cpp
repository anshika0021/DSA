class Solution {
public:
    int mySqrt(int x) {
        if (x == 0) return 0; 

        int low = 1, high = x, ans = 0;
        while (low <= high) {
            long mid = low + (high - low) / 2; 
            if (mid * mid == x) return mid;
            if (mid * mid < x) { 
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }
};
