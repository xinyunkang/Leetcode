
public class SortColors {
	public void sortColors(int[] nums) {
        int index = 0;
        int left = 0;   //record the last position of 0
        int right = nums.length-1;  //record the last position of 1
        while(index <= right){ //NOT left<=right
            if(nums[index]==0){
                 swap(nums, index++, left++); //swap the left and index
            }else if (nums[index]==1){
                index++;   
            }else{  //nums[index]==2
                swap(nums, index, right--);  //NOT index++, because need to test if is 0 still need to further swap
            }
        }
    }
    
    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }


// 1, 0, 2, 0
// l
// i        r

// //[index]=1, index++

// 1,0,2,0
// l
//   i   r
// //[index]=0, swap(index, left) and index++, left++
// 0,1,2,0
//   l
//     i r
// //[index]=2, swap(index, right) and right--
// 0,1,0,2
//   l
//     i
//     r
// //[index]=0, swap(index, left) and index++, left++
// 0,0,1,2
//     l
//       i
//     r    
// //i<=right, stop!


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
