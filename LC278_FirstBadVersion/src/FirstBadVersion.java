
public class FirstBadVersion {
	public int firstBadVersion(int n) {
		// Binary search
		return binarySearch(1, n);
	}

	public int binarySearch(int start, int end) {

		long startLong = start;
		long endLong = end;
		Long middleLong = (startLong + endLong) / 2; // use long to avoid sum overflow
		int mid = middleLong.intValue(); // need to cast back to int.

		if (isBadVersion(mid)) { // isBadVersion() is an api provided by leetcode.
			if (!isBadVersion(mid - 1)) { // consider the +1/-1 scenario
				return mid;
			} else {
				return binarySearch(start, mid - 1); // return
			}
		} else {
			if (isBadVersion(mid + 1)) { // consider the +1/-1 scenarios
				return mid + 1;
			} else {
				return binarySearch(mid + 1, end); // return
			}
		}
	}

	private boolean isBadVersion(int mid) {
		// TODO Auto-generated method stub
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
