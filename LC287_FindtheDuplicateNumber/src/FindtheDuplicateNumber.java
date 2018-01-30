
public class FindtheDuplicateNumber {
	 public int findDuplicate(int[] nums) {
	        //O(nlogn)  O(1)
	        int start=0;
	        int end=nums.length-1;
	        
	        while(start<=end){ //<= not <
	            int mid=(end-start)/2+start;
	            int count=0;
	            for(int i=0;i<nums.length;i++){  //unsorted need to iterate all each time.
	                if(nums[i]<=mid){ //<= not <
	                    count++;
	                }
	            }
	            if(count>mid){  //duplicate must in first half
	                end=mid-1;
	            }else{
	                start=mid+1;
	            }
	        }
	        
	        return start;
	        
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
