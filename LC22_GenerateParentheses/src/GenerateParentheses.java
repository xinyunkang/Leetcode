import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {
	public List<String> generateParenthesis(int n) {
		// back tracking problem
		List<String> res = new ArrayList<String>();
		if (n == 0) {
			return res;
		}
		String s = "";
		helper(res, s, n, n);
		return res;
	}

	public void helper(List<String> res, String s, int left, int right) {
		if (left > right) { // the rest of left should NOT be larger than right.
			return;
		}
		if (left == 0 && right == 0) { // Add one solution to the result. //NOT left==right
			res.add(s);
			return;
		} else {
			if (left > 0) { // still have left
				helper(res, s + "(", left - 1, right);   //use left firstly, if finished and returned, track back to use one right instead.
			}
			if (right > 0) { // NOT else if, else if could only get one result.
				helper(res, s + ")", left, right - 1);
			}

		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenerateParentheses gp=new GenerateParentheses();
		System.out.println(gp.generateParenthesis(3));
	}

}
