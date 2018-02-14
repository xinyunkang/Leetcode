
public class MaximumDepthOfBinaryTree {

	 /*
    public int maxDepth(TreeNode root) {
        if(root==null)
			return 0;
		return 1+Math.max(maxDepth(root.right), maxDepth(root.left)) ;
    }
    */
    
     public int maxDepth(TreeNode root) {
        if(root==null)
			return 0;
         int l=maxDepth(root.left)+1;
         int r=maxDepth(root.right)+1;
         
		return Math.max(l,r) ;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
