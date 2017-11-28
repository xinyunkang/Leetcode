
public class RotateArray {
	public static void rotate(int[] nums, int k) {
//		k=k%nums.length;
//		int[] nums2 = new int[nums.length * 2];
//		for (int i = 0; i < nums.length; i++) {
//			nums2[i] = nums[i];
//			nums2[i + nums.length] = nums[i];
//		}
//
//		for (int i = 0; i < nums.length; i++) {
//			nums[i] = nums2[i + nums.length - k];
//		}
		
		int[] temp = new int[nums.length];
		for (int i = 0; i < nums.length; i++) {
			temp[(i+k)%nums.length]=nums[i]; //the number at index i in the original array is placed at the index (i+k)
		}
		for (int i = 0; i < nums.length; i++) {
			nums[i]=temp[i];
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		rotate(new int[] { 1, 2 }, 3);

	}

}
