
public class Sqrt {
	public int mySqrt(int x) {
		//Binary Search
		if (x == 0) {
			return 0;
		}
		int left = 1;
		int right = x; //NOT Integer.Max
		// Near the very end, closest step, before while loop, left = mid = right.
		// In while, If mid < sqrt(x), left = mid + 1 executed, right pointer is not
		// moving, and right is the answer.
		// If while, If mid > sqrt(x), right = mid - 1 executed, right pointer shifts
		// left 1, closest to sqrt(x), right is also the answer.
		while (left <= right) {
			int mid = (left + right) / 2;
			// Don't use tempSquare=mid*mid---may overflow
			if (mid == x / mid) {
				return mid;
			} else if (mid < x / mid) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}

		}

		return right;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
