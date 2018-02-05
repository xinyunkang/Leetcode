import java.util.Stack;

public class EvaluateReversePolishNotation {
	public int evalRPN(String[] tokens) {
        Stack<Integer> s= new Stack<>();  //use Integer stack
        for(String str:tokens){
            if(str.equals("+")){
                int a=s.pop();
                int b=s.pop();
                s.push(a+b);
            }else if(str.equals("-")){
                int a=s.pop();
                int b=s.pop();
                s.push(b-a);
            }else if(str.equals("*")){
                int a=s.pop();
                int b=s.pop();
                s.push(a*b);
            }else if(str.equals("/")){
                int a=s.pop();
                int b=s.pop();
                s.push(b/a);
            }else{
                s.push(Integer.valueOf(str));
            }
        }
        return s.pop();
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
