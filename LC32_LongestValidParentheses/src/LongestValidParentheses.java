import java.util.*;

public class LongestValidParentheses {
	 public int longestValidParentheses(String s) {
	        //using stack
	        if(s==null||s.length()==0) return 0;
	        Stack<Integer> stack= new Stack<>();  //record position index, not character.
	        int start=-1; //set the start index to be -1 instead of 0;
	        int max=0;
	        char[] arr= s.toCharArray();
	        for(int i=0;i<arr.length;i++){
	            if(arr[i]=='('){
	                stack.push(i); //record the index of '('  //push, not put/add.
	            }else{  //arr[i] is ')'
	                if(stack.isEmpty()){ //NO '(' stored in stack
	                    start=i;  //move start to the i index.
	                }else{  //there are '(' in stack. a pair could be formed.
	                    stack.pop(); //remove the corresponding ( for the ) at i.
	                    if(stack.isEmpty()){ //NO '(' stored in stack anymore
	                        max=Math.max(max, i-start); //start is the position of that pairing '('.
	                    }else{  //there are still '(' in the stack.
	                        //start.peek() is the nearest '(' which pairing this ')' at i.
	                        max=Math.max(max, i-stack.peek()); 
	                    }
	                }
	            }
	        }
	        
	        return max;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
