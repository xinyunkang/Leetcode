
public class SameTree {
	public boolean isSameTree(TreeNode p, TreeNode q) {
		if (p == null && q == null) {
			return true;
		}
		// could be short to p==null||q==null instead of
		// p==null&&q!=null||p!=null&&q==null
		if (p == null || q == null || p.val != q.val) {
			return false;
		}
		return isSameTree(p.left, q.left) && isSameTree(p.right, q.right); //NOT &&
	}

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
