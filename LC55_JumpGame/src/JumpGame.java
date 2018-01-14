
public class JumpGame {
	public boolean canJump(int[] nums) {
        int Max=0;
        for(int i=0;i<nums.length;i++){
            if(i>Max) return false;  //if max could not reach the current step, return false.
            Max=Math.max(nums[i]+i,Max);
        }
        return true;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
