import java.util.HashMap;
import java.util.HashSet;

public class MostCommonWord {
	public static String mostCommonWord(String paragraph, String[] banned) {
		String ans = "";

		if (paragraph == null || paragraph.length() == 0) {
			return ans;
		}
		paragraph += "."; // need to add this one or the last word would not be checked.

		HashSet<String> bannedSet = new HashSet<>();
		HashMap<String, Integer> count = new HashMap<>();
		for (String word : banned) {
			bannedSet.add(word);
		}
		StringBuilder word = new StringBuilder();
		int max = 0;
		for (char c : paragraph.toCharArray()) { // Use char, not Character. Remember toCharArray
			if (Character.isLetter(c)) { // Use Character. isLetter, not isCharacter
				word.append(Character.toLowerCase(c));
			} else if (word.length() > 0) {
				String tempWord = word.toString();
				if (!bannedSet.contains(tempWord)) {
					count.put(tempWord, count.getOrDefault(tempWord, 0) + 1);
					if (count.get(tempWord) > max) {
						max = count.get(tempWord);
						ans = tempWord;
					}
				}
				word = new StringBuilder();
			}
		}

		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Bob hit a ball, the hit BALL flew far after it was hit.";
		String[] strArr= new String[] {"hit"};
		System.out.println(mostCommonWord(str,strArr));
	}

}
