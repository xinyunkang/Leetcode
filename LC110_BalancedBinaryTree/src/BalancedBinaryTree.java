
public class BalancedBinaryTree {
	public boolean isBalanced(TreeNode root) {
		// a height-balanced binary tree is defined as a binary tree in which the depth
		// of the two subtrees of every node never differ by more than 1.
		if (root == null) {
			return true;
		}
		// 1.remember to use Math.abs when calc the difference. 
		// 2. remember to check the isBalcned for child node.
		return (Math.abs(depth(root.left) - depth(root.right)) <= 1) && isBalanced(root.left) && isBalanced(root.right);

	}

	public int depth(TreeNode root) {
		if (root == null) {
			return 0;
		} else {
			return Math.max(depth(root.left), depth(root.right)) + 1;
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}