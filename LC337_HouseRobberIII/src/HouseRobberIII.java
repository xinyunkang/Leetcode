
public class HouseRobberIII {
	 //O(n) O(n)
    public int rob(TreeNode root) {
        if(root==null) return 0;
        int val=0;
        
        if(root.left!=null){
            //WRONG  val+= root.left.left.val+root.left.right.val;
            val+= rob(root.left.left)+rob(root.left.right);
        }
        if(root.right!=null){
             val+= rob(root.right.left)+rob(root.right.right);
        }
        return Math.max(root.val+val, rob(root.left)+rob(root.right));
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
