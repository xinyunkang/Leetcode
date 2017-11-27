import java.util.HashMap;

public class MajorityElement {
	public int majorityElement(int[] nums) {
		// 1. Sorting
		// Arrays.sort(nums);
		// return nums[nums.length/2];

		// 2. HashMap
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		int result = 0;
		if (nums.length == 1) { // Edge case. only one element
			return nums[0];
		}
		for (int num : nums) {
			if (map.getOrDefault(num, 0) >= nums.length / 2) { // use getOrDefault avoid null,
				// >= NOT > for example input is [2,2]
				result = num;
			} else {
				map.put(num, map.getOrDefault(num, 0) + 1);
			}
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
