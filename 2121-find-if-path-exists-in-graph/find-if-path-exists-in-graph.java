class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        ArrayList<Integer>[] one = new ArrayList[n];
        for(int i=0;i<n;i++){
            one[i] = new ArrayList<>();
        }
        for(int[] edge : edges){
            int u = edge[0];
            int v = edge[1];
            one[u].add(v);
            one[v].add(u);

        }
        boolean[] visited = new boolean[n];
        Queue<Integer> q = new LinkedList<>();
       
        q.add(source);
        visited[source]=true;
        while(!q.isEmpty()) {
            int cur = q.poll();
            if(cur == destination){
                return true;
            }
            for(int neig: one[cur]) {
                if(!visited[neig]) {
                    visited[neig] = true;
                    q.add(neig);
                }
            }
        }
        return false;
    }
    
}