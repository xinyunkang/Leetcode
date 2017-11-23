
public class ExcelSheetColumnNumber {
	public static int titleToNumber(String s) {
		int number = 0;
		char[] chars = s.toCharArray();

		for (int i = 0; i < chars.length; i++) {    //chars[0] is the highest digit. chars[length-1] is the lowest.

			number = 26 * number + chars[i] - 'A' + 1; 
		}
		return number;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(titleToNumber("BA"));
	}

}
