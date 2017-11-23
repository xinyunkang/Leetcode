
public class ValidPalindrome {
	public static boolean isPalindrome(String s) {
		if (s.isEmpty()) {
			return true;   //regard null as a true.
		}
		String strLetterOnly = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();  //how to cast string.

		int headIndex = 0;
		int tailIndex = strLetterOnly.length() - 1;
		while (headIndex < tailIndex) {
			if (strLetterOnly.charAt(headIndex) != strLetterOnly.charAt(tailIndex)) {
				return false;
			}
			headIndex++;
			tailIndex--;
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
		System.out.println(isPalindrome(""));
	}

}
