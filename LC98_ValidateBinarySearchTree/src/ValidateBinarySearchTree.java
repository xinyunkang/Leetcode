
public class ValidateBinarySearchTree {
	public boolean isValidBST(TreeNode root) {
		return help(root, null, null);
	}

	public boolean help(TreeNode root, Integer min, Integer max) { // use Object Integer and null pointer to avoid the
																	// corner cases (when node has value
																	// Integer.MIN_VALUE or Integer.MAX_VALUE ).
		if (root == null) {
			return true;
		}

		return (min == null || root.val > min) && (max == null || root.val < max) && help(root.left, min, root.val)
				&& help(root.right, root.val, max);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
