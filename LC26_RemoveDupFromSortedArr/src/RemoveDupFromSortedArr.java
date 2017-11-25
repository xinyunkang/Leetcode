
public class RemoveDupFromSortedArr {
	public static int removeDuplicates(int[] nums) {
		if(nums==null) return 0;
		int slow=0;
		for(int fast=1;fast<nums.length;fast++) {
			if(nums[fast]!=nums[slow]) {  //has diff number
				nums[slow+1]=nums[fast];  //assign slow's next item to fast.
				slow++;				
			}
		}
		return slow+1; //length = last index +1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] test=new int[] {1,1,2};
		removeDuplicates(test);
	}

}
