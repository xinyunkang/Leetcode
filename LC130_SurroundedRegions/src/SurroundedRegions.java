
public class SurroundedRegions {
	public void solve(char[][] board) {
        /*
        use dfs.
        1. scan all O in the 4 boarders and mark the adjacent O to 1.
        2. scan change all O to x, change all 1 to O
        */
        
        if(board==null||board.length==0||board[0].length==0) return;
        int m=board.length-1;
        int n=board[0].length-1;
        for(int i=0;i<=m;i++){
           if(board[i][0]=='O'){
                dfs(board,i,0);                    
           }
            if(board[i][n]=='O'){
                dfs(board,i,n);                    
           }
            
        }
         for(int j=0;j<=n;j++){
           if(board[0][j]=='O'){
                dfs(board,0,j);                    
           }
            if(board[m][j]=='O'){
                dfs(board,m,j);                    
           }
            
        }
        
        for(int i=0;i<=m;i++){
            for(int j=0;j<=n;j++){
                if(board[i][j]=='O'){
                    board[i][j]='X';
                }
                if(board[i][j]=='1'){
                    board[i][j]='O';
                }
            }
        }
        
    }
    
    
    public void dfs(char[][] board, int x, int y){
        if(x<0||y<0||x>=board.length||y>=board[0].length|| board[x][y] != 'O') return;
        //remember || board[i][j] != 'O' 
        board[x][y]='1'; //mark different than '0'
        dfs(board,x,y-1);
        dfs(board,x,y+1);
        dfs(board,x-1,y);
        dfs(board,x+1,y);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
