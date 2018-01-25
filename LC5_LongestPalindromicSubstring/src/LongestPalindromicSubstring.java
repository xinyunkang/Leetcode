
public class LongestPalindromicSubstring {
	 String res=""; //global variable
	    public String longestPalindrome(String s) {
	        if(s==null||s.length()==0) return "";        
	        for(int i=0;i<s.length();i++){  
	            helper(s, i, i);  //if s.length is odd.
	            helper(s, i, i+1); //even
	        }
	        return res;
	    }
	        
	    public void helper(String s, int left, int right){
	        while(left>=0&&right<s.length()&&s.charAt(left)==s.charAt(right)){//right<s.length, not <= 
	            //NOT if(s.charAt(left)==s.charAt(right)), should be in while condition
	            left--;
	            right++;            
	        }
	        //the last left-- and right++ got a not meet request value. 
	        //so rollback using the meet request substring.
	        String temp=s.substring(left+1,right); 
	        if(temp.length()>res.length()){
	            res=temp;
	        }
	    }
	    
	    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
