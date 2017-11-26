
public class ImplementStrStr {
	public static int strStr(String haystack, String needle) {
		int l1 = haystack.length();
		int l2 = needle.length();
		if (haystack.isEmpty() && needle.isEmpty()) {
			return 0;
		}
		if (l2 > l1) {
			return -1;
		}

		int threshold = l1 - l2;
		for (int stackIndex = 0; stackIndex <= threshold; stackIndex++) {
			// use substring instead of char by char compare.
			// l2+threshold, NOT l1+threshold
			if (haystack.substring(stackIndex, stackIndex + l2).equals(needle)) {

				return stackIndex;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(strStr("hello", "ll"));

	}

}
