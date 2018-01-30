
public class IncreasingTripletSubsequence {
	public boolean increasingTriplet(int[] nums) {
        // start with two largest values, as soon as we find a number bigger than both, while both have been updated, return true.
        int min=Integer.MAX_VALUE; 
        int secondMin=Integer.MAX_VALUE;
        for(int num:nums){
            if(num<min) {
                min=num;
            }else if(num<secondMin){
                secondMin=num;
            }else if(num>secondMin){
                return true;
            }        
        }
        return false;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
