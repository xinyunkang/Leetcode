
public class MaximumSubarray {
	public int maxSubArray1(int[] nums) {
        //dp Time: O(n), Space: O(n)
        int[] dp= new int[nums.length];
        dp[0]=nums[0];
        int res=nums[0];  //NOT res=0;
        for(int i=1; i<nums.length;i++){
            dp[i]=nums[i]+ (dp[i-1]>0?dp[i-1]:0); //need use () to seperate nums[i]
            res=Math.max(res, dp[i]);
        }
        return res;
    }
    
    public int maxSubArray(int[] nums) {
        //dp Time: O(n), Space: O(1)
        int sum=nums[0];
        int res=nums[0];
        
        for(int i=1; i<nums.length;i++){
           sum=Math.max(nums[i],sum+nums[i]);  //sum is like res[i-1]
            res= Math.max(res, sum);
        }
        return res;
    }
    

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MaximumSubarray m = new MaximumSubarray();
		System.out.println(m.maxSubArray(new int[] {-2,1,-3,4,-1,2,1,-5,4}));
	}

}
