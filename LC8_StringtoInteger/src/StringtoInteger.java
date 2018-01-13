
public class StringtoInteger {
	public int myAtoi(String str) {
		/*
		 * need to concern following 3 factors: 
				1. + - 
                2. not valid 
                3. edge cases

		 */

		int start = 0;
		int sign = 1;
		int res = 0;
		if (str == null || str.length() == 0)
			return 0;
		str = str.trim();
		if (str.charAt(0) == '+') {
			sign = 1;
			start++;
		} else if (str.charAt(0) == '-') {
			sign = -1;
			start++;
		}
		// else{
		// NOT else.

		for (int i = start; i < str.length(); i++) {
			if (!Character.isDigit(str.charAt(i))) {
				return (int) res * sign;
			}
			// Integer.MAX_VALUE = 2147483647
			// Integer.MIN_VALUE = -2147483648
			//A good way to check the min or max value without overflow.
			if (res > Integer.MAX_VALUE / 10 || (res == Integer.MAX_VALUE / 10 && str.charAt(i) - '0' > 7)) {
				if (sign == 1)
					return Integer.MAX_VALUE;
				else
					return Integer.MIN_VALUE;
			}
			res = res * 10 + str.charAt(i) - '0'; // use -'0' to convert to int value.
		}
		// }

		return (int) res * sign;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
