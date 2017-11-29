
public class ClimbingStairs {

	public int climbStairs(int n) {
		// DP
		if (n == 0 || n == 1 || n == 2) {
			return n;
		}
		int[] memo = new int[n + 1]; // start from memo[1], end with memo[n], didn't use memo[0] 
										// so the total size is n+1
		memo[1] = 1;
		memo[2] = 2;
		for (int i = 3; i <= n; i++) {
			memo[i] = memo[i - 1] + memo[i - 2];
		}
		return memo[n];

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
