import java.util.*;

public class SubstringwithConcatenationofAllWords {
	public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> res = new ArrayList<Integer>();
        if(words==null||s==null) return res;
        int wLen=words[0].length();
        int numOfWords=words.length;
        
        HashMap<String, Integer> map = new HashMap<>();
        for(String word:words){ //initial map 
             map.put(word,map.getOrDefault(word,0)+1);  // expected times of each word 
        }
        
        for(int i=0;i<=s.length()-wLen*numOfWords;i++){  //<=, not <
            //HashMap<String, Integer> copy = new HashMap<>(map); //over time limit
            HashMap<String, Integer> seen = new HashMap<>();
            int start=i;
            int wordsLeft=numOfWords;
            while(wordsLeft>0){
                String temp=s.substring(start,start+wLen);
                if(!map.containsKey(temp)){//Do not contain, break this while                 
                    break;
                }
                seen.put(temp,seen.getOrDefault(temp,0)+1); //record the times we have seen
                
                if(seen.get(temp)>map.getOrDefault(temp,0)) { 
                    //Once we meet an unexpected word or the times of some word 
                    //is larger than its expected times, we stop the check.
                    break;
                }           
                wordsLeft--;
                start+=wLen;  //DO NOT +1
            }            
            if(wordsLeft==0) { //important to add this check
                res.add(i);
            }
        }
        return res;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
