import java.util.*;

class Solution {
    public List<Boolean> checkIfPrerequisite(int n, int[][] prerequisites, int[][] queries) {
        boolean[][] reach = new boolean[n][n];
        
        for (int[] pre : prerequisites) {
    reach[pre[0]][pre[1]] = true; // ai is prerequisite of bi
}

        // Floyd-Warshall for transitive closure
        for (int k = 0; k < n; k++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (reach[i][k] && reach[k][j]) reach[i][j] = true;
                }
            }
        }
        
        List<Boolean> ans = new ArrayList<>();
        for (int[] q : queries) {
            ans.add(reach[q[0]][q[1]]);
        }
        return ans;
    }
}
