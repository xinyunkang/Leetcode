
public class RemoveDuplicatesfromSortedArrayII {
	public int removeDuplicates(int[] nums) {
        if(nums.length<=2) return nums.length;
        int count=2;
        
        for(int i=2;i<nums.length;i++){
            if(nums[i]!=nums[count-2]){ //count-2 NOT i-2
                nums[count++]=nums[i];  //nums[count] is the position needs to be inserted.
            }            
        }
        return count;
    }
    
    /*
    1 1 1 2 2 3
        c
        i
    nums[i]==nums[count-2] 
    i++
        
    1 1 1 2 2 3
        c
          i
    nums[i]!=nums[count-2]
    nums[count++]=nums[i];
    
    1 1 2 2 2 3
          c
            i
            
    nums[i]!=nums[count-2]
    nums[count++]=nums[i];       
            
     1 1 2 2 2 3
             c
               i
            
    nums[i]!=nums[count-2]
    nums[count++]=nums[i]; 
    1 1 2 2 3 3
            c
              i
            
    */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoveDuplicatesfromSortedArrayII r=new RemoveDuplicatesfromSortedArrayII();
		System.out.println(r.removeDuplicates(new int[] {1,1,2}));
	}

}
