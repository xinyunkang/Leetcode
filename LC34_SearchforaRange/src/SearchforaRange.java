
public class SearchforaRange {
	public int[] searchRange(int[] nums, int target) {
		int strLen = nums.length;
		int start = -1;
		int end = -1;
		for (int i = 0; i < strLen; i++) {
			if (nums[i] == target) {
				if (start == -1) {
					start = i;

				} else {
					end = i;
				}
			}
		}

		if (start != -1 && end == -1) {
			end = start;
		}
		return new int[] { start, end };
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
