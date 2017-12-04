import java.util.ArrayList;
import java.util.List;

public class WordBreak {
	public static boolean wordBreak(String s, List<String> dict) {
		//DP
		boolean[] f = new boolean[s.length() + 1]; // use s.length()+1;
		f[0] = true;  //set the initial to true;
		for (int end = 1; end <= s.length(); end++) { //start from 1  <=s.length(), NOT <s.length()
			for (int start = 0; start < end; start++) {  //start<end
				if (f[start] && dict.contains(s.substring(start, end))) { //before dict f[start] is true; from start to end (NOT include) is contained in dict.
					f[end] = true;  //if contain s.charAt(i), set f[i]=true;
					break;
				}
			}
		}
		return f[s.length()]; //means from start=0 to end=s.length()-1 there are dicts matches.
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> str=new ArrayList<String>() ;
		str.add("leet");
		str.add("code");
		wordBreak("leetcode",str);
	}

}
