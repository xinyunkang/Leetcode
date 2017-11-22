
public class MaximumDepthOfBinaryTree {

	public int maxDepth(TreeNode root) {
		if(root==null)
			return 0;
		return 1+Math.max(maxDepth(root.right), maxDepth(root.left)) ;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
