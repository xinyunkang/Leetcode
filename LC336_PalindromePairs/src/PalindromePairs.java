import java.util.*;

public class PalindromePairs {
	public List<List<Integer>> palindromePairs(String[] words) {
        List<List<Integer>> res= new ArrayList<>();
        if(words==null||words.length<2) return res;
        
        //put all words into the map
        HashMap<String, Integer> map= new HashMap<>();
        for(int i=0;i<words.length;i++){
            map.put(words[i],i);
        }
        
        
        for(int i=0;i<words.length;i++){
            for(int j=0;j<=words[i].length();j++){
                String str1=words[i].substring(0,j);
                String str2=words[i].substring(j);
                if(isPalindrome(str1)){
                    String rev=new StringBuilder(str2).reverse().toString();
                    if(map.containsKey(rev)&&map.get(rev)!=i){ //in map and not itself.
                        res.add(Arrays.asList(map.get(rev),i)); //Arrays.asList
                    }
                }
                if(str2.length()!=0&&isPalindrome(str2)){
                    String rev=new StringBuilder(str1).reverse().toString();
                    if(map.containsKey(rev)&&map.get(rev)!=i){ //in map and not itself.
                        res.add(Arrays.asList(i,map.get(rev)));
                    }
                }
            }
        }
        return res;
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

	}

}
