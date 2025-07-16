class Solution {
    public int maximumDetonation(int[][] bombs) {
        int n = bombs.length, max = 0;

        for (int i = 0; i < n; i++) {
            max = Math.max(max, dfs(i, bombs, new boolean[n]));
        }

        return max;
    }

    private int dfs(int i, int[][] bombs, boolean[] visited) {
        visited[i] = true;
        int count = 1;

        for (int j = 0; j < bombs.length; j++) {
            if (!visited[j] && inRange(bombs[i], bombs[j])) {
                count += dfs(j, bombs, visited);
            }
        }

        return count;
    }

    private boolean inRange(int[] a, int[] b) {
        long dx = a[0] - b[0], dy = a[1] - b[1], r = a[2];
        return dx * dx + dy * dy <= r * r;
    }
}
