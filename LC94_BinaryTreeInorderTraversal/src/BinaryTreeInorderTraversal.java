import java.util.*;

public class BinaryTreeInorderTraversal {
	 
    public List<Integer> inorderTraversal2(TreeNode root) {
          
        List<Integer> res= new ArrayList<>();
        if(root==null) return res;        
        helper(res, root);
        return res;
    }
    
    public List<Integer> helper(List<Integer> res, TreeNode root){
        if(root==null) return res;
        helper(res,root.left); //move left before root.
        res.add(root.val);       
        helper(res, root.right);
        return res;
    }
    
    public List<Integer> inorderTraversal(TreeNode root) {
        //Iterator  O(n) O(n)        
        List<Integer> res= new ArrayList<>();
        if(root==null) return res;
        Stack<TreeNode> s= new Stack<>();
        //s.push(root);
        TreeNode cur=root;
        while(cur!=null||!s.isEmpty()){ // || not &&
            while(cur!=null){  //push all left node to stack
                s.push(cur); //NOT s.push(cur.left)
                cur=cur.left;
            }
            cur=s.pop();
            res.add(cur.val);
            cur=cur.right; //NOT push into s            
        }
        return res;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
