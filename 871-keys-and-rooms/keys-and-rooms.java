class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n = rooms.size();
        boolean[] vis = new boolean[n];
        dfs(0, rooms, vis);  
        for (int i=0;i<vis.length;i++) {
            if (!vis[i]) {
                return false;
            }
        }
        return true;
    }

    private void dfs(int room, List<List<Integer>> rooms, boolean[] vis) {
        vis[room] = true;
        for (int neigh : rooms.get(room)) {
            if (!vis[neigh]) {
                dfs(neigh, rooms, vis);
            }
        }
    }
}
