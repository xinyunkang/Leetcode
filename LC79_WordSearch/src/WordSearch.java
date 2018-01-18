
public class WordSearch {
	public boolean exist(char[][] board, String word) {
        //dfs        
        for(int i = 0; i<board.length; i++){
            for(int j=0; j<board[0].length; j++){
                if(helper(board, i, j, 0, word)){
                    return true;
                }
            }
        }
        return false;
    }
    
    //dfs
    public boolean helper(char[][] board, int i, int j, int start, String word){
        if(start>=word.length()) return true; 
        if(i<0||i>=board.length||j<0||j>=board[0].length) return false; //>=length  NOT >length
        if(board[i][j]==word.charAt(start)){
            start++;
            char c=board[i][j];
            board[i][j]='#';  //temperary mark as used.
            boolean res=helper(board,i-1,j,start,word)||
                helper(board,i,j-1,start,word)||
                helper(board,i+1,j,start,word)||
                helper(board,i,j+1,start,word);
            board[i][j]=c;  //rollback       
            return res;
        }
        return false;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
