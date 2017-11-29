
public class ReverseInteger {
	public static int reverse(int x) {
		// My code 
		/*
		String numStr=x+""; //convert int to string by +""
		long result=0;  //use type long for calculating
		for(int i=(numStr.charAt(0)=='-'?1:0);i<numStr.length();i++) {
			//remember to add -'0' or it will be the ascii value;
			result=result+(numStr.charAt(i)-'0')*(long)Math.pow(10, numStr.charAt(0)=='-'?(i-1):i); 			
			if(result<Integer.MIN_VALUE||result>Integer.MAX_VALUE) {
				return 0;
			}		
		}
		return (int)(numStr.charAt(0)=='-'?-result:result); //cast result back to int.
*/
		
		
		//best solution
		long result=0;
		while(x!=0) {
			result=result*10+x%10;
			x/=10;
			if(result<Integer.MIN_VALUE||result>Integer.MAX_VALUE) {
				return 0;
			}			
		}
		return (int)result;
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(reverse(1534236469));
	}

}
