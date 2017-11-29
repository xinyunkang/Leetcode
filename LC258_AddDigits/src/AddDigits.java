
public class AddDigits {
	public static int addDigits(int num) {
		int result = getSum(num);

		if (result < 10) {
			return result;
		} else {
			return addDigits(result);
		}

	}

	public static int getSum(int num) {
		int sum = 0;
		while (num != 0) {
			sum += num % 10;
			num /= 10;
		}

		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(addDigits(38));
	}

}
