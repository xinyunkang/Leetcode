import java.util.HashMap;

public class WordPattern {
	public static boolean wordPattern(String pattern, String str) {
		if(pattern.isEmpty()||str.isEmpty())
			return false;		
		String[] words=str.split(" ");
		char[] charArr=pattern.toCharArray();
		if(words.length!=charArr.length)
			return false;
		HashMap<Character, String> map= new HashMap<Character, String>(); //NOT <String, Character>
		for(int i=0;i<words.length;i++) {
			if(map.containsKey(charArr[i])) {        //if has key, the value should be the word.
				if(map.get(charArr[i])!=words[i]) {  //When compare strings don't use !=, which always return false
					return false;
				}
			}else {
				if(map.containsValue(words[i])) {   //if doesn't has key, the word value should NOT exist.
					return false;
				}
				map.put(charArr[i], words[i]);
			}
			
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String pattern = "abba";
		String str = "dog cat cat fish";
		System.out.println(wordPattern(pattern, str));
	}

}
