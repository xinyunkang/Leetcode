import java.util.Stack;

public class BasicCalculator {
	public int calculate(String s) {
        int sign=1;
        int res=0;
        Stack<Integer> stack= new Stack<>();
        for(int i=0;i<s.length();i++){
            if(Character.isDigit(s.charAt(i))){
                int num=s.charAt(i)-'0';
                while(i+1<s.length()&&Character.isDigit(s.charAt(i+1))){
                    num=num*10+s.charAt(i+1)-'0';
                    i++; //Don't forget.
                }
                res+=num*sign;
            }else if(s.charAt(i)=='+'){
                sign=1;
            }else if(s.charAt(i)=='-'){
                sign=-1;
            }else if(s.charAt(i)=='('){
                stack.push(res);
                stack.push(sign);
                res=0;
                sign=1;
            }else if (s.charAt(i) == ')') {
                res=res*stack.pop()+stack.pop(); //1st stack.pop is sign, 2nd stack.pop is old calc Value
            }
        }
        return res;
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
