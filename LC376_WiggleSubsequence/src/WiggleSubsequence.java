
public class WiggleSubsequence {
	 public int wiggleMaxLength(int[] nums) {
	        if(nums==null||nums.length==0) return 0;
	        int up=1;
	        int down=1;
	        for(int i=1;i<nums.length;i++){
	            if(nums[i]>nums[i-1]){
	                up=down+1;  //NOT up++
	            }else if(nums[i]<nums[i-1]){
	                down=up+1;
	            }
	        }
	        return Math.max(up,down);
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
