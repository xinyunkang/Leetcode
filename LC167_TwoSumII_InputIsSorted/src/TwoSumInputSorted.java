
public class TwoSumInputSorted {

	public static int[] twoSum(int[] numbers, int target) {
		int indexA = 0;
		int indexB = numbers.length - 1;
		int[] result=new int[2];

		while (target != numbers[indexA] + numbers[indexB]) {
			if (target > numbers[indexA] + numbers[indexB]) {
				indexA++;
			} else if (target <numbers[indexA] + numbers[indexB]) {
				indexB--;
			}
		}
		result[0] = indexA + 1;
		result[1] = indexB + 1;
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input=new int[] {2, 7, 11, 15};
		int target = 26;
		System.out.println(twoSum(input, target));
	}

}
