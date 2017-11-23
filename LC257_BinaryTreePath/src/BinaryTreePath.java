import java.util.ArrayList;
import java.util.List;

public class BinaryTreePath {
	public List<String> binaryTreePaths(TreeNode root) {
		List<String> answer = new ArrayList<String>();
		if (root != null)   //remember to check the edge.
			getPath(root, "", answer);
		return answer;

	}

	public void getPath(TreeNode root, String path, List<String> answer) {
		if (root.left == null && root.right == null) {
			answer.add(path + root.val);
		}
		if (root.left != null) {  //NOT else if
			getPath(root.left, path + root.val + "->", answer);
		}
		if (root.right != null) { //NOT else if
			getPath(root.right, path + root.val + "->", answer);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
