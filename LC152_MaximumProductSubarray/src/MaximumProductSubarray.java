
public class MaximumProductSubarray {
	public int maxProduct(int[] nums) {
        if(nums==null||nums.length==0) return 0;
        int max=nums[0]; //NOT 0
        int min=nums[0];
        int res=nums[0];
        for(int i=1;i<nums.length;i++){  //i start from 1
            int temp=max; //store the max in current loop. Used in min calc
            max=Math.max(Math.max(max*nums[i], min*nums[i]), nums[i]); //3 conditions.
            min=Math.min(Math.min(min*nums[i],temp*nums[i]), nums[i]);
            res=Math.max(max,res);  //NOT res=Math.max(max,min);
        }
        return res;
    }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
