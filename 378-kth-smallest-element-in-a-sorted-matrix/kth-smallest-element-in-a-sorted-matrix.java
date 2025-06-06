import java.util.PriorityQueue;
import java.util.Collections;

class Solution {
    public int kthSmallest(int[][] matrix, int k) {
    
        PriorityQueue<Integer> maxheap = new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                maxheap.add(matrix[i][j]);
                if (maxheap.size() > k) {
                    maxheap.poll(); 
                }
            }
        }

        return maxheap.peek(); 
    }
}
