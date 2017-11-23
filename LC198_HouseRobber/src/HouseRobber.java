
public class HouseRobber {

	public int rob(int[] nums) {
		int rob = 0; // max monney can get if rob current house
		int notRob = 0; // max monney can get if NOT rob current house
		for (int i = 0; i < nums.length; i++) {
			int curRob = notRob + nums[i]; // add curRob value to void impact between notRob and rob value.
			notRob = Math.max(rob, notRob);// if not rob ith house, take the max value of robbed (i-1)th house and not
											// rob (i-1)th house
			rob = curRob; // if rob current value, previous house must not be robbed
		}
		return Math.max(notRob, rob);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
