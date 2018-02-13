import java.util.*;

public class InvertBinaryTree {
	/* O(n) O(n)
	 * 
	 */
    public TreeNode invertTree1(TreeNode root) {
        if(root==null) return root;
        
        //root.right=invertTree(root.left); Assign directly is WRONG 
        //root.left = invertTree(root.right);
        TreeNode right=invertTree(root.right);
        TreeNode left= invertTree(root.left);
        root.right=left;
        root.left=right;
        return root;
    }
    
    
    /* O(n) O(n) BFS
    */
      public TreeNode invertTree(TreeNode root) {
        if(root==null) return root;
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        q.offer(root);
        while(!q.isEmpty()){
            TreeNode n=q.poll();
            TreeNode temp=n.left;
            n.left=n.right;
            n.right=temp;
            if(n.left!=null) q.offer(n.left);
            if(n.right!=null) q.offer(n.right);            
        }
        return root;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
