
public class FirstMissingPositive {
	public int firstMissingPositive(int[] nums) {
        if(nums==null||nums.length==0) return 1;
        
        for(int i=0;i<nums.length; i++){
            //nums[i]!=nums[nums[i]-1]) instead of i!=nums[i]-1 to avoid swap same value pair.
            while(nums[i]>0 && nums[i]<=nums.length && nums[i]!=nums[nums[i]-1]){                 
                int temp= nums[nums[i]-1];  //temp=nums[i] would be wrong.
                nums[nums[i]-1]=nums[i];    
                nums[i]=temp;
                
                
//                int temp= nums[i];          //temp=nums[i] would be wrong.
//                nums[i]=nums[nums[i]-1];    
//                nums[nums[i]-1]=temp;    //because this step would assign temp to the wrong address.
               
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=i+1){
                return i+1;
            }
        }
        return nums.length+1;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirstMissingPositive f =new FirstMissingPositive();
		System.out.println(f.firstMissingPositive(new int[] {3,4,-1,1}));
	}

}
