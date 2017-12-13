import java.util.ArrayList;
import java.util.List;

public class Permutations {
	public static List<List<Integer>> permute(int[] nums) {
        
        List<List<Integer>> result= new ArrayList<>();
        permuteHelper(nums,result, new ArrayList<>());
        return result;
    }
	
	
	private static void permuteHelper(int[] nums, List<List<Integer>> result, List<Integer> tempList) {
		
		if(nums.length==tempList.size()) {
			result.add(new ArrayList<>(tempList));
		}else {
			for(int i=0;i<nums.length;i++) {
				if(tempList.contains(nums[i])) continue; //element already exists, skip
				tempList.add(nums[i]);
				permuteHelper(nums, result, tempList);
				tempList.remove(tempList.size() - 1); //remove the last element which you added before.
													//because one position should put on different element.
			}
		}
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= new int[] {1,2,3};
		List<List<Integer>> resultMain= permute(nums);
		System.out.println(resultMain);
	}

}
