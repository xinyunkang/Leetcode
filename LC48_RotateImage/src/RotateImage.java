
public class RotateImage {
	public static void rotate(int[][] matrix) {
		/*
		 * clockwise rotate
		 * first reverse up to down, then swap the symmetry 
		 * 1 2 3     7 8 9     7 4 1
		 * 4 5 6  => 4 5 6  => 8 5 2
		 * 7 8 9     1 2 3     9 6 3
		*/
        int col_len=matrix[0].length; //NOT length()
        int row_len=matrix.length;
        
         for(int i=0;i<row_len/2;i++){
            for(int j=0;j<col_len;j++){
                int temp=matrix[i][j];  
                matrix[i][j]=matrix[row_len-1-i][j]; //row_len-1, NOT +1
                matrix[row_len-1-i][j]=temp;                
            }
            
        }
        
        for(int i=0;i<row_len;i++){
            for(int j=i;j<col_len;j++){  //j=i, NOT j=0
                int temp=matrix[i][j];               
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
            
        }
		
		/*
		 * anticlockwise rotate
		 * first reverse left to right, then swap the symmetry
		 * 1 2 3     3 2 1     3 6 9
		 * 4 5 6  => 6 5 4  => 2 5 8
		 * 7 8 9     9 8 7     1 4 7
		*/

        for(int i=0;i<row_len;i++){
           for(int j=0;j<col_len/2;j++){
               int temp=matrix[i][j];  
               matrix[i][j]=matrix[i][col_len-1-j]; //column swap
               matrix[i][col_len-1-j]=temp;                
           }
           
       }
       
       for(int i=0;i<row_len;i++){
           for(int j=i;j<col_len;j++){  //j=i, NOT j=0
               int temp=matrix[i][j];               
               matrix[i][j]=matrix[j][i];
               matrix[j][i]=temp;
           }
           
       }
       
        
        System.out.println("");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		rotate(new int[][] { {1,2,3},{4,5,6},{7,8,9}});
		System.out.println("");
	}

}
