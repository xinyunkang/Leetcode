import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {
	public static List<List<String>> groupAnagrams(String[] strs) {
		if (strs.length == 0)
			return new ArrayList();
		Map<String, List> ans = new HashMap<String, List>(); // could use list to store multiple value.
		for (String s : strs) {
			char[] ca = s.toCharArray(); // char[], NOT Char[]
			Arrays.sort(ca); // ca will be sorted. Arrays, NOT Array
			String key = String.valueOf(ca); // convert array to string by using String.valueOf()!!
			if (!ans.containsKey(key))
				ans.put(key, new ArrayList()); // create new ArrayList for value.
			ans.get(key).add(s); // add new value to list.
		}
		return new ArrayList(ans.values()); // ans.values,NOT getValues() NOT Values();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strs = new String[] { "eat", "tea", "tan", "ate", "nat", "bat" };
		groupAnagrams(strs);
	}

}
