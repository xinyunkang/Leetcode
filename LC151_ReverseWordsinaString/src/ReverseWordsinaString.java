
public class ReverseWordsinaString {
	public String reverseWords(String s) {
		String[] strArr = s.trim().split("\\s+"); // split by multiple spaces
		StringBuilder sb = new StringBuilder();
		for (int i = strArr.length - 1; i >= 0; i--) {
			sb.append(strArr[i] + " ");

		}

		return sb.toString().trim(); // trim() only remove the space from beginning or end of the string.

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
