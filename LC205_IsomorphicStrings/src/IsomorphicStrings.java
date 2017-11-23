import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class IsomorphicStrings {

	public static boolean isIsomorphic(String s, String t) {


		// use two int[256] to map all the characters, which is also sorted.
		if (s == null && t == null) {
			return true;
		}
		int[] mapA = new int[256];
		int[] mapB = new int[256];

		int length = s.length();

		for (int i = 0; i < length; i++) {
			if (mapA[s.charAt(i)] != mapB[t.charAt(i)])
				return false;
			mapA[s.charAt(i)] = i + 1;  //make sure the value of corresponding char at ith position is unique.
			mapB[t.charAt(i)] = i + 1;
		}
		return true;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(isIsomorphic("egg", "add"));
		System.out.println(isIsomorphic("aba", "baa"));
	}

}
