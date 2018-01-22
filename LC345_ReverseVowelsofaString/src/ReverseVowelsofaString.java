
public class ReverseVowelsofaString {
	public String reverseVowels(String s) {
		if (s == null || s.length() == 0)
			return s;
		char[] arr = s.toCharArray();
		int left = 0;
		int right = s.length() - 1;
		while (left < right) {
			if (!isVowel(s.charAt(left))) {
				left++;
			}
			if (!isVowel(s.charAt(right))) {
				right--;
			}
			if (isVowel(s.charAt(left)) && isVowel(s.charAt(right))) {
				swap(arr, left++, right--);
			}
		}
		return String.valueOf(arr);
	}

	public boolean isVowel(char c) {
		c = Character.toLowerCase(c); // convert to lower case.
		if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
			return true;
		}
		return false;
	}

	public void swap(char[] arr, int i, int j) {
		char temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
