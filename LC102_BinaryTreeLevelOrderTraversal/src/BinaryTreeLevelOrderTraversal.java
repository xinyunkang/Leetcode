import java.util.ArrayList;
import java.util.List;

public class BinaryTreeLevelOrderTraversal {

	public List<List<Integer>> levelOrder(TreeNode root) {
		List<List<Integer>> res = new ArrayList<>();
		helper(res, root, 0);
		return res;
	}

	public void helper(List<List<Integer>> res, TreeNode root, int height) {
		// BFS
		if (root == null) {
			return;
		}
		if (res.size() == height) { // NOT res.lenght();
			res.add(new ArrayList<Integer>()); // add new empty list to the result.
		}
		res.get(height).add(root.val); // store the root val to result.
		helper(res, root.left, height + 1);
		helper(res, root.right, height + 1);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
