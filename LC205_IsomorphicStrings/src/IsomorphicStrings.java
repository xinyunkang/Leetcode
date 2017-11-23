import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class IsomorphicStrings {

	public static boolean isIsomorphic(String s, String t) {
		//// //use hashmap
		HashMap<Character, Integer> mapA= new HashMap<Character, Integer>();
        HashMap<Character, Integer> mapB= new HashMap<Character, Integer>();
        for(char c: s.toCharArray()) {
             mapA.put(c, mapA.getOrDefault(c, 0)+1);
        }
       
        for(char c: t.toCharArray()) {
             mapB.put(c, mapB.getOrDefault(c, 0)+1);
        }
        List<Integer> mapAKey = new ArrayList<Integer>(mapA.values());  //convert map values to List
        List<Integer> mapBKey = new ArrayList<Integer>(mapB.values());

        return mapAKey.equals(mapBKey);
//
//		// use two int[256] to map all the characters, which is also sorted.
//		if (s == null && t == null) {
//			return true;
//		}
//		int[] mapA = new int[256];
//		int[] mapB = new int[256];
//
//		int length = s.length();
//
//		for (int i = 0; i < length; i++) {
//			if (mapA[s.charAt(i)] != mapB[t.charAt(i)])
//				return false;
//			mapA[s.charAt(i)] = i + 1;  //make sure the 
//			mapB[t.charAt(i)] = i + 1;
//		}
//		return true;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(isIsomorphic("egg", "add"));
		System.out.println(isIsomorphic("aba", "baa"));
	}

}
