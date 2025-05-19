class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = Integer.MIN_VALUE;

        for (int pile : piles) {
            high = Math.max(high, pile);
        }

        int ans = high;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            long totalHours = 0;  // Use long here
            for (int pile : piles) {
                totalHours += (pile + mid - 1) / mid;  // ceil(pile / mid)
            }

            if (totalHours <= h) {
                ans = mid;        // try smaller speed
                high = mid - 1;
            } else {
                low = mid + 1;    // too slow
            }
        }

        return ans;
    }
}

