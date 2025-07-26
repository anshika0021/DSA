class Solution {
    public boolean exist(char[][] board, String word) {
        int rows = board.length;
        int col = board[0].length;
        int ind = 0;
        for(int i=0;i<rows;i++){
            for(int j=0;j<col;j++){
                if(board[i][j] == word.charAt(0) && dfs(board,i,j,word,ind)){
                    return true;
                }
            }
            
        }
        return false;
        
    }
    boolean dfs(char[][]board,int i ,int j,String word,int ind){
            if(ind == word.length()){
                return true;
            }
            if (i < 0 || j < 0 || i >= board.length || j >= board[0].length ||
            board[i][j] != word.charAt(ind)) {
            return false;
        }
            char temp = board[i][j];
            board[i][j] = '%';
            boolean found = dfs(board,i+1,j,word,ind+1)||
            dfs(board,i-1,j,word,ind+1)||
            dfs(board,i,j+1,word,ind+1)||
            dfs(board,i,j-1,word,ind+1);
            board[i][j] = temp;
            return found;
    
        }
        
}