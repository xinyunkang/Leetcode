import java.util.*;

public class PathSumII {
	 List<List<Integer>> res= new ArrayList<>();
	    
	    public List<List<Integer>> pathSum(TreeNode root, int sum) {
	        if(root==null) return res;
	        helper(root, new ArrayList<>() , sum);        
	        return res;
	    }
	    
	    public void helper(TreeNode root, List<Integer> path, int sum){       
	        if(root==null) return; 
	        path.add(root.val); //add node to path firstly.
	        if(root.left==null && root.right==null){
	            if(root.val==sum){                
	                res.add(new ArrayList(path));      //res.add(path); is NOT right.
	            }
	        }
	        //NOT else. need to call the below code in every loop.
	            helper(root.left, path, sum-root.val);
	            helper(root.right, path, sum-root.val);
	            path.remove(path.size()-1); //Important
	            /*
	                1
	              2   3
	            4  5 
	            
	            remove the last node. 
	            For example, after the path 1-2-4
	            delete 4, then make space to insert 5
	            for path 1-2-5.    
	                                    
	            */
	        
	        
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
