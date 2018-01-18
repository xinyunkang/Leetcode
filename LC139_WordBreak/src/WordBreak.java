import java.util.ArrayList;
import java.util.List;

public class WordBreak {
	 public boolean wordBreak(String s, List<String> wordDict) {
	        //dp
	        //for subString(a,b), b is the upper limit not included.
	        //in order to get the subString with the last character, need s.length+1;
	        boolean[] dp = new boolean[s.length()+1];
	        dp[0]=true;
	        
	        for(int end=1;end<=s.length();end++){  //start from 1 because last index is s.length;
	            for(int start=0; start<end; start++){ //the start index of word need to be checked.
	                //dp[start]== true when former subStrings are contained in Dict.
	                if(dp[start]&&wordDict.contains(s.substring(start,end))){   //substring, NOT subString           
	                    dp[end]=true; 
	                    break;
	                } 
	            }
	        }
	        
	        return dp[s.length()];
		
	    }

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		ArrayList<String> str=new ArrayList<String>() ;
//		str.add("leet");
//		str.add("code");
//		wordBreak("leetcode",str);
	}

}
