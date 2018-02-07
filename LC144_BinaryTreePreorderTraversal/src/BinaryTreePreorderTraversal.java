import java.util.*;



public class BinaryTreePreorderTraversal {
	
    public List<Integer> preorderTraversal1(TreeNode root) {
        //recursive  O(n) O(n)
        
        List<Integer> res= new ArrayList<>();
        if(root==null) return res;
        
        helper(res, root);
        return res;
    }
    
    public List<Integer> helper(List<Integer> res, TreeNode root){
        if(root==null) return res;
        res.add(root.val);
        helper(res,root.left);
        helper(res, root.right);
        return res;
    }
    
    
    public List<Integer> preorderTraversal(TreeNode root) {
        //Iterator  O(n) O(n)        
        List<Integer> res= new ArrayList<>();
        if(root==null) return res;
        Stack<TreeNode> s= new Stack<>();
        s.push(root);
        while(!s.isEmpty()){
            TreeNode cur= s.pop();
            if(cur.right!=null){ //for stack is FILO, need to push Right child before left!
                s.push(cur.right);
            }
            if(cur.left!=null){
                s.push(cur.left);
            }
            
            res.add(cur.val);
        }
        return res;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
