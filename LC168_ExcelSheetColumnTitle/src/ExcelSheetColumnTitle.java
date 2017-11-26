
public class ExcelSheetColumnTitle {
	public static String convertToTitle(int n) {
		StringBuilder result = new StringBuilder();
		while (n > 0) {
			n--;//need to minus 1, because add 'A' and n/26; so could not use (n-1)%26 instead.
			result.append((char)('A' + n % 26));  
			n = n / 26;
		}
		return result.reverse().toString(); // reverse the result.
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(convertToTitle(26));
	}

}
