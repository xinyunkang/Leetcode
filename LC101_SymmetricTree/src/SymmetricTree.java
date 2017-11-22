
public class SymmetricTree {
	public boolean isSymmetric(TreeNode root) {
		return isMirror(root, root);  //recursive pass root twice
	}

	public boolean isMirror(TreeNode rightNode, TreeNode leftNode) {
		if (rightNode == null && leftNode == null)
			return true;
		if (rightNode == null || leftNode == null)
			return false;
		return (rightNode.val == leftNode.val)    
				&& isMirror(rightNode.right, leftNode.left)
				&& isMirror(rightNode.left, leftNode.right);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
