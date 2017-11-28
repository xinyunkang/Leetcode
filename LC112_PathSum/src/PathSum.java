
public class PathSum {
	public boolean hasPathSum(TreeNode root, int sum) {
		if (root == null) {
			return false;
		
		} else if (root.left==null&&root.right==null&&root.val == sum) { 
			//need to be the leaf, so add left & right child is null check
			return true;
		
		} else {
			return hasPathSum(root.left, sum - root.val)||hasPathSum(root.right, sum - root.val);//NOT sum-root.right.val
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
