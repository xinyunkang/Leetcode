
public class SearchinRotatedSortedArray {
	public int search(int[] nums, int target) {
		if (nums == null || nums.length == 0)
			return -1; // add edge check.
		int start = 0;
		int end = nums.length - 1;

		while (start < end-1 ) { // NOT start<end, or will loop forever if edge case (target is the first or last item).
			int mid = (end - start) / 2 + start; // style of how to get the mid value.
			if (nums[mid] == target)
				return mid;
			if (nums[start] < nums[mid]) { // if the first half is ascend.
				if (nums[start] <= target && target <= nums[mid]) { // <=, not <
					end = mid;
				} else { // should be in the second half
					start = mid;
				}
			} else { // second half is ascend
				if (nums[mid] <= target && target <= nums[end]) {
					start = mid;
				} else {// should be in the first half
					end = mid;
				}
			}
		}

		if (nums[start] == target)
			return start; // Add edge check in the end.
		if (nums[end] == target)
			return end;

		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SearchinRotatedSortedArray srsa= new SearchinRotatedSortedArray();
		System.out.println(srsa.search(new int[] {4, 5, 6, 7, 0, 1, 2}, 2));
	}

}
