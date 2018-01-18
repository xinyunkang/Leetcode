import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {
//	public static List<List<String>> groupAnagrams(String[] strs) {
//	    //space: O(n)  time:O(m*nlgn)
//		if (strs.length == 0)
//			return new ArrayList();
//		Map<String, List> ans = new HashMap<String, List>(); // could use list to store multiple value.
//		for (String s : strs) {
//			char[] ca = s.toCharArray(); // char[], NOT Char[]
//			Arrays.sort(ca); // ca will be sorted. Arrays, NOT Array
//			String key = String.valueOf(ca); // convert array to string by using String.valueOf()!!
//			if (!ans.containsKey(key))
//				ans.put(key, new ArrayList()); // create new ArrayList for value.
//			ans.get(key).add(s); // add new value to list.
//		}
//		return new ArrayList(ans.values()); // ans.values,NOT getValues() NOT Values();
//	}

	 public List<List<String>> groupAnagrams(String[] strs) {
	        //space: O(n)  time:O(m*n)
	        HashMap<String, List<String>> map= new HashMap<>();
	        
	        for(String str: strs){
	            int[] count= new int[26];  //avoid sort the strings. Each string has new count array.
	            char[] ca= str.toCharArray();
	            for(Character c: ca){
	                count[c-'a']++;   //c-'a' to int 
	            }
	            String s="";
	            for(int i=0;i<count.length;i++){
	                if(count[i]!=0){
	                    s+=String.valueOf(count[i])+String.valueOf((char)(i+'a'));  //like 1a1e1t  
	                    //(char)(i+'a') cast from int to char
	                }
	                
	            }
	            if(map.containsKey(s)){
	                List<String> ls= map.get(s); //get stored list directly.
	                ls.add(str);
	                map.put(s,ls);
	            }else{
	                List<String> ls= new ArrayList<>();               
	                ls.add(str);
	                map.put(s,ls);
	            }
	        }
	        
	        return new ArrayList<>(map.values());
	    }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strs = new String[] { "eat", "tea", "tan", "ate", "nat", "bat" };
		//groupAnagrams(strs);
	}

}
