
public class NumOfOneBits {
	public int hammingWeight(int n) {
		int count = 0;
		while (n != 0) {
			if ((n & 1) == 1) {
				count++;
			}
			n = n >>> 1;
		}
		return count;
		// Or
//		while (n != 0) {
//			sum++;
//			n &= (n - 1);  //remove the right most 1.
//		}
//		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
