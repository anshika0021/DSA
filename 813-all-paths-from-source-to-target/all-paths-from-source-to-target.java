class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> gra = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        int source =0;
        int dest = graph.length-1;
        dfs(graph,0,dest,gra,path);
        return gra;
    }
    
    void dfs(int[][] graph, int curr, int dest, List<List<Integer>> gra,List<Integer> path) {
        path.add(curr); 
        if (curr == dest) {
            gra.add(new ArrayList<>(path)); 
        } 
        else {
            for (int neighbor : graph[curr]) {
                dfs(graph, neighbor, dest, gra,path);
            }
        }
        path.remove(path.size()-1);
    }
}
