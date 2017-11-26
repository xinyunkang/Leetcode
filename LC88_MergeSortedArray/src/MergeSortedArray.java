
public class MergeSortedArray {
	public void merge(int[] nums1, int m, int[] nums2, int n) {
		int mIndex = m - 1;
		int nIndex = n - 1;
		int totalIndex = m + n - 1; // allocate the size of the final result.

		while (mIndex > -1 && nIndex > -1) {
			// always find the biggest one to attach at the end of array.
			nums1[totalIndex--] = nums1[mIndex] > nums2[nIndex] ? nums1[mIndex--] : nums2[nIndex--];
		}
		while (nIndex > -1) { // if nums1 is finished earlier than nums2, attach all the left nums2.
			nums1[totalIndex--] = nums2[nIndex--];
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
