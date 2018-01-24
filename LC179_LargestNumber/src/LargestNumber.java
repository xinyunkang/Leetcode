import java.util.Arrays;
import java.util.Comparator;

public class LargestNumber {
	public String largestNumber(int[] nums) {
        if(nums==null||nums.length==0){
            return "";
        }
        String[] res = new String[nums.length];
        for(int i=0;i<nums.length;i++){
            res[i]=String.valueOf(nums[i]);  //cast to string
        }
        Comparator<String> comp= new Comparator<String>(){
            @Override
            public int compare(String s1, String s2){   //override the compare function
                String str1=s1+s2;
                String str2=s2+s1;
                return str2.compareTo(str1);
            }
            
        };  //remember the ;
        Arrays.sort(res, comp);  //NOT Array
        if(res[0].charAt(0)=='0'){  //edge case. NOT charAt[0]
            return "0";
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<res.length;i++){
            sb.append(res[i]);
        }
        return sb.toString();
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
