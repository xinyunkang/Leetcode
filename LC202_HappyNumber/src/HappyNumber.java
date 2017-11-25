import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class HappyNumber {

	public boolean isHappy(int n) {
		Set<Integer> newNumSet = new HashSet<Integer>();
		int sqareSum, remain;
		while (newNumSet.add(n)) {  //use set to record numbers and break the while loop when duplicated.
			sqareSum = 0;
			while (n != 0) {
				remain = n % 10;
				sqareSum += remain * remain;
				n /= 10;
			}

			if (sqareSum != 1) {
				n = sqareSum;
			} else {
				return true;
			}
		}

		return false;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HappyNumber hn = new HappyNumber();
		System.out.println(hn.isHappy(2));
	}

}
