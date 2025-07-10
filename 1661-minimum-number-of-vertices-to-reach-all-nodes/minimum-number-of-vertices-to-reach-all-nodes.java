class Solution {
    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
        int[] Degree = new int[n];
        for (List<Integer> edge : edges) {
            int curr = edge.get(1);
            Degree[curr]++;
        }
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (Degree[i] == 0) {
                result.add(i); 
            }
        }
        return result;
    }
}
