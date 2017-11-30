import java.util.HashMap;

public class LongestCommonPrefix {
	public static String longestCommonPrefix(String[] strs) {
		if (strs.length == 0) { //Do NOT use strs==null.
			return "";
		}
		String prefix=strs[0];
		for(int i=1;i<strs.length;i++) {
			while(strs[i].indexOf(prefix)!=0) {
				prefix=prefix.substring(0, prefix.length()-1);
				if(prefix.isEmpty()) {  //need to add empty check.
					return "";
				}
			}
		}
		return prefix;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(longestCommonPrefix(new String[] { "a", "a", "b" }));
	}

}
