import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class RepeatedDNASequences {
	public List<String> findRepeatedDnaSequences(String s) {
        HashSet<String> seen = new HashSet<>();
        HashSet<String> res = new HashSet<>();  //Need to use hashset for result to avoid duplicated.
        for(int i=0;i<s.length()-9;i++){ //-9
            if(!seen.add(s.substring(i,i+10))){  //NOT subString
                res.add(s.substring(i,i+10));
            }
        }
        return new ArrayList<String>(res); //cast from hashset to arraylist.
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
