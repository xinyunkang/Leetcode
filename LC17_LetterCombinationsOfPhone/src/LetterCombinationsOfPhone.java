import java.util.LinkedList;
import java.util.List;

public class LetterCombinationsOfPhone {
	public static List<String> letterCombinations(String digits) {
		// use queue to store the answer.
		LinkedList<String> ans = new LinkedList<String>();
		 if (digits == null || digits.length() == 0)  //NOT digits==""
             return ans; 
		String[] mapping = new String[] { "0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
		ans.add("");
		for (int i = 0; i < digits.length(); i++) {
			int x = (int) (digits.charAt(i) - '0'); // x is the number in phone.
			while (ans.peek().length() == i) { // get the first element's length in queue.
				String t = ans.remove(); // Retrieves and removes the head (first element) of this list.
				for (char s : mapping[x].toCharArray())
					ans.add(t + s); // add to the end of queue.
			}

		}

		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		letterCombinations("");
	}

}
