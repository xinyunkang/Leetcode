
public class RansomNote {
	public boolean canConstruct(String ransomNote, String magazine) {
        int[] map= new int[26];  //use 26 instead of 256 save space
        for(int i=0;i<magazine.length();i++){
            map[magazine.charAt(i)-'a']++;  // -'a' 
        }
        for(int i=0;i<ransomNote.length();i++){
           if(--map[ransomNote.charAt(i)-'a']==-1){
               return false;
           }
        }
        return true;
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
