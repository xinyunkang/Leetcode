
public class UniquePathsII {
	public int uniquePathsWithObstacles(int[][] obstacleGrid) {
		int length = obstacleGrid[0].length;
		int[] res = new int[length];
		res[0] = 1; // initial the first cell to 1
		for (int i = 0; i < obstacleGrid.length; i++) {
			for (int j = 0; j < obstacleGrid[0].length; j++) {
				if (obstacleGrid[i][j] == 1) {
					res[j] = 0; // for obstacle exists, set this point value to 0.
				} else if (j > 0) { // exclude j==0,
					res[j] += res[j - 1];
				}
			}
		}
		return res[length - 1];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}