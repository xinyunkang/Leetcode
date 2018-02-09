import java.util.*;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLevelOrderTraversal {

	public List<List<Integer>> levelOrder(TreeNode root) {
		List<List<Integer>> res = new ArrayList<>();
		helper(res, root, 0);
		return res;
	}

	public void helper(List<List<Integer>> res, TreeNode root, int height) {
		// BFS
		if (root == null) {
			return;
		}
		if (res.size() == height) { // NOT res.lenght();
			res.add(new ArrayList<Integer>()); // add new empty list to the result.
		}
		res.get(height).add(root.val); // store the root val to result.
		helper(res, root.left, height + 1);
		helper(res, root.right, height + 1);

	}
	
	public List<List<Integer>> levelOrder2(TreeNode root) {
        List<List<Integer>> res= new ArrayList<>();
        if(root==null) return res;
        Queue<TreeNode> q= new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            int size = q.size(); //get the number of nodes in this level
            List<Integer> list= new ArrayList<>();  //record the result in this level
            for(int i=0;i<size;i++){
                TreeNode n= q.poll();
                list.add(n.val);
                if(n.left!=null) q.offer(n.left);
                if(n.right!=null) q.offer(n.right);
            }
            res.add(list);
        }
        return res;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
