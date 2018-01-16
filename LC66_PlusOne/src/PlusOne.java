
public class PlusOne {

	 //case 1: 1020 -> 1021
    //case 2: 1999 -> 2000
    //case 3: 9999 -> 10000
    public int[] plusOne(int[] digits) {
        if(digits==null||digits.length==0) return digits;
        
        for(int i=digits.length-1;i>=0;i--){ //from the lowest digits
            if(digits[i]<9){
                digits[i]++; //case 1
                return digits;  //case 1 or 2
            }else{
                digits[i]=0;  //case 2
            }
        }
        
        //for case 3 add a new array with first digit to 1 and other digits to 0.
        int[] res= new int[digits.length+1];
        res[0]=1;
        return res;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
