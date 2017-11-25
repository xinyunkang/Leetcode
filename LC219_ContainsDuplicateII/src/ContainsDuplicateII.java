import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ContainsDuplicateII {
	public static boolean containsNearbyDuplicate(int[] nums, int k) {
		HashMap<Integer, List<Integer>> map = new HashMap<Integer, List<Integer>>();
		for(int i=0;i<nums.length;i++)
		{
			List<Integer> tempIntList=map.getOrDefault(nums[i], new ArrayList<Integer>());
			
			if(tempIntList.size()!=0) {
				for(int j:tempIntList) {
					if(Math.abs(i-j)<=k)
						return true;
				}
			}			
			tempIntList.add(i);
			map.put(nums[i], tempIntList);			
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] tempArr=new int[] {1};
		int k=1;
		System.out.println(containsNearbyDuplicate(tempArr,k));
		
	}

}
