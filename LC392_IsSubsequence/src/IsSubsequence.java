
public class IsSubsequence {
	public boolean isSubsequence(String s, String t) {
        if(s==null||s.length()==0) return true;
        int i=0;
        int j=0;
        while(i<s.length()&&j<t.length()){
            if(s.charAt(i)==t.charAt(j)){
                i++;
            }
            j++;
        }
        return i==s.length();
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
