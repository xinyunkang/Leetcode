import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
	public boolean containsDuplicate(int[] nums) {
		Set numSet = new HashSet();

		for (int num : nums) {
			if (!numSet.add(num)) {  //if duplicate, will return false when try to add to set.
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
