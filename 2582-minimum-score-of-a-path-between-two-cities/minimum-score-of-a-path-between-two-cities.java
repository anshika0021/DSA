class Solution {
    public int minScore(int n, int[][] roads) {
        List<List<int[]>> graph = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }

        for (int[] edge : roads) {
            int u = edge[0];
            int v = edge[1];
            int w = edge[2];
            graph.get(u).add(new int[]{v, w});
            graph.get(v).add(new int[]{u, w});
        }

        boolean[] visited = new boolean[n + 1];
        int[] min = new int[]{Integer.MAX_VALUE};

        dfs(1, graph, visited, min);
        return min[0];
    }

    private void dfs(int node, List<List<int[]>> graph, boolean[] visited, int[] min) {
        visited[node] = true;

        for (int[] neighbor : graph.get(node)) {
            int nextNode = neighbor[0];
            int weight = neighbor[1];
            min[0] = Math.min(min[0], weight);

            if (!visited[nextNode]) {
                dfs(nextNode, graph, visited, min);
            }
        }
    }
}
