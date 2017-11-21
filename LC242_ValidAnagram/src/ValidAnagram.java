import java.util.HashMap;

public class ValidAnagram {
	public static boolean isAnagram(String s, String t) {
		//For 26 letters only
//		if(s.length()!=t.length()) //To check length is the same firstly.
//			return false;
//		int[] map =new int[26];
//		for(char c: s.toCharArray())
//		{
//			map[c-'a']++;
//		}
//		for(char c: t.toCharArray())
//		{
//			if(--map[c-'a']<0)
//				return false;
//		}
//		return true;
		
		//For all unicode, use hashmap
		if(s.length()!=t.length()) //To check length is the same firstly.
			return false;
		HashMap<Character, Integer> map = new HashMap<Character, Integer>(); //NOT Hashmap,character & integer
		for(char c:s.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0)+1);
		}
		for(char c:t.toCharArray()) {
			int charFromMap=map.getOrDefault(c, 0);
			if(charFromMap==0)
			{
				return false;
			}
			else {
				map.put(c, charFromMap-1);
			}
		}
		return true;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="anagran";
		String t="nagaram";
		
		System.out.println(isAnagram(s,t));

	}

}
