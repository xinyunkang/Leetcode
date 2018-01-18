
public class ReverseStringII {
	 public String reverseStr(String s, int k) {
	        char[] ca=s.toCharArray();
	        int i=0;
	        while(i<s.length()) {           //NOT for(int i=0;i<s.length();i++){
	            int j=Math.min(i+k-1,s.length()-1);
	            swap(ca, i, j);
	            i+=2*k;
	        }
	        return String.valueOf(ca); //NOT new String.valueOf(ca)
	    }
	    
	    public void swap(char[] charArr, int i, int j){
	        while(i<j){
	            char temp=charArr[i];
	            charArr[i]=charArr[j];
	            charArr[j]=temp;
	            i++;//Don't forget!
	            j--;
	        }
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
