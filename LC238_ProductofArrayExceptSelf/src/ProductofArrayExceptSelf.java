
public class ProductofArrayExceptSelf {
	public int[] productExceptSelf(int[] nums) {
		// The idea is simply. The product basically is calculated using the numbers
		// before the current number and //the numbers after the current number. Thus,
		// we can scan the array twice. First, we calcuate the running product //of the
		// part before the current number. Second, we calculate the running product of
		// the part after the current //number through scanning from the end of the
		// array.
		int numLength = nums.length;
		int[] result = new int[numLength];
		if (numLength == 0) {
			return result;
		}
		for (int i = 0, prefix = 1; i < numLength; i++) {
			result[i] = prefix; // the product of numbers before result[i]
			prefix *= nums[i]; // multiply current number as the prefix for next number.
		}

		for (int j = numLength - 1, sufix = 1; j >= 0; j--) {
			// the product of numbers after result[i]
			result[j] *= sufix; // NOT result[j]=sufix. result[j] needs to multiply the prefix result.
			sufix *= nums[j]; // multiply current number as the suffix for next number.
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
