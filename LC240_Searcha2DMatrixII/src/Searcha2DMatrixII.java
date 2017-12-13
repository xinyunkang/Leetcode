
public class Searcha2DMatrixII {
	public boolean searchMatrix(int[][] matrix, int target) {
		if (matrix == null || matrix.length < 1 || matrix[0].length < 1) { // add matrix[0].length <1 check
			return false;
		}
		int rowLength = matrix.length;
		int columnLength = matrix[0].length;
		int row = 0;
		int column = columnLength - 1; // use up-right corner as start point.
		while (column >= 0 && row < rowLength) {
			if (target == matrix[row][column]) {
				return true;
			}
			if (target < matrix[row][column]) {
				column--;
			} else {
				row++;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
