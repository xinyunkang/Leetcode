import java.util.*;

public class SummaryRanges {
	public List<String> summaryRanges(int[] nums) {
        List<String> res = new ArrayList<String>();
        if(nums==null||nums.length==0) return res;
       
        for(int i=0;i<nums.length;i++){
            int start=nums[i];
            while(i<nums.length-1&&nums[i+1]==nums[i]+1){
               i++;
            }
            if(nums[i]!=start){
                res.add(start+"->"+nums[i]);
            }else{
                res.add(String.valueOf(start));
            }
        }
        return res;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
