import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class twoSum {

	public static int[] twoSum(int[] nums, int target) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			map.put(nums[i], i);
		}

		for (int firstIndex = 0; firstIndex < nums.length; firstIndex++) {
			int secondValue = target - nums[firstIndex];
			if (map.containsKey(secondValue) && firstIndex != map.get(secondValue)) {  //IMPORTANT!-- remember to check duplicate and NOT the same one
				int secondIndex = map.get(secondValue);
				return new int[] { firstIndex, secondIndex };
			}
		}
		return null;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// int[] nums= new int[] {3,2,4};
		// int[] nums= new int[] {3,3};   // good test case 
		// int target =6;

		int[] nums = new int[] { 2, 5, 5, 11 }; // good test case 
		int target = 10;

		int[] result = twoSum(nums, target);
		System.out.print(Arrays.toString(result));
	}

}
