import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class ValidParentheses {
	
	public static boolean isValid(String s) {
		
        Deque deque= new LinkedList();
        char[] chars=s.toCharArray();
        if(chars.length%2!=0)
        	return false;
        for(char c: chars) {
        	if(c=='{') {
        		deque.add('}');
        	}
        	else if(c=='[') {
        		deque.add(']');
        	}
        	else if(c=='(') {
        		deque.add(')');
        	}
        	else if (deque.isEmpty()||(Character)deque.removeLast()!=c) { //use (Character) to cast from object to char
        		return false;
        	}
        }
       return deque.isEmpty();
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String test="()[]{}";
		
		
		System.out.print(isValid(test));
	}

}
