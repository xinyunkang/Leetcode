
public class RangeSumQuery {
	int[] sum;
	public void NumArray(int[] nums) {
        sum=new int[nums.length+1];
        for(int i=0;i<nums.length;i++) {
        	sum[i+1]=sum[i]+nums[i]; //start from sum[1]  
        	// sum[k]sum[k] as the cumulative sum for nums[0... k-1]
        }
    }

	public int sumRange(int i, int j) {
		return sum[j+1]-sum[i];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
