
public class PowerOfTwo {

	public boolean isPowerOfTwo(int n) {
		// Power of 2 means only one bit of n is '1', so use the trick n&(n-1)==0 to
		// judge whether that is the case
		return (n > 0) && ((n & (n - 1)) == 0);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
