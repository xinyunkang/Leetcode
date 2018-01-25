import java.util.*;

public class PalindromePartitioning {
	public List<List<String>> partition(String s) {
        //back tracking.
        List<List<String>> res= new ArrayList<>();
        if(s==null||s.length()==0) return res;
        helper(res, new ArrayList<>(), s);
        return res;
    }
    
    public void helper(List<List<String>> res, List<String> list, String s){
        if(s.length()==0){  //add the result to res
            res.add(new ArrayList<>(list)); //copy the list and add to the res.
            //should NOT use res.add(list) directly, that would add the ref of list to res
            //so the final res result would be all with the last list value.
            return;
        }
                
        for(int i=0;i<s.length();i++){
            if(isPalindrome(s.substring(0,i+1))){
                list.add(s.substring(0,i+1));
                helper(res,list,s.substring(i+1));  
                list.remove(list.size()-1); //remove the last element to backtracking.
            }               
        }
    }
    
    
    public boolean isPalindrome(String s){
        int i=0;
        int j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PalindromePartitioning pp= new PalindromePartitioning();
		System.out.println(pp.partition("aab"));
	}

}
