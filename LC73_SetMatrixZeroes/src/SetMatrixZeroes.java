
public class SetMatrixZeroes {
	public void setZeroes(int[][] matrix) {
		int rowLength = matrix.length;
		int colLength = matrix[0].length;
		boolean firstRowZero = false;
		boolean firstColumnZero = false;
		for (int i = 0; i < rowLength; i++) {
			for (int j = 0; j < colLength; j++) {

				if (matrix[i][j] == 0) {
					if (i == 0)
						firstRowZero = true; // mark the status of first row and column
					if (j == 0)
						firstColumnZero = true;
					matrix[0][j] = 0; // mark the corresponding column will be zero
					matrix[i][0] = 0; // mark the corresponding row will be zero
				}
			}
		}

		for (int i = 1; i < rowLength; i++) { // Start from 1, NOT 0
			for (int j = 1; j < colLength; j++) {
				if (matrix[0][j] == 0 || matrix[i][0] == 0) {
					matrix[i][j] = 0; // mark the corresponding rows and columns to zero
				}
			}
		}

		if (firstRowZero) {
			for (int j = 0; j < colLength; j++) {
				matrix[0][j] = 0;
			}
		}

		if (firstColumnZero) {
			for (int i = 0; i < rowLength; i++) {
				matrix[i][0] = 0;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
