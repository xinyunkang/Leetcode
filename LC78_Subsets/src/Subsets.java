import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subsets {
	public static List<List<Integer>> subsets(int[] nums) {
		List<List<Integer>> res = new ArrayList<>();  //need to use List<List<Integer>> to get the same return type.
		 											// NOT. new  ArrayList<ArrayList<Integer>> ();
		res.add(new ArrayList<Integer>());  //Initial with [].
        
        Arrays.sort(nums);
        for(int i : nums) {
            List<List<Integer>> tmp = new ArrayList<>();  //To record the new added item in for loop, add to res at end of each loop.
            for(List<Integer> a : res) {   //get the current result list.
                List<Integer> sub = new ArrayList<>(a);  //NOT use sub directly, which will change current sub value.
                sub.add(i);  //add the 
                tmp.add(sub);
            }
            res.addAll(tmp);
        }
        return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		subsets(new int[] {1,2,3});
	}

}
