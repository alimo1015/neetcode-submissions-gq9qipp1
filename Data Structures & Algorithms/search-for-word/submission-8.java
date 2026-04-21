class Solution {
    int[][] offs = {{-1,0}, {1,0}, {0,1}, {0,-1}};
    public boolean exist(char[][] board, String word) {
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length; j++){
                if(board[i][j] == word.charAt(0)){
                    if(backtrack(i,j, 0, board, word)){
                        return true;
                    }
                }
            }
        }
        return false;
    }
    public boolean backtrack(int i, int j, int index, char[][] board, String word){
        if(index == word.length()){
            return true;
        }
        if(i < 0 || i == board.length || j < 0 || j == board[0].length
        || board[i][j] != word.charAt(index)){
            return false;
        }
        char tmp = board[i][j];
        board[i][j] = '#';

        for(int[] off : offs){
            
            if(backtrack(i + off[0], j + off[1], index + 1, board, word)){
                return true;
            }
        }
        board[i][j] = tmp;
        return false;

    }
}
