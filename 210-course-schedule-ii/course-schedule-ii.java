
class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < numCourses; i++) graph.add(new ArrayList<>());
        for (int[] pre : prerequisites) {
            graph.get(pre[1]).add(pre[0]); // bi -> ai
        }
        
        int[] visited = new int[numCourses];
        List<Integer> order = new ArrayList<>();
        
        for (int i = 0; i < numCourses; i++) {
            if (!dfs(i, graph, visited, order)) return new int[0];
        }
        
        Collections.reverse(order); // reverse to get correct order
        return order.stream().mapToInt(i -> i).toArray();
    }
    
    private boolean dfs(int node, List<List<Integer>> graph, int[] visited, List<Integer> order) {
        if (visited[node] == 1) return false; // cycle detected
        if (visited[node] == 2) return true;  // already visited
        
        visited[node] = 1;
        for (int neighbor : graph.get(node)) {
            if (!dfs(neighbor, graph, visited, order)) return false;
        }
        visited[node] = 2;
        order.add(node);
        return true;
    }
}
