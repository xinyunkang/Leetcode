import java.util.*;

public class WordLadder {
	public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        HashSet<String> set= new HashSet<>(wordList);
        if(set.contains(beginWord)){
            set. remove(beginWord);  //remove beginword from set.
        }
        HashMap<String,Integer> map = new HashMap<>();
        map.put(beginWord,1);       
        Queue<String> q= new LinkedList<>(); //Queue is abstract; new Queue<>();cannot be instantiated 
        q.offer(beginWord);
        while(!q.isEmpty()){
            String word=q.poll();
            int curLevel=map.get(word); //refresh curLevel here.
            //NOT HERE   char[] c= word.toCharArray(); 
            for(int i=0;i<word.length();i++){
                char[] c= word.toCharArray();  //here. because need to reset everytime in this for loop
                for(char j='a';j<='z';j++){  //not int
                    c[i]=j;
                    String temp= new String(c);
                    if(set.contains(temp)){
                        if(temp.equals(endWord)){
                            return curLevel+1;
                        }else{                           
                            map.put(temp,curLevel+1);
                            set.remove(temp);
                            q.offer(temp);
                        }
                    }
                }
            }
        }
        return 0;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
