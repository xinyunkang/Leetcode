
public class RotateArray {

//  time O(n)   space O(n)    
//  public void rotate(int[] nums, int k) {
//     int[] temp = new int[nums.length];
//		for (int i = 0; i < nums.length; i++) {
//			//the number at index i in the original array is placed at the index (i+k)
//         temp[(i+k)%nums.length]=nums[i]; 
//		}
//		for (int i = 0; i < nums.length; i++) {
//			nums[i]=temp[i];
//		}
    
    
// }


public void rotate(int[] nums, int k) {
    //Time O(n), Space O(1)
    /*
    example: 1234567           
    */
    k%=nums.length;
    reverse(nums,0,nums.length-1); //7654321
    reverse(nums,0,k-1); //5674321
    reverse(nums,k,nums.length-1); //5671234
    
}

public void reverse(int[] nums, int i, int j){
    while(i<j){
    int temp=nums[i];
    nums[i++]=nums[j];
    nums[j--]=temp;
    }

}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//rotate(new int[] { 1, 2 }, 3);

	}

}
