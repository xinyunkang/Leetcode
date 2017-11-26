
public class MoveZeros {
	public static void moveZeroes(int[] nums) {
		int leftMostZeroIndex=0;
		for(int i=0;i<nums.length;i++) {
			if(nums[i]!=0) {
				if(i>leftMostZeroIndex) {
					nums[leftMostZeroIndex]=nums[i];
					nums[i]=0;  //swap with zero. May need to be moved again.
					//leftMostZeroIndex=i; //NOT Correct.
					//leftMostZeroIndex++; //NOT Correct. For example, [2,1] would return [1,0]
				}
				leftMostZeroIndex++; //whether doing the swap or not, need to plus one for non-zero. 
									//So when nums[i]==0, the leftMostZeroIndex is not increased.
									//and could be swapped with the next non-zero number.
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = new int[] { 1,0,1,0,1};
		moveZeroes(input);
	}

}
