import java.util.HashSet;

public class LongestSubstringWithoutRepeatingCharacters {
	public static int lengthOfLongestSubstring(String s) {
		HashSet<Character> hs = new HashSet<Character>();
		int slow = 0;
		int max = 0;
		int fast = 0;
		while (fast < s.length()) { // NOT for(int fast=0;fast<s.length();fast++)
			// NO need to use if(!hs.contains(s.charAt(fast)))
			if (hs.add(s.charAt(fast))) { // will return false if could not add.
				max = Math.max(max, hs.size()); // Or Math.max(max, fast-slow+1);
				fast++;
			} else {
				//delete from the head by using a slow pointer i until we can put character j to the hash set.
				hs.remove(s.charAt(slow++)); // remove from the lowest to the first duplicate.
			}
		}
		return max;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(lengthOfLongestSubstring("abcabcbb"));
		System.out.println(lengthOfLongestSubstring("dvdf"));
		System.out.println(lengthOfLongestSubstring("bbtablud"));
		System.out.println(lengthOfLongestSubstring("bpfbhmipx"));

	}

}
