
public class UniquePaths {
	//dp 1
    //time: O(m*n); space: O(m*n)
    public int uniquePaths1(int m, int n) {
        int[][] res= new int[m][n]; //NOT new int[m][n]{}
        for(int i=0;i<m;i++){
            res[i][0]=1;
        }
        for(int j=0;j<n;j++){
            res[0][j]=1;
        }
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                res[i][j]=res[i-1][j]+res[i][j-1];
            }
        }
        return res[m-1][n-1];
    }
    
    
    //dp 2
    //time: O(m*n); space: O(n)
    public int uniquePaths(int m, int n) {
        int[]res= new int[n];  //only store the column calculated value
        res[0]=1; //initialize the first int[0][0] value to 1
       
        for(int i=0;i<m;i++){   //scan from top to bottom.
            for(int j=1;j<n;j++){ //scan from the second column to rightmost for each row.
                res[j]=res[j-1]+res[j];
            }
        }
        return res[n-1]; //last row last column
    }
    
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
