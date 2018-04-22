
public class FirstBadVersion {
	// edward version
	// Time: O(log(n))
	// Space: O(1)
	public int firstBadVersion(int n) {
		int start = 1;
		int end = n;

		while (start + 1 < end) { // no need to concern mid+1,-1
			int mid = (end - start) / 2 + start; // no need to use long.
			if (isBadVersion(mid)) {
				end = mid;
			} else {
				start = mid;
			}
		} // after break end is always 1 larger than start
		if (isBadVersion(start)) {
			return start;
		}
		return end;

	}

	public boolean isBadVersion(int mid) {
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
