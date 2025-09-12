class Solution {
    public int numSquares(int n) {
        Queue<Integer> queue = new LinkedList<>();
        Set<Integer> visited = new HashSet<>();
        queue.add(n);
        visited.add(n);
        int level = 0;

        while (!queue.isEmpty()) {
            level++;
            int size = queue.size();

            for (int i = 0; i < size; i++) {
                int curr = queue.poll();

                for (int j = 1; j * j <= curr; j++) {
                    int next = curr - j * j;
                    if (next == 0) return level;
                    if (!visited.contains(next)) {
                        queue.add(next);
                        visited.add(next);
                    }
                }
            }
        }
        return level;
    }
}
