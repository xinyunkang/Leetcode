
public class LongestPalindromicSubstring {
	public String longestPalindrome(String s) {
	       String max="";
	        for(int i=0;i<s.length();i++){
	            String s1=extend(s,i,i); //if s.length is odd;
	            String s2=extend(s,i,i+1); //if s.length is even;
	            if(s1.length()>max.length()) max=s1;
	            if(s2.length()>max.length()) max=s2;
	        }
	        return max;
	    }
	        
	    public String extend(String s, int j, int k){
	       for(;j>=0&&k<s.length();j--,k++){
	           if(s.charAt(j)!=s.charAt(k)){
	               break;
	           }
	       }
	        return s.substring(j+1, k);  //NOT subString
	    }
	    
	    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
