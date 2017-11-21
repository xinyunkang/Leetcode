
public class LCA {

	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
		if(root.val>p.val&&root.val>q.val)
		{
			return lowestCommonAncestor(root.left,p,q); //remember to add return
		}
		else if(root.val<p.val&&root.val<q.val)
		{
			return lowestCommonAncestor(root.right,p,q); //remember to add return
		}
		else {
			return root;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
