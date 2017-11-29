
public class FactorialTrailingZeroes {
	public static int trailingZeroes(int n) {
		//calculate how many 5 do we have.
		int result=0;
		while(n!=0) {
			n=n/5;
			result+=n;
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(trailingZeroes(100));
	}

}
