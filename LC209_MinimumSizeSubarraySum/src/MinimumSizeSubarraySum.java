
public class MinimumSizeSubarraySum {
	public int minSubArrayLen(int s, int[] nums) {
        int left=0;
        int sum=0;
        int res=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            while(left<=i&&sum>=s){
                res=Math.min(res, i-left+1);
                sum-=nums[left++];
            }
        }
        
        return res==Integer.MAX_VALUE?0:res;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
