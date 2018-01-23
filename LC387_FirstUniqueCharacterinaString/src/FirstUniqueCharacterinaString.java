
public class FirstUniqueCharacterinaString {
	public int firstUniqChar(String s) {
        if(s==null||s.length()==0){
            return -1;
        }
        int[] map= new int[26];
        for(int i=0;i<s.length();i++){
            map[s.charAt(i)-'a']++;
        }
        for(int i=0;i<s.length();i++){
            if(map[s.charAt(i)-'a']==1){  //only appear once.
                return i;
            }
        }
        return -1;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
