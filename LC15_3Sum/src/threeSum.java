import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class threeSum {

	public static List<List<Integer>> threeSum(int[] nums) {
		//sort array firstly.
        Arrays.sort(nums);
        //for loop, get the rest target with two pointer sum solution
        List<List<Integer>> res= new ArrayList<>(); //NOT List<List<Integer>>() List is abstract;
        for(int i=0;i<nums.length-2;i++){
            if(i>0&&nums[i]==nums[i-1]) continue; //not nums[i]==nums[i+1]  //add i>0 because num[i-1]
            int target=0-nums[i];
            int left=i+1;
            int right=nums.length-1;
            while(right>left){
                
                if(nums[left]+nums[right]==target){
                    res.add(Arrays.asList(nums[i],nums[left],nums[right])); //learn Arrays.asList IMPORTANT!!!
                    left++;
                    right--;
                    while(right>left&&nums[left]==nums[left-1]) left++; //NOT continue, need to move the pointer.
                    while(right>left&&nums[right]==nums[right+1]) right--;
                }
                else if(nums[left]+nums[right]>target){
                    right--;
                }else if(nums[left]+nums[right]<target){
               
                    left++;
                }
            }
        }
        return res;

	}

	public static void main(String[] args) {
		

		int[] nums = new int[] { -1, 0, 1, 2, -1, -4}; 
		
		List<List<Integer>> result= threeSum(nums);
		System.out.print(Arrays.toString(result.toArray()));
	}

}
